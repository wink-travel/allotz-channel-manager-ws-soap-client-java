
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Date and time of trip that allows specifying a time window before and after the given date.
 * 
 * <p>Java class for TravelDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DepartureDateTime" type="{http://www.opentravel.org/OTA/2003/05}TimeInstantType"/>
 *         &lt;element name="ArrivalDateTime" type="{http://www.opentravel.org/OTA/2003/05}TimeInstantType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDateTimeType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "departureDateTime",
    "arrivalDateTime"
})
@XmlSeeAlso({
    OriginDestinationInformationType.class
})
public class TravelDateTimeType {

    @XmlElement(name = "DepartureDateTime", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected TimeInstantType departureDateTime;
    @XmlElement(name = "ArrivalDateTime", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected TimeInstantType arrivalDateTime;

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantType }
     *     
     */
    public TimeInstantType getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantType }
     *     
     */
    public void setDepartureDateTime(TimeInstantType value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantType }
     *     
     */
    public TimeInstantType getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantType }
     *     
     */
    public void setArrivalDateTime(TimeInstantType value) {
        this.arrivalDateTime = value;
    }

}
