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
 * <p>Java class for WDS_TachographItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_TachographItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DriverStatus1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DriverLimit1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Duration1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsCard1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DriverStatus2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DriverLimit2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Duration2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsCard2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TachoKm" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_TachographItem", propOrder = {

})
public class WDSTachographItem {

    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "Datum", required = true)
    protected String datum;
    @XmlElement(name = "DriverStatus1")
    protected int driverStatus1;
    @XmlElement(name = "DriverLimit1")
    protected int driverLimit1;
    @XmlElement(name = "Duration1", required = true)
    protected String duration1;
    @XmlElement(name = "IsCard1")
    protected int isCard1;
    @XmlElement(name = "DriverStatus2")
    protected int driverStatus2;
    @XmlElement(name = "DriverLimit2")
    protected int driverLimit2;
    @XmlElement(name = "Duration2", required = true)
    protected String duration2;
    @XmlElement(name = "IsCard2")
    protected int isCard2;
    @XmlElement(name = "TachoKm")
    protected float tachoKm;

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
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Gets the value of the driverStatus1 property.
     * 
     */
    public int getDriverStatus1() {
        return driverStatus1;
    }

    /**
     * Sets the value of the driverStatus1 property.
     * 
     */
    public void setDriverStatus1(int value) {
        this.driverStatus1 = value;
    }

    /**
     * Gets the value of the driverLimit1 property.
     * 
     */
    public int getDriverLimit1() {
        return driverLimit1;
    }

    /**
     * Sets the value of the driverLimit1 property.
     * 
     */
    public void setDriverLimit1(int value) {
        this.driverLimit1 = value;
    }

    /**
     * Gets the value of the duration1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration1() {
        return duration1;
    }

    /**
     * Sets the value of the duration1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration1(String value) {
        this.duration1 = value;
    }

    /**
     * Gets the value of the isCard1 property.
     * 
     */
    public int getIsCard1() {
        return isCard1;
    }

    /**
     * Sets the value of the isCard1 property.
     * 
     */
    public void setIsCard1(int value) {
        this.isCard1 = value;
    }

    /**
     * Gets the value of the driverStatus2 property.
     * 
     */
    public int getDriverStatus2() {
        return driverStatus2;
    }

    /**
     * Sets the value of the driverStatus2 property.
     * 
     */
    public void setDriverStatus2(int value) {
        this.driverStatus2 = value;
    }

    /**
     * Gets the value of the driverLimit2 property.
     * 
     */
    public int getDriverLimit2() {
        return driverLimit2;
    }

    /**
     * Sets the value of the driverLimit2 property.
     * 
     */
    public void setDriverLimit2(int value) {
        this.driverLimit2 = value;
    }

    /**
     * Gets the value of the duration2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration2() {
        return duration2;
    }

    /**
     * Sets the value of the duration2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration2(String value) {
        this.duration2 = value;
    }

    /**
     * Gets the value of the isCard2 property.
     * 
     */
    public int getIsCard2() {
        return isCard2;
    }

    /**
     * Sets the value of the isCard2 property.
     * 
     */
    public void setIsCard2(int value) {
        this.isCard2 = value;
    }

    /**
     * Gets the value of the tachoKm property.
     * 
     */
    public float getTachoKm() {
        return tachoKm;
    }

    /**
     * Sets the value of the tachoKm property.
     * 
     */
    public void setTachoKm(float value) {
        this.tachoKm = value;
    }

}