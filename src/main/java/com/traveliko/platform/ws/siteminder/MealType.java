
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MealType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MealType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVML"/&gt;
 *     &lt;enumeration value="BBML"/&gt;
 *     &lt;enumeration value="BLML"/&gt;
 *     &lt;enumeration value="CHML"/&gt;
 *     &lt;enumeration value="DBML"/&gt;
 *     &lt;enumeration value="FPML"/&gt;
 *     &lt;enumeration value="GFML"/&gt;
 *     &lt;enumeration value="HFML"/&gt;
 *     &lt;enumeration value="HNML"/&gt;
 *     &lt;enumeration value="KSML"/&gt;
 *     &lt;enumeration value="LCML"/&gt;
 *     &lt;enumeration value="LFML"/&gt;
 *     &lt;enumeration value="LPML"/&gt;
 *     &lt;enumeration value="LSML"/&gt;
 *     &lt;enumeration value="MOML"/&gt;
 *     &lt;enumeration value="NLML"/&gt;
 *     &lt;enumeration value="ORML"/&gt;
 *     &lt;enumeration value="PRML"/&gt;
 *     &lt;enumeration value="RVML"/&gt;
 *     &lt;enumeration value="SFML"/&gt;
 *     &lt;enumeration value="SPML"/&gt;
 *     &lt;enumeration value="VGML"/&gt;
 *     &lt;enumeration value="VLML"/&gt;
 *     &lt;enumeration value="RGML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MealType")
@XmlEnum
public enum MealType {


    /**
     * AVML - Asian Veg
     * 
     */
    AVML,

    /**
     * BBML - Baby/Infant Food
     * 
     */
    BBML,

    /**
     * BLML - Bland Meal
     * 
     */
    BLML,

    /**
     * CHML - Child Meal
     * 
     */
    CHML,

    /**
     * DBML - Diabetic
     * 
     */
    DBML,

    /**
     * FPML - Fruit Meal
     * 
     */
    FPML,

    /**
     * GFML - Gluten Free
     * 
     */
    GFML,

    /**
     * HFML - High Fiber
     * 
     */
    HFML,

    /**
     * HNML - Hindu Meal
     * 
     */
    HNML,

    /**
     * KSML - Kosher
     * 
     */
    KSML,

    /**
     * LCML - Low Calorie
     * 
     */
    LCML,

    /**
     * LFML - Low Cholesterol
     * 
     */
    LFML,

    /**
     * LPML - Low Protein
     * 
     */
    LPML,

    /**
     * LSML - Low Sodium/No Salt
     * 
     */
    LSML,

    /**
     * MOML - Moslem
     * 
     */
    MOML,

    /**
     * NLML - Non-Lactose
     * 
     */
    NLML,

    /**
     * ORML - Oriental
     * 
     */
    ORML,

    /**
     * PRML - Low Purin
     * 
     */
    PRML,

    /**
     * RVML - Raw Vegetarian
     * 
     */
    RVML,

    /**
     * SFML - Seafood
     * 
     */
    SFML,

    /**
     * SPML - Special/Specify
     * 
     */
    SPML,

    /**
     * VGML - Vegetarian/Non Dairy
     * 
     */
    VGML,

    /**
     * VLML - Vegetarian/Milk/Eggs
     * 
     */
    VLML,

    /**
     * Designates a regular meal.
     * 
     */
    RGML;

    public String value() {
        return name();
    }

    public static MealType fromValue(String v) {
        return valueOf(v);
    }

}
