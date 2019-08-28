
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
 * Describes the row details in a seat map
 * 
 * <p>Java class for RowDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirSeats">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirSeat" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatDetailsGroup"/>
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirRowCharacteristics">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CharacteristicList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxNumberOfSeats" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *       &lt;attribute name="RowNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AirBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowDetailsType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "airSeats",
    "airRowCharacteristics"
})
public class RowDetailsType {

    @XmlElement(name = "AirSeats", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected RowDetailsType.AirSeats airSeats;
    @XmlElement(name = "AirRowCharacteristics", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected RowDetailsType.AirRowCharacteristics airRowCharacteristics;
    @XmlAttribute(name = "MaxNumberOfSeats")
    protected Integer maxNumberOfSeats;
    @XmlAttribute(name = "RowNumber", required = true)
    protected BigInteger rowNumber;
    @XmlAttribute(name = "AirBookDesigCode")
    protected String airBookDesigCode;

    /**
     * Gets the value of the airSeats property.
     * 
     * @return
     *     possible object is
     *     {@link RowDetailsType.AirSeats }
     *     
     */
    public RowDetailsType.AirSeats getAirSeats() {
        return airSeats;
    }

    /**
     * Sets the value of the airSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowDetailsType.AirSeats }
     *     
     */
    public void setAirSeats(RowDetailsType.AirSeats value) {
        this.airSeats = value;
    }

    /**
     * Gets the value of the airRowCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link RowDetailsType.AirRowCharacteristics }
     *     
     */
    public RowDetailsType.AirRowCharacteristics getAirRowCharacteristics() {
        return airRowCharacteristics;
    }

    /**
     * Sets the value of the airRowCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowDetailsType.AirRowCharacteristics }
     *     
     */
    public void setAirRowCharacteristics(RowDetailsType.AirRowCharacteristics value) {
        this.airRowCharacteristics = value;
    }

    /**
     * Gets the value of the maxNumberOfSeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    /**
     * Sets the value of the maxNumberOfSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfSeats(Integer value) {
        this.maxNumberOfSeats = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the airBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirBookDesigCode() {
        return airBookDesigCode;
    }

    /**
     * Sets the value of the airBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirBookDesigCode(String value) {
        this.airBookDesigCode = value;
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
     *       &lt;attribute name="CharacteristicList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirRowCharacteristics {

        @XmlAttribute(name = "CharacteristicList", required = true)
        protected List<String> characteristicList;

        /**
         * Gets the value of the characteristicList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characteristicList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacteristicList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCharacteristicList() {
            if (characteristicList == null) {
                characteristicList = new ArrayList<String>();
            }
            return this.characteristicList;
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
     *       &lt;sequence>
     *         &lt;element name="AirSeat" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatDetailsGroup"/>
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airSeat"
    })
    public static class AirSeats {

        @XmlElement(name = "AirSeat", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected List<RowDetailsType.AirSeats.AirSeat> airSeat;

        /**
         * Gets the value of the airSeat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airSeat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirSeat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RowDetailsType.AirSeats.AirSeat }
         * 
         * 
         */
        public List<RowDetailsType.AirSeats.AirSeat> getAirSeat() {
            if (airSeat == null) {
                airSeat = new ArrayList<RowDetailsType.AirSeats.AirSeat>();
            }
            return this.airSeat;
        }


        /**
         * Describes the seat attributes.
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatDetailsGroup"/>
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirSeat {

            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "SeatAvailability")
            protected String seatAvailability;
            @XmlAttribute(name = "SeatNumber", required = true)
            protected String seatNumber;
            @XmlAttribute(name = "SeatCharacteristics", required = true)
            protected List<String> seatCharacteristics;
            @XmlAttribute(name = "AirBookDesigCode")
            protected String airBookDesigCode;

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * Gets the value of the seatAvailability property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeatAvailability() {
                return seatAvailability;
            }

            /**
             * Sets the value of the seatAvailability property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeatAvailability(String value) {
                this.seatAvailability = value;
            }

            /**
             * Gets the value of the seatNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeatNumber() {
                return seatNumber;
            }

            /**
             * Sets the value of the seatNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeatNumber(String value) {
                this.seatNumber = value;
            }

            /**
             * Gets the value of the seatCharacteristics property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatCharacteristics property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatCharacteristics().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSeatCharacteristics() {
                if (seatCharacteristics == null) {
                    seatCharacteristics = new ArrayList<String>();
                }
                return this.seatCharacteristics;
            }

            /**
             * Gets the value of the airBookDesigCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirBookDesigCode() {
                return airBookDesigCode;
            }

            /**
             * Sets the value of the airBookDesigCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirBookDesigCode(String value) {
                this.airBookDesigCode = value;
            }

        }

    }

}
