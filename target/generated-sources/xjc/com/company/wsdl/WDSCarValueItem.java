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
 * <p>Java class for WDS_CarValueItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarValueItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DateGMT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Fuel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RPM" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RPM_FMS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarValueItem", propOrder = {

})
public class WDSCarValueItem {

    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "DateGMT", required = true)
    protected String dateGMT;
    @XmlElement(name = "Route")
    protected int route;
    @XmlElement(name = "Speed")
    protected int speed;
    @XmlElement(name = "Fuel")
    protected float fuel;
    @XmlElement(name = "Altitude")
    protected int altitude;
    @XmlElement(name = "RPM")
    protected int rpm;
    @XmlElement(name = "RPM_FMS")
    protected int rpmfms;

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
     * Gets the value of the dateGMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateGMT() {
        return dateGMT;
    }

    /**
     * Sets the value of the dateGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateGMT(String value) {
        this.dateGMT = value;
    }

    /**
     * Gets the value of the route property.
     * 
     */
    public int getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     */
    public void setRoute(int value) {
        this.route = value;
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

    /**
     * Gets the value of the altitude property.
     * 
     */
    public int getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     */
    public void setAltitude(int value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the rpm property.
     * 
     */
    public int getRPM() {
        return rpm;
    }

    /**
     * Sets the value of the rpm property.
     * 
     */
    public void setRPM(int value) {
        this.rpm = value;
    }

    /**
     * Gets the value of the rpmfms property.
     * 
     */
    public int getRPMFMS() {
        return rpmfms;
    }

    /**
     * Sets the value of the rpmfms property.
     * 
     */
    public void setRPMFMS(int value) {
        this.rpmfms = value;
    }

}