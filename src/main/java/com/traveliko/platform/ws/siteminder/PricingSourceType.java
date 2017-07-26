
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Published"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PricingSourceType")
@XmlEnum
public enum PricingSourceType {


    /**
     * Published fare.
     * 
     */
    @XmlEnumValue("Published")
    PUBLISHED("Published"),

    /**
     * Private fare.
     * 
     */
    @XmlEnumValue("Private")
    PRIVATE("Private"),

    /**
     * Fare is both public and private.
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    PricingSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingSourceType fromValue(String v) {
        for (PricingSourceType c: PricingSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
