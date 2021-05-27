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
 * <p>Java class for WDS_CarOptimalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarOptimalItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="cargroupid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="carid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="identifikator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="driver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userrights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="alarmsms" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iddriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="capacitykg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="capacitym3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarOptimalItem", propOrder = {

})
public class WDSCarOptimalItem {

    protected int cargroupid;
    protected int carid;
    @XmlElement(required = true)
    protected String identifikator;
    @XmlElement(required = true)
    protected String driver;
    @XmlElement(required = true)
    protected String mobil;
    protected int userrights;
    protected int type;
    protected int online;
    protected int disabled;
    @XmlElement(required = true)
    protected String alarmsms;
    protected int iddriver;
    protected int capacitykg;
    protected float capacitym3;

    /**
     * Gets the value of the cargroupid property.
     * 
     */
    public int getCargroupid() {
        return cargroupid;
    }

    /**
     * Sets the value of the cargroupid property.
     * 
     */
    public void setCargroupid(int value) {
        this.cargroupid = value;
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
     * Gets the value of the identifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifikator() {
        return identifikator;
    }

    /**
     * Sets the value of the identifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifikator(String value) {
        this.identifikator = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * Gets the value of the mobil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobil() {
        return mobil;
    }

    /**
     * Sets the value of the mobil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobil(String value) {
        this.mobil = value;
    }

    /**
     * Gets the value of the userrights property.
     * 
     */
    public int getUserrights() {
        return userrights;
    }

    /**
     * Sets the value of the userrights property.
     * 
     */
    public void setUserrights(int value) {
        this.userrights = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the online property.
     * 
     */
    public int getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     */
    public void setOnline(int value) {
        this.online = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     */
    public int getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     */
    public void setDisabled(int value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the alarmsms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmsms() {
        return alarmsms;
    }

    /**
     * Sets the value of the alarmsms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmsms(String value) {
        this.alarmsms = value;
    }

    /**
     * Gets the value of the iddriver property.
     * 
     */
    public int getIddriver() {
        return iddriver;
    }

    /**
     * Sets the value of the iddriver property.
     * 
     */
    public void setIddriver(int value) {
        this.iddriver = value;
    }

    /**
     * Gets the value of the capacitykg property.
     * 
     */
    public int getCapacitykg() {
        return capacitykg;
    }

    /**
     * Sets the value of the capacitykg property.
     * 
     */
    public void setCapacitykg(int value) {
        this.capacitykg = value;
    }

    /**
     * Gets the value of the capacitym3 property.
     * 
     */
    public float getCapacitym3() {
        return capacitym3;
    }

    /**
     * Sets the value of the capacitym3 property.
     * 
     */
    public void setCapacitym3(float value) {
        this.capacitym3 = value;
    }

}
