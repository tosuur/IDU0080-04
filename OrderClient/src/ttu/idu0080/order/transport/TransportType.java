
package ttu.idu0080.order.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pakkumiseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportType", propOrder = {
    "pakkumiseId"
})
public class TransportType {

    protected String pakkumiseId;

    /**
     * Gets the value of the pakkumiseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPakkumiseId() {
        return pakkumiseId;
    }

    /**
     * Sets the value of the pakkumiseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPakkumiseId(String value) {
        this.pakkumiseId = value;
    }

}
