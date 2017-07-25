
package com.traveliko.platform.ws.siteminder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the occupancy of a room or cabin.
 * 
 * <p>Java class for RoomProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PassengerRPHs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ListOfPassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OccupancyGroup"/&gt;
 *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}ShortDescriptionType" /&gt;
 *       &lt;attribute name="MaxAdults" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" /&gt;
 *       &lt;attribute name="CotQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" /&gt;
 *       &lt;attribute name="FreeChildFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomProfileType", propOrder = {
    "passengerRPHs"
})
@XmlSeeAlso({
    com.traveliko.platform.ws.siteminder.ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.class
})
public class RoomProfileType
    extends RoomStayCandidateType
{

    @XmlElement(name = "PassengerRPHs")
    protected RoomProfileType.PassengerRPHs passengerRPHs;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "MaxAdults")
    protected Integer maxAdults;
    @XmlAttribute(name = "CotQuantity")
    protected Integer cotQuantity;
    @XmlAttribute(name = "FreeChildFlag")
    protected Boolean freeChildFlag;
    @XmlAttribute(name = "MinOccupancy")
    protected Integer minOccupancy;
    @XmlAttribute(name = "MaxOccupancy")
    protected Integer maxOccupancy;

    /**
     * Gets the value of the passengerRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link RoomProfileType.PassengerRPHs }
     *     
     */
    public RoomProfileType.PassengerRPHs getPassengerRPHs() {
        return passengerRPHs;
    }

    /**
     * Sets the value of the passengerRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomProfileType.PassengerRPHs }
     *     
     */
    public void setPassengerRPHs(RoomProfileType.PassengerRPHs value) {
        this.passengerRPHs = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the maxAdults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdults() {
        return maxAdults;
    }

    /**
     * Sets the value of the maxAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdults(Integer value) {
        this.maxAdults = value;
    }

    /**
     * Gets the value of the cotQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCotQuantity() {
        return cotQuantity;
    }

    /**
     * Sets the value of the cotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCotQuantity(Integer value) {
        this.cotQuantity = value;
    }

    /**
     * Gets the value of the freeChildFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeChildFlag() {
        return freeChildFlag;
    }

    /**
     * Sets the value of the freeChildFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeChildFlag(Boolean value) {
        this.freeChildFlag = value;
    }

    /**
     * Gets the value of the minOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinOccupancy() {
        return minOccupancy;
    }

    /**
     * Sets the value of the minOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinOccupancy(Integer value) {
        this.minOccupancy = value;
    }

    /**
     * Gets the value of the maxOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Sets the value of the maxOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccupancy(Integer value) {
        this.maxOccupancy = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="ListOfPassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerRPHs {

        @XmlAttribute(name = "ListOfPassengerRPH")
        protected List<String> listOfPassengerRPH;

        /**
         * Gets the value of the listOfPassengerRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfPassengerRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfPassengerRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getListOfPassengerRPH() {
            if (listOfPassengerRPH == null) {
                listOfPassengerRPH = new ArrayList<String>();
            }
            return this.listOfPassengerRPH;
        }

    }

}
