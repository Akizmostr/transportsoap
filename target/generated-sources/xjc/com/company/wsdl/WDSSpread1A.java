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
 * <p>Java class for WDS_Spread1A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_Spread1A"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Mer_datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stav" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Davka" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sirka" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rezim" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_Spread1A", propOrder = {

})
public class WDSSpread1A {

    @XmlElement(name = "Mer_datum", required = true)
    protected String merDatum;
    @XmlElement(name = "Datum", required = true)
    protected String datum;
    @XmlElement(name = "Stav", required = true)
    protected String stav;
    @XmlElement(name = "Davka")
    protected int davka;
    @XmlElement(name = "Sirka")
    protected int sirka;
    @XmlElement(name = "Rezim", required = true)
    protected String rezim;

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
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStav(String value) {
        this.stav = value;
    }

    /**
     * Gets the value of the davka property.
     * 
     */
    public int getDavka() {
        return davka;
    }

    /**
     * Sets the value of the davka property.
     * 
     */
    public void setDavka(int value) {
        this.davka = value;
    }

    /**
     * Gets the value of the sirka property.
     * 
     */
    public int getSirka() {
        return sirka;
    }

    /**
     * Sets the value of the sirka property.
     * 
     */
    public void setSirka(int value) {
        this.sirka = value;
    }

    /**
     * Gets the value of the rezim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRezim() {
        return rezim;
    }

    /**
     * Sets the value of the rezim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRezim(String value) {
        this.rezim = value;
    }

}
