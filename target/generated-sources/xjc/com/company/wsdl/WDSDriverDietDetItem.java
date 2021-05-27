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
 * <p>Java class for WDS_DriverDietDetItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_DriverDietDetItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="MPZ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Date_from" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Date_to" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BasicRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Curr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Driver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_DriverDietDetItem", propOrder = {

})
public class WDSDriverDietDetItem {

    @XmlElement(name = "MPZ", required = true)
    protected String mpz;
    @XmlElement(name = "Date_from", required = true)
    protected String dateFrom;
    @XmlElement(name = "Date_to", required = true)
    protected String dateTo;
    @XmlElement(name = "Duration", required = true)
    protected String duration;
    @XmlElement(name = "Distance")
    protected float distance;
    @XmlElement(name = "Hour")
    protected int hour;
    @XmlElement(name = "BasicRate")
    protected float basicRate;
    @XmlElement(name = "Curr", required = true)
    protected String curr;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "Vehicle", required = true)
    protected String vehicle;
    @XmlElement(name = "Driver", required = true)
    protected String driver;

    /**
     * Gets the value of the mpz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPZ() {
        return mpz;
    }

    /**
     * Sets the value of the mpz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPZ(String value) {
        this.mpz = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    public float getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(float value) {
        this.distance = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Gets the value of the basicRate property.
     * 
     */
    public float getBasicRate() {
        return basicRate;
    }

    /**
     * Sets the value of the basicRate property.
     * 
     */
    public void setBasicRate(float value) {
        this.basicRate = value;
    }

    /**
     * Gets the value of the curr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurr() {
        return curr;
    }

    /**
     * Sets the value of the curr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurr(String value) {
        this.curr = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicle(String value) {
        this.vehicle = value;
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

}
