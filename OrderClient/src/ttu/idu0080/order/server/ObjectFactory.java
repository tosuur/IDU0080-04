
package ttu.idu0080.order.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttu.idu0080.order.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetOrderShipmentsByOrderIdRyhmName_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrderShipmentsByOrderIdRyhmName");
	private final static QName _GetOrderShipmentsByOrderIdRyhmNameResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrderShipmentsByOrderIdRyhmNameResponse");
	private final static QName _InsertOrderShipment_QNAME = new QName("http://server.order.idu0080.ttu/", "insertOrderShipment");
	private final static QName _InsertOrderShipmentResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "insertOrderShipmentResponse");
	private final static QName _GetAllCouriers_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllCouriers");
	private final static QName _GetAllCouriersResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllCouriersResponse");
	private final static QName _GetCourierById_QNAME = new QName("http://server.order.idu0080.ttu/", "getCourierById");
	private final static QName _GetCourierByIdResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getCourierByIdResponse");
	private final static QName _GetCouriersByAddress_QNAME = new QName("http://server.order.idu0080.ttu/", "getCouriersByAddress");
	private final static QName _GetCouriersByAddressResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getCouriersByAddressResponse");
	private final static QName _GetAllOrders_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllOrders");
    private final static QName _GetAllOrdersResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllOrdersResponse");
    private final static QName _GetOrdersByCustomerId_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByCustomerId");
    private final static QName _GetOrdersByCustomerIdResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByCustomerIdResponse");
    private final static QName _GetOrdersByCustomerLastName_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByCustomerLastName");
    private final static QName _GetOrdersByCustomerLastNameResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByCustomerLastNameResponse");
    private final static QName _GetOrdersByOrderId_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByOrderId");
    private final static QName _GetOrdersByOrderIdResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByOrderIdResponse");
    private final static QName _GetOrdersByShippingAddress_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByShippingAddress");
    private final static QName _GetOrdersByShippingAddressResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByShippingAddressResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttu.idu0080.order.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderShipmentsByOrderIdRyhmName }
     * 
     */
    public GetOrderShipmentsByOrderIdRyhmName createGetOrderShipmentsByOrderIdRyhmName() {
        return new GetOrderShipmentsByOrderIdRyhmName();
    }

	/**
     * Create an instance of {@link GetOrderShipmentsByOrderIdRyhmNameResponse }
     * 
     */
    public GetOrderShipmentsByOrderIdRyhmNameResponse createGetOrderShipmentsByOrderIdRyhmNameResponse() {
        return new GetOrderShipmentsByOrderIdRyhmNameResponse();
    }

	/**
     * Create an instance of {@link InsertOrderShipment }
     * 
     */
    public InsertOrderShipment createInsertOrderShipment() {
        return new InsertOrderShipment();
    }

	/**
     * Create an instance of {@link InsertOrderShipmentResponse }
     * 
     */
    public InsertOrderShipmentResponse createInsertOrderShipmentResponse() {
        return new InsertOrderShipmentResponse();
    }

	/**
     * Create an instance of {@link OrderShipment }
     * 
     */
    public OrderShipment createOrderShipment() {
        return new OrderShipment();
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderShipmentsByOrderIdRyhmName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrderShipmentsByOrderIdRyhmName")
    public JAXBElement<GetOrderShipmentsByOrderIdRyhmName> createGetOrderShipmentsByOrderIdRyhmName(GetOrderShipmentsByOrderIdRyhmName value) {
        return new JAXBElement<GetOrderShipmentsByOrderIdRyhmName>(_GetOrderShipmentsByOrderIdRyhmName_QNAME, GetOrderShipmentsByOrderIdRyhmName.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderShipmentsByOrderIdRyhmNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrderShipmentsByOrderIdRyhmNameResponse")
    public JAXBElement<GetOrderShipmentsByOrderIdRyhmNameResponse> createGetOrderShipmentsByOrderIdRyhmNameResponse(GetOrderShipmentsByOrderIdRyhmNameResponse value) {
        return new JAXBElement<GetOrderShipmentsByOrderIdRyhmNameResponse>(_GetOrderShipmentsByOrderIdRyhmNameResponse_QNAME, GetOrderShipmentsByOrderIdRyhmNameResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrderShipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "insertOrderShipment")
    public JAXBElement<InsertOrderShipment> createInsertOrderShipment(InsertOrderShipment value) {
        return new JAXBElement<InsertOrderShipment>(_InsertOrderShipment_QNAME, InsertOrderShipment.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrderShipmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "insertOrderShipmentResponse")
    public JAXBElement<InsertOrderShipmentResponse> createInsertOrderShipmentResponse(InsertOrderShipmentResponse value) {
        return new JAXBElement<InsertOrderShipmentResponse>(_InsertOrderShipmentResponse_QNAME, InsertOrderShipmentResponse.class, null, value);
    }

	/**
     * Create an instance of {@link GetAllCouriers }
     * 
     */
    public GetAllCouriers createGetAllCouriers() {
        return new GetAllCouriers();
    }

	/**
     * Create an instance of {@link GetAllCouriersResponse }
     * 
     */
    public GetAllCouriersResponse createGetAllCouriersResponse() {
        return new GetAllCouriersResponse();
    }

	/**
     * Create an instance of {@link GetCourierById }
     * 
     */
    public GetCourierById createGetCourierById() {
        return new GetCourierById();
    }

	/**
     * Create an instance of {@link GetCourierByIdResponse }
     * 
     */
    public GetCourierByIdResponse createGetCourierByIdResponse() {
        return new GetCourierByIdResponse();
    }

	/**
     * Create an instance of {@link GetCouriersByAddress }
     * 
     */
    public GetCouriersByAddress createGetCouriersByAddress() {
        return new GetCouriersByAddress();
    }

	/**
     * Create an instance of {@link GetCouriersByAddressResponse }
     * 
     */
    public GetCouriersByAddressResponse createGetCouriersByAddressResponse() {
        return new GetCouriersByAddressResponse();
    }

	/**
     * Create an instance of {@link Courier }
     * 
     */
    public Courier createCourier() {
        return new Courier();
    }

	/**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByCustomerId }
     * 
     */
    public GetOrdersByCustomerId createGetOrdersByCustomerId() {
        return new GetOrdersByCustomerId();
    }

    /**
     * Create an instance of {@link GetOrdersByCustomerIdResponse }
     * 
     */
    public GetOrdersByCustomerIdResponse createGetOrdersByCustomerIdResponse() {
        return new GetOrdersByCustomerIdResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByCustomerLastName }
     * 
     */
    public GetOrdersByCustomerLastName createGetOrdersByCustomerLastName() {
        return new GetOrdersByCustomerLastName();
    }

    /**
     * Create an instance of {@link GetOrdersByCustomerLastNameResponse }
     * 
     */
    public GetOrdersByCustomerLastNameResponse createGetOrdersByCustomerLastNameResponse() {
        return new GetOrdersByCustomerLastNameResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByOrderId }
     * 
     */
    public GetOrdersByOrderId createGetOrdersByOrderId() {
        return new GetOrdersByOrderId();
    }

    /**
     * Create an instance of {@link GetOrdersByOrderIdResponse }
     * 
     */
    public GetOrdersByOrderIdResponse createGetOrdersByOrderIdResponse() {
        return new GetOrdersByOrderIdResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByShippingAddress }
     * 
     */
    public GetOrdersByShippingAddress createGetOrdersByShippingAddress() {
        return new GetOrdersByShippingAddress();
    }

    /**
     * Create an instance of {@link GetOrdersByShippingAddressResponse }
     * 
     */
    public GetOrdersByShippingAddressResponse createGetOrdersByShippingAddressResponse() {
        return new GetOrdersByShippingAddressResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link OrderProduct }
     * 
     */
    public OrderProduct createOrderProduct() {
        return new OrderProduct();
    }

    /**
     * Create an instance of {@link Seller }
     * 
     */
    public Seller createSeller() {
        return new Seller();
    }

    /**
     * Create an instance of {@link EntAddress }
     * 
     */
    public EntAddress createEntAddress() {
        return new EntAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCouriers }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllCouriers")
    public JAXBElement<GetAllCouriers> createGetAllCouriers(GetAllCouriers value) {
        return new JAXBElement<GetAllCouriers>(_GetAllCouriers_QNAME, GetAllCouriers.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCouriersResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllCouriersResponse")
    public JAXBElement<GetAllCouriersResponse> createGetAllCouriersResponse(GetAllCouriersResponse value) {
        return new JAXBElement<GetAllCouriersResponse>(_GetAllCouriersResponse_QNAME, GetAllCouriersResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierById }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCourierById")
    public JAXBElement<GetCourierById> createGetCourierById(GetCourierById value) {
        return new JAXBElement<GetCourierById>(_GetCourierById_QNAME, GetCourierById.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierByIdResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCourierByIdResponse")
    public JAXBElement<GetCourierByIdResponse> createGetCourierByIdResponse(GetCourierByIdResponse value) {
        return new JAXBElement<GetCourierByIdResponse>(_GetCourierByIdResponse_QNAME, GetCourierByIdResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCouriersByAddress }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCouriersByAddress")
    public JAXBElement<GetCouriersByAddress> createGetCouriersByAddress(GetCouriersByAddress value) {
        return new JAXBElement<GetCouriersByAddress>(_GetCouriersByAddress_QNAME, GetCouriersByAddress.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCouriersByAddressResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCouriersByAddressResponse")
    public JAXBElement<GetCouriersByAddressResponse> createGetCouriersByAddressResponse(GetCouriersByAddressResponse value) {
        return new JAXBElement<GetCouriersByAddressResponse>(_GetCouriersByAddressResponse_QNAME, GetCouriersByAddressResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrders }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllOrders")
    public JAXBElement<GetAllOrders> createGetAllOrders(GetAllOrders value) {
        return new JAXBElement<GetAllOrders>(_GetAllOrders_QNAME, GetAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllOrdersResponse")
    public JAXBElement<GetAllOrdersResponse> createGetAllOrdersResponse(GetAllOrdersResponse value) {
        return new JAXBElement<GetAllOrdersResponse>(_GetAllOrdersResponse_QNAME, GetAllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByCustomerId }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByCustomerId")
    public JAXBElement<GetOrdersByCustomerId> createGetOrdersByCustomerId(GetOrdersByCustomerId value) {
        return new JAXBElement<GetOrdersByCustomerId>(_GetOrdersByCustomerId_QNAME, GetOrdersByCustomerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByCustomerIdResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByCustomerIdResponse")
    public JAXBElement<GetOrdersByCustomerIdResponse> createGetOrdersByCustomerIdResponse(GetOrdersByCustomerIdResponse value) {
        return new JAXBElement<GetOrdersByCustomerIdResponse>(_GetOrdersByCustomerIdResponse_QNAME, GetOrdersByCustomerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByCustomerLastName }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByCustomerLastName")
    public JAXBElement<GetOrdersByCustomerLastName> createGetOrdersByCustomerLastName(GetOrdersByCustomerLastName value) {
        return new JAXBElement<GetOrdersByCustomerLastName>(_GetOrdersByCustomerLastName_QNAME, GetOrdersByCustomerLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByCustomerLastNameResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByCustomerLastNameResponse")
    public JAXBElement<GetOrdersByCustomerLastNameResponse> createGetOrdersByCustomerLastNameResponse(GetOrdersByCustomerLastNameResponse value) {
        return new JAXBElement<GetOrdersByCustomerLastNameResponse>(_GetOrdersByCustomerLastNameResponse_QNAME, GetOrdersByCustomerLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByOrderId }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByOrderId")
    public JAXBElement<GetOrdersByOrderId> createGetOrdersByOrderId(GetOrdersByOrderId value) {
        return new JAXBElement<GetOrdersByOrderId>(_GetOrdersByOrderId_QNAME, GetOrdersByOrderId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByOrderIdResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByOrderIdResponse")
    public JAXBElement<GetOrdersByOrderIdResponse> createGetOrdersByOrderIdResponse(GetOrdersByOrderIdResponse value) {
        return new JAXBElement<GetOrdersByOrderIdResponse>(_GetOrdersByOrderIdResponse_QNAME, GetOrdersByOrderIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByShippingAddress }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByShippingAddress")
    public JAXBElement<GetOrdersByShippingAddress> createGetOrdersByShippingAddress(GetOrdersByShippingAddress value) {
        return new JAXBElement<GetOrdersByShippingAddress>(_GetOrdersByShippingAddress_QNAME, GetOrdersByShippingAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByShippingAddressResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByShippingAddressResponse")
    public JAXBElement<GetOrdersByShippingAddressResponse> createGetOrdersByShippingAddressResponse(GetOrdersByShippingAddressResponse value) {
        return new JAXBElement<GetOrdersByShippingAddressResponse>(_GetOrdersByShippingAddressResponse_QNAME, GetOrdersByShippingAddressResponse.class, null, value);
    }

}
