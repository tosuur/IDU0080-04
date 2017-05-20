package ttu.idu0080.order.transport;

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
 * 2017-05-20T20:31:47.133+03:00
 * Generated source version: 3.1.9
 * 
 */
@WebService(targetNamespace = "http://www.example.org/transport/", name = "TransportService")
@XmlSeeAlso({ObjectFactory.class})
public interface TransportService {

    @WebMethod(operationName = "TransportType")
    @Oneway
    @RequestWrapper(localName = "TransportType", targetNamespace = "http://www.example.org/transport/", className = "ttu.idu0080.order.transport.TransportType")
    public void transportType(
        @WebParam(name = "pakkumiseId", targetNamespace = "")
        java.lang.String pakkumiseId
    );

    @WebMethod(operationName = "Transport")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "TransportResponse", targetNamespace = "http://www.example.org/transport/", partName = "parameters")
    public TransportResponse transport(
        @WebParam(partName = "parameters", name = "Transport", targetNamespace = "http://www.example.org/transport/")
        Transport parameters
    );
}
