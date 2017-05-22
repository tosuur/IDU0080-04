package ttu.idu0080.order.protsess;

import java.util.List;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.Order;
import ttu.idu0080.order.server.OrderService_OrderServicePort_Client;
import ttu.idu0080.order.teenus.Pakkumine;
import ttu.idu0080.order.teenus.Teenus_OrderTeenusPort_Client;

public class OrderProtsess {

	public Order getOrderById(int id) {
		OrderService_OrderServicePort_Client OrderServiceClient = new OrderService_OrderServicePort_Client();
		Order order = null;
		try {
			order = OrderServiceClient.getOrdersById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}
	
	public List<Courier> getCourierList() {
		Teenus_OrderTeenusPort_Client CourierServiceTeenus = new Teenus_OrderTeenusPort_Client();
		List<Courier> CourierList = null;
		try {
			CourierList = CourierServiceTeenus.getCouriers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CourierList;
	}

	public Pakkumine getBestOffer(int courierId, Order order) {
		Teenus_OrderTeenusPort_Client CourierServiceTeenus = new Teenus_OrderTeenusPort_Client();
		Pakkumine offer = null;
		try {
			offer = CourierServiceTeenus.getOffer(courierId, order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return offer;
	}
	
	public String generateTrackingNumber(String offerId) {
		Teenus_OrderTeenusPort_Client CourierServiceTeenus = new Teenus_OrderTeenusPort_Client();
		String trackingNumber = null;
		try {
			trackingNumber = CourierServiceTeenus.generateTrackingNumber(offerId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trackingNumber;
	}

}
