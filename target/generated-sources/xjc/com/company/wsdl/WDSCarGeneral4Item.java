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
 * <p>Java class for WDS_CarGeneral4Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarGeneral4Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CarId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cargroupid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Iddriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Identifikator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Popis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Divize" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stredisko" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Osobni_cislo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cislo_objektu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cislo_TP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tovarni_znacka" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Model_vozu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Typ_PHM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stanoviste" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amort" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="DomovPraceDomov" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mesic_km" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nadrz" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CenaBezDPH" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CenaDPH" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CenasDPH" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Spotreba_TP" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Spotreba_TP_mesto" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Spotreba_TP_mimo" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Responsible_user" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Supervising_user" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Accounting_office" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LandToolDef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LandWorkDef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LandWorkWidth" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="LandOverlay" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdTemplate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Vlastnik" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Druh" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DatOd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mobil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mobil2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarGeneral4Item", propOrder = {

})
public class WDSCarGeneral4Item {

    @XmlElement(name = "CarId")
    protected int carId;
    @XmlElement(name = "Cargroupid")
    protected int cargroupid;
    @XmlElement(name = "Iddriver")
    protected int iddriver;
    @XmlElement(name = "Identifikator", required = true)
    protected String identifikator;
    @XmlElement(name = "Popis", required = true)
    protected String popis;
    @XmlElement(name = "Divize", required = true)
    protected String divize;
    @XmlElement(name = "Stredisko", required = true)
    protected String stredisko;
    @XmlElement(name = "Osobni_cislo", required = true)
    protected String osobniCislo;
    @XmlElement(name = "Cislo_objektu", required = true)
    protected String cisloObjektu;
    @XmlElement(name = "Cislo_TP", required = true)
    protected String cisloTP;
    @XmlElement(name = "VIN", required = true)
    protected String vin;
    @XmlElement(name = "Tovarni_znacka", required = true)
    protected String tovarniZnacka;
    @XmlElement(name = "Model_vozu", required = true)
    protected String modelVozu;
    @XmlElement(name = "Typ_PHM", required = true)
    protected String typPHM;
    @XmlElement(name = "Stanoviste", required = true)
    protected String stanoviste;
    @XmlElement(name = "Amort")
    protected float amort;
    @XmlElement(name = "DomovPraceDomov")
    protected int domovPraceDomov;
    @XmlElement(name = "Mesic_km")
    protected int mesicKm;
    @XmlElement(name = "Nadrz")
    protected int nadrz;
    @XmlElement(name = "CenaBezDPH")
    protected float cenaBezDPH;
    @XmlElement(name = "CenaDPH")
    protected float cenaDPH;
    @XmlElement(name = "CenasDPH")
    protected float cenasDPH;
    @XmlElement(name = "Spotreba_TP")
    protected float spotrebaTP;
    @XmlElement(name = "Spotreba_TP_mesto")
    protected float spotrebaTPMesto;
    @XmlElement(name = "Spotreba_TP_mimo")
    protected float spotrebaTPMimo;
    @XmlElement(name = "Responsible_user")
    protected int responsibleUser;
    @XmlElement(name = "Supervising_user")
    protected int supervisingUser;
    @XmlElement(name = "Accounting_office")
    protected int accountingOffice;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "LandToolDef")
    protected int landToolDef;
    @XmlElement(name = "LandWorkDef")
    protected int landWorkDef;
    @XmlElement(name = "LandWorkWidth")
    protected float landWorkWidth;
    @XmlElement(name = "LandOverlay")
    protected int landOverlay;
    @XmlElement(name = "IdTemplate")
    protected int idTemplate;
    @XmlElement(name = "Vlastnik")
    protected int vlastnik;
    @XmlElement(name = "Druh")
    protected int druh;
    @XmlElement(name = "DatOd", required = true)
    protected String datOd;
    @XmlElement(name = "Mobil", required = true)
    protected String mobil;
    @XmlElement(name = "Mobil2", required = true)
    protected String mobil2;

    /**
     * Gets the value of the carId property.
     * 
     */
    public int getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     */
    public void setCarId(int value) {
        this.carId = value;
    }

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
     * Gets the value of the iddriver property.
     * 
     */
    public int getIddriver() {
        return iddriver;
    }

    /**
     * Sets the value of the iddriver property.
     * 
     */
    public void setIddriver(int value) {
        this.iddriver = value;
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
     * Gets the value of the divize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivize() {
        return divize;
    }

    /**
     * Sets the value of the divize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivize(String value) {
        this.divize = value;
    }

    /**
     * Gets the value of the stredisko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStredisko() {
        return stredisko;
    }

    /**
     * Sets the value of the stredisko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStredisko(String value) {
        this.stredisko = value;
    }

    /**
     * Gets the value of the osobniCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsobniCislo() {
        return osobniCislo;
    }

    /**
     * Sets the value of the osobniCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsobniCislo(String value) {
        this.osobniCislo = value;
    }

    /**
     * Gets the value of the cisloObjektu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloObjektu() {
        return cisloObjektu;
    }

    /**
     * Sets the value of the cisloObjektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloObjektu(String value) {
        this.cisloObjektu = value;
    }

    /**
     * Gets the value of the cisloTP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloTP() {
        return cisloTP;
    }

    /**
     * Sets the value of the cisloTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloTP(String value) {
        this.cisloTP = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the tovarniZnacka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTovarniZnacka() {
        return tovarniZnacka;
    }

    /**
     * Sets the value of the tovarniZnacka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTovarniZnacka(String value) {
        this.tovarniZnacka = value;
    }

    /**
     * Gets the value of the modelVozu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVozu() {
        return modelVozu;
    }

    /**
     * Sets the value of the modelVozu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVozu(String value) {
        this.modelVozu = value;
    }

    /**
     * Gets the value of the typPHM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypPHM() {
        return typPHM;
    }

    /**
     * Sets the value of the typPHM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypPHM(String value) {
        this.typPHM = value;
    }

    /**
     * Gets the value of the stanoviste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStanoviste() {
        return stanoviste;
    }

    /**
     * Sets the value of the stanoviste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStanoviste(String value) {
        this.stanoviste = value;
    }

    /**
     * Gets the value of the amort property.
     * 
     */
    public float getAmort() {
        return amort;
    }

    /**
     * Sets the value of the amort property.
     * 
     */
    public void setAmort(float value) {
        this.amort = value;
    }

    /**
     * Gets the value of the domovPraceDomov property.
     * 
     */
    public int getDomovPraceDomov() {
        return domovPraceDomov;
    }

    /**
     * Sets the value of the domovPraceDomov property.
     * 
     */
    public void setDomovPraceDomov(int value) {
        this.domovPraceDomov = value;
    }

    /**
     * Gets the value of the mesicKm property.
     * 
     */
    public int getMesicKm() {
        return mesicKm;
    }

    /**
     * Sets the value of the mesicKm property.
     * 
     */
    public void setMesicKm(int value) {
        this.mesicKm = value;
    }

    /**
     * Gets the value of the nadrz property.
     * 
     */
    public int getNadrz() {
        return nadrz;
    }

    /**
     * Sets the value of the nadrz property.
     * 
     */
    public void setNadrz(int value) {
        this.nadrz = value;
    }

    /**
     * Gets the value of the cenaBezDPH property.
     * 
     */
    public float getCenaBezDPH() {
        return cenaBezDPH;
    }

    /**
     * Sets the value of the cenaBezDPH property.
     * 
     */
    public void setCenaBezDPH(float value) {
        this.cenaBezDPH = value;
    }

    /**
     * Gets the value of the cenaDPH property.
     * 
     */
    public float getCenaDPH() {
        return cenaDPH;
    }

    /**
     * Sets the value of the cenaDPH property.
     * 
     */
    public void setCenaDPH(float value) {
        this.cenaDPH = value;
    }

    /**
     * Gets the value of the cenasDPH property.
     * 
     */
    public float getCenasDPH() {
        return cenasDPH;
    }

    /**
     * Sets the value of the cenasDPH property.
     * 
     */
    public void setCenasDPH(float value) {
        this.cenasDPH = value;
    }

    /**
     * Gets the value of the spotrebaTP property.
     * 
     */
    public float getSpotrebaTP() {
        return spotrebaTP;
    }

    /**
     * Sets the value of the spotrebaTP property.
     * 
     */
    public void setSpotrebaTP(float value) {
        this.spotrebaTP = value;
    }

    /**
     * Gets the value of the spotrebaTPMesto property.
     * 
     */
    public float getSpotrebaTPMesto() {
        return spotrebaTPMesto;
    }

    /**
     * Sets the value of the spotrebaTPMesto property.
     * 
     */
    public void setSpotrebaTPMesto(float value) {
        this.spotrebaTPMesto = value;
    }

    /**
     * Gets the value of the spotrebaTPMimo property.
     * 
     */
    public float getSpotrebaTPMimo() {
        return spotrebaTPMimo;
    }

    /**
     * Sets the value of the spotrebaTPMimo property.
     * 
     */
    public void setSpotrebaTPMimo(float value) {
        this.spotrebaTPMimo = value;
    }

    /**
     * Gets the value of the responsibleUser property.
     * 
     */
    public int getResponsibleUser() {
        return responsibleUser;
    }

    /**
     * Sets the value of the responsibleUser property.
     * 
     */
    public void setResponsibleUser(int value) {
        this.responsibleUser = value;
    }

    /**
     * Gets the value of the supervisingUser property.
     * 
     */
    public int getSupervisingUser() {
        return supervisingUser;
    }

    /**
     * Sets the value of the supervisingUser property.
     * 
     */
    public void setSupervisingUser(int value) {
        this.supervisingUser = value;
    }

    /**
     * Gets the value of the accountingOffice property.
     * 
     */
    public int getAccountingOffice() {
        return accountingOffice;
    }

    /**
     * Sets the value of the accountingOffice property.
     * 
     */
    public void setAccountingOffice(int value) {
        this.accountingOffice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the landToolDef property.
     * 
     */
    public int getLandToolDef() {
        return landToolDef;
    }

    /**
     * Sets the value of the landToolDef property.
     * 
     */
    public void setLandToolDef(int value) {
        this.landToolDef = value;
    }

    /**
     * Gets the value of the landWorkDef property.
     * 
     */
    public int getLandWorkDef() {
        return landWorkDef;
    }

    /**
     * Sets the value of the landWorkDef property.
     * 
     */
    public void setLandWorkDef(int value) {
        this.landWorkDef = value;
    }

    /**
     * Gets the value of the landWorkWidth property.
     * 
     */
    public float getLandWorkWidth() {
        return landWorkWidth;
    }

    /**
     * Sets the value of the landWorkWidth property.
     * 
     */
    public void setLandWorkWidth(float value) {
        this.landWorkWidth = value;
    }

    /**
     * Gets the value of the landOverlay property.
     * 
     */
    public int getLandOverlay() {
        return landOverlay;
    }

    /**
     * Sets the value of the landOverlay property.
     * 
     */
    public void setLandOverlay(int value) {
        this.landOverlay = value;
    }

    /**
     * Gets the value of the idTemplate property.
     * 
     */
    public int getIdTemplate() {
        return idTemplate;
    }

    /**
     * Sets the value of the idTemplate property.
     * 
     */
    public void setIdTemplate(int value) {
        this.idTemplate = value;
    }

    /**
     * Gets the value of the vlastnik property.
     * 
     */
    public int getVlastnik() {
        return vlastnik;
    }

    /**
     * Sets the value of the vlastnik property.
     * 
     */
    public void setVlastnik(int value) {
        this.vlastnik = value;
    }

    /**
     * Gets the value of the druh property.
     * 
     */
    public int getDruh() {
        return druh;
    }

    /**
     * Sets the value of the druh property.
     * 
     */
    public void setDruh(int value) {
        this.druh = value;
    }

    /**
     * Gets the value of the datOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatOd() {
        return datOd;
    }

    /**
     * Sets the value of the datOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatOd(String value) {
        this.datOd = value;
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
     * Gets the value of the mobil2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobil2() {
        return mobil2;
    }

    /**
     * Sets the value of the mobil2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobil2(String value) {
        this.mobil2 = value;
    }

}
