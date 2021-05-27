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
 * <p>Java class for WDS_TankStationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_TankStationItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdStop" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdPoint" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MStart" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Ew" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="El" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Station" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_TankStationItem", propOrder = {

})
public class WDSTankStationItem {

    @XmlElement(name = "IdStop")
    protected int idStop;
    @XmlElement(name = "IdPoint")
    protected int idPoint;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "MStart")
    protected int mStart;
    @XmlElement(name = "Ew")
    protected float ew;
    @XmlElement(name = "El")
    protected float el;
    @XmlElement(name = "Station", required = true)
    protected String station;

    /**
     * Gets the value of the idStop property.
     * 
     */
    public int getIdStop() {
        return idStop;
    }

    /**
     * Sets the value of the idStop property.
     * 
     */
    public void setIdStop(int value) {
        this.idStop = value;
    }

    /**
     * Gets the value of the idPoint property.
     * 
     */
    public int getIdPoint() {
        return idPoint;
    }

    /**
     * Sets the value of the idPoint property.
     * 
     */
    public void setIdPoint(int value) {
        this.idPoint = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the mStart property.
     * 
     */
    public int getMStart() {
        return mStart;
    }

    /**
     * Sets the value of the mStart property.
     * 
     */
    public void setMStart(int value) {
        this.mStart = value;
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
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStation(String value) {
        this.station = value;
    }

}
