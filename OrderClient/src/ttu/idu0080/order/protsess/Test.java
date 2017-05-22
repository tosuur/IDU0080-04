package ttu.idu0080.order.protsess;

import java.util.ArrayList;
import java.util.List;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.EntAddress;
import ttu.idu0080.order.server.Order;
import ttu.idu0080.order.teenus.Pakkumine;

public class Test {

	public static void main(String[] args) {
		OrderProtsess op = new OrderProtsess();
		Order order = op.getOrderById(1);
		System.out.println(order.getPriceTotal());
		System.out.println("---------------");
		List<Courier> couriers = op.getCourierList();
		List<Pakkumine> pakkumised = new ArrayList<Pakkumine>();
		for (Courier courier : couriers) {
			pakkumised.add(op.getBestOffer(courier.getEnterprise(), order));
			//System.out.println(courier.getName() + " - percent: "+ courier.getPercentFromOrder());
		}
		//Courier courier = op.getBestOffer(order, order);
		//System.out.println("Best: " + courier.getName() + " - percent: "+ courier.getPercentFromOrder());
		
		for (Pakkumine pakkumine : pakkumised) {
			System.out.println(pakkumine.getOfferId() + "  |  " + pakkumine.getPrice() + "  |  " + pakkumine.getDeliveryTime());
			System.out.println("--------------------");
		}
	}

}
