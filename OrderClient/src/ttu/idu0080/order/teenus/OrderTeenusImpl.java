
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.order.teenus;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-05-22T19:02:28.034+03:00
 * Generated source version: 3.1.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderTeenusService",
                      portName = "OrderTeenusPort",
                      targetNamespace = "http://teenus.order.idu0080.ttu/",
                      wsdlLocation = "http://localhost:8080/OrderTeenus/services/OrderTeenusPort?wsdl",
                      endpointInterface = "ttu.idu0080.order.teenus.CourierTeenus")
                      
public class OrderTeenusImpl implements CourierTeenus {

    private static final Logger LOG = Logger.getLogger(OrderTeenusImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.order.teenus.CourierTeenus#getCourierById(int arg0)*
     */
    public ttu.idu0080.order.server.Courier getCourierById(int arg0) { 
        LOG.info("Executing operation getCourierById");
        System.out.println(arg0);
        try {
            ttu.idu0080.order.server.Courier _return = new ttu.idu0080.order.server.Courier();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            ttu.idu0080.order.server.EntAddress _returnAddressesVal1 = new ttu.idu0080.order.server.EntAddress();
            _returnAddressesVal1.setAddress(-692410823);
            _returnAddressesVal1.setCountry("Country-878274282");
            _returnAddressesVal1.setCounty("County1973821662");
            _returnAddressesVal1.setStreetAddress("StreetAddress591257583");
            _returnAddressesVal1.setTownVillage("TownVillage1799252365");
            _returnAddressesVal1.setZipcode("Zipcode-797115180");
            _returnAddresses.add(_returnAddressesVal1);
            _return.getAddresses().addAll(_returnAddresses);
            _return.setEnterprise(-2116118467);
            _return.setName("Name1289023541");
            _return.setPercentFromOrder(-1056334167);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.teenus.CourierTeenus#getCourierList()*
     */
    public java.util.List<ttu.idu0080.order.server.Courier> getCourierList() { 
        LOG.info("Executing operation getCourierList");
        try {
            java.util.List<ttu.idu0080.order.server.Courier> _return = new java.util.ArrayList<ttu.idu0080.order.server.Courier>();
            ttu.idu0080.order.server.Courier _returnVal1 = new ttu.idu0080.order.server.Courier();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            ttu.idu0080.order.server.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.order.server.EntAddress();
            _returnVal1AddressesVal1.setAddress(-1770982159);
            _returnVal1AddressesVal1.setCountry("Country848944894");
            _returnVal1AddressesVal1.setCounty("County1586891885");
            _returnVal1AddressesVal1.setStreetAddress("StreetAddress-383464519");
            _returnVal1AddressesVal1.setTownVillage("TownVillage-1298630000");
            _returnVal1AddressesVal1.setZipcode("Zipcode-1284360541");
            _returnVal1Addresses.add(_returnVal1AddressesVal1);
            _returnVal1.getAddresses().addAll(_returnVal1Addresses);
            _returnVal1.setEnterprise(512705884);
            _returnVal1.setName("Name-818058489");
            _returnVal1.setPercentFromOrder(-1929665225);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
