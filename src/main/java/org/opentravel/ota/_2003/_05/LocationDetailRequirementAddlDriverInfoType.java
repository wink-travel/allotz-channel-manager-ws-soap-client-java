
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDetailRequirementAddlDriverInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailRequirementAddlDriverInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="IncludedAuthorized"/>
 *     &lt;enumeration value="AdditionalAuthorized"/>
 *     &lt;enumeration value="Fees"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailRequirementAddlDriverInfoType")
@XmlEnum
public enum LocationDetailRequirementAddlDriverInfoType {


    /**
     * Indicates that the associated information describes requirements and restrictions with regard to additional drivers that are automatically authorized as additional drivers of the rented vehicle.  The information may provide details on the type of person or relation to the renter that would result in a person being automatically included as an additional driver.
     * 
     */
    @XmlEnumValue("IncludedAuthorized")
    INCLUDED_AUTHORIZED("IncludedAuthorized"),

    /**
     * Indicates that the associated information describes requirements and restrictions with regard to others who are not automatically authorized as additional drivers of the rented vehicle.  The information may provide details on what should be done to attain such authorization.
     * 
     */
    @XmlEnumValue("AdditionalAuthorized")
    ADDITIONAL_AUTHORIZED("AdditionalAuthorized"),

    /**
     * Indicates that the associated information describes fees that may be due, based on additional drivers of the rented vehicle.
     * 
     */
    @XmlEnumValue("Fees")
    FEES("Fees"),

    /**
     * Indicates that the associated information describes miscellaneous requirements and restrictions with regard to additional drivers of the rented vehicle.
     * 
     */
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    LocationDetailRequirementAddlDriverInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailRequirementAddlDriverInfoType fromValue(String v) {
        for (LocationDetailRequirementAddlDriverInfoType c: LocationDetailRequirementAddlDriverInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
