package ttu.idu0080.order.teenus;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import ttu.idu0080.order.server.Courier;

@WebService(name = "CourierTeenus", targetNamespace = "http://teenus.order.idu0080.ttu/")
public interface CourierTeenus {

	List<Courier> getCourierList();

	Courier getCourierById(int id);

}