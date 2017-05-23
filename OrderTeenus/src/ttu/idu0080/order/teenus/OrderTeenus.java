package ttu.idu0080.order.teenus;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import javax.jws.WebService;

import ttu.idu0080.order.offer.Pakkumine;
import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.CourierService_CourierServicePort_Client;
import ttu.idu0080.order.server.EntAddress;
import ttu.idu0080.order.server.Order;

@WebService(targetNamespace = "http://teenus.order.idu0080.ttu/", endpointInterface = "ttu.idu0080.order.teenus.Teenus", portName = "OrderTeenusPort", serviceName = "OrderTeenusService")
public class OrderTeenus implements Teenus{
	ttu.idu0080.order.logid.Logger logger = new ttu.idu0080.order.logid.Logger("C://services_log.txt");
	public List<Courier> getCourierList() {
		CourierService_CourierServicePort_Client CourierServiceTeenus = new CourierService_CourierServicePort_Client();
		List<Courier> CourierList = null;
		try {
			CourierList = CourierServiceTeenus.getCouriers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CourierList;
	}

	public Courier getCourierById(int id) {
		CourierService_CourierServicePort_Client CourierServiceTeenus = new CourierService_CourierServicePort_Client();
		Courier Courier = null;
		try {
			Courier = CourierServiceTeenus.getCouriersById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Courier;
	}
	
	public String generateTrackingNumber(String offerId) {
		logger.WriteToFile("---------------------------");
		logger.WriteToFile(LocalDate.now() + " starting TransportOrderService");
		String trackingNumber = offerId.toLowerCase().concat("#" + LocalDate.now());
		logger.WriteToFile("Pakkumisele (offer_id): ["+offerId+"] vastav tellimus registreeritud. Saadetise tracking number: ["+trackingNumber+"]");
		logger.WriteToFile(LocalDate.now() + " ending TransportOrderService");
		logger.WriteToFile("---------------------------");
		return trackingNumber;
	}

	public Pakkumine getOffer(int courierId, Order order) {

		logger.WriteToFile("---------------------------");
		logger.WriteToFile(LocalDate.now() + " starting OfferService");
		//build price
		Float offer = new Float("0");
		Courier courier = getCourierById(courierId);
		offer = getOriginalOffer(order, courier);

        
        logger.WriteToFile( "Received courier id: ["+courierId+"] order price: ["+order.getPriceTotal()
        	+"] shipping address county: ["+order.getShippingAddress().getCounty()+"]" );
        logger.WriteToFile("Kullerfirma protsent:["+courier.getPercentFromOrder()+"]");
		
        int discount = 0;
		for (EntAddress address : courier.getAddresses()) {
			if (address.getCounty().equals(order.getShippingAddress().getCounty())) {
				offer = (float) (offer - (0.3 * getOriginalOffer(order, courier)));
		        logger.WriteToFile("Shipping aadress langeb kokku kullerfirma aadressiga");
		        discount += 30;
			}
			for (EntAddress sellerAddresses : order.getSeller().getAddresses()) {
				if (address.getCounty().equals(sellerAddresses)) {
					offer = (float) (offer - (0.3 * getOriginalOffer(order, courier)));
			        logger.WriteToFile("Müüja aadress langeb kokku kullerfirma aadressiga");
			        discount += 30;
				}
			}
		}
		logger.WriteToFile("Offer discount % ["+discount+"%] ");
		//build offerId
		//https://stackoverflow.com/questions/20536566/creating-a-random-string-with-a-z-and-0-9-in-java/20536597#20536597
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        
        LocalDate date = LocalDate.now();
        int randomNrOfDays = rnd.nextInt(7) + 1;
        date = date.plusDays(randomNrOfDays);
        
        logger.WriteToFile("offer: offer_id: ["+saltStr+"] offer_price: ["+offer+"] approx. delivery date: ["+date+"] ");

		logger.WriteToFile(LocalDate.now() + " ending OfferService");
		logger.WriteToFile("---------------------------");
        
		return new Pakkumine(saltStr,offer+order.getPriceTotal(),randomNrOfDays);

	}

	private static Float getOriginalOffer(Order order, Courier courier) {
		return order.getPriceTotal() * courier.getPercentFromOrder() / 100;
	}

}
