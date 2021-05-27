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
 * <p>Java class for WDS_SpreadDItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_SpreadDItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DatGMT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatSend" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ew" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="El" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Work" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TRoute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Act" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Plow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="M1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="M2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Dist" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Odo" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Dose" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="WR" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="WL" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="SInert" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="SSalt" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="SBrine" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="SendStart" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SendCls" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SendNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AirTemp" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="RoadTemp" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_SpreadDItem", propOrder = {

})
public class WDSSpreadDItem {

    @XmlElement(name = "DatGMT", required = true)
    protected String datGMT;
    @XmlElement(name = "DatSend", required = true)
    protected String datSend;
    @XmlElement(name = "Ew")
    protected float ew;
    @XmlElement(name = "El")
    protected float el;
    @XmlElement(name = "Work")
    protected int work;
    @XmlElement(name = "TRoute")
    protected int tRoute;
    @XmlElement(name = "Speed")
    protected int speed;
    @XmlElement(name = "Act")
    protected int act;
    @XmlElement(name = "Plow")
    protected int plow;
    @XmlElement(name = "M1")
    protected int m1;
    @XmlElement(name = "M2")
    protected int m2;
    @XmlElement(name = "Dist")
    protected float dist;
    @XmlElement(name = "Odo")
    protected float odo;
    @XmlElement(name = "Dose")
    protected float dose;
    @XmlElement(name = "WR")
    protected float wr;
    @XmlElement(name = "WL")
    protected float wl;
    @XmlElement(name = "SInert")
    protected float sInert;
    @XmlElement(name = "SSalt")
    protected float sSalt;
    @XmlElement(name = "SBrine")
    protected float sBrine;
    @XmlElement(name = "SendStart")
    protected int sendStart;
    @XmlElement(name = "SendCls")
    protected int sendCls;
    @XmlElement(name = "SendNum")
    protected int sendNum;
    @XmlElement(name = "AirTemp")
    protected float airTemp;
    @XmlElement(name = "RoadTemp")
    protected float roadTemp;

    /**
     * Gets the value of the datGMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatGMT() {
        return datGMT;
    }

    /**
     * Sets the value of the datGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatGMT(String value) {
        this.datGMT = value;
    }

    /**
     * Gets the value of the datSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatSend() {
        return datSend;
    }

    /**
     * Sets the value of the datSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatSend(String value) {
        this.datSend = value;
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
     * Gets the value of the work property.
     * 
     */
    public int getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     */
    public void setWork(int value) {
        this.work = value;
    }

    /**
     * Gets the value of the tRoute property.
     * 
     */
    public int getTRoute() {
        return tRoute;
    }

    /**
     * Sets the value of the tRoute property.
     * 
     */
    public void setTRoute(int value) {
        this.tRoute = value;
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
     * Gets the value of the act property.
     * 
     */
    public int getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     */
    public void setAct(int value) {
        this.act = value;
    }

    /**
     * Gets the value of the plow property.
     * 
     */
    public int getPlow() {
        return plow;
    }

    /**
     * Sets the value of the plow property.
     * 
     */
    public void setPlow(int value) {
        this.plow = value;
    }

    /**
     * Gets the value of the m1 property.
     * 
     */
    public int getM1() {
        return m1;
    }

    /**
     * Sets the value of the m1 property.
     * 
     */
    public void setM1(int value) {
        this.m1 = value;
    }

    /**
     * Gets the value of the m2 property.
     * 
     */
    public int getM2() {
        return m2;
    }

    /**
     * Sets the value of the m2 property.
     * 
     */
    public void setM2(int value) {
        this.m2 = value;
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

    /**
     * Gets the value of the odo property.
     * 
     */
    public float getOdo() {
        return odo;
    }

    /**
     * Sets the value of the odo property.
     * 
     */
    public void setOdo(float value) {
        this.odo = value;
    }

    /**
     * Gets the value of the dose property.
     * 
     */
    public float getDose() {
        return dose;
    }

    /**
     * Sets the value of the dose property.
     * 
     */
    public void setDose(float value) {
        this.dose = value;
    }

    /**
     * Gets the value of the wr property.
     * 
     */
    public float getWR() {
        return wr;
    }

    /**
     * Sets the value of the wr property.
     * 
     */
    public void setWR(float value) {
        this.wr = value;
    }

    /**
     * Gets the value of the wl property.
     * 
     */
    public float getWL() {
        return wl;
    }

    /**
     * Sets the value of the wl property.
     * 
     */
    public void setWL(float value) {
        this.wl = value;
    }

    /**
     * Gets the value of the sInert property.
     * 
     */
    public float getSInert() {
        return sInert;
    }

    /**
     * Sets the value of the sInert property.
     * 
     */
    public void setSInert(float value) {
        this.sInert = value;
    }

    /**
     * Gets the value of the sSalt property.
     * 
     */
    public float getSSalt() {
        return sSalt;
    }

    /**
     * Sets the value of the sSalt property.
     * 
     */
    public void setSSalt(float value) {
        this.sSalt = value;
    }

    /**
     * Gets the value of the sBrine property.
     * 
     */
    public float getSBrine() {
        return sBrine;
    }

    /**
     * Sets the value of the sBrine property.
     * 
     */
    public void setSBrine(float value) {
        this.sBrine = value;
    }

    /**
     * Gets the value of the sendStart property.
     * 
     */
    public int getSendStart() {
        return sendStart;
    }

    /**
     * Sets the value of the sendStart property.
     * 
     */
    public void setSendStart(int value) {
        this.sendStart = value;
    }

    /**
     * Gets the value of the sendCls property.
     * 
     */
    public int getSendCls() {
        return sendCls;
    }

    /**
     * Sets the value of the sendCls property.
     * 
     */
    public void setSendCls(int value) {
        this.sendCls = value;
    }

    /**
     * Gets the value of the sendNum property.
     * 
     */
    public int getSendNum() {
        return sendNum;
    }

    /**
     * Sets the value of the sendNum property.
     * 
     */
    public void setSendNum(int value) {
        this.sendNum = value;
    }

    /**
     * Gets the value of the airTemp property.
     * 
     */
    public float getAirTemp() {
        return airTemp;
    }

    /**
     * Sets the value of the airTemp property.
     * 
     */
    public void setAirTemp(float value) {
        this.airTemp = value;
    }

    /**
     * Gets the value of the roadTemp property.
     * 
     */
    public float getRoadTemp() {
        return roadTemp;
    }

    /**
     * Sets the value of the roadTemp property.
     * 
     */
    public void setRoadTemp(float value) {
        this.roadTemp = value;
    }

}