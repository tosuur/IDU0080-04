
package ttu.idu0080.order.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrdersByCustomerId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrdersByCustomerId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrdersByCustomerId", propOrder = {
    "customerId"
})
public class GetOrdersByCustomerId {

    @XmlElement(name = "customer_id")
    protected int customerId;

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

}
