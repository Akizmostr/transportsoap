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
 * <p>Java class for WDS_StaDriversItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_StaDriversItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="iddriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Jmeno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Prijmeni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Osobni_cislo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Skupina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stredisko" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Celkem_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Sluzebni_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Soukrome_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Doba_jizdy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Doba_jizdy_sluzebni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Doba_jizdy_soukroma" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DomovPraceDomov" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PHM_l" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PHM_cena" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Ostatni_naklady" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="K_uhrade_ridici" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Amortizace" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Amort_ridic" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Uhrazeno_ridicem" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Soukr_km_k_uhrade" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Porizovaci_cena" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Doba_jizdy_sluzebni_den" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Doba_jizdy_sluzebni_noc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Divize" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="employer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="use_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_StaDriversItem", propOrder = {

})
public class WDSStaDriversItem {

    protected int iddriver;
    @XmlElement(name = "Jmeno", required = true)
    protected String jmeno;
    @XmlElement(name = "Prijmeni", required = true)
    protected String prijmeni;
    @XmlElement(name = "Osobni_cislo", required = true)
    protected String osobniCislo;
    @XmlElement(name = "Skupina", required = true)
    protected String skupina;
    @XmlElement(name = "Stredisko", required = true)
    protected String stredisko;
    @XmlElement(name = "Celkem_km")
    protected float celkemKm;
    @XmlElement(name = "Sluzebni_km")
    protected float sluzebniKm;
    @XmlElement(name = "Soukrome_km")
    protected float soukromeKm;
    @XmlElement(name = "Doba_jizdy", required = true)
    protected String dobaJizdy;
    @XmlElement(name = "Doba_jizdy_sluzebni", required = true)
    protected String dobaJizdySluzebni;
    @XmlElement(name = "Doba_jizdy_soukroma", required = true)
    protected String dobaJizdySoukroma;
    @XmlElement(name = "DomovPraceDomov")
    protected float domovPraceDomov;
    @XmlElement(name = "PHM_l")
    protected float phml;
    @XmlElement(name = "PHM_cena")
    protected float phmCena;
    @XmlElement(name = "Ostatni_naklady")
    protected float ostatniNaklady;
    @XmlElement(name = "K_uhrade_ridici")
    protected float kUhradeRidici;
    @XmlElement(name = "Amortizace")
    protected float amortizace;
    @XmlElement(name = "Amort_ridic")
    protected float amortRidic;
    @XmlElement(name = "Uhrazeno_ridicem")
    protected float uhrazenoRidicem;
    @XmlElement(name = "Soukr_km_k_uhrade")
    protected float soukrKmKUhrade;
    @XmlElement(name = "Porizovaci_cena")
    protected float porizovaciCena;
    @XmlElement(name = "Doba_jizdy_sluzebni_den", required = true)
    protected String dobaJizdySluzebniDen;
    @XmlElement(name = "Doba_jizdy_sluzebni_noc", required = true)
    protected String dobaJizdySluzebniNoc;
    @XmlElement(name = "Divize", required = true)
    protected String divize;
    @XmlElement(defaultValue = "")
    protected String employer;
    @XmlElement(name = "use_mode", defaultValue = "")
    protected String useMode;

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
     * Gets the value of the jmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Sets the value of the jmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmeno(String value) {
        this.jmeno = value;
    }

    /**
     * Gets the value of the prijmeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Sets the value of the prijmeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrijmeni(String value) {
        this.prijmeni = value;
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
     * Gets the value of the skupina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkupina() {
        return skupina;
    }

    /**
     * Sets the value of the skupina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkupina(String value) {
        this.skupina = value;
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
     * Gets the value of the celkemKm property.
     * 
     */
    public float getCelkemKm() {
        return celkemKm;
    }

    /**
     * Sets the value of the celkemKm property.
     * 
     */
    public void setCelkemKm(float value) {
        this.celkemKm = value;
    }

    /**
     * Gets the value of the sluzebniKm property.
     * 
     */
    public float getSluzebniKm() {
        return sluzebniKm;
    }

    /**
     * Sets the value of the sluzebniKm property.
     * 
     */
    public void setSluzebniKm(float value) {
        this.sluzebniKm = value;
    }

    /**
     * Gets the value of the soukromeKm property.
     * 
     */
    public float getSoukromeKm() {
        return soukromeKm;
    }

    /**
     * Sets the value of the soukromeKm property.
     * 
     */
    public void setSoukromeKm(float value) {
        this.soukromeKm = value;
    }

