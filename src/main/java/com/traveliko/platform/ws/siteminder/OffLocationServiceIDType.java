
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffLocationServiceID_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OffLocationServiceID_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="CustPickUp"/&gt;
 *     &lt;enumeration value="VehDelivery"/&gt;
 *     &lt;enumeration value="CustDropOff"/&gt;
 *     &lt;enumeration value="VehCollection"/&gt;
 *     &lt;enumeration value="Exchange"/&gt;
 *     &lt;enumeration value="RepairLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OffLocationServiceID_Type")
@XmlEnum
public enum OffLocationServiceIDType {


    /**
     * Indicates that the associated information describes an offered service by which the customer may be picked up and taken to the rental facility, to rent a vehicle.
     * 
     */
    @XmlEnumValue("CustPickUp")
    CUST_PICK_UP("CustPickUp"),

    /**
     * Indicates that the associated information describes an offered service by which the vehicle may be delivered to a location, rather than the customer taking delivery at the rental facility.
     * 
     */
    @XmlEnumValue("VehDelivery")
    VEH_DELIVERY("VehDelivery"),

    /**
     * Indicates that the associated information describes an offered service by which the customer may be dropped off at a location after the vehicle rental period has ended.
     * 
     */
    @XmlEnumValue("CustDropOff")
    CUST_DROP_OFF("CustDropOff"),

    /**
     * Indicates that the associated information describes an offered service by which the vehicle may be collected from a location, rather than the customer returning the vehicle to the rental facility.
     * 
     */
    @XmlEnumValue("VehCollection")
    VEH_COLLECTION("VehCollection"),

    /**
     * Indicates that the associated information describes an offered service by which the customer will be delivered the exchanged car.
     * 
     */
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),

    /**
     * Location where a customer's vehicle is being repaired.
     * 
     */
    @XmlEnumValue("RepairLocation")
    REPAIR_LOCATION("RepairLocation");
    private final String value;

    OffLocationServiceIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OffLocationServiceIDType fromValue(String v) {
        for (OffLocationServiceIDType c: OffLocationServiceIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
