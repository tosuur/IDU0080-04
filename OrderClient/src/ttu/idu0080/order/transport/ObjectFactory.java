
package ttu.idu0080.order.transport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttu.idu0080.order.transport package. 
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

    private final static QName _Transport_QNAME = new QName("http://www.example.org/transport/", "Transport");
    private final static QName _TransportResponse_QNAME = new QName("http://www.example.org/transport/", "TransportResponse");
    private final static QName _TransportType_QNAME = new QName("http://www.example.org/transport/", "TransportType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttu.idu0080.order.transport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Transport }
     * 
     */
    public Transport createTransport() {
        return new Transport();
    }

    /**
     * Create an instance of {@link TransportResponse }
     * 
     */
    public TransportResponse createTransportResponse() {
        return new TransportResponse();
    }

    /**
     * Create an instance of {@link TransportType }
     * 
     */
    public TransportType createTransportType() {
        return new TransportType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/transport/", name = "Transport")
    public JAXBElement<Transport> createTransport(Transport value) {
        return new JAXBElement<Transport>(_Transport_QNAME, Transport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/transport/", name = "TransportResponse")
    public JAXBElement<TransportResponse> createTransportResponse(TransportResponse value) {
        return new JAXBElement<TransportResponse>(_TransportResponse_QNAME, TransportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/transport/", name = "TransportType")
    public JAXBElement<TransportType> createTransportType(TransportType value) {
        return new JAXBElement<TransportType>(_TransportType_QNAME, TransportType.class, null, value);
    }

}
