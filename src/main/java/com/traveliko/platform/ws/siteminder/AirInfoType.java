
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the Air Deviation Request information.
 * 
 * <p>Java class for AirInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}OperatingAirlineType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DepartureDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
 *       &lt;attribute name="AirlineCabinClass" type="{http://www.opentravel.org/OTA/2003/05}CabinType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirInfoType", propOrder = {
    "departureCity",
    "arrivalCity",
    "airline"
})
@XmlSeeAlso({
    com.traveliko.platform.ws.siteminder.CruiseGuestDetailType.AirAccommodations.AirAccommodation.class
})
public class AirInfoType {

    @XmlElement(name = "DepartureCity")
    protected LocationType departureCity;
    @XmlElement(name = "ArrivalCity")
    protected LocationType arrivalCity;
    @XmlElement(name = "Airline")
    protected OperatingAirlineType airline;
    @XmlAttribute(name = "DepartureDateTime")
    protected String departureDateTime;
    @XmlAttribute(name = "ArrivalDateTime")
    protected String arrivalDateTime;
    @XmlAttribute(name = "AirlineCabinClass")
    protected CabinType airlineCabinClass;

    /**
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureCity(LocationType value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalCity(LocationType value) {
        this.arrivalCity = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingAirlineType }
     *     
     */
    public OperatingAirlineType getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingAirlineType }
     *     
     */
    public void setAirline(OperatingAirlineType value) {
        this.airline = value;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDateTime(String value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the airlineCabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getAirlineCabinClass() {
        return airlineCabinClass;
    }

    /**
     * Sets the value of the airlineCabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setAirlineCabinClass(CabinType value) {
        this.airlineCabinClass = value;
    }

}
