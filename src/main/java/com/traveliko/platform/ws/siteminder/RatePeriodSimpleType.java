
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatePeriodSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RatePeriodSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Hourly"/&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *     &lt;enumeration value="Weekly"/&gt;
 *     &lt;enumeration value="Monthly"/&gt;
 *     &lt;enumeration value="WeekendDay"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Package"/&gt;
 *     &lt;enumeration value="Bundle"/&gt;
 *     &lt;enumeration value="Total"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RatePeriodSimpleType")
@XmlEnum
public enum RatePeriodSimpleType {

    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("WeekendDay")
    WEEKEND_DAY("WeekendDay"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The rate period is based on the package.
     * 
     */
    @XmlEnumValue("Package")
    PACKAGE("Package"),

    /**
     * The rate is the same regardless of the number of days the vehicle is rented
     * 
     */
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle"),

    /**
     * The rate is the total, no specific rate period.
     * 
     */
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    RatePeriodSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RatePeriodSimpleType fromValue(String v) {
        for (RatePeriodSimpleType c: RatePeriodSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
