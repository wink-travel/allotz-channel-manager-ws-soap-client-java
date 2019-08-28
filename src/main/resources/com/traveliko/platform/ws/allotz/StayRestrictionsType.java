
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type defining Min and Max Stay Restrictions.
 * 
 * <p>Java class for StayRestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayRestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="MinimumStay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ReturnTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="MinStay" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                 &lt;attribute name="StayUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *                 &lt;attribute name="MinStayDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="ComplicatedRulesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaximumStay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ReturnType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="C"/>
 *                       &lt;enumeration value="S"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ReturnTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="MaxStay" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *                 &lt;attribute name="StayUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *                 &lt;attribute name="MaxStayDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="ComplicatedRulesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="StayRestrictionsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayRestrictionsType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "minimumStay",
    "maximumStay"
})
public class StayRestrictionsType {

    @XmlElement(name = "MinimumStay", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected StayRestrictionsType.MinimumStay minimumStay;
    @XmlElement(name = "MaximumStay", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected StayRestrictionsType.MaximumStay maximumStay;
    @XmlAttribute(name = "StayRestrictionsInd")
    protected Boolean stayRestrictionsInd;

    /**
     * Gets the value of the minimumStay property.
     * 
     * @return
     *     possible object is
     *     {@link StayRestrictionsType.MinimumStay }
     *     
     */
    public StayRestrictionsType.MinimumStay getMinimumStay() {
        return minimumStay;
    }

    /**
     * Sets the value of the minimumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictionsType.MinimumStay }
     *     
     */
    public void setMinimumStay(StayRestrictionsType.MinimumStay value) {
        this.minimumStay = value;
    }

    /**
     * Gets the value of the maximumStay property.
     * 
     * @return
     *     possible object is
     *     {@link StayRestrictionsType.MaximumStay }
     *     
     */
    public StayRestrictionsType.MaximumStay getMaximumStay() {
        return maximumStay;
    }

    /**
     * Sets the value of the maximumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictionsType.MaximumStay }
     *     
     */
    public void setMaximumStay(StayRestrictionsType.MaximumStay value) {
        this.maximumStay = value;
    }

    /**
     * Gets the value of the stayRestrictionsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStayRestrictionsInd() {
        return stayRestrictionsInd;
    }

    /**
     * Sets the value of the stayRestrictionsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStayRestrictionsInd(Boolean value) {
        this.stayRestrictionsInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ReturnType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="C"/>
     *             &lt;enumeration value="S"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="MaxStay" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *       &lt;attribute name="StayUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *       &lt;attribute name="MaxStayDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="ComplicatedRulesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MaximumStay {

        @XmlAttribute(name = "ReturnType")
        protected String returnType;
        @XmlAttribute(name = "ReturnTimeOfDay")
        protected String returnTimeOfDay;
        @XmlAttribute(name = "MaxStay")
        protected Integer maxStay;
        @XmlAttribute(name = "StayUnit")
        protected StayUnitType stayUnit;
        @XmlAttribute(name = "MaxStayDate")
        protected String maxStayDate;
        @XmlAttribute(name = "ComplicatedRulesInd")
        protected Boolean complicatedRulesInd;

        /**
         * Gets the value of the returnType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnType() {
            return returnType;
        }

        /**
         * Sets the value of the returnType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnType(String value) {
            this.returnType = value;
        }

        /**
         * Gets the value of the returnTimeOfDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnTimeOfDay() {
            return returnTimeOfDay;
        }

        /**
         * Sets the value of the returnTimeOfDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnTimeOfDay(String value) {
            this.returnTimeOfDay = value;
        }

        /**
         * Gets the value of the maxStay property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMaxStay() {
            return maxStay;
        }

        /**
         * Sets the value of the maxStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaxStay(Integer value) {
            this.maxStay = value;
        }

        /**
         * Gets the value of the stayUnit property.
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getStayUnit() {
            return stayUnit;
        }

        /**
         * Sets the value of the stayUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setStayUnit(StayUnitType value) {
            this.stayUnit = value;
        }

        /**
         * Gets the value of the maxStayDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxStayDate() {
            return maxStayDate;
        }

        /**
         * Sets the value of the maxStayDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxStayDate(String value) {
            this.maxStayDate = value;
        }

        /**
         * Gets the value of the complicatedRulesInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isComplicatedRulesInd() {
            return complicatedRulesInd;
        }

        /**
         * Sets the value of the complicatedRulesInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setComplicatedRulesInd(Boolean value) {
            this.complicatedRulesInd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="MinStay" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *       &lt;attribute name="StayUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *       &lt;attribute name="MinStayDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="ComplicatedRulesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MinimumStay {

        @XmlAttribute(name = "ReturnTimeOfDay")
        protected String returnTimeOfDay;
        @XmlAttribute(name = "MinStay")
        protected Integer minStay;
        @XmlAttribute(name = "StayUnit")
        protected StayUnitType stayUnit;
        @XmlAttribute(name = "MinStayDate")
        protected String minStayDate;
        @XmlAttribute(name = "ComplicatedRulesInd")
        protected Boolean complicatedRulesInd;

        /**
         * Gets the value of the returnTimeOfDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnTimeOfDay() {
            return returnTimeOfDay;
        }

        /**
         * Sets the value of the returnTimeOfDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnTimeOfDay(String value) {
            this.returnTimeOfDay = value;
        }

        /**
         * Gets the value of the minStay property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMinStay() {
            return minStay;
        }

        /**
         * Sets the value of the minStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMinStay(Integer value) {
            this.minStay = value;
        }

        /**
         * Gets the value of the stayUnit property.
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getStayUnit() {
            return stayUnit;
        }

        /**
         * Sets the value of the stayUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setStayUnit(StayUnitType value) {
            this.stayUnit = value;
        }

        /**
         * Gets the value of the minStayDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinStayDate() {
            return minStayDate;
        }

        /**
         * Sets the value of the minStayDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinStayDate(String value) {
            this.minStayDate = value;
        }

        /**
         * Gets the value of the complicatedRulesInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isComplicatedRulesInd() {
            return complicatedRulesInd;
        }

        /**
         * Sets the value of the complicatedRulesInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setComplicatedRulesInd(Boolean value) {
            this.complicatedRulesInd = value;
        }

    }

}
