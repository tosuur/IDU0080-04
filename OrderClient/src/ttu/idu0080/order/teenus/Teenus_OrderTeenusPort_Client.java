
package ttu.idu0080.order.teenus;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.Order;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-05-22T21:14:11.492+03:00
 * Generated source version: 3.1.10
 * 
 */
public final class Teenus_OrderTeenusPort_Client {

    private static final QName SERVICE_NAME = new QName("http://teenus.order.idu0080.ttu/", "OrderTeenusService");

    public Teenus_OrderTeenusPort_Client() {
    }
    
    public java.util.List<Courier> getCouriers() throws Exception {
    	URL wsdlURL = OrderTeenusService.WSDL_LOCATION;
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
      
        OrderTeenusService ss = new OrderTeenusService(wsdlURL, SERVICE_NAME);
        Teenus port = ss.getOrderTeenusPort();  
        
        {
    	System.out.println("Invoking getAllCouriers...");
    	_getAllCouriers__return = port.getCourierList();
        }
        return _getAllCouriers__return;
    }
    
    public Pakkumine getOffer(int courierId, Order order) throws Exception {
    	URL wsdlURL = OrderTeenusService.WSDL_LOCATION;
    	String args[]={""};
    	Pakkumine _getOffer__return = null;
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
      
        OrderTeenusService ss = new OrderTeenusService(wsdlURL, SERVICE_NAME);
        Teenus port = ss.getOrderTeenusPort();  
        
        {
    	System.out.println("Invoking getAllCouriers...");
    	_getOffer__return = port.getOffer(courierId, order);
        }
        return _getOffer__return;
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = OrderTeenusService.WSDL_LOCATION;
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
      
        OrderTeenusService ss = new OrderTeenusService(wsdlURL, SERVICE_NAME);
        Teenus port = ss.getOrderTeenusPort();  
        
        {
        System.out.println("Invoking getCourierById...");
        int _getCourierById_arg0 = -36002917;
        ttu.idu0080.order.server.Courier _getCourierById__return = port.getCourierById(_getCourierById_arg0);
        System.out.println("getCourierById.result=" + _getCourierById__return);


        }
        {
        System.out.println("Invoking getCourierList...");
        java.util.List<ttu.idu0080.order.server.Courier> _getCourierList__return = port.getCourierList();
        System.out.println("getCourierList.result=" + _getCourierList__return);


        }
        {
        System.out.println("Invoking getOffer...");
        int _getOffer_arg0 = 1137381354;
        ttu.idu0080.order.server.Order _getOffer_arg1 = new ttu.idu0080.order.server.Order();
        ttu.idu0080.order.server.Customer _getOffer_arg1Customer = new ttu.idu0080.order.server.Customer();
        java.util.List<ttu.idu0080.order.server.Address> _getOffer_arg1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
        ttu.idu0080.order.server.Address _getOffer_arg1CustomerAddressesVal1 = new ttu.idu0080.order.server.Address();
        _getOffer_arg1CustomerAddressesVal1.setAddress(-1747379118);
        _getOffer_arg1CustomerAddressesVal1.setCountry("Country-1265529564");
        _getOffer_arg1CustomerAddressesVal1.setCounty("County455957996");
        _getOffer_arg1CustomerAddressesVal1.setStreetAddress("StreetAddress-1594938769");
        _getOffer_arg1CustomerAddressesVal1.setTownVillage("TownVillage-582420079");
        _getOffer_arg1CustomerAddressesVal1.setZipcode("Zipcode1138580963");
        _getOffer_arg1CustomerAddresses.add(_getOffer_arg1CustomerAddressesVal1);
        _getOffer_arg1Customer.getAddresses().addAll(_getOffer_arg1CustomerAddresses);
        _getOffer_arg1Customer.setCustomer(-566477175);
        _getOffer_arg1Customer.setFirstName("FirstName1678703825");
        _getOffer_arg1Customer.setLastName("LastName1662268453");
        _getOffer_arg1.setCustomer(_getOffer_arg1Customer);
        _getOffer_arg1.setOrderId(-1457219901);
        java.util.List<ttu.idu0080.order.server.OrderProduct> _getOffer_arg1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
        ttu.idu0080.order.server.OrderProduct _getOffer_arg1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
        _getOffer_arg1OrderProductsVal1.setOrderProduct(-1810549346);
        _getOffer_arg1OrderProductsVal1.setPrice(0.57494944f);
        _getOffer_arg1OrderProductsVal1.setPriceTotal(0.30724412f);
        _getOffer_arg1OrderProductsVal1.setProductCount(1304906031);
        _getOffer_arg1OrderProductsVal1.setProductName("ProductName-769606418");
        _getOffer_arg1OrderProducts.add(_getOffer_arg1OrderProductsVal1);
        _getOffer_arg1.getOrderProducts().addAll(_getOffer_arg1OrderProducts);
        _getOffer_arg1.setPriceTotal(0.6071885f);
        ttu.idu0080.order.server.Seller _getOffer_arg1Seller = new ttu.idu0080.order.server.Seller();
        java.util.List<ttu.idu0080.order.server.EntAddress> _getOffer_arg1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
        ttu.idu0080.order.server.EntAddress _getOffer_arg1SellerAddressesVal1 = new ttu.idu0080.order.server.EntAddress();
        _getOffer_arg1SellerAddressesVal1.setAddress(-307618226);
        _getOffer_arg1SellerAddressesVal1.setCountry("Country514399107");
        _getOffer_arg1SellerAddressesVal1.setCounty("County1234735626");
        _getOffer_arg1SellerAddressesVal1.setStreetAddress("StreetAddress-976109741");
        _getOffer_arg1SellerAddressesVal1.setTownVillage("TownVillage2020982415");
        _getOffer_arg1SellerAddressesVal1.setZipcode("Zipcode-1615151154");
        _getOffer_arg1SellerAddresses.add(_getOffer_arg1SellerAddressesVal1);
        _getOffer_arg1Seller.getAddresses().addAll(_getOffer_arg1SellerAddresses);
        _getOffer_arg1Seller.setEnterprise(242442175);
        _getOffer_arg1Seller.setName("Name-222680924");
        _getOffer_arg1.setSeller(_getOffer_arg1Seller);
        ttu.idu0080.order.server.Address _getOffer_arg1ShippingAddress = new ttu.idu0080.order.server.Address();
        _getOffer_arg1ShippingAddress.setAddress(2027818339);
        _getOffer_arg1ShippingAddress.setCountry("Country-1059220776");
        _getOffer_arg1ShippingAddress.setCounty("County-857929008");
        _getOffer_arg1ShippingAddress.setStreetAddress("StreetAddress1091194684");
        _getOffer_arg1ShippingAddress.setTownVillage("TownVillage-1090064569");
        _getOffer_arg1ShippingAddress.setZipcode("Zipcode-1447843994");
        _getOffer_arg1.setShippingAddress(_getOffer_arg1ShippingAddress);
        ttu.idu0080.order.teenus.Pakkumine _getOffer__return = port.getOffer(_getOffer_arg0, _getOffer_arg1);
        System.out.println("getOffer.result=" + _getOffer__return);


        }

        System.exit(0);
    }

}
