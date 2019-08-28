
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Code and optional string to describe a location point.
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.traveliko.platform.ws.allotz.VerificationType.StartLocation.class,
    com.traveliko.platform.ws.allotz.VerificationType.EndLocation.class,
    com.traveliko.platform.ws.allotz.ConnectionType.ConnectionLocation.class,
    com.traveliko.platform.ws.allotz.VehicleAvailCoreType.VendorLocation.class,
    com.traveliko.platform.ws.allotz.VehicleAvailCoreType.DropOffLocation.class,
    com.traveliko.platform.ws.allotz.ItemSearchCriterionType.CodeRef.class,
    AirportPrefType.class,
    com.traveliko.platform.ws.allotz.SailingBaseType.DeparturePort.class,
    com.traveliko.platform.ws.allotz.SailingBaseType.ArrivalPort.class,
    com.traveliko.platform.ws.allotz.VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation.class,
    com.traveliko.platform.ws.allotz.VehicleRentalCoreType.PickUpLocation.class,
    com.traveliko.platform.ws.allotz.VehicleRentalCoreType.ReturnLocation.class,
    com.traveliko.platform.ws.allotz.OriginDestinationInformationType.OriginLocation.class,
    com.traveliko.platform.ws.allotz.OriginDestinationInformationType.DestinationLocation.class
})
public class LocationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * Gets the value of the value property.
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
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

}
