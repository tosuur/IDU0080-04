
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.order.transport;

import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-05-20T20:31:47.113+03:00
 * Generated source version: 3.1.9
 * 
 */

@javax.jws.WebService(
                      serviceName = "Transport",
                      portName = "transportSOAP",
                      targetNamespace = "http://www.example.org/transport/",
                      wsdlLocation = "file:/C:/Users/Smarta/Documents/veebiteenused1/IDU0080-04/OrderTeenus/WebContent/wsdl/transport.wsdl",
                      endpointInterface = "ttu.idu0080.order.transport.TransportService")
                      
public class TransportSOAPImpl implements TransportService {

    private static final Logger LOG = Logger.getLogger(TransportSOAPImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.order.transport.TransportService#transportType(java.lang.String pakkumiseId)*
     */
    public void transportType(java.lang.String pakkumiseId) { 
        LOG.info("Executing operation transportType");
        System.out.println(pakkumiseId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.transport.TransportService#transport(ttu.idu0080.order.transport.Transport parameters)*
     */
    public ttu.idu0080.order.transport.TransportResponse transport(Transport parameters) { 
        LOG.info("Executing operation transport");
        System.out.println(parameters);
        try {
            ttu.idu0080.order.transport.TransportResponse _return = new ttu.idu0080.order.transport.TransportResponse();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
