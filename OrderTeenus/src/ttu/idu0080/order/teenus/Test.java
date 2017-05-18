package ttu.idu0080.order.teenus;

import java.util.List;

import ttu.idu0080.order.server.Courier;

public class Test {

	public static void main(String[] args) {
		OrderTeenus ot = new OrderTeenus();
		List<Courier> couriers = ot.getCourierList();
		for (Courier courier : couriers) {
			System.out.println(courier.getName());
		}
		System.out.println("---------------");
		Courier courier = ot.getCourierById(1);
		System.out.println(courier.getName());
	}

}
