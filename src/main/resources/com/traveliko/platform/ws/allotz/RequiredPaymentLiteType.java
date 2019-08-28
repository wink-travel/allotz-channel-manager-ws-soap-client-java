
package com.traveliko.platform.ws.allotz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Summary version of the RequiredPaymentType, initially created for the Travel Itinerary Message set.
 * 
 * <p>Java class for RequiredPaymentLiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredPaymentLiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}AcceptedPaymentsType" minOccurs="0"/>
 *         &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetributionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
 *             &lt;enumeration value="ResAutoCancelled"/>
 *             &lt;enumeration value="ResNotGuaranteed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredPaymentLiteType", namespace = "http://www.opentravel.org/OTA/2003/05", propOrder = {
    "acceptedPayments",
    "amountPercent"
})
public class RequiredPaymentLiteType {

    @XmlElement(name = "AcceptedPayments", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected AcceptedPaymentsType acceptedPayments;
    @XmlElement(name = "AmountPercent", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected AmountPercentType amountPercent;
    @XmlAttribute(name = "RetributionType")
    protected String retributionType;

    /**
     * Gets the value of the acceptedPayments property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedPaymentsType }
     *     
     */
    public AcceptedPaymentsType getAcceptedPayments() {
        return acceptedPayments;
    }

    /**
     * Sets the value of the acceptedPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedPaymentsType }
     *     
     */
    public void setAcceptedPayments(AcceptedPaymentsType value) {
        this.acceptedPayments = value;
    }

    /**
     * Gets the value of the amountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPercentType }
     *     
     */
    public AmountPercentType getAmountPercent() {
        return amountPercent;
    }

    /**
     * Sets the value of the amountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercentType }
     *     
     */
    public void setAmountPercent(AmountPercentType value) {
        this.amountPercent = value;
    }

    /**
     * Gets the value of the retributionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetributionType() {
        return retributionType;
    }

    /**
     * Sets the value of the retributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetributionType(String value) {
        this.retributionType = value;
    }

}
