
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDetailRequirementAgeInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailRequirementAgeInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="MinimumAge"/>
 *     &lt;enumeration value="MinimumAgeExceptions"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailRequirementAgeInfoType")
@XmlEnum
public enum LocationDetailRequirementAgeInfoType {


    /**
     * Indicates that the associated information describes requirements and restrictions concerning the minimum age permitted for the rental of a vehicle.
     * 
     */
    @XmlEnumValue("MinimumAge")
    MINIMUM_AGE("MinimumAge"),

    /**
     * Indicates that the associated information describes the exceptions to the requirements and restrictions concerning the minimum age permitted for the rental of a vehicle.
     * 
     */
    @XmlEnumValue("MinimumAgeExceptions")
    MINIMUM_AGE_EXCEPTIONS("MinimumAgeExceptions"),

    /**
     * Indicates that the associated information describes miscellaneous requirements and restrictions with regard to the age of the renter of a vehicle.
     * 
     */
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    LocationDetailRequirementAgeInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailRequirementAgeInfoType fromValue(String v) {
        for (LocationDetailRequirementAgeInfoType c: LocationDetailRequirementAgeInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
