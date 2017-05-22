package ttu.idu0080.order.protsess;

import java.util.List;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.EntAddress;
import ttu.idu0080.order.server.Order;

public class Test {

	public static void main(String[] args) {
		OrderProtsess op = new OrderProtsess();
		Order order = op.getOrderById(1);
		System.out.println(order.getPriceTotal());
		System.out.println("---------------");
		List<Courier> couriers = op.getCourierList();
		for (Courier courier : couriers) {
			System.out.println(courier.getName() + " - percent: "+ courier.getPercentFromOrder());
		}
		Courier courier = getBestOffer(order, couriers);
		System.out.println("Best: " + courier.getName() + " - percent: "+ courier.getPercentFromOrder());
	}

	private static Courier getBestOffer(Order order, List<Courier> couriers) {
		Courier bestCourier = couriers.get(0);
		
		Float offer = order.getPriceTotal() + (order.getPriceTotal() * couriers.get(0).getPercentFromOrder() / 100);
		for (Courier courier : couriers) {
			float thisOffer = getOffer(courier, order);
			if (thisOffer < offer) {
				offer = thisOffer;
				bestCourier = courier;
			}
		}
		System.out.println("bestofferprice: " + offer);
		return bestCourier;
	}

	private static float getOffer(Courier courier, Order order) {
		Float offer = new Float("0");
		offer = getOriginalOffer(order,courier);
		for (EntAddress address : courier.getAddresses()) {
			if (address.getCounty().equals(order.getShippingAddress().getCounty())) {
				offer = (float) (offer -  (0.3 * getOriginalOffer(order,courier)));
			}
			for (EntAddress sellerAddresses : order.getSeller().getAddresses()) {
				if (address.getCounty().equals(sellerAddresses)) {
					offer = (float) (offer -  (0.3 * getOriginalOffer(order,courier)));
				}
			}
		}
		return offer + order.getPriceTotal();
	}

	private static Float getOriginalOffer(Order order, Courier courier) {
		return order.getPriceTotal() * courier.getPercentFromOrder() / 100;
	}

}
