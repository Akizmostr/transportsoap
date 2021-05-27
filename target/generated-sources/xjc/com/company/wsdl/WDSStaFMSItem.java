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
 * <p>Java class for WDS_StaFMSItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_StaFMSItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="T1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CL" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Acc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TP" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Spd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FR" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="IFE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="AFE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ESpd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Temp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AW" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_StaFMSItem", propOrder = {

})
public class WDSStaFMSItem {

    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "T1")
    protected int t1;
    @XmlElement(name = "T2")
    protected int t2;
    @XmlElement(name = "TS")
    protected int ts;
    @XmlElement(name = "BR")
    protected int br;
    @XmlElement(name = "CL")
    protected int cl;
    @XmlElement(name = "Acc")
    protected int acc;
    @XmlElement(name = "TP")
    protected int tp;
    @XmlElement(name = "Spd")
    protected int spd;
    @XmlElement(name = "FR")
    protected float fr;
    @XmlElement(name = "IFE")
    protected float ife;
    @XmlElement(name = "AFE")
    protected float afe;
    @XmlElement(name = "ESpd")
    protected int eSpd;
    @XmlElement(name = "Temp")
    protected int temp;
    @XmlElement(name = "AW")
    protected int aw;

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
     * Gets the value of the t1 property.
     * 
     */
    public int getT1() {
        return t1;
    }

    /**
     * Sets the value of the t1 property.
     * 
     */
    public void setT1(int value) {
        this.t1 = value;
    }

    /**
     * Gets the value of the t2 property.
     * 
     */
    public int getT2() {
        return t2;
    }

    /**
     * Sets the value of the t2 property.
     * 
     */
    public void setT2(int value) {
        this.t2 = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     */
    public int getTS() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     */
    public void setTS(int value) {
        this.ts = value;
    }

    /**
     * Gets the value of the br property.
     * 
     */
    public int getBR() {
        return br;
    }

    /**
     * Sets the value of the br property.
     * 
     */
    public void setBR(int value) {
        this.br = value;
    }

    /**
     * Gets the value of the cl property.
     * 
     */
    public int getCL() {
        return cl;
    }

    /**
     * Sets the value of the cl property.
     * 
     */
    public void setCL(int value) {
        this.cl = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     */
    public int getAcc() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     */
    public void setAcc(int value) {
        this.acc = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     */
    public int getTP() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     */
    public void setTP(int value) {
        this.tp = value;
    }

    /**
     * Gets the value of the spd property.
     * 
     */
    public int getSpd() {
        return spd;
    }

    /**
     * Sets the value of the spd property.
     * 
     */
    public void setSpd(int value) {
        this.spd = value;
    }

    /**
     * Gets the value of the fr property.
     * 
     */
    public float getFR() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     */
    public void setFR(float value) {
        this.fr = value;
    }

    /**
     * Gets the value of the ife property.
     * 
     */
    public float getIFE() {
        return ife;
    }

    /**
     * Sets the value of the ife property.
     * 
     */
    public void setIFE(float value) {
        this.ife = value;
    }

    /**
     * Gets the value of the afe property.
     * 
     */
    public float getAFE() {
        return afe;
    }

    /**
     * Sets the value of the afe property.
     * 
     */
    public void setAFE(float value) {
        this.afe = value;
    }

    /**
     * Gets the value of the eSpd property.
     * 
     */
    public int getESpd() {
        return eSpd;
    }

    /**
     * Sets the value of the eSpd property.
     * 
     */
    public void setESpd(int value) {
        this.eSpd = value;
    }

    /**
     * Gets the value of the temp property.
     * 
     */
    public int getTemp() {
        return temp;
    }

    /**
     * Sets the value of the temp property.
     * 
     */
    public void setTemp(int value) {
        this.temp = value;
    }

    /**
     * Gets the value of the aw property.
     * 
     */
    public int getAW() {
        return aw;
    }

    /**
     * Sets the value of the aw property.
     * 
     */
    public void setAW(int value) {
        this.aw = value;
    }

}
