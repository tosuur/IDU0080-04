package ttu.idu0080.order.teenus;

import java.util.List;

import javax.jws.WebService;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.CourierService_CourierServicePort_Client;

@WebService(targetNamespace = "http://teenus.order.idu0080.ttu/", endpointInterface = "ttu.idu0080.order.teenus.CourierTeenus", portName = "OrderTeenusPort", serviceName = "OrderTeenusService")
public class OrderTeenus implements CourierTeenus {
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
	
}
