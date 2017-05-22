package ttu.idu0080.order.protsess;

import java.util.List;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.Order;

public class Test {

	public static void main(String[] args) {
		OrderProtsess op = new OrderProtsess();
		Order order = op.getOrderById(1);
		System.out.println(order.getPriceTotal());
		System.out.println("---------------");
		List<Courier> couriers = op.getCourierList();
		for (Courier courier : couriers) {
			System.out.println(courier.getName());
		}
	}

}