    /**
     * Gets the value of the dobaJizdy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDobaJizdy() {
        return dobaJizdy;
    }

    /**
     * Sets the value of the dobaJizdy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDobaJizdy(String value) {
        this.dobaJizdy = value;
    }

    /**
     * Gets the value of the dobaJizdySluzebni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDobaJizdySluzebni() {
        return dobaJizdySluzebni;
    }

    /**
     * Sets the value of the dobaJizdySluzebni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDobaJizdySluzebni(String value) {
        this.dobaJizdySluzebni = value;
    }

    /**
     * Gets the value of the dobaJizdySoukroma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDobaJizdySoukroma() {
        return dobaJizdySoukroma;
    }

    /**
     * Sets the value of the dobaJizdySoukroma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDobaJizdySoukroma(String value) {
        this.dobaJizdySoukroma = value;
    }

    /**
     * Gets the value of the domovPraceDomov property.
     * 
     */
    public float getDomovPraceDomov() {
        return domovPraceDomov;
    }

    /**
     * Sets the value of the domovPraceDomov property.
     * 
     */
    public void setDomovPraceDomov(float value) {
        this.domovPraceDomov = value;
    }

    /**
     * Gets the value of the phml property.
     * 
     */
    public float getPHML() {
        return phml;
    }

    /**
     * Sets the value of the phml property.
     * 
     */
    public void setPHML(float value) {
        this.phml = value;
    }

    /**
     * Gets the value of the phmCena property.
     * 
     */
    public float getPHMCena() {
        return phmCena;
    }

    /**
     * Sets the value of the phmCena property.
     * 
     */
    public void setPHMCena(float value) {
        this.phmCena = value;
    }

    /**
     * Gets the value of the ostatniNaklady property.
     * 
     */
    public float getOstatniNaklady() {
        return ostatniNaklady;
    }

    /**
     * Sets the value of the ostatniNaklady property.
     * 
     */
    public void setOstatniNaklady(float value) {
        this.ostatniNaklady = value;
    }

    /**
     * Gets the value of the kUhradeRidici property.
     * 
     */
    public float getKUhradeRidici() {
        return kUhradeRidici;
    }

    /**
     * Sets the value of the kUhradeRidici property.
     * 
     */
    public void setKUhradeRidici(float value) {
        this.kUhradeRidici = value;
    }

    /**
     * Gets the value of the amortizace property.
     * 
     */
    public float getAmortizace() {
        return amortizace;
    }

    /**
     * Sets the value of the amortizace property.
     * 
     */
    public void setAmortizace(float value) {
        this.amortizace = value;
    }

    /**
     * Gets the value of the amortRidic property.
     * 
     */
    public float getAmortRidic() {
        return amortRidic;
    }

    /**
     * Sets the value of the amortRidic property.
     * 
     */
    public void setAmortRidic(float value) {
        this.amortRidic = value;
    }

    /**
     * Gets the value of the uhrazenoRidicem property.
     * 
     */
    public float getUhrazenoRidicem() {
        return uhrazenoRidicem;
    }

    /**
     * Sets the value of the uhrazenoRidicem property.
     * 
     */
    public void setUhrazenoRidicem(float value) {
        this.uhrazenoRidicem = value;
    }

    /**
     * Gets the value of the soukrKmKUhrade property.
     * 
     */
    public float getSoukrKmKUhrade() {
        return soukrKmKUhrade;
    }

    /**
     * Sets the value of the soukrKmKUhrade property.
     * 
     */
    public void setSoukrKmKUhrade(float value) {
        this.soukrKmKUhrade = value;
    }

    /**
     * Gets the value of the porizovaciCena property.
     * 
     */
    public float getPorizovaciCena() {
        return porizovaciCena;
    }

    /**
     * Sets the value of the porizovaciCena property.
     * 
     */
    public void setPorizovaciCena(float value) {
        this.porizovaciCena = value;
    }

    /**
     * Gets the value of the dobaJizdySluzebniDen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDobaJizdySluzebniDen() {
        return dobaJizdySluzebniDen;
    }

    /**
     * Sets the value of the dobaJizdySluzebniDen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDobaJizdySluzebniDen(String value) {
        this.dobaJizdySluzebniDen = value;
    }

    /**
     * Gets the value of the dobaJizdySluzebniNoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDobaJizdySluzebniNoc() {
        return dobaJizdySluzebniNoc;
    }

    /**
     * Sets the value of the dobaJizdySluzebniNoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDobaJizdySluzebniNoc(String value) {
        this.dobaJizdySluzebniNoc = value;
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
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployer(String value) {
        this.employer = value;
    }

    /**
     * Gets the value of the useMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseMode() {
        return useMode;
    }

    /**
     * Sets the value of the useMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseMode(String value) {
        this.useMode = value;
    }

}