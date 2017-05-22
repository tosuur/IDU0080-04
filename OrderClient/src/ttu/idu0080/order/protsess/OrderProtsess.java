package ttu.idu0080.order.protsess;

import java.util.List;

import ttu.idu0080.order.offer.Pakkumine;
import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.Order;
import ttu.idu0080.order.server.OrderService_OrderServicePort_Client;
import ttu.idu0080.order.teenus.CourierTeenus_OrderTeenusPort_Client;

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
		CourierTeenus_OrderTeenusPort_Client CourierServiceTeenus = new CourierTeenus_OrderTeenusPort_Client();
		List<Courier> CourierList = null;
		try {
			CourierList = CourierServiceTeenus.getCouriers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CourierList;
	}

	public Courier getBestOffer(Order order, List<Courier> couriers) {
		OrderService_OrderServicePort_Client OrderServiceClient = new OrderService_OrderServicePort_Client();
		Pakkumine offer = null;
		try {
			//offer = OrderServiceClient.getOrdersById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} 

}
