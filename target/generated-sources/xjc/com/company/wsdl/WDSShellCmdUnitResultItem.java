//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.27 at 04:09:25 PM MSK 
//


package com.company.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WDS_ShellCmdUnitResultItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_ShellCmdUnitResultItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="processingTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cmd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_ShellCmdUnitResultItem", propOrder = {

})
public class WDSShellCmdUnitResultItem {

    protected int identifier;
    @XmlElement(required = true)
    protected String processingTime;
    @XmlElement(required = true)
    protected String resultDeliveryTime;
    protected int carid;
    @XmlElement(required = true)
    protected String cmd;
    @XmlElement(required = true)
    protected String result;

    /**
     * Gets the value of the identifier property.
     * 
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     */
    public void setIdentifier(int value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the processingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingTime() {
        return processingTime;
    }

    /**
     * Sets the value of the processingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingTime(String value) {
        this.processingTime = value;
    }

    /**
     * Gets the value of the resultDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDeliveryTime() {
        return resultDeliveryTime;
    }

    /**
     * Sets the value of the resultDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDeliveryTime(String value) {
        this.resultDeliveryTime = value;
    }

    /**
     * Gets the value of the carid property.
     * 
     */
    public int getCarid() {
        return carid;
    }

    /**
     * Sets the value of the carid property.
     * 
     */
    public void setCarid(int value) {
        this.carid = value;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmd() {
        return cmd;
    }

    /**
     * Sets the value of the cmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmd(String value) {
        this.cmd = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

}
