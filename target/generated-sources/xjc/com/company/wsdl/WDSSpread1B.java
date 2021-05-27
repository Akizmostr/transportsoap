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
 * <p>Java class for WDS_Spread1B complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_Spread1B"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Mer_datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Vyrobni_cislo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sul_smena" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Solanka_smena" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Inert_smena" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Vzdalenost" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Vzdalenost_posyp" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Sul_celkem" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Solanka_celkem" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Inert_celkem" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Mh_smena" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Mh_celkem" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_Spread1B", propOrder = {

})
public class WDSSpread1B {

    @XmlElement(name = "Mer_datum", required = true)
    protected String merDatum;
    @XmlElement(name = "Datum", required = true)
    protected String datum;
    @XmlElement(name = "Vyrobni_cislo", required = true)
    protected String vyrobniCislo;
    @XmlElement(name = "Sul_smena")
    protected int sulSmena;
    @XmlElement(name = "Solanka_smena")
    protected int solankaSmena;
    @XmlElement(name = "Inert_smena")
    protected int inertSmena;
    @XmlElement(name = "Vzdalenost")
    protected float vzdalenost;
    @XmlElement(name = "Vzdalenost_posyp")
    protected float vzdalenostPosyp;
    @XmlElement(name = "Sul_celkem")
    protected float sulCelkem;
    @XmlElement(name = "Solanka_celkem")
    protected float solankaCelkem;
    @XmlElement(name = "Inert_celkem")
    protected float inertCelkem;
    @XmlElement(name = "Mh_smena")
    protected float mhSmena;
    @XmlElement(name = "Mh_celkem")
    protected float mhCelkem;

    /**
     * Gets the value of the merDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerDatum() {
        return merDatum;
    }

    /**
     * Sets the value of the merDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerDatum(String value) {
        this.merDatum = value;
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
     * Gets the value of the vyrobniCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyrobniCislo() {
        return vyrobniCislo;
    }

    /**
     * Sets the value of the vyrobniCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyrobniCislo(String value) {
        this.vyrobniCislo = value;
    }

    /**
     * Gets the value of the sulSmena property.
     * 
     */
    public int getSulSmena() {
        return sulSmena;
    }

    /**
     * Sets the value of the sulSmena property.
     * 
     */
    public void setSulSmena(int value) {
        this.sulSmena = value;
    }

    /**
     * Gets the value of the solankaSmena property.
     * 
     */
    public int getSolankaSmena() {
        return solankaSmena;
    }

    /**
     * Sets the value of the solankaSmena property.
     * 
     */
    public void setSolankaSmena(int value) {
        this.solankaSmena = value;
    }

    /**
     * Gets the value of the inertSmena property.
     * 
     */
    public int getInertSmena() {
        return inertSmena;
    }

    /**
     * Sets the value of the inertSmena property.
     * 
     */
    public void setInertSmena(int value) {
        this.inertSmena = value;
    }

    /**
     * Gets the value of the vzdalenost property.
     * 
     */
    public float getVzdalenost() {
        return vzdalenost;
    }

    /**
     * Sets the value of the vzdalenost property.
     * 
     */
    public void setVzdalenost(float value) {
        this.vzdalenost = value;
    }

    /**
     * Gets the value of the vzdalenostPosyp property.
     * 
     */
    public float getVzdalenostPosyp() {
        return vzdalenostPosyp;
    }

    /**
     * Sets the value of the vzdalenostPosyp property.
     * 
     */
    public void setVzdalenostPosyp(float value) {
        this.vzdalenostPosyp = value;
    }

    /**
     * Gets the value of the sulCelkem property.
     * 
     */
    public float getSulCelkem() {
        return sulCelkem;
    }

    /**
     * Sets the value of the sulCelkem property.
     * 
     */
    public void setSulCelkem(float value) {
        this.sulCelkem = value;
    }

    /**
     * Gets the value of the solankaCelkem property.
     * 
     */
    public float getSolankaCelkem() {
        return solankaCelkem;
    }

    /**
     * Sets the value of the solankaCelkem property.
     * 
     */
    public void setSolankaCelkem(float value) {
        this.solankaCelkem = value;
    }

    /**
     * Gets the value of the inertCelkem property.
     * 
     */
    public float getInertCelkem() {
        return inertCelkem;
    }

    /**
     * Sets the value of the inertCelkem property.
     * 
     */
    public void setInertCelkem(float value) {
        this.inertCelkem = value;
    }

    /**
     * Gets the value of the mhSmena property.
     * 
     */
    public float getMhSmena() {
        return mhSmena;
    }

    /**
     * Sets the value of the mhSmena property.
     * 
     */
    public void setMhSmena(float value) {
        this.mhSmena = value;
    }

    /**
     * Gets the value of the mhCelkem property.
     * 
     */
    public float getMhCelkem() {
        return mhCelkem;
    }

    /**
     * Sets the value of the mhCelkem property.
     * 
     */
    public void setMhCelkem(float value) {
        this.mhCelkem = value;
    }

}
