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
 * <p>Java class for WDS_OverSpeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_OverSpeedItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdDriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Time_from" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Time_to" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="El" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Ew" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Dist" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_OverSpeedItem", propOrder = {

})
public class WDSOverSpeedItem {

    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "IdDriver")
    protected int idDriver;
    @XmlElement(name = "MSpeed")
    protected int mSpeed;
    @XmlElement(name = "Time_from", required = true)
    protected String timeFrom;
    @XmlElement(name = "Time_to", required = true)
    protected String timeTo;
    @XmlElement(name = "El")
    protected float el;
    @XmlElement(name = "Ew")
    protected float ew;
    @XmlElement(name = "Dist")
    protected float dist;

    /**
     * Gets the value of the idCar property.
     * 
     */
    public int getIdCar() {
        return idCar;
    }

    /**
     * Sets the value of the idCar property.
     * 
     */
    public void setIdCar(int value) {
        this.idCar = value;
    }

    /**
     * Gets the value of the idDriver property.
     * 
     */
    public int getIdDriver() {
        return idDriver;
    }

    /**
     * Sets the value of the idDriver property.
     * 
     */
    public void setIdDriver(int value) {
        this.idDriver = value;
    }

    /**
     * Gets the value of the mSpeed property.
     * 
     */
    public int getMSpeed() {
        return mSpeed;
    }

    /**
     * Sets the value of the mSpeed property.
     * 
     */
    public void setMSpeed(int value) {
        this.mSpeed = value;
    }

    /**
     * Gets the value of the timeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFrom() {
        return timeFrom;
    }

    /**
     * Sets the value of the timeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFrom(String value) {
        this.timeFrom = value;
    }

    /**
     * Gets the value of the timeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTo() {
        return timeTo;
    }

    /**
     * Sets the value of the timeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTo(String value) {
        this.timeTo = value;
    }

    /**
     * Gets the value of the el property.
     * 
     */
    public float getEl() {
        return el;
    }

    /**
     * Sets the value of the el property.
     * 
     */
    public void setEl(float value) {
        this.el = value;
    }

    /**
     * Gets the value of the ew property.
     * 
     */
    public float getEw() {
        return ew;
    }

    /**
     * Sets the value of the ew property.
     * 
     */
    public void setEw(float value) {
        this.ew = value;
    }

    /**
     * Gets the value of the dist property.
     * 
     */
    public float getDist() {
        return dist;
    }

    /**
     * Sets the value of the dist property.
     * 
     */
    public void setDist(float value) {
        this.dist = value;
    }

}