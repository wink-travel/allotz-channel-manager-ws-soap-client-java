
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDetailRequirementInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailRequirementInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="OneWayRental"/&gt;
 *     &lt;enumeration value="Geographic"/&gt;
 *     &lt;enumeration value="DropOff"/&gt;
 *     &lt;enumeration value="License"/&gt;
 *     &lt;enumeration value="Insurance"/&gt;
 *     &lt;enumeration value="Eligibility"/&gt;
 *     &lt;enumeration value="Miscellaneous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailRequirementInfoType")
@XmlEnum
public enum LocationDetailRequirementInfoType {


    /**
     * Indicates that the associated information describes the requirements and restrictions concerning one way rentals
     * 
     */
    @XmlEnumValue("OneWayRental")
    ONE_WAY_RENTAL("OneWayRental"),

    /**
     * Indicates that the associated information describes the requirements and restrictions concerning geographic limitations, for example, the vehicle may only be driven into adjoining states, the vehicle may not be taken in Mexico, etc.
     * 
     */
    @XmlEnumValue("Geographic")
    GEOGRAPHIC("Geographic"),

    /**
     * Indicates that the associated information describes the requirements and restrictions concerning the dropoff, or return, of the vehicle.
     * 
     */
    @XmlEnumValue("DropOff")
    DROP_OFF("DropOff"),

    /**
     * Indicates that the associated information describes the requirements and restrictions concerning the renter's drivers license and associated factors, such as driving record, violations, etc. 
     * 
     */
    @XmlEnumValue("License")
    LICENSE("License"),

    /**
     * Indicates that the associated information describes the requirements and restrictions concerning insurance for the vehicle that is being rented. 
     * 
     */
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),

    /**
     * Indicates that the associated information describes the requirements and restrictions concerning the eligibility of those who may rent from a specific rental facility.  For example, a rental facility may be at the premises of a corporation, and only those corporate employees may rent from that location.  The facility is not considered a public rental facility.
     * 
     */
    @XmlEnumValue("Eligibility")
    ELIGIBILITY("Eligibility"),

    /**
     * Indicates that the associated information describes miscellaneous requirements and restrictions.
     * 
     */
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    LocationDetailRequirementInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailRequirementInfoType fromValue(String v) {
        for (LocationDetailRequirementInfoType c: LocationDetailRequirementInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
