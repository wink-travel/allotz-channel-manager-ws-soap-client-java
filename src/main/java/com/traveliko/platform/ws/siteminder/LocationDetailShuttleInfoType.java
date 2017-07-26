
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDetailShuttleInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailShuttleInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Transportation"/&gt;
 *     &lt;enumeration value="Frequency"/&gt;
 *     &lt;enumeration value="PickupInfo"/&gt;
 *     &lt;enumeration value="Distance"/&gt;
 *     &lt;enumeration value="ElapsedTime"/&gt;
 *     &lt;enumeration value="Fee"/&gt;
 *     &lt;enumeration value="Miscellaneous"/&gt;
 *     &lt;enumeration value="Hours"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailShuttleInfoType")
@XmlEnum
public enum LocationDetailShuttleInfoType {


    /**
     * Indicates that the associated information describes the shuttle, such as shared bus, tram, company-specific bus.
     * 
     */
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),

    /**
     * Indicates that the associated information describes the frequency with which the shuttle service operates.
     * 
     */
    @XmlEnumValue("Frequency")
    FREQUENCY("Frequency"),

    /**
     * Indicates that the associated information describes where the shuttle service picks up those who are renting vehicles, how to get to the shuttle pick up location, etc/
     * 
     */
    @XmlEnumValue("PickupInfo")
    PICKUP_INFO("PickupInfo"),

    /**
     * Indicates that the associated information describes the distance that the shuttle will travel, from point of pickup to arrival at the rental facility.
     * 
     */
    @XmlEnumValue("Distance")
    DISTANCE("Distance"),

    /**
     * Indicates that the associated information describes the approximate elapsed time from point of pickup to arrival at the rental facility.
     * 
     */
    @XmlEnumValue("ElapsedTime")
    ELAPSED_TIME("ElapsedTime"),

    /**
     * Indicates that the associated information describes any shuttle fees that may apply.
     * 
     */
    @XmlEnumValue("Fee")
    FEE("Fee"),

    /**
     * Indicates that the associated information describes miscellaneous information about the shuttle service.
     * 
     */
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),

    /**
     * Indicates the information pertains to the shuttle hours of operation.
     * 
     */
    @XmlEnumValue("Hours")
    HOURS("Hours");
    private final String value;

    LocationDetailShuttleInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailShuttleInfoType fromValue(String v) {
        for (LocationDetailShuttleInfoType c: LocationDetailShuttleInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
