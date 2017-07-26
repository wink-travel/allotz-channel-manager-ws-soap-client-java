
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Add-Update"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Replace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionType")
@XmlEnum
public enum ActionType {


    /**
     * Typically used to add an item where it does not exist or to update an item where it does exist.
     * 
     */
    @XmlEnumValue("Add-Update")
    ADD_UPDATE("Add-Update"),

    /**
     * Typically used to cancel an existing item.
     * 
     */
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     * Typically used to remove specified data.
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * Typically used to add data whether data already exists or not.
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * Typically used to overlay existing data.
     * 
     */
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    ActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionType fromValue(String v) {
        for (ActionType c: ActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
