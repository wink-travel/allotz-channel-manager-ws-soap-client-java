
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USTimeZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USTimeZoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "USTimeZoneType", namespace = "http://www.opentravel.org/OTA/2003/05")
@XmlEnum
public enum USTimeZoneType {

    P,
    M,
    C,
    E;

    public String value() {
        return name();
    }

    public static USTimeZoneType fromValue(String v) {
        return valueOf(v);
    }

}
