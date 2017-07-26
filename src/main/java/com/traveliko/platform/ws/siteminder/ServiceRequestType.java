
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Describes a customer request for a service or facility which is not directly bookable in the supplier's system and may have to be passed on to the ultimate provider of the service e.g. flowers in room; low floor room etc.
 * 
 * <p>Java class for ServiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;StringLength1to32"&gt;
 *       &lt;attribute name="TravelSector" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *       &lt;attribute name="InventoryItemRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestType", propOrder = {
    "value"
})
public class ServiceRequestType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "TravelSector")
    protected String travelSector;
    @XmlAttribute(name = "InventoryItemRPH")
    protected String inventoryItemRPH;

    /**
     * Used for Character Strings, length 1 to 32.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the travelSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelSector() {
        return travelSector;
    }

    /**
     * Sets the value of the travelSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelSector(String value) {
        this.travelSector = value;
    }

    /**
     * Gets the value of the inventoryItemRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryItemRPH() {
        return inventoryItemRPH;
    }

    /**
     * Sets the value of the inventoryItemRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryItemRPH(String value) {
        this.inventoryItemRPH = value;
    }

}
