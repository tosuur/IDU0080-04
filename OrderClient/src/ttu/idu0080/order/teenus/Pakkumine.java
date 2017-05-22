
package ttu.idu0080.order.teenus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pakkumine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pakkumine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="offerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pakkumine", propOrder = {
    "deliveryTime",
    "offerId",
    "price"
})
public class Pakkumine {

    protected int deliveryTime;
    protected String offerId;
    protected float price;

    /**
     * Gets the value of the deliveryTime property.
     * 
     */
    public int getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     */
    public void setDeliveryTime(int value) {
        this.deliveryTime = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

}
