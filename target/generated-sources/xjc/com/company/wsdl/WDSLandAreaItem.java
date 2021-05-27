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
 * <p>Java class for WDS_LandAreaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_LandAreaItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="idpoint" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nazev" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zs" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Zd" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Naklon" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Plocha" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Vrstva" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Popis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Uzivatel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KodBloku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ctverec" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pozn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Polygon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DisableDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_LandAreaItem", propOrder = {

})
public class WDSLandAreaItem {

    protected int idpoint;
    @XmlElement(name = "Nazev", required = true)
    protected String nazev;
    @XmlElement(name = "Zs")
    protected float zs;
    @XmlElement(name = "Zd")
    protected float zd;
    @XmlElement(name = "Radius")
    protected int radius;
    @XmlElement(name = "Naklon")
    protected int naklon;
    @XmlElement(name = "Plocha")
    protected float plocha;
    @XmlElement(name = "Vrstva", required = true)
    protected String vrstva;
    @XmlElement(name = "Kod", required = true)
    protected String kod;
    @XmlElement(name = "Popis", required = true)
    protected String popis;
    @XmlElement(name = "Uzivatel", required = true)
    protected String uzivatel;
    @XmlElement(name = "KodBloku", required = true)
    protected String kodBloku;
    @XmlElement(name = "Ctverec", required = true)
    protected String ctverec;
    @XmlElement(name = "Stat", required = true)
    protected String stat;
    @XmlElement(name = "Pozn", required = true)
    protected String pozn;
    @XmlElement(name = "Polygon", required = true)
    protected String polygon;
    @XmlElement(name = "Disabled")
    protected int disabled;
    @XmlElement(name = "DisableDate", required = true)
    protected String disableDate;

    /**
     * Gets the value of the idpoint property.
     * 
     */
    public int getIdpoint() {
        return idpoint;
    }

    /**
     * Sets the value of the idpoint property.
     * 
     */
    public void setIdpoint(int value) {
        this.idpoint = value;
    }

    /**
     * Gets the value of the nazev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazev() {
        return nazev;
    }

    /**
     * Sets the value of the nazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazev(String value) {
        this.nazev = value;
    }

    /**
     * Gets the value of the zs property.
     * 
     */
    public float getZs() {
        return zs;
    }

    /**
     * Sets the value of the zs property.
     * 
     */
    public void setZs(float value) {
        this.zs = value;
    }

    /**
     * Gets the value of the zd property.
     * 
     */
    public float getZd() {
        return zd;
    }

    /**
     * Sets the value of the zd property.
     * 
     */
    public void setZd(float value) {
        this.zd = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(int value) {
        this.radius = value;
    }

    /**
     * Gets the value of the naklon property.
     * 
     */
    public int getNaklon() {
        return naklon;
    }

    /**
     * Sets the value of the naklon property.
     * 
     */
    public void setNaklon(int value) {
        this.naklon = value;
    }

    /**
     * Gets the value of the plocha property.
     * 
     */
    public float getPlocha() {
        return plocha;
    }

    /**
     * Sets the value of the plocha property.
     * 
     */
    public void setPlocha(float value) {
        this.plocha = value;
    }

    /**
     * Gets the value of the vrstva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrstva() {
        return vrstva;
    }

    /**
     * Sets the value of the vrstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrstva(String value) {
        this.vrstva = value;
    }

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKod(String value) {
        this.kod = value;
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
     * Gets the value of the uzivatel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUzivatel() {
        return uzivatel;
    }

    /**
     * Sets the value of the uzivatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUzivatel(String value) {
        this.uzivatel = value;
    }

    /**
     * Gets the value of the kodBloku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodBloku() {
        return kodBloku;
    }

    /**
     * Sets the value of the kodBloku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodBloku(String value) {
        this.kodBloku = value;
    }

    /**
     * Gets the value of the ctverec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtverec() {
        return ctverec;
    }

    /**
     * Sets the value of the ctverec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtverec(String value) {
        this.ctverec = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the pozn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozn() {
        return pozn;
    }

    /**
     * Sets the value of the pozn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozn(String value) {
        this.pozn = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolygon(String value) {
        this.polygon = value;
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
     * Gets the value of the disableDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableDate() {
        return disableDate;
    }

    /**
     * Sets the value of the disableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableDate(String value) {
        this.disableDate = value;
    }

}
