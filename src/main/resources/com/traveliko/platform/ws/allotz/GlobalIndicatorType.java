
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="FE"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="WH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GlobalIndicatorType", namespace = "http://www.opentravel.org/OTA/2003/05")
@XmlEnum
public enum GlobalIndicatorType {


    /**
     * Atlantic/Pacific Round-the-World
     * 
     */
    AP,

    /**
     * Atlantic Ocean
     * 
     */
    AT,

    /**
     * Circle trip
     * 
     */
    CT,

    /**
     * Domestic
     * 
     */
    DO,

    /**
     * Eastern Hemisphere
     * 
     */
    EH,

    /**
     * Within the Far East
     * 
     */
    FE,

    /**
     * Pacific Ocean
     * 
     */
    PA,

    /**
     * TC1-TC3 via Pacific/N. America
     * 
     */
    PN,

    /**
     * Polar Route
     * 
     */
    PO,

    /**
     * Russia Area 3
     * 
     */
    RU,

    /**
     * Round the world
     * 
     */
    RW,

    /**
     * South Atlantic only
     * 
     */
    SA,

    /**
     * Trans Siberia Route
     * 
     */
    TS,

    /**
     * Western Hemisphere
     * 
     */
    WH;

    public String value() {
        return name();
    }

    public static GlobalIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
