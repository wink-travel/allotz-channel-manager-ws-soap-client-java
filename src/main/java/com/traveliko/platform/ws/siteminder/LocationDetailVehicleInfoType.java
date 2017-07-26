
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDetailVehicleInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailVehicleInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="GeneralInformation"/&gt;
 *     &lt;enumeration value="Disclaimer"/&gt;
 *     &lt;enumeration value="AdvancedBooking"/&gt;
 *     &lt;enumeration value="NonSmokingVehicles"/&gt;
 *     &lt;enumeration value="SpecialityVehicles"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailVehicleInfoType")
@XmlEnum
public enum LocationDetailVehicleInfoType {


    /**
     * Indicates that the associated information describes general information about the vehicles that are typically offered for rental.
     * 
     */
    @XmlEnumValue("GeneralInformation")
    GENERAL_INFORMATION("GeneralInformation"),

    /**
     * Indicates that the associated information provides the disclaimers about the vehicles that are typically offered for rental.  This may be typically that not all vehicles may be available at any one time, for example.
     * 
     */
    @XmlEnumValue("Disclaimer")
    DISCLAIMER("Disclaimer"),

    /**
     * Indicates that the associated information describes any advance booking requiremennts about one or more vehicle types.  Some unusual vehicles may not be available at short notice.
     * 
     */
    @XmlEnumValue("AdvancedBooking")
    ADVANCED_BOOKING("AdvancedBooking"),

    /**
     * Indicates that the associated information describes general information about non-smoking vehicles that may be offered for rental.
     * 
     */
    @XmlEnumValue("NonSmokingVehicles")
    NON_SMOKING_VEHICLES("NonSmokingVehicles"),

    /**
     * Indicates that the associated information describes special, unusual or high-end vehicles that may be offered for rental.
     * 
     */
    @XmlEnumValue("SpecialityVehicles")
    SPECIALITY_VEHICLES("SpecialityVehicles");
    private final String value;

    LocationDetailVehicleInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailVehicleInfoType fromValue(String v) {
        for (LocationDetailVehicleInfoType c: LocationDetailVehicleInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
