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
 * <p>Java class for WDS_LogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_LogItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LogDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TypeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_LogItem", propOrder = {

})
public class WDSLogItem {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(name = "LogDate", required = true)
    protected String logDate;
    @XmlElement(name = "TypeNumber")
    protected int typeNumber;
    @XmlElement(name = "TypeDesc", required = true)
    protected String typeDesc;
    @XmlElement(name = "Content", required = true)
    protected String content;
    protected int carid;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the logDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDate() {
        return logDate;
    }

    /**
     * Sets the value of the logDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDate(String value) {
        this.logDate = value;
    }

    /**
     * Gets the value of the typeNumber property.
     * 
     */
    public int getTypeNumber() {
        return typeNumber;
    }

    /**
     * Sets the value of the typeNumber property.
     * 
     */
    public void setTypeNumber(int value) {
        this.typeNumber = value;
    }

    /**
     * Gets the value of the typeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * Sets the value of the typeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDesc(String value) {
        this.typeDesc = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
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

}
