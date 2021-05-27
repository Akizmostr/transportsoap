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
 * <p>Java class for WDS_Position5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_Position5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="carid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Zs" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Zd" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="positiontime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localpostime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Location_state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Location_city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Location_street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="input1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="input2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="input3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="input4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ac_dallas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="usedfuel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="mh" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fuel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_Position5", propOrder = {

})
public class WDSPosition5 {

    protected int carid;
    @XmlElement(name = "Zs")
    protected float zs;
    @XmlElement(name = "Zd")
    protected float zd;
    @XmlElement(required = true)
    protected String positiontime;
    @XmlElement(required = true)
    protected String localpostime;
    protected int speed;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "Location_state", required = true)
    protected String locationState;
    @XmlElement(name = "Location_city", required = true)
    protected String locationCity;
    @XmlElement(name = "Location_street", required = true)
    protected String locationStreet;
    @XmlElement(required = true)
    protected String input1;
    @XmlElement(required = true)
    protected String input2;
    @XmlElement(required = true)
    protected String input3;
    @XmlElement(required = true)
    protected String input4;
    @XmlElement(name = "ac_dallas", required = true)
    protected String acDallas;
    protected float km;
    protected float usedfuel;
    protected int mh;
    protected float fuel;

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
     * Gets the value of the zs property.
     * 
     */
    public float getZs() {
        return zs;
    }

    /**
     * Sets the value of the zs property.
     * 
     */
    public void setZs(float value) {
        this.zs = value;
    }

    /**
     * Gets the value of the zd property.
     * 
     */
    public float getZd() {
        return zd;
    }

    /**
     * Sets the value of the zd property.
     * 
     */
    public void setZd(float value) {
        this.zd = value;
    }

    /**
     * Gets the value of the positiontime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiontime() {
        return positiontime;
    }

    /**
     * Sets the value of the positiontime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiontime(String value) {
        this.positiontime = value;
    }

    /**
     * Gets the value of the localpostime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalpostime() {
        return localpostime;
    }

    /**
     * Sets the value of the localpostime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalpostime(String value) {
        this.localpostime = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
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
     * Gets the value of the locationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationState() {
        return locationState;
    }

    /**
     * Sets the value of the locationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationState(String value) {
        this.locationState = value;
    }

    /**
     * Gets the value of the locationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCity() {
        return locationCity;
    }

    /**
     * Sets the value of the locationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCity(String value) {
        this.locationCity = value;
    }

    /**
     * Gets the value of the locationStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationStreet() {
        return locationStreet;
    }

    /**
     * Sets the value of the locationStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationStreet(String value) {
        this.locationStreet = value;
    }

    /**
     * Gets the value of the input1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput1() {
        return input1;
    }

    /**
     * Sets the value of the input1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput1(String value) {
        this.input1 = value;
    }

    /**
     * Gets the value of the input2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput2() {
        return input2;
    }

    /**
     * Sets the value of the input2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput2(String value) {
        this.input2 = value;
    }

    /**
     * Gets the value of the input3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput3() {
        return input3;
    }

    /**
     * Sets the value of the input3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput3(String value) {
        this.input3 = value;
    }

    /**
     * Gets the value of the input4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput4() {
        return input4;
    }

    /**
     * Sets the value of the input4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput4(String value) {
        this.input4 = value;
    }

    /**
     * Gets the value of the acDallas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcDallas() {
        return acDallas;
    }

    /**
     * Sets the value of the acDallas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcDallas(String value) {
        this.acDallas = value;
    }

    /**
     * Gets the value of the km property.
     * 
     */
    public float getKm() {
        return km;
    }

    /**
     * Sets the value of the km property.
     * 
     */
    public void setKm(float value) {
        this.km = value;
    }

    /**
     * Gets the value of the usedfuel property.
     * 
     */
    public float getUsedfuel() {
        return usedfuel;
    }

    /**
     * Sets the value of the usedfuel property.
     * 
     */
    public void setUsedfuel(float value) {
        this.usedfuel = value;
    }

    /**
     * Gets the value of the mh property.
     * 
     */
    public int getMh() {
        return mh;
    }

    /**
     * Sets the value of the mh property.
     * 
     */
    public void setMh(int value) {
        this.mh = value;
    }

    /**
     * Gets the value of the fuel property.
     * 
     */
    public float getFuel() {
        return fuel;
    }

    /**
     * Sets the value of the fuel property.
     * 
     */
    public void setFuel(float value) {
        this.fuel = value;
    }

}
