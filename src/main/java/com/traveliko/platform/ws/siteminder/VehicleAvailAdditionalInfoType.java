
package com.traveliko.platform.ws.siteminder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * The VehicleAvailAdditionalInfoType complex type identifies the data that describes supplemental information made available as part of describing the availability and rate of one or more vehicles.
 * 
 * <p>Java class for VehicleAvailAdditionalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailAdditionalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PricedCoverages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PricedCoverage" type="{http://www.opentravel.org/OTA/2003/05}CoveragePricedType" maxOccurs="15"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}PaymentRulesType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ChargeablePeriod" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailAdditionalInfoType", propOrder = {
    "pricedCoverages",
    "paymentRules",
    "tpaExtensions"
})
public class VehicleAvailAdditionalInfoType {

    @XmlElement(name = "PricedCoverages")
    protected VehicleAvailAdditionalInfoType.PricedCoverages pricedCoverages;
    @XmlElement(name = "PaymentRules")
    protected PaymentRulesType paymentRules;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ChargeablePeriod")
    protected Duration chargeablePeriod;

    /**
     * Gets the value of the pricedCoverages property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailAdditionalInfoType.PricedCoverages }
     *     
     */
    public VehicleAvailAdditionalInfoType.PricedCoverages getPricedCoverages() {
        return pricedCoverages;
    }

    /**
     * Sets the value of the pricedCoverages property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailAdditionalInfoType.PricedCoverages }
     *     
     */
    public void setPricedCoverages(VehicleAvailAdditionalInfoType.PricedCoverages value) {
        this.pricedCoverages = value;
    }

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRulesType }
     *     
     */
    public PaymentRulesType getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRulesType }
     *     
     */
    public void setPaymentRules(PaymentRulesType value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the chargeablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChargeablePeriod() {
        return chargeablePeriod;
    }

    /**
     * Sets the value of the chargeablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChargeablePeriod(Duration value) {
        this.chargeablePeriod = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="PricedCoverage" type="{http://www.opentravel.org/OTA/2003/05}CoveragePricedType" maxOccurs="15"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pricedCoverage"
    })
    public static class PricedCoverages {

        @XmlElement(name = "PricedCoverage", required = true)
        protected List<CoveragePricedType> pricedCoverage;

        /**
         * Gets the value of the pricedCoverage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricedCoverage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricedCoverage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CoveragePricedType }
         * 
         * 
         */
        public List<CoveragePricedType> getPricedCoverage() {
            if (pricedCoverage == null) {
                pricedCoverage = new ArrayList<CoveragePricedType>();
            }
            return this.pricedCoverage;
        }

    }

}