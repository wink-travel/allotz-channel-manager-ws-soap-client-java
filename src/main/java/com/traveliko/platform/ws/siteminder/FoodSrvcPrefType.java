
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Indicates preferences for type of food service facilities in a hotel.
 * 
 * <p>Java class for FoodSrvcPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodSrvcPrefType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;StringLength1to128"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/&gt;
 *       &lt;attribute name="FoodSrvcType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodSrvcPrefType", propOrder = {
    "value"
})
public class FoodSrvcPrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "FoodSrvcType")
    protected String foodSrvcType;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Used for Character Strings, length 1 to 128.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the foodSrvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodSrvcType() {
        return foodSrvcType;
    }

    /**
     * Sets the value of the foodSrvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodSrvcType(String value) {
        this.foodSrvcType = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

}