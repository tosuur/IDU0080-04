package ttu.idu0080.order.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-05-15T23:51:34.774+03:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://server.order.idu0080.ttu/", name = "OrderService")
@XmlSeeAlso({ObjectFactory.class})
public interface OrderService {

    @WebMethod
    @Action(input = "http://server.order.idu0080.ttu/OrderService/getOrdersByCustomerIdRequest", output = "http://server.order.idu0080.ttu/OrderService/getOrdersByCustomerIdResponse")
    @RequestWrapper(localName = "getOrdersByCustomerId", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetOrdersByCustomerId")
    @ResponseWrapper(localName = "getOrdersByCustomerIdResponse", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetOrdersByCustomerIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByCustomerId(
        @WebParam(name = "customer_id", targetNamespace = "")
        int customerId
    );

    @WebMethod
    @Action(input = "http://server.order.idu0080.ttu/OrderService/getAllOrdersRequest", output = "http://server.order.idu0080.ttu/OrderService/getAllOrdersResponse")
    @RequestWrapper(localName = "getAllOrders", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetAllOrders")
    @ResponseWrapper(localName = "getAllOrdersResponse", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetAllOrdersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ttu.idu0080.order.server.Order> getAllOrders();

    @WebMethod
    @Action(input = "http://server.order.idu0080.ttu/OrderService/getOrdersByOrderIdRequest", output = "http://server.order.idu0080.ttu/OrderService/getOrdersByOrderIdResponse")
    @RequestWrapper(localName = "getOrdersByOrderId", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetOrdersByOrderId")
    @ResponseWrapper(localName = "getOrdersByOrderIdResponse", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetOrdersByOrderIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ttu.idu0080.order.server.Order getOrdersByOrderId(
        @WebParam(name = "order_id", targetNamespace = "")
        int orderId
    );

    @WebMethod
    @Action(input = "http://server.order.idu0080.ttu/OrderService/getOrdersByShippingAddressRequest", output = "http://server.order.idu0080.ttu/OrderService/getOrdersByShippingAddressResponse")
    @RequestWrapper(localName = "getOrdersByShippingAddress", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetOrdersByShippingAddress")
    @ResponseWrapper(localName = "getOrdersByShippingAddressResponse", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetOrdersByShippingAddressResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByShippingAddress(
        @WebParam(name = "country", targetNamespace = "")
        java.lang.String country,
        @WebParam(name = "county", targetNamespace = "")
        java.lang.String county
    );

    @WebMethod
    @Action(input = "http://server.order.idu0080.ttu/OrderService/getOrdersByCustomerLastNameRequest", output = "http://server.order.idu0080.ttu/OrderService/getOrdersByCustomerLastNameResponse")
    @RequestWrapper(localName = "getOrdersByCustomerLastName", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetOrdersByCustomerLastName")
    @ResponseWrapper(localName = "getOrdersByCustomerLastNameResponse", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.order.server.GetOrdersByCustomerLastNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByCustomerLastName(
        @WebParam(name = "last_name", targetNamespace = "")
        java.lang.String lastName
    );
}
