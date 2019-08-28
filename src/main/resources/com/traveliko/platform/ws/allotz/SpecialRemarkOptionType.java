
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRemarkOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialRemarkOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Itinerary"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Endorsement"/>
 *     &lt;enumeration value="Save"/>
 *     &lt;enumeration value="Confidential"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="GRMS"/>
 *     &lt;enumeration value="Split"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialRemarkOptionType", namespace = "http://www.opentravel.org/OTA/2003/05")
@XmlEnum
public enum SpecialRemarkOptionType {


    /**
     * Remarks apply to the itinerary.
     * 
     */
    @XmlEnumValue("Itinerary")
    ITINERARY("Itinerary"),

    /**
     * Remarks apply to the invoice.
     * 
     */
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),

    /**
     * Remarks apply to the endorsement.
     * 
     */
    @XmlEnumValue("Endorsement")
    ENDORSEMENT("Endorsement"),

    /**
     * Remarks which can be deleted by the author only.
     * 
     */
    @XmlEnumValue("Save")
    SAVE("Save"),

    /**
     * Confidential remarks which are visible only to the author and system providers.
     * 
     */
    @XmlEnumValue("Confidential")
    CONFIDENTIAL("Confidential"),

    /**
     * Free text remarks which can be sent to specific airlines.
     * 
     */
    @XmlEnumValue("Free")
    FREE("Free"),

    /**
     * Remarks from or to a specific group revenue management system (GRMS).
     * 
     */
    GRMS("GRMS"),

    /**
     * Remarks containing information about split transaction (Split off PNR address, time, who, etc.).
     * 
     */
    @XmlEnumValue("Split")
    SPLIT("Split");
    private final String value;

    SpecialRemarkOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialRemarkOptionType fromValue(String v) {
        for (SpecialRemarkOptionType c: SpecialRemarkOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
