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
 * <p>Java class for WDS_StaCarsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_StaCarsItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="carid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="identifikator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cislo_objektu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pujcovna" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Skupina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ridic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tach_start" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Tach_end" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Celkem_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Sluzebni_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Soukrome_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="DomovPraceDomov" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Celkem_km_mesto" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Sluzebni_km_mesto" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Soukrome_km_mesto" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Celkem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sluzebni" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Soukrome" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Doba_jizdy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Start_stav_PHM" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="End_stav_PHM" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PHM_l" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PHM_cena" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PHM_cena_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Ostatni_naklady" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="K_uhrade_ridici" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Spotreba_prut" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Prum_spotreba" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Prum_spotreba_prut" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Prum_spotreba_hod" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Spotreba_dle_TP" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Dlouhodoba_spotreba" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Tovarni_znacka" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Model_vozu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Casod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Casdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Osobni_cislo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Uplna_skupina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amortizace" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Amort_ridic" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Mh_start" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mh_end" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rozdilmh" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Uhrazeno_ridicem" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_StaCarsItem", propOrder = {

})
public class WDSStaCarsItem {

    protected int carid;
    @XmlElement(required = true)
    protected String identifikator;
    @XmlElement(name = "Cislo_objektu", required = true)
    protected String cisloObjektu;
    @XmlElement(name = "Pujcovna")
    protected int pujcovna;
    @XmlElement(name = "Skupina", required = true)
    protected String skupina;
    @XmlElement(name = "Ridic", required = true)
    protected String ridic;
    @XmlElement(name = "Tach_start")
    protected float tachStart;
    @XmlElement(name = "Tach_end")
    protected float tachEnd;
    @XmlElement(name = "Celkem_km")
    protected float celkemKm;
    @XmlElement(name = "Sluzebni_km")
    protected float sluzebniKm;
    @XmlElement(name = "Soukrome_km")
    protected float soukromeKm;
    @XmlElement(name = "DomovPraceDomov")
    protected float domovPraceDomov;
    @XmlElement(name = "Celkem_km_mesto")
    protected float celkemKmMesto;
    @XmlElement(name = "Sluzebni_km_mesto")
    protected float sluzebniKmMesto;
    @XmlElement(name = "Soukrome_km_mesto")
    protected float soukromeKmMesto;
    @XmlElement(name = "Celkem")
    protected int celkem;
    @XmlElement(name = "Sluzebni")
    protected int sluzebni;
    @XmlElement(name = "Soukrome")
    protected int soukrome;
    @XmlElement(name = "Doba_jizdy", required = true)
    protected String dobaJizdy;
    @XmlElement(name = "Start_stav_PHM")
    protected float startStavPHM;
    @XmlElement(name = "End_stav_PHM")
    protected float endStavPHM;
    @XmlElement(name = "PHM_l")
    protected float phml;
    @XmlElement(name = "PHM_cena")
    protected float phmCena;
    @XmlElement(name = "PHM_cena_km")
    protected float phmCenaKm;
    @XmlElement(name = "Ostatni_naklady")
    protected float ostatniNaklady;
    @XmlElement(name = "K_uhrade_ridici")
    protected float kUhradeRidici;
    @XmlElement(name = "Spotreba_prut")
    protected float spotrebaPrut;
    @XmlElement(name = "Prum_spotreba")
    protected float prumSpotreba;
    @XmlElement(name = "Prum_spotreba_prut")
    protected float prumSpotrebaPrut;
    @XmlElement(name = "Prum_spotreba_hod")
    protected float prumSpotrebaHod;
    @XmlElement(name = "Spotreba_dle_TP")
    protected float spotrebaDleTP;
    @XmlElement(name = "Dlouhodoba_spotreba")
    protected float dlouhodobaSpotreba;
    @XmlElement(name = "Tovarni_znacka", required = true)
    protected String tovarniZnacka;
    @XmlElement(name = "Model_vozu", required = true)
    protected String modelVozu;
    @XmlElement(name = "Casod", required = true)
    protected String casod;
    @XmlElement(name = "Casdo", required = true)
    protected String casdo;
    @XmlElement(name = "Osobni_cislo", required = true)
    protected String osobniCislo;
    @XmlElement(name = "Uplna_skupina", required = true)
    protected String uplnaSkupina;
    @XmlElement(name = "Amortizace")
    protected float amortizace;
    @XmlElement(name = "Amort_ridic")
    protected float amortRidic;
    @XmlElement(name = "Mh_start")
    protected int mhStart;
    @XmlElement(name = "Mh_end")
    protected int mhEnd;
    @XmlElement(name = "Rozdilmh")
    protected int rozdilmh;
    @XmlElement(name = "Uhrazeno_ridicem")
    protected float uhrazenoRidicem;

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
     * Gets the value of the pujcovna property.
     * 
     */
    public int getPujcovna() {
        return pujcovna;
    }

