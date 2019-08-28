
package com.traveliko.platform.ws.allotz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of unsigned integers serving as reference placeholders, and used as an index identifying which guests occupy this room
 * 
 * <p>Java class for ResGuestRPHsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResGuestRPHsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResGuestRPH" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
@XmlType(name = "ResGuestRPHsType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "resGuestRPH"
})
public class ResGuestRPHsType {

    @XmlElement(name = "ResGuestRPH", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected List<ResGuestRPHsType.ResGuestRPH> resGuestRPH;

    /**
     * Gets the value of the resGuestRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resGuestRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResGuestRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResGuestRPHsType.ResGuestRPH }
     * 
     * 
     */
    public List<ResGuestRPHsType.ResGuestRPH> getResGuestRPH() {
        if (resGuestRPH == null) {
            resGuestRPH = new ArrayList<ResGuestRPHsType.ResGuestRPH>();
        }
        return this.resGuestRPH;
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
    public static class ResGuestRPH {

        @XmlAttribute(name = "RPH")
        protected String rph;

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

    }

}
