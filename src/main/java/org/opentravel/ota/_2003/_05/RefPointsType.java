
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference points in relation to/from  the current entity.
 * 
 * <p>Java class for RefPointsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefPointsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefPoint" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelativePositionType">
 *                 &lt;sequence>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *                 &lt;attribute name="RefPointCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Proximity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RefPointName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="StateProv" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
 *                 &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *               &lt;/extension>
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
@XmlType(name = "RefPointsType", propOrder = {
    "refPoint"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.AreaInfoType.RefPoints.class
})
public class RefPointsType {

    @XmlElement(name = "RefPoint", required = true)
    protected List<RefPointsType.RefPoint> refPoint;

    /**
     * Gets the value of the refPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefPointsType.RefPoint }
     * 
     * 
     */
    public List<RefPointsType.RefPoint> getRefPoint() {
        if (refPoint == null) {
            refPoint = new ArrayList<RefPointsType.RefPoint>();
        }
        return this.refPoint;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelativePositionType">
     *       &lt;sequence>
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
     *       &lt;attribute name="RefPointCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Proximity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RefPointName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="StateProv" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
     *       &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "multimediaDescriptions",
        "descriptiveText"
    })
    public static class RefPoint
        extends RelativePositionType
    {

        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "RefPointCategoryCode")
        protected String refPointCategoryCode;
        @XmlAttribute(name = "Proximity")
        protected String proximity;
        @XmlAttribute(name = "CityCode")
        protected String cityCode;
        @XmlAttribute(name = "RefPointName")
        protected String refPointName;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "StateProv")
        protected String stateProv;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;
        @XmlAttribute(name = "PositionAccuracy")
        protected String positionAccuracy;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * Gets the value of the multimediaDescriptions property.
         * 
         * @return
         *     possible object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * Sets the value of the multimediaDescriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * Gets the value of the descriptiveText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * Sets the value of the descriptiveText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        /**
         * Gets the value of the refPointCategoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefPointCategoryCode() {
            return refPointCategoryCode;
        }

        /**
         * Sets the value of the refPointCategoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefPointCategoryCode(String value) {
            this.refPointCategoryCode = value;
        }

        /**
         * Gets the value of the proximity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProximity() {
            return proximity;
        }

        /**
         * Sets the value of the proximity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProximity(String value) {
            this.proximity = value;
        }

        /**
         * Gets the value of the cityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityCode() {
            return cityCode;
        }

        /**
         * Sets the value of the cityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityCode(String value) {
            this.cityCode = value;
        }

        /**
         * Gets the value of the refPointName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefPointName() {
            return refPointName;
        }

        /**
         * Sets the value of the refPointName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefPointName(String value) {
            this.refPointName = value;
        }

        /**
         * Gets the value of the existsCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * Sets the value of the existsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        /**
         * Gets the value of the stateProv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateProv() {
            return stateProv;
        }

        /**
         * Sets the value of the stateProv property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateProv(String value) {
            this.stateProv = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the codeDetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * Sets the value of the codeDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * Gets the value of the removal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * Sets the value of the removal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the altitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * Sets the value of the altitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * Gets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * Sets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

        /**
         * Gets the value of the positionAccuracy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionAccuracy() {
            return positionAccuracy;
        }

        /**
         * Sets the value of the positionAccuracy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionAccuracy(String value) {
            this.positionAccuracy = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
