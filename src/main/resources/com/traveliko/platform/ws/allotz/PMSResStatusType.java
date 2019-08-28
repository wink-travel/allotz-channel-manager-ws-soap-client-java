
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PMS_ResStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PMS_ResStatusType">
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16">
 *     &lt;enumeration value="Reserved"/>
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Request denied"/>
 *     &lt;enumeration value="No-show"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="In-house"/>
 *     &lt;enumeration value="Checked out"/>
 *     &lt;enumeration value="Waitlisted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PMS_ResStatusType", namespace = "http://www.opentravel.org/OTA/2003/05")
@XmlEnum
public enum PMSResStatusType {


    /**
     * The reservation has been reserved.
     * 
     */
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),

    /**
     * The reservation has been requested but has not yet been reserved.
     * 
     */
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),

    /**
     * The request for the reservation has been denied.
     * 
     */
    @XmlEnumValue("Request denied")
    REQUEST_DENIED("Request denied"),

    /**
     * This reservation is in "no show" status. Typically this means the person for whom this reservation belonged did not check in and the reservation was moved to "no show" status.
     * 
     */
    @XmlEnumValue("No-show")
    NO_SHOW("No-show"),

    /**
     * This reservation has been cancelled.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * This reservation has been check in, and is in "in-house" status.
     * 
     */
    @XmlEnumValue("In-house")
    IN_HOUSE("In-house"),

    /**
     * The guest has checked out and the reservation has been changed to "Checked out" status
     * 
     */
    @XmlEnumValue("Checked out")
    CHECKED_OUT("Checked out"),

    /**
     * This reservation is in waitlist status and the reservation has not been confirmed.
     * 
     */
    @XmlEnumValue("Waitlisted")
    WAITLISTED("Waitlisted");
    private final String value;

    PMSResStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PMSResStatusType fromValue(String v) {
        for (PMSResStatusType c: PMSResStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
