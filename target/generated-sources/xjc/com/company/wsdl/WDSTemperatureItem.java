//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.27 at 01:13:31 PM MSK 
//


package com.company.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WDS_TemperatureItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_TemperatureItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DateT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="T1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="T2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="T3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="T4" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="T5" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="T6" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_TemperatureItem", propOrder = {

})
public class WDSTemperatureItem {

    @XmlElement(name = "DateT", required = true)
    protected String dateT;
    @XmlElement(name = "T1")
    protected float t1;
    @XmlElement(name = "T2")
    protected float t2;
    @XmlElement(name = "T3")
    protected float t3;
    @XmlElement(name = "T4")
    protected float t4;
    @XmlElement(name = "T5")
    protected float t5;
    @XmlElement(name = "T6")
    protected float t6;

    /**
     * Gets the value of the dateT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateT() {
        return dateT;
    }

    /**
     * Sets the value of the dateT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateT(String value) {
        this.dateT = value;
    }

    /**
     * Gets the value of the t1 property.
     * 
     */
    public float getT1() {
        return t1;
    }

    /**
     * Sets the value of the t1 property.
     * 
     */
    public void setT1(float value) {
        this.t1 = value;
    }

    /**
     * Gets the value of the t2 property.
     * 
     */
    public float getT2() {
        return t2;
    }

    /**
     * Sets the value of the t2 property.
     * 
     */
    public void setT2(float value) {
        this.t2 = value;
    }

    /**
     * Gets the value of the t3 property.
     * 
     */
    public float getT3() {
        return t3;
    }

    /**
     * Sets the value of the t3 property.
     * 
     */
    public void setT3(float value) {
        this.t3 = value;
    }

    /**
     * Gets the value of the t4 property.
     * 
     */
    public float getT4() {
        return t4;
    }

    /**
     * Sets the value of the t4 property.
     * 
     */
    public void setT4(float value) {
        this.t4 = value;
    }

    /**
     * Gets the value of the t5 property.
     * 
     */
    public float getT5() {
        return t5;
    }

    /**
     * Sets the value of the t5 property.
     * 
     */
    public void setT5(float value) {
        this.t5 = value;
    }

    /**
     * Gets the value of the t6 property.
     * 
     */
    public float getT6() {
        return t6;
    }

    /**
     * Sets the value of the t6 property.
     * 
     */
    public void setT6(float value) {
        this.t6 = value;
    }

}