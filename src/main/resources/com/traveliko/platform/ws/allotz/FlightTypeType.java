
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Nonstop"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Connection"/>
 *     &lt;enumeration value="SingleConnection"/>
 *     &lt;enumeration value="DoubleConnection"/>
 *     &lt;enumeration value="OneStopOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightTypeType", namespace = "http://www.opentravel.org/OTA/2003/05")
@XmlEnum
public enum FlightTypeType {


    /**
     * Indicates the flight does not make any scheduled stops between 2 points.
     * 
     */
    @XmlEnumValue("Nonstop")
    NONSTOP("Nonstop"),

    /**
     * Indicates the flight makes a scheduled stop(s) between 2 points.
     * 
     */
    @XmlEnumValue("Direct")
    DIRECT("Direct"),

    /**
     * Indicates the flight will require a change of aircraft at a connecting point(s).
     * 
     */
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),

    /**
     * A trip with only one connection.
     * 
     */
    @XmlEnumValue("SingleConnection")
    SINGLE_CONNECTION("SingleConnection"),

    /**
     * A trip with only two connections.
     * 
     */
    @XmlEnumValue("DoubleConnection")
    DOUBLE_CONNECTION("DoubleConnection"),

    /**
     * Indicates that the flight makes only one stop.
     * 
     */
    @XmlEnumValue("OneStopOnly")
    ONE_STOP_ONLY("OneStopOnly");
    private final String value;

    FlightTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightTypeType fromValue(String v) {
        for (FlightTypeType c: FlightTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
