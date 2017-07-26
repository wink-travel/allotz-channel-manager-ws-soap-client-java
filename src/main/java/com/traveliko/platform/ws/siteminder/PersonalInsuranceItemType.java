
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates the number of customers taking specific type of personal insurance.
 * 
 * <p>Java class for PersonalInsuranceItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalInsuranceItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerCounts" type="{http://www.opentravel.org/OTA/2003/05}CustomerCountsType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}PkgPersonalInsuranceCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalInsuranceItemType", propOrder = {
    "customerCounts"
})
public class PersonalInsuranceItemType {

    @XmlElement(name = "CustomerCounts", required = true)
    protected CustomerCountsType customerCounts;
    @XmlAttribute(name = "Code", required = true)
    protected PkgPersonalInsuranceCode code;

    /**
     * Gets the value of the customerCounts property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCountsType }
     *     
     */
    public CustomerCountsType getCustomerCounts() {
        return customerCounts;
    }

    /**
     * Sets the value of the customerCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCountsType }
     *     
     */
    public void setCustomerCounts(CustomerCountsType value) {
        this.customerCounts = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link PkgPersonalInsuranceCode }
     *     
     */
    public PkgPersonalInsuranceCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link PkgPersonalInsuranceCode }
     *     
     */
    public void setCode(PkgPersonalInsuranceCode value) {
        this.code = value;
    }

}
