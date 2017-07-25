
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="DO"/&gt;
 *     &lt;enumeration value="EH"/&gt;
 *     &lt;enumeration value="FE"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PN"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="TS"/&gt;
 *     &lt;enumeration value="WH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalIndicatorType")
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
