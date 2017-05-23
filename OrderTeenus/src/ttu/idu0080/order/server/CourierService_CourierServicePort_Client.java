
package ttu.idu0080.order.server;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.logging.SimpleFormatter;

import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-05-18T11:36:06.619+03:00
 * Generated source version: 3.1.9
 * 
 */
public final class CourierService_CourierServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.order.idu0080.ttu/", "CourierServiceService");
    ttu.idu0080.order.logid.Logger logg = new ttu.idu0080.order.logid.Logger("C://services_log.txt");
    
    public CourierService_CourierServicePort_Client() {
    	logg.WriteToFile("starting courierService");
    }
    
    public java.util.List<Courier> getCouriers() throws Exception {
    	
    	logg.WriteToFile(LocalDate.now() + " - getting All Couriers");
    	
    	URL wsdlURL = CourierServiceService.WSDL_LOCATION;
    	String args[]={""};
    	java.util.List<ttu.idu0080.order.server.Courier> _getAllCouriers__return = null;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    //wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CourierServiceService ss = new CourierServiceService(wsdlURL, SERVICE_NAME);
        CourierService port = ss.getCourierServicePort();  
        
        {
    	System.out.println("Invoking getAllCouriers...");
    	_getAllCouriers__return = port.getAllCouriers();
        }
        return _getAllCouriers__return;
    }
    
    public Courier getCouriersById(int id) throws Exception {
    	URL wsdlURL = CourierServiceService.WSDL_LOCATION;
    	String args[]={""};
    	ttu.idu0080.order.server.Courier _getCourierById__return = null;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    //wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CourierServiceService ss = new CourierServiceService(wsdlURL, SERVICE_NAME);
        CourierService port = ss.getCourierServicePort();  
        
        {
            System.out.println("Invoking getCourierById...");
            _getCourierById__return = port.getCourierById(id);
            //System.out.println("getCourierById.result=" + _getCourierById__return);


            }
        return _getCourierById__return;
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CourierServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CourierServiceService ss = new CourierServiceService(wsdlURL, SERVICE_NAME);
        CourierService port = ss.getCourierServicePort();  
        
        {
        System.out.println("Invoking getCouriersByAddress...");
        java.lang.String _getCouriersByAddress_country = "_getCouriersByAddress_country789408163";
        java.lang.String _getCouriersByAddress_county = "_getCouriersByAddress_county397100638";
        java.util.List<ttu.idu0080.order.server.Courier> _getCouriersByAddress__return = port.getCouriersByAddress(_getCouriersByAddress_country, _getCouriersByAddress_county);
        System.out.println("getCouriersByAddress.result=" + _getCouriersByAddress__return);


        }
        {
        System.out.println("Invoking getCourierById...");
        int _getCourierById_courierId = 1640060836;
        ttu.idu0080.order.server.Courier _getCourierById__return = port.getCourierById(_getCourierById_courierId);
        System.out.println("getCourierById.result=" + _getCourierById__return);


        }
        {
        System.out.println("Invoking getAllCouriers...");
        java.util.List<ttu.idu0080.order.server.Courier> _getAllCouriers__return = port.getAllCouriers();
        System.out.println("getAllCouriers.result=" + _getAllCouriers__return);


        }

        System.exit(0);
    }

}
