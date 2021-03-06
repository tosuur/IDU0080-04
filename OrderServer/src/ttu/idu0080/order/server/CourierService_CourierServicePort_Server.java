
package ttu.idu0080.order.server;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-05-15T23:54:27.213+03:00
 * Generated source version: 3.1.10
 * 
 */
 
public class CourierService_CourierServicePort_Server{

    protected CourierService_CourierServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new CourierServiceImpl();
        String address = "http://tund.ttu.ee:80/orderservice/couriers";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new CourierService_CourierServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
