package ttu.idu0080.order.teenus;

import java.util.List;

import javax.jws.WebService;

import ttu.idu0080.order.offer.Pakkumine;
import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.Order;

@WebService(name = "Teenus", targetNamespace = "http://teenus.order.idu0080.ttu/")
public interface Teenus {

	List<Courier> getCourierList();

	Courier getCourierById(int id);

	String generateTrackingNumber(String offerId);

	Pakkumine getOffer(int courierId, Order order);

}