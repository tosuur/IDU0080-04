
package ttu.idu0080.order.teenus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttu.idu0080.order.teenus package. 
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

    private final static QName _GetCourierById_QNAME = new QName("http://teenus.order.idu0080.ttu/", "getCourierById");
    private final static QName _GetCourierByIdResponse_QNAME = new QName("http://teenus.order.idu0080.ttu/", "getCourierByIdResponse");
    private final static QName _GetCourierList_QNAME = new QName("http://teenus.order.idu0080.ttu/", "getCourierList");
    private final static QName _GetCourierListResponse_QNAME = new QName("http://teenus.order.idu0080.ttu/", "getCourierListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttu.idu0080.order.teenus
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link GetCourierList }
     * 
     */
    public GetCourierList createGetCourierList() {
        return new GetCourierList();
    }

    /**
     * Create an instance of {@link GetCourierListResponse }
     * 
     */
    public GetCourierListResponse createGetCourierListResponse() {
        return new GetCourierListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teenus.order.idu0080.ttu/", name = "getCourierById")
    public JAXBElement<GetCourierById> createGetCourierById(GetCourierById value) {
        return new JAXBElement<GetCourierById>(_GetCourierById_QNAME, GetCourierById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teenus.order.idu0080.ttu/", name = "getCourierByIdResponse")
    public JAXBElement<GetCourierByIdResponse> createGetCourierByIdResponse(GetCourierByIdResponse value) {
        return new JAXBElement<GetCourierByIdResponse>(_GetCourierByIdResponse_QNAME, GetCourierByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teenus.order.idu0080.ttu/", name = "getCourierList")
    public JAXBElement<GetCourierList> createGetCourierList(GetCourierList value) {
        return new JAXBElement<GetCourierList>(_GetCourierList_QNAME, GetCourierList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teenus.order.idu0080.ttu/", name = "getCourierListResponse")
    public JAXBElement<GetCourierListResponse> createGetCourierListResponse(GetCourierListResponse value) {
        return new JAXBElement<GetCourierListResponse>(_GetCourierListResponse_QNAME, GetCourierListResponse.class, null, value);
    }

}
