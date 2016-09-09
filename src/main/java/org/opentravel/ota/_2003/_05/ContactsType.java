
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Provides detailed name information.
 * 
 * <p>Java class for ContactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *                 &lt;sequence>
 *                   &lt;element name="JobTitle" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
 *                           &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *                 &lt;attribute name="SrvcCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="CorporatePosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OKToPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NameOrdered" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ContactsType", propOrder = {
    "name"
})
public class ContactsType {

    @XmlElement(name = "Name", required = true)
    protected List<ContactsType.Name> name;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactsType.Name }
     * 
     * 
     */
    public List<ContactsType.Name> getName() {
        if (name == null) {
            name = new ArrayList<ContactsType.Name>();
        }
        return this.name;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
     *       &lt;sequence>
     *         &lt;element name="JobTitle" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
     *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
     *       &lt;attribute name="SrvcCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="CorporatePosition" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OKToPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NameOrdered" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jobTitle"
    })
    public static class Name
        extends PersonNameType
    {

        @XmlElement(name = "JobTitle")
        protected List<ContactsType.Name.JobTitle> jobTitle;
        @XmlAttribute(name = "SrvcCode")
        protected String srvcCode;
        @XmlAttribute(name = "Location")
        protected String location;
        @XmlAttribute(name = "CorporatePosition")
        protected String corporatePosition;
        @XmlAttribute(name = "OKToPublish")
        protected Boolean okToPublish;
        @XmlAttribute(name = "NameOrdered")
        protected String nameOrdered;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "Gender")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String gender;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * Gets the value of the jobTitle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobTitle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJobTitle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactsType.Name.JobTitle }
         * 
         * 
         */
        public List<ContactsType.Name.JobTitle> getJobTitle() {
            if (jobTitle == null) {
                jobTitle = new ArrayList<ContactsType.Name.JobTitle>();
            }
            return this.jobTitle;
        }

        /**
         * Gets the value of the srvcCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrvcCode() {
            return srvcCode;
        }

        /**
         * Sets the value of the srvcCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrvcCode(String value) {
            this.srvcCode = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the corporatePosition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorporatePosition() {
            return corporatePosition;
        }

        /**
         * Sets the value of the corporatePosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorporatePosition(String value) {
            this.corporatePosition = value;
        }

        /**
         * Gets the value of the okToPublish property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOKToPublish() {
            return okToPublish;
        }

        /**
         * Sets the value of the okToPublish property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOKToPublish(Boolean value) {
            this.okToPublish = value;
        }

        /**
         * Gets the value of the nameOrdered property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameOrdered() {
            return nameOrdered;
        }

        /**
         * Sets the value of the nameOrdered property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameOrdered(String value) {
            this.nameOrdered = value;
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
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
         *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class JobTitle {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Type")
            protected String type;

            /**
             * Used for Character Strings, length 1 to 64.
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
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}