    /**
     * Sets the value of the pujcovna property.
     * 
     */
    public void setPujcovna(int value) {
        this.pujcovna = value;
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
     * Gets the value of the ridic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRidic() {
        return ridic;
    }

    /**
     * Sets the value of the ridic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRidic(String value) {
        this.ridic = value;
    }

    /**
     * Gets the value of the tachStart property.
     * 
     */
    public float getTachStart() {
        return tachStart;
    }

    /**
     * Sets the value of the tachStart property.
     * 
     */
    public void setTachStart(float value) {
        this.tachStart = value;
    }

    /**
     * Gets the value of the tachEnd property.
     * 
     */
    public float getTachEnd() {
        return tachEnd;
    }

    /**
     * Sets the value of the tachEnd property.
     * 
     */
    public void setTachEnd(float value) {
        this.tachEnd = value;
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
     * Gets the value of the celkemKmMesto property.
     * 
     */
    public float getCelkemKmMesto() {
        return celkemKmMesto;
    }

    /**
     * Sets the value of the celkemKmMesto property.
     * 
     */
    public void setCelkemKmMesto(float value) {
        this.celkemKmMesto = value;
    }

    /**
     * Gets the value of the sluzebniKmMesto property.
     * 
     */
    public float getSluzebniKmMesto() {
        return sluzebniKmMesto;
    }

    /**
     * Sets the value of the sluzebniKmMesto property.
     * 
     */
    public void setSluzebniKmMesto(float value) {
        this.sluzebniKmMesto = value;
    }

    /**
     * Gets the value of the soukromeKmMesto property.
     * 
     */
    public float getSoukromeKmMesto() {
        return soukromeKmMesto;
    }

    /**
     * Sets the value of the soukromeKmMesto property.
     * 
     */
    public void setSoukromeKmMesto(float value) {
        this.soukromeKmMesto = value;
    }

    /**
     * Gets the value of the celkem property.
     * 
     */
    public int getCelkem() {
        return celkem;
    }

    /**
     * Sets the value of the celkem property.
     * 
     */
    public void setCelkem(int value) {
        this.celkem = value;
    }

    /**
     * Gets the value of the sluzebni property.
     * 
     */
    public int getSluzebni() {
        return sluzebni;
    }

    /**
     * Sets the value of the sluzebni property.
     * 
     */
    public void setSluzebni(int value) {
        this.sluzebni = value;
    }

    /**
     * Gets the value of the soukrome property.
     * 
     */
    public int getSoukrome() {
        return soukrome;
    }

    /**
     * Sets the value of the soukrome property.
     * 
     */
    public void setSoukrome(int value) {
        this.soukrome = value;
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
     * Gets the value of the startStavPHM property.
     * 
     */
    public float getStartStavPHM() {
        return startStavPHM;
    }

    /**
     * Sets the value of the startStavPHM property.
     * 
     */
    public void setStartStavPHM(float value) {
        this.startStavPHM = value;
    }

    /**
     * Gets the value of the endStavPHM property.
     * 
     */
    public float getEndStavPHM() {
        return endStavPHM;
    }

    /**
     * Sets the value of the endStavPHM property.
     * 
     */
    public void setEndStavPHM(float value) {
        this.endStavPHM = value;
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
     * Gets the value of the phmCenaKm property.
     * 
     */
    public float getPHMCenaKm() {
        return phmCenaKm;
    }

    /**
     * Sets the value of the phmCenaKm property.
     * 
     */
    public void setPHMCenaKm(float value) {
        this.phmCenaKm = value;
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
     * Gets the value of the spotrebaPrut property.
     * 
     */
    public float getSpotrebaPrut() {
        return spotrebaPrut;
    }

    /**
     * Sets the value of the spotrebaPrut property.
     * 
     */
    public void setSpotrebaPrut(float value) {
        this.spotrebaPrut = value;
    }

    /**
     * Gets the value of the prumSpotreba property.
     * 
     */
    public float getPrumSpotreba() {
        return prumSpotreba;
    }

    /**
     * Sets the value of the prumSpotreba property.
     * 
     */
    public void setPrumSpotreba(float value) {
        this.prumSpotreba = value;
    }

    /**
     * Gets the value of the prumSpotrebaPrut property.
     * 
     */
    public float getPrumSpotrebaPrut() {
        return prumSpotrebaPrut;
    }

    /**
     * Sets the value of the prumSpotrebaPrut property.
     * 
     */
    public void setPrumSpotrebaPrut(float value) {
        this.prumSpotrebaPrut = value;
    }

    /**
     * Gets the value of the prumSpotrebaHod property.
     * 
     */
    public float getPrumSpotrebaHod() {
        return prumSpotrebaHod;
    }

    /**
     * Sets the value of the prumSpotrebaHod property.
     * 
     */
    public void setPrumSpotrebaHod(float value) {
        this.prumSpotrebaHod = value;
    }

    /**
     * Gets the value of the spotrebaDleTP property.
     * 
     */
    public float getSpotrebaDleTP() {
        return spotrebaDleTP;
    }

    /**
     * Sets the value of the spotrebaDleTP property.
     * 
     */
    public void setSpotrebaDleTP(float value) {
        this.spotrebaDleTP = value;
    }

    /**
     * Gets the value of the dlouhodobaSpotreba property.
     * 
     */
    public float getDlouhodobaSpotreba() {
        return dlouhodobaSpotreba;
    }

    /**
     * Sets the value of the dlouhodobaSpotreba property.
     * 
     */
    public void setDlouhodobaSpotreba(float value) {
        this.dlouhodobaSpotreba = value;
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
     * Gets the value of the uplnaSkupina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplnaSkupina() {
        return uplnaSkupina;
    }

    /**
     * Sets the value of the uplnaSkupina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplnaSkupina(String value) {
        this.uplnaSkupina = value;
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
     * Gets the value of the mhStart property.
     * 
     */
    public int getMhStart() {
        return mhStart;
    }

    /**
     * Sets the value of the mhStart property.
     * 
     */
    public void setMhStart(int value) {
        this.mhStart = value;
    }

    /**
     * Gets the value of the mhEnd property.
     * 
     */
    public int getMhEnd() {
        return mhEnd;
    }

    /**
     * Sets the value of the mhEnd property.
     * 
     */
    public void setMhEnd(int value) {
        this.mhEnd = value;
    }

    /**
     * Gets the value of the rozdilmh property.
     * 
     */
    public int getRozdilmh() {
        return rozdilmh;
    }

    /**
     * Sets the value of the rozdilmh property.
     * 
     */
    public void setRozdilmh(int value) {
        this.rozdilmh = value;
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

}
