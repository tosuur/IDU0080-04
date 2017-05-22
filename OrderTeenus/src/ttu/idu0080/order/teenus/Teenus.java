package ttu.idu0080.order.teenus;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import ttu.idu0080.order.offer.Pakkumine;
import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.Order;

@WebService(name = "Teenus", targetNamespace = "http://teenus.order.idu0080.ttu/")
public interface Teenus {

	@RequestWrapper(className = "ttu.idu0080.order.teenus.jaxws.GetCourierList", localName = "getCourierList", targetNamespace = "http://teenus.order.idu0080.ttu/")
	@ResponseWrapper(className = "ttu.idu0080.order.teenus.jaxws.GetCourierListResponse", localName = "getCourierListResponse", targetNamespace = "http://teenus.order.idu0080.ttu/")
	List<Courier> getCourierList();

	@RequestWrapper(className = "ttu.idu0080.order.teenus.jaxws.GetCourierById", localName = "getCourierById", targetNamespace = "http://teenus.order.idu0080.ttu/")
	@ResponseWrapper(className = "ttu.idu0080.order.teenus.jaxws.GetCourierByIdResponse", localName = "getCourierByIdResponse", targetNamespace = "http://teenus.order.idu0080.ttu/")
	Courier getCourierById(@WebParam(name = "arg0") int id);

	@RequestWrapper(className = "ttu.idu0080.order.teenus.jaxws.GetOffer", localName = "getOffer", targetNamespace = "http://teenus.order.idu0080.ttu/")
	@ResponseWrapper(className = "ttu.idu0080.order.teenus.jaxws.GetOfferResponse", localName = "getOfferResponse", targetNamespace = "http://teenus.order.idu0080.ttu/")
	Pakkumine getOffer(@WebParam(name = "arg0") int courierId, @WebParam(name = "arg1") Order order);

}