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
 * <p>Java class for WDS_CarConsumptionDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarConsumptionDetailItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalDistanceKm" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="TotalConsumption" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Consumption_l" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Consumption_h" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Consumption_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Fuel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="FuelConsumption" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CurrentConsumption" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarConsumptionDetailItem", propOrder = {

})
public class WDSCarConsumptionDetailItem {

    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Time")
    protected int time;
    @XmlElement(name = "TotalDistanceKm")
    protected float totalDistanceKm;
    @XmlElement(name = "Distance")
    protected float distance;
    @XmlElement(name = "TotalConsumption")
    protected float totalConsumption;
    @XmlElement(name = "Consumption_l")
    protected float consumptionL;
    @XmlElement(name = "Consumption_h")
    protected float consumptionH;
    @XmlElement(name = "Consumption_km")
    protected float consumptionKm;
    @XmlElement(name = "Fuel")
    protected float fuel;
    @XmlElement(name = "FuelConsumption")
    protected float fuelConsumption;
    @XmlElement(name = "CurrentConsumption")
    protected float currentConsumption;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     */
    public int getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(int value) {
        this.time = value;
    }

    /**
     * Gets the value of the totalDistanceKm property.
     * 
     */
    public float getTotalDistanceKm() {
        return totalDistanceKm;
    }

    /**
     * Sets the value of the totalDistanceKm property.
     * 
     */
    public void setTotalDistanceKm(float value) {
        this.totalDistanceKm = value;
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
     * Gets the value of the totalConsumption property.
     * 
     */
    public float getTotalConsumption() {
        return totalConsumption;
    }

    /**
     * Sets the value of the totalConsumption property.
     * 
     */
    public void setTotalConsumption(float value) {
        this.totalConsumption = value;
    }

    /**
     * Gets the value of the consumptionL property.
     * 
     */
    public float getConsumptionL() {
        return consumptionL;
    }

    /**
     * Sets the value of the consumptionL property.
     * 
     */
    public void setConsumptionL(float value) {
        this.consumptionL = value;
    }

    /**
     * Gets the value of the consumptionH property.
     * 
     */
    public float getConsumptionH() {
        return consumptionH;
    }

    /**
     * Sets the value of the consumptionH property.
     * 
     */
    public void setConsumptionH(float value) {
        this.consumptionH = value;
    }

    /**
     * Gets the value of the consumptionKm property.
     * 
     */
    public float getConsumptionKm() {
        return consumptionKm;
    }

    /**
     * Sets the value of the consumptionKm property.
     * 
     */
    public void setConsumptionKm(float value) {
        this.consumptionKm = value;
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
     * Gets the value of the fuelConsumption property.
     * 
     */
    public float getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Sets the value of the fuelConsumption property.
     * 
     */
    public void setFuelConsumption(float value) {
        this.fuelConsumption = value;
    }

    /**
     * Gets the value of the currentConsumption property.
     * 
     */
    public float getCurrentConsumption() {
        return currentConsumption;
    }

    /**
     * Sets the value of the currentConsumption property.
     * 
     */
    public void setCurrentConsumption(float value) {
        this.currentConsumption = value;
    }

}