
package com.traveliko.platform.ws.allotz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Collection of video items.
 * 
 * <p>Java class for VideoItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoDescriptionType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="Caption" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "VideoItemsType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "videoItem"
})
public class VideoItemsType {

    @XmlElement(name = "VideoItem", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected List<VideoItemsType.VideoItem> videoItem;

    /**
     * Gets the value of the videoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoItemsType.VideoItem }
     * 
     * 
     */
    public List<VideoItemsType.VideoItem> getVideoItem() {
        if (videoItem == null) {
            videoItem = new ArrayList<VideoItemsType.VideoItem>();
        }
        return this.videoItem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoDescriptionType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *       &lt;attribute name="Caption" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoItem
        extends VideoDescriptionType
    {

        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "Caption")
        protected String caption;
        @XmlAttribute(name = "Version")
        protected String version;
        @XmlAttribute(name = "CreateDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDateTime;
        @XmlAttribute(name = "CreatorID")
        protected String creatorID;
        @XmlAttribute(name = "LastModifyDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastModifyDateTime;
        @XmlAttribute(name = "LastModifierID")
        protected String lastModifierID;
        @XmlAttribute(name = "PurgeDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar purgeDate;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the caption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaption() {
            return caption;
        }

        /**
         * Sets the value of the caption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaption(String value) {
            this.caption = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the createDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDateTime() {
            return createDateTime;
        }

        /**
         * Sets the value of the createDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDateTime(XMLGregorianCalendar value) {
            this.createDateTime = value;
        }

        /**
         * Gets the value of the creatorID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatorID() {
            return creatorID;
        }

        /**
         * Sets the value of the creatorID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatorID(String value) {
            this.creatorID = value;
        }

        /**
         * Gets the value of the lastModifyDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastModifyDateTime() {
            return lastModifyDateTime;
        }

        /**
         * Sets the value of the lastModifyDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastModifyDateTime(XMLGregorianCalendar value) {
            this.lastModifyDateTime = value;
        }

        /**
         * Gets the value of the lastModifierID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModifierID() {
            return lastModifierID;
        }

        /**
         * Sets the value of the lastModifierID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModifierID(String value) {
            this.lastModifierID = value;
        }

        /**
         * Gets the value of the purgeDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPurgeDate() {
            return purgeDate;
        }

        /**
         * Sets the value of the purgeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPurgeDate(XMLGregorianCalendar value) {
            this.purgeDate = value;
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

    }

}
