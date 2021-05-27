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
 * <p>Java class for WDS_CarConditionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarConditionItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="idcar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fuelLitre" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="fuelPercentage" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="stateOfChargeKwh" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="stateOfChargePercentage" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="directReading" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isChargerConnected" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isChargingInProgress" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timeTo80Charge" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="timeToFullCharge" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="estimatedRangeKmFuel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="estimatedRangeKmBattery" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="odometerKm" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="batteryMaxCapacityKwh" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="fuelMaxCapacityLitre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarConditionItem", propOrder = {

})
public class WDSCarConditionItem {

    protected int idcar;
    @XmlElement(required = true)
    protected String dateStatus;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float fuelLitre;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float fuelPercentage;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float stateOfChargeKwh;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float stateOfChargePercentage;
    protected int directReading;
    protected int isChargerConnected;
    protected int isChargingInProgress;
    protected float timeTo80Charge;
    protected float timeToFullCharge;
    protected float estimatedRangeKmFuel;
    protected float estimatedRangeKmBattery;
    protected float odometerKm;
    protected int type;
    @XmlElement(required = true)
    protected String errorMessage;
    protected float batteryMaxCapacityKwh;
    protected int fuelMaxCapacityLitre;

    /**
     * Gets the value of the idcar property.
     * 
     */
    public int getIdcar() {
        return idcar;
    }

    /**
     * Sets the value of the idcar property.
     * 
     */
    public void setIdcar(int value) {
        this.idcar = value;
    }

    /**
     * Gets the value of the dateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateStatus() {
        return dateStatus;
    }

    /**
     * Sets the value of the dateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateStatus(String value) {
        this.dateStatus = value;
    }

    /**
     * Gets the value of the fuelLitre property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFuelLitre() {
        return fuelLitre;
    }

    /**
     * Sets the value of the fuelLitre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFuelLitre(Float value) {
        this.fuelLitre = value;
    }

    /**
     * Gets the value of the fuelPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFuelPercentage() {
        return fuelPercentage;
    }

    /**
     * Sets the value of the fuelPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFuelPercentage(Float value) {
        this.fuelPercentage = value;
    }

    /**
     * Gets the value of the stateOfChargeKwh property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStateOfChargeKwh() {
        return stateOfChargeKwh;
    }

    /**
     * Sets the value of the stateOfChargeKwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStateOfChargeKwh(Float value) {
        this.stateOfChargeKwh = value;
    }

    /**
     * Gets the value of the stateOfChargePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStateOfChargePercentage() {
        return stateOfChargePercentage;
    }

    /**
     * Sets the value of the stateOfChargePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStateOfChargePercentage(Float value) {
        this.stateOfChargePercentage = value;
    }

    /**
     * Gets the value of the directReading property.
     * 
     */
    public int getDirectReading() {
        return directReading;
    }

    /**
     * Sets the value of the directReading property.
     * 
     */
    public void setDirectReading(int value) {
        this.directReading = value;
    }

    /**
     * Gets the value of the isChargerConnected property.
     * 
     */
    public int getIsChargerConnected() {
        return isChargerConnected;
    }

    /**
     * Sets the value of the isChargerConnected property.
     * 
     */
    public void setIsChargerConnected(int value) {
        this.isChargerConnected = value;
    }

    /**
     * Gets the value of the isChargingInProgress property.
     * 
     */
    public int getIsChargingInProgress() {
        return isChargingInProgress;
    }

    /**
     * Sets the value of the isChargingInProgress property.
     * 
     */
    public void setIsChargingInProgress(int value) {
        this.isChargingInProgress = value;
    }

    /**
     * Gets the value of the timeTo80Charge property.
     * 
     */
    public float getTimeTo80Charge() {
        return timeTo80Charge;
    }

    /**
     * Sets the value of the timeTo80Charge property.
     * 
     */
    public void setTimeTo80Charge(float value) {
        this.timeTo80Charge = value;
    }

    /**
     * Gets the value of the timeToFullCharge property.
     * 
     */
    public float getTimeToFullCharge() {
        return timeToFullCharge;
    }

    /**
     * Sets the value of the timeToFullCharge property.
     * 
     */
    public void setTimeToFullCharge(float value) {
        this.timeToFullCharge = value;
    }

    /**
     * Gets the value of the estimatedRangeKmFuel property.
     * 
     */
    public float getEstimatedRangeKmFuel() {
        return estimatedRangeKmFuel;
    }

    /**
     * Sets the value of the estimatedRangeKmFuel property.
     * 
     */
    public void setEstimatedRangeKmFuel(float value) {
        this.estimatedRangeKmFuel = value;
    }

    /**
     * Gets the value of the estimatedRangeKmBattery property.
     * 
     */
    public float getEstimatedRangeKmBattery() {
        return estimatedRangeKmBattery;
    }

    /**
     * Sets the value of the estimatedRangeKmBattery property.
     * 
     */
    public void setEstimatedRangeKmBattery(float value) {
        this.estimatedRangeKmBattery = value;
    }

    /**
     * Gets the value of the odometerKm property.
     * 
     */
    public float getOdometerKm() {
        return odometerKm;
    }

    /**
     * Sets the value of the odometerKm property.
     * 
     */
    public void setOdometerKm(float value) {
        this.odometerKm = value;
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
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the batteryMaxCapacityKwh property.
     * 
     */
    public float getBatteryMaxCapacityKwh() {
        return batteryMaxCapacityKwh;
    }

    /**
     * Sets the value of the batteryMaxCapacityKwh property.
     * 
     */
    public void setBatteryMaxCapacityKwh(float value) {
        this.batteryMaxCapacityKwh = value;
    }

    /**
     * Gets the value of the fuelMaxCapacityLitre property.
     * 
     */
    public int getFuelMaxCapacityLitre() {
        return fuelMaxCapacityLitre;
    }

    /**
     * Sets the value of the fuelMaxCapacityLitre property.
     * 
     */
    public void setFuelMaxCapacityLitre(int value) {
        this.fuelMaxCapacityLitre = value;
    }

}
