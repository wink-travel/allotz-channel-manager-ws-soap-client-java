
package com.traveliko.platform.ws.allotz;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of LengthOfStay.
 * 
 * <p>Java class for LengthsOfStayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LengthsOfStayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LengthOfStay" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LOS_Pattern" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FullPatternLOS" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="OpenStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MinMaxMessageType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="SetMinLOS"/>
 *                       &lt;enumeration value="RemoveMinLOS"/>
 *                       &lt;enumeration value="SetMaxLOS"/>
 *                       &lt;enumeration value="RemoveMaxLOS"/>
 *                       &lt;enumeration value="SetForwardMinStay"/>
 *                       &lt;enumeration value="RemoveForwardMinStay"/>
 *                       &lt;enumeration value="SetForwardMaxStay"/>
 *                       &lt;enumeration value="RemoveForwardMaxStay"/>
 *                       &lt;enumeration value="FixedLOS"/>
 *                       &lt;enumeration value="FullPatternLOS"/>
 *                       &lt;enumeration value="MinLOS"/>
 *                       &lt;enumeration value="MaxLOS"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ArrivalDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FixedPatternLength" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthsOfStayType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "lengthOfStay"
})
public class LengthsOfStayType {

    @XmlElement(name = "LengthOfStay", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected List<LengthsOfStayType.LengthOfStay> lengthOfStay;
    @XmlAttribute(name = "ArrivalDateBased")
    protected Boolean arrivalDateBased;
    @XmlAttribute(name = "FixedPatternLength")
    protected Integer fixedPatternLength;

    /**
     * Gets the value of the lengthOfStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lengthOfStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthOfStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthsOfStayType.LengthOfStay }
     * 
     * 
     */
    public List<LengthsOfStayType.LengthOfStay> getLengthOfStay() {
        if (lengthOfStay == null) {
            lengthOfStay = new ArrayList<LengthsOfStayType.LengthOfStay>();
        }
        return this.lengthOfStay;
    }

    /**
     * Gets the value of the arrivalDateBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivalDateBased() {
        return arrivalDateBased;
    }

    /**
     * Sets the value of the arrivalDateBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivalDateBased(Boolean value) {
        this.arrivalDateBased = value;
    }

    /**
     * Gets the value of the fixedPatternLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFixedPatternLength() {
        return fixedPatternLength;
    }

    /**
     * Sets the value of the fixedPatternLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFixedPatternLength(Integer value) {
        this.fixedPatternLength = value;
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
     *       &lt;sequence>
     *         &lt;element name="LOS_Pattern" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FullPatternLOS" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="OpenStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MinMaxMessageType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="SetMinLOS"/>
     *             &lt;enumeration value="RemoveMinLOS"/>
     *             &lt;enumeration value="SetMaxLOS"/>
     *             &lt;enumeration value="RemoveMaxLOS"/>
     *             &lt;enumeration value="SetForwardMinStay"/>
     *             &lt;enumeration value="RemoveForwardMinStay"/>
     *             &lt;enumeration value="SetForwardMaxStay"/>
     *             &lt;enumeration value="RemoveForwardMaxStay"/>
     *             &lt;enumeration value="FixedLOS"/>
     *             &lt;enumeration value="FullPatternLOS"/>
     *             &lt;enumeration value="MinLOS"/>
     *             &lt;enumeration value="MaxLOS"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "losPattern"
    })
    public static class LengthOfStay {

        @XmlElement(name = "LOS_Pattern", namespace = "http://www.opentravel.org/OTA/2003/05")
        protected LengthsOfStayType.LengthOfStay.LOSPattern losPattern;
        @XmlAttribute(name = "Time")
        protected BigInteger time;
        @XmlAttribute(name = "TimeUnit")
        protected TimeUnitType timeUnit;
        @XmlAttribute(name = "OpenStatusIndicator")
        protected Boolean openStatusIndicator;
        @XmlAttribute(name = "MinMaxMessageType")
        protected String minMaxMessageType;

        /**
         * Gets the value of the losPattern property.
         * 
         * @return
         *     possible object is
         *     {@link LengthsOfStayType.LengthOfStay.LOSPattern }
         *     
         */
        public LengthsOfStayType.LengthOfStay.LOSPattern getLOSPattern() {
            return losPattern;
        }

        /**
         * Sets the value of the losPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link LengthsOfStayType.LengthOfStay.LOSPattern }
         *     
         */
        public void setLOSPattern(LengthsOfStayType.LengthOfStay.LOSPattern value) {
            this.losPattern = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTime(BigInteger value) {
            this.time = value;
        }

        /**
         * Gets the value of the timeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getTimeUnit() {
            return timeUnit;
        }

        /**
         * Sets the value of the timeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setTimeUnit(TimeUnitType value) {
            this.timeUnit = value;
        }

        /**
         * Gets the value of the openStatusIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOpenStatusIndicator() {
            return openStatusIndicator;
        }

        /**
         * Sets the value of the openStatusIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOpenStatusIndicator(Boolean value) {
            this.openStatusIndicator = value;
        }

        /**
         * Gets the value of the minMaxMessageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinMaxMessageType() {
            return minMaxMessageType;
        }

        /**
         * Sets the value of the minMaxMessageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinMaxMessageType(String value) {
            this.minMaxMessageType = value;
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
         *       &lt;attribute name="FullPatternLOS" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LOSPattern {

            @XmlAttribute(name = "FullPatternLOS")
            protected String fullPatternLOS;

            /**
             * Gets the value of the fullPatternLOS property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullPatternLOS() {
                return fullPatternLOS;
            }

            /**
             * Sets the value of the fullPatternLOS property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullPatternLOS(String value) {
                this.fullPatternLOS = value;
            }

        }

    }

}
