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
public class OrderTeenus implements CourierTeenus, Teenus {
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
	
	public String orderTransport(String offerId, int courierId) {
		Courier courier = getCourierById(courierId);
		String trackingNumber = offerId.toLowerCase().concat("#" + LocalDate.now());
		
		//insert order into table
		
		return trackingNumber;
	}

	public Pakkumine getOffer(int courierId, Order order) {
		//build price
		Float offer = new Float("0");
		Courier courier = getCourierById(courierId);
		offer = getOriginalOffer(order, courier);
		for (EntAddress address : courier.getAddresses()) {
			if (address.getCounty().equals(order.getShippingAddress().getCounty())) {
				offer = (float) (offer - (0.3 * getOriginalOffer(order, courier)));
			}
			for (EntAddress sellerAddresses : order.getSeller().getAddresses()) {
				if (address.getCounty().equals(sellerAddresses)) {
					offer = (float) (offer - (0.3 * getOriginalOffer(order, courier)));
				}
			}
		}
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
		return new Pakkumine(saltStr,offer+order.getPriceTotal(),rnd.nextInt(7) + 1);

	}

	private static Float getOriginalOffer(Order order, Courier courier) {
		return order.getPriceTotal() * courier.getPercentFromOrder() / 100;
	}

}
