
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleEquipmentPricedType complex type identifies the data that describes a priced piece of special equipment in association with the rental of a vehicle.  The data consists of the equipment and the correspondinng charge.
 * 
 * <p>Java class for VehicleEquipmentPricedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleEquipmentPricedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentType"/>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleEquipmentPricedType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "equipment",
    "charge"
})
public class VehicleEquipmentPricedType {

    @XmlElement(name = "Equipment", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected VehicleEquipmentType equipment;
    @XmlElement(name = "Charge", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected VehicleChargeType charge;
    @XmlAttribute(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentType }
     *     
     */
    public VehicleEquipmentType getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentType }
     *     
     */
    public void setEquipment(VehicleEquipmentType value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType }
     *     
     */
    public VehicleChargeType getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType }
     *     
     */
    public void setCharge(VehicleChargeType value) {
        this.charge = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
