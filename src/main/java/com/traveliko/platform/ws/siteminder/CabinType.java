
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CabinType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="First"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Economy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CabinType")
@XmlEnum
public enum CabinType {


    /**
     * First class compartment.
     * 
     */
    @XmlEnumValue("First")
    FIRST("First"),

    /**
     * Business class compartment.
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),

    /**
     * Economy (or sometimes referred to as Coach) class compartment.
     * 
     */
    @XmlEnumValue("Economy")
    ECONOMY("Economy");
    private final String value;

    CabinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinType fromValue(String v) {
        for (CabinType c: CabinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
