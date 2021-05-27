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
 * <p>Java class for WDS_DriverRatingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_DriverRatingItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdDriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarIdentifikator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Dist_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Num_Routes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Avg_speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Max_speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Avg_cons" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Flow_cons" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Book_cons" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Tolerance_cons" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="AvgCO2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="FloatCO2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="TotalCO2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_DriverRatingItem", propOrder = {

})
public class WDSDriverRatingItem {

    @XmlElement(name = "IdDriver")
    protected int idDriver;
    @XmlElement(name = "CarIdentifikator", required = true)
    protected String carIdentifikator;
    @XmlElement(name = "Dist_km")
    protected float distKm;
    @XmlElement(name = "Num_Routes")
    protected int numRoutes;
    @XmlElement(name = "Rating")
    protected int rating;
    @XmlElement(name = "Avg_speed")
    protected int avgSpeed;
    @XmlElement(name = "Max_speed")
    protected int maxSpeed;
    @XmlElement(name = "Avg_cons")
    protected float avgCons;
    @XmlElement(name = "Flow_cons")
    protected float flowCons;
    @XmlElement(name = "Book_cons")
    protected float bookCons;
    @XmlElement(name = "Tolerance_cons")
    protected float toleranceCons;
    @XmlElement(name = "AvgCO2")
    protected float avgCO2;
    @XmlElement(name = "FloatCO2")
    protected float floatCO2;
    @XmlElement(name = "TotalCO2")
    protected float totalCO2;

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
     * Gets the value of the carIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarIdentifikator() {
        return carIdentifikator;
    }

    /**
     * Sets the value of the carIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarIdentifikator(String value) {
        this.carIdentifikator = value;
    }

    /**
     * Gets the value of the distKm property.
     * 
     */
    public float getDistKm() {
        return distKm;
    }

    /**
     * Sets the value of the distKm property.
     * 
     */
    public void setDistKm(float value) {
        this.distKm = value;
    }

    /**
     * Gets the value of the numRoutes property.
     * 
     */
    public int getNumRoutes() {
        return numRoutes;
    }

    /**
     * Sets the value of the numRoutes property.
     * 
     */
    public void setNumRoutes(int value) {
        this.numRoutes = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     */
    public void setRating(int value) {
        this.rating = value;
    }

    /**
     * Gets the value of the avgSpeed property.
     * 
     */
    public int getAvgSpeed() {
        return avgSpeed;
    }

    /**
     * Sets the value of the avgSpeed property.
     * 
     */
    public void setAvgSpeed(int value) {
        this.avgSpeed = value;
    }

    /**
     * Gets the value of the maxSpeed property.
     * 
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the value of the maxSpeed property.
     * 
     */
    public void setMaxSpeed(int value) {
        this.maxSpeed = value;
    }

    /**
     * Gets the value of the avgCons property.
     * 
     */
    public float getAvgCons() {
        return avgCons;
    }

    /**
     * Sets the value of the avgCons property.
     * 
     */
    public void setAvgCons(float value) {
        this.avgCons = value;
    }

    /**
     * Gets the value of the flowCons property.
     * 
     */
    public float getFlowCons() {
        return flowCons;
    }

    /**
     * Sets the value of the flowCons property.
     * 
     */
    public void setFlowCons(float value) {
        this.flowCons = value;
    }

    /**
     * Gets the value of the bookCons property.
     * 
     */
    public float getBookCons() {
        return bookCons;
    }

    /**
     * Sets the value of the bookCons property.
     * 
     */
    public void setBookCons(float value) {
        this.bookCons = value;
    }

    /**
     * Gets the value of the toleranceCons property.
     * 
     */
    public float getToleranceCons() {
        return toleranceCons;
    }

    /**
     * Sets the value of the toleranceCons property.
     * 
     */
    public void setToleranceCons(float value) {
        this.toleranceCons = value;
    }

    /**
     * Gets the value of the avgCO2 property.
     * 
     */
    public float getAvgCO2() {
        return avgCO2;
    }

    /**
     * Sets the value of the avgCO2 property.
     * 
     */
    public void setAvgCO2(float value) {
        this.avgCO2 = value;
    }

    /**
     * Gets the value of the floatCO2 property.
     * 
     */
    public float getFloatCO2() {
        return floatCO2;
    }

    /**
     * Sets the value of the floatCO2 property.
     * 
     */
    public void setFloatCO2(float value) {
        this.floatCO2 = value;
    }

    /**
     * Gets the value of the totalCO2 property.
     * 
     */
    public float getTotalCO2() {
        return totalCO2;
    }

    /**
     * Sets the value of the totalCO2 property.
     * 
     */
    public void setTotalCO2(float value) {
        this.totalCO2 = value;
    }

}
