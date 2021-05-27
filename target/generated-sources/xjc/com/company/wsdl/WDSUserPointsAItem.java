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
 * <p>Java class for WDS_UserPointsAItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_UserPointsAItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Nazev" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zs" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Zd" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Ulice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Obec" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Psc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MStat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kont_osoba" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kont_mobil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zdrzeni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Casod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Casdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pozn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Vrstva" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Firma" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Typ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Klasifikace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Popis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PlanNavstev" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PKat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="www" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Priznak" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idpoint" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_UserPointsAItem", propOrder = {

})
public class WDSUserPointsAItem {

    @XmlElement(name = "Nazev", required = true)
    protected String nazev;
    @XmlElement(name = "Zs")
    protected float zs;
    @XmlElement(name = "Zd")
    protected float zd;
    @XmlElement(name = "Ulice", required = true)
    protected String ulice;
    @XmlElement(name = "Obec", required = true)
    protected String obec;
    @XmlElement(name = "Psc", required = true)
    protected String psc;
    @XmlElement(name = "MStat", required = true)
    protected String mStat;
    @XmlElement(name = "IC", required = true)
    protected String ic;
    @XmlElement(name = "Kont_osoba", required = true)
    protected String kontOsoba;
    @XmlElement(name = "Kont_mobil", required = true)
    protected String kontMobil;
    @XmlElement(name = "Zdrzeni", required = true)
    protected String zdrzeni;
    @XmlElement(name = "Casod", required = true)
    protected String casod;
    @XmlElement(name = "Casdo", required = true)
    protected String casdo;
    @XmlElement(name = "Pozn", required = true)
    protected String pozn;
    @XmlElement(name = "Radius")
    protected int radius;
    @XmlElement(name = "Vrstva", required = true)
    protected String vrstva;
    @XmlElement(name = "Kod", required = true)
    protected String kod;
    @XmlElement(name = "Firma", required = true)
    protected String firma;
    @XmlElement(name = "Typ", required = true)
    protected String typ;
    @XmlElement(name = "Klasifikace", required = true)
    protected String klasifikace;
    @XmlElement(name = "Popis", required = true)
    protected String popis;
    @XmlElement(name = "PlanNavstev")
    protected int planNavstev;
    @XmlElement(name = "PKat", required = true)
    protected String pKat;
    @XmlElement(required = true)
    protected String www;
    @XmlElement(name = "Priznak")
    protected int priznak;
    @XmlElement(name = "Paid", required = true)
    protected String paid;
    @XmlElement(name = "PFrom", required = true)
    protected String pFrom;
    @XmlElement(name = "PTo", required = true)
    protected String pTo;
    protected int idpoint;

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
     * Gets the value of the ulice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlice() {
        return ulice;
    }

    /**
     * Sets the value of the ulice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlice(String value) {
        this.ulice = value;
    }

    /**
     * Gets the value of the obec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObec() {
        return obec;
    }

    /**
     * Sets the value of the obec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObec(String value) {
        this.obec = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsc() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsc(String value) {
        this.psc = value;
    }

    /**
     * Gets the value of the mStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMStat() {
        return mStat;
    }

    /**
     * Sets the value of the mStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMStat(String value) {
        this.mStat = value;
    }

    /**
     * Gets the value of the ic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIC() {
        return ic;
    }

    /**
     * Sets the value of the ic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIC(String value) {
        this.ic = value;
    }

    /**
     * Gets the value of the kontOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontOsoba() {
        return kontOsoba;
    }

    /**
     * Sets the value of the kontOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontOsoba(String value) {
        this.kontOsoba = value;
    }

    /**
     * Gets the value of the kontMobil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontMobil() {
        return kontMobil;
    }

    /**
     * Sets the value of the kontMobil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontMobil(String value) {
        this.kontMobil = value;
    }

    /**
     * Gets the value of the zdrzeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZdrzeni() {
        return zdrzeni;
    }

    /**
     * Sets the value of the zdrzeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZdrzeni(String value) {
        this.zdrzeni = value;
    }

    /**
     * Gets the value of the casod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasod() {
        return casod;
    }

    /**
     * Sets the value of the casod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasod(String value) {
        this.casod = value;
    }

    /**
     * Gets the value of the casdo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasdo() {
        return casdo;
    }

    /**
     * Sets the value of the casdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasdo(String value) {
        this.casdo = value;
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
     * Gets the value of the firma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma(String value) {
        this.firma = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the klasifikace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlasifikace() {
        return klasifikace;
    }

    /**
     * Sets the value of the klasifikace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlasifikace(String value) {
        this.klasifikace = value;
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
     * Gets the value of the planNavstev property.
     * 
     */
    public int getPlanNavstev() {
        return planNavstev;
    }

    /**
     * Sets the value of the planNavstev property.
     * 
     */
    public void setPlanNavstev(int value) {
        this.planNavstev = value;
    }

    /**
     * Gets the value of the pKat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKat() {
        return pKat;
    }

    /**
     * Sets the value of the pKat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKat(String value) {
        this.pKat = value;
    }

    /**
     * Gets the value of the www property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWww() {
        return www;
    }

    /**
     * Sets the value of the www property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWww(String value) {
        this.www = value;
    }

    /**
     * Gets the value of the priznak property.
     * 
     */
    public int getPriznak() {
        return priznak;
    }

    /**
     * Sets the value of the priznak property.
     * 
     */
    public void setPriznak(int value) {
        this.priznak = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaid(String value) {
        this.paid = value;
    }

    /**
     * Gets the value of the pFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFrom() {
        return pFrom;
    }

    /**
     * Sets the value of the pFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFrom(String value) {
        this.pFrom = value;
    }

    /**
     * Gets the value of the pTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTo() {
        return pTo;
    }

    /**
     * Sets the value of the pTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTo(String value) {
        this.pTo = value;
    }

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

}
