
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The VehicleArrivalDetailsType complex type defines the information that describes an arriving mode of transportation which is associated with the rental of a vehicle.  This is typically used to identify how the customer will be arriving at the vehicle rental facility.
 * 
 * <p>Java class for VehicleArrivalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleArrivalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="MarketingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TransportationCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleArrivalDetailsType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "arrivalLocation",
    "marketingCompany",
    "operatingCompany"
})
public class VehicleArrivalDetailsType {

    @XmlElement(name = "ArrivalLocation", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected LocationType arrivalLocation;
    @XmlElement(name = "MarketingCompany", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected CompanyNameType marketingCompany;
    @XmlElement(name = "OperatingCompany", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected CompanyNameType operatingCompany;
    @XmlAttribute(name = "TransportationCode")
    protected String transportationCode;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "ArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;

    /**
     * Gets the value of the arrivalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * Sets the value of the arrivalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalLocation(LocationType value) {
        this.arrivalLocation = value;
    }

    /**
     * Gets the value of the marketingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getMarketingCompany() {
        return marketingCompany;
    }

    /**
     * Sets the value of the marketingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setMarketingCompany(CompanyNameType value) {
        this.marketingCompany = value;
    }

    /**
     * Gets the value of the operatingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * Sets the value of the operatingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setOperatingCompany(CompanyNameType value) {
        this.operatingCompany = value;
    }

    /**
     * Gets the value of the transportationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationCode() {
        return transportationCode;
    }

    /**
     * Sets the value of the transportationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationCode(String value) {
        this.transportationCode = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

}
