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
 * <p>Java class for WDS_CarItem2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarItem2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="cargroupid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="carid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="identifikator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="driver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userrights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="gpsmobil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gpsmobil2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unittype" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="unitname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="swnastav" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tdevice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="disabledate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="popis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carsharing" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="immobilizer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarItem2", propOrder = {

})
public class WDSCarItem2 {

    protected int cargroupid;
    protected int carid;
    @XmlElement(required = true)
    protected String identifikator;
    @XmlElement(required = true)
    protected String driver;
    @XmlElement(required = true)
    protected String mobil;
    protected int userrights;
    protected int type;
    protected int online;
    protected int disabled;
    @XmlElement(required = true)
    protected String gpsmobil;
    @XmlElement(required = true)
    protected String gpsmobil2;
    @XmlElement(required = true)
    protected String imei;
    @XmlElement(required = true)
    protected String sn;
    protected int unittype;
    @XmlElement(required = true)
    protected String unitname;
    protected long swnastav;
    protected int tdevice;
    @XmlElement(required = true)
    protected String disabledate;
    @XmlElement(required = true)
    protected String popis;
    protected int carsharing;
    protected int immobilizer;

    /**
     * Gets the value of the cargroupid property.
     * 
     */
    public int getCargroupid() {
        return cargroupid;
    }

    /**
     * Sets the value of the cargroupid property.
     * 
     */
    public void setCargroupid(int value) {
        this.cargroupid = value;
    }

    /**
     * Gets the value of the carid property.
     * 
     */
    public int getCarid() {
        return carid;
    }

    /**
     * Sets the value of the carid property.
     * 
     */
    public void setCarid(int value) {
        this.carid = value;
    }

    /**
     * Gets the value of the identifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifikator() {
        return identifikator;
    }

    /**
     * Sets the value of the identifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifikator(String value) {
        this.identifikator = value;
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

    /**
     * Gets the value of the mobil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobil() {
        return mobil;
    }

    /**
     * Sets the value of the mobil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobil(String value) {
        this.mobil = value;
    }

    /**
     * Gets the value of the userrights property.
     * 
     */
    public int getUserrights() {
        return userrights;
    }

    /**
     * Sets the value of the userrights property.
     * 
     */
    public void setUserrights(int value) {
        this.userrights = value;
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
     * Gets the value of the online property.
     * 
     */
    public int getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     */
    public void setOnline(int value) {
        this.online = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     */
    public int getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     */
    public void setDisabled(int value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the gpsmobil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsmobil() {
        return gpsmobil;
    }

    /**
     * Sets the value of the gpsmobil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsmobil(String value) {
        this.gpsmobil = value;
    }

    /**
     * Gets the value of the gpsmobil2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsmobil2() {
        return gpsmobil2;
    }

    /**
     * Sets the value of the gpsmobil2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsmobil2(String value) {
        this.gpsmobil2 = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the sn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSn() {
        return sn;
    }

    /**
     * Sets the value of the sn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSn(String value) {
        this.sn = value;
    }

    /**
     * Gets the value of the unittype property.
     * 
     */
    public int getUnittype() {
        return unittype;
    }

    /**
     * Sets the value of the unittype property.
     * 
     */
    public void setUnittype(int value) {
        this.unittype = value;
    }

    /**
     * Gets the value of the unitname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitname() {
        return unitname;
    }

    /**
     * Sets the value of the unitname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitname(String value) {
        this.unitname = value;
    }

    /**
     * Gets the value of the swnastav property.
     * 
     */
    public long getSwnastav() {
        return swnastav;
    }

    /**
     * Sets the value of the swnastav property.
     * 
     */
    public void setSwnastav(long value) {
        this.swnastav = value;
    }

    /**
     * Gets the value of the tdevice property.
     * 
     */
    public int getTdevice() {
        return tdevice;
    }

    /**
     * Sets the value of the tdevice property.
     * 
     */
    public void setTdevice(int value) {
        this.tdevice = value;
    }

    /**
     * Gets the value of the disabledate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabledate() {
        return disabledate;
    }

    /**
     * Sets the value of the disabledate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabledate(String value) {
        this.disabledate = value;
    }

    /**
     * Gets the value of the popis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopis() {
        return popis;
    }

    /**
     * Sets the value of the popis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopis(String value) {
        this.popis = value;
    }

    /**
     * Gets the value of the carsharing property.
     * 
     */
    public int getCarsharing() {
        return carsharing;
    }

    /**
     * Sets the value of the carsharing property.
     * 
     */
    public void setCarsharing(int value) {
        this.carsharing = value;
    }

    /**
     * Gets the value of the immobilizer property.
     * 
     */
    public int getImmobilizer() {
        return immobilizer;
    }

    /**
     * Sets the value of the immobilizer property.
     * 
     */
    public void setImmobilizer(int value) {
        this.immobilizer = value;
    }

}
