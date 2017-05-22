
package ttu.idu0080.order.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for courier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="courier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addresses" type="{http://server.order.idu0080.ttu/}entAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="enterprise" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percent_from_order" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courier", propOrder = {
    "addresses",
    "enterprise",
    "name",
    "percentFromOrder"
})
public class Courier {

    @XmlElement(nillable = true)
    protected List<EntAddress> addresses;
    protected int enterprise;
    protected String name;
    @XmlElement(name = "percent_from_order")
    protected int percentFromOrder;

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntAddress }
     * 
     * 
     */
    public List<EntAddress> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<EntAddress>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the enterprise property.
     * 
     */
    public int getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     */
    public void setEnterprise(int value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the percentFromOrder property.
     * 
     */
    public int getPercentFromOrder() {
        return percentFromOrder;
    }

    /**
     * Sets the value of the percentFromOrder property.
     * 
     */
    public void setPercentFromOrder(int value) {
        this.percentFromOrder = value;
    }

}
