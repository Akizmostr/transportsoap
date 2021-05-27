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
 * <p>Java class for WDS_CarInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Identifikator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Dealer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Firma" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mobil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Principid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TovZn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kodf" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VerifiedVIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarInfo", propOrder = {

})
public class WDSCarInfo {

    @XmlElement(name = "IdCar", required = true)
    protected String idCar;
    @XmlElement(name = "Identifikator", required = true)
    protected String identifikator;
    @XmlElement(name = "Dealer", required = true)
    protected String dealer;
    @XmlElement(name = "Firma", required = true)
    protected String firma;
    @XmlElement(name = "Mobil", required = true)
    protected String mobil;
    @XmlElement(name = "Principid")
    protected int principid;
    @XmlElement(name = "Sn", required = true)
    protected String sn;
    @XmlElement(name = "TovZn", required = true)
    protected String tovZn;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "Kodf", required = true)
    protected String kodf;
    @XmlElement(name = "VerifiedVIN", required = true)
    protected String verifiedVIN;

    /**
     * Gets the value of the idCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCar() {
        return idCar;
    }

    /**
     * Sets the value of the idCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCar(String value) {
        this.idCar = value;
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
     * Gets the value of the dealer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealer() {
        return dealer;
    }

    /**
     * Sets the value of the dealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealer(String value) {
        this.dealer = value;
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
     * Gets the value of the principid property.
     * 
     */
    public int getPrincipid() {
        return principid;
    }

    /**
     * Sets the value of the principid property.
     * 
     */
    public void setPrincipid(int value) {
        this.principid = value;
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
     * Gets the value of the tovZn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTovZn() {
        return tovZn;
    }

    /**
     * Sets the value of the tovZn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTovZn(String value) {
        this.tovZn = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the kodf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodf() {
        return kodf;
    }

    /**
     * Sets the value of the kodf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodf(String value) {
        this.kodf = value;
    }

    /**
     * Gets the value of the verifiedVIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifiedVIN() {
        return verifiedVIN;
    }

    /**
     * Sets the value of the verifiedVIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifiedVIN(String value) {
        this.verifiedVIN = value;
    }

}