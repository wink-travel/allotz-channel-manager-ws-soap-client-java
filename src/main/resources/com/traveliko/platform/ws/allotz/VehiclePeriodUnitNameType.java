
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehiclePeriodUnitNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehiclePeriodUnitNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="RentalPeriod"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Weekend"/>
 *     &lt;enumeration value="ExtraMonth"/>
 *     &lt;enumeration value="Bundle"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="ExtraDay"/>
 *     &lt;enumeration value="ExtraHour"/>
 *     &lt;enumeration value="ExtraWeek"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehiclePeriodUnitNameType", namespace = "http://www.opentravel.org/OTA/2003/05")
@XmlEnum
public enum VehiclePeriodUnitNameType {

    @XmlEnumValue("RentalPeriod")
    RENTAL_PERIOD("RentalPeriod"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),

    /**
     * The calculation is for each weekend.
     * 
     */
    @XmlEnumValue("Weekend")
    WEEKEND("Weekend"),

    /**
     * The charge is based on an extra month.
     * 
     */
    @XmlEnumValue("ExtraMonth")
    EXTRA_MONTH("ExtraMonth"),

    /**
     * The rate is the same regardless of the number of days the vehicle is rented.
     * 
     */
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle"),

    /**
     * The charge is based on the package.
     * 
     */
    @XmlEnumValue("Package")
    PACKAGE("Package"),

    /**
     * The charge is based on an extra day.
     * 
     */
    @XmlEnumValue("ExtraDay")
    EXTRA_DAY("ExtraDay"),

    /**
     * The charge is based on an extra hour.
     * 
     */
    @XmlEnumValue("ExtraHour")
    EXTRA_HOUR("ExtraHour"),

    /**
     * The charge is based on an extra week.
     * 
     */
    @XmlEnumValue("ExtraWeek")
    EXTRA_WEEK("ExtraWeek");
    private final String value;

    VehiclePeriodUnitNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehiclePeriodUnitNameType fromValue(String v) {
        for (VehiclePeriodUnitNameType c: VehiclePeriodUnitNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
