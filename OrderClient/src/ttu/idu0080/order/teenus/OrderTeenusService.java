package ttu.idu0080.order.teenus;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-05-22T23:03:07.466+03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "OrderTeenusService", 
                  wsdlLocation = "http://localhost:8080/OrderTeenus/services/OrderTeenusPort?wsdl",
                  targetNamespace = "http://teenus.order.idu0080.ttu/") 
public class OrderTeenusService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://teenus.order.idu0080.ttu/", "OrderTeenusService");
    public final static QName OrderTeenusPort = new QName("http://teenus.order.idu0080.ttu/", "OrderTeenusPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/OrderTeenus/services/OrderTeenusPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderTeenusService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/OrderTeenus/services/OrderTeenusPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderTeenusService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderTeenusService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderTeenusService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public OrderTeenusService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrderTeenusService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrderTeenusService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Teenus
     */
    @WebEndpoint(name = "OrderTeenusPort")
    public Teenus getOrderTeenusPort() {
        return super.getPort(OrderTeenusPort, Teenus.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Teenus
     */
    @WebEndpoint(name = "OrderTeenusPort")
    public Teenus getOrderTeenusPort(WebServiceFeature... features) {
        return super.getPort(OrderTeenusPort, Teenus.class, features);
    }

}
