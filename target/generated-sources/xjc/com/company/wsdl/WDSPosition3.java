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
 * <p>Java class for WDS_Position3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_Position3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="cd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Zs" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Zd" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="pt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Hg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Fl" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="FW" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Hb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="LB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Wr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="T2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="T3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="D1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="D2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="D3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="D4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="D5" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="st" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ca" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="A1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="A2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i1s" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i2s" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i3s" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i4s" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ac_dallas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usedfuel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="destodes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timetodes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sgarmin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fearthwidthd" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="fearthlengthd" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="gdatetime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tdevice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="num_sms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="swnastav" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mil" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aa_e" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ll" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ffff" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="eee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dst" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dmi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="snv" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ss" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tIn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vvvv" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="skodaetime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dact" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SC" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="LC" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Tkm1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Tkm2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_Position3", propOrder = {

})
public class WDSPosition3 {

    protected int cd;
    @XmlElement(name = "Zs")
    protected float zs;
    @XmlElement(name = "Zd")
    protected float zd;
    @XmlElement(required = true)
    protected String pt;
    @XmlElement(required = true)
    protected String lp;
    protected int sd;
    @XmlElement(name = "LN", required = true)
    protected String ln;
    @XmlElement(required = true)
    protected String i1;
    @XmlElement(required = true)
    protected String i2;
    @XmlElement(required = true)
    protected String i3;
    @XmlElement(required = true)
    protected String i4;
    @XmlElement(name = "EE")
    protected int ee;
    @XmlElement(name = "Hg")
    protected int hg;
    @XmlElement(name = "Fl")
    protected float fl;
    @XmlElement(name = "FW")
    protected int fw;
    @XmlElement(name = "Hb")
    protected int hb;
    @XmlElement(name = "Km")
    protected float km;
    @XmlElement(name = "LB")
    protected int lb;
    @XmlElement(name = "Wr")
    protected int wr;
    @XmlElement(name = "T1")
    protected float t1;
    @XmlElement(name = "T2")
    protected float t2;
    @XmlElement(name = "T3")
    protected float t3;
    @XmlElement(name = "D1")
    protected int d1;
    @XmlElement(name = "D2")
    protected int d2;
    @XmlElement(name = "D3")
    protected int d3;
    @XmlElement(name = "D4")
    protected int d4;
    @XmlElement(name = "D5")
    protected int d5;
    @XmlElement(required = true)
    protected String st;
    protected int ca;
    @XmlElement(name = "A1")
    protected int a1;
    @XmlElement(name = "A2")
    protected int a2;
    @XmlElement(name = "VM", required = true)
    protected String vm;
    @XmlElement(name = "VP", required = true)
    protected String vp;
    @XmlElement(name = "VC", required = true)
    protected String vc;
    @XmlElement(name = "i1s", required = true)
    protected String i1S;
    @XmlElement(name = "i2s", required = true)
    protected String i2S;
    @XmlElement(name = "i3s", required = true)
    protected String i3S;
    @XmlElement(name = "i4s", required = true)
    protected String i4S;
    @XmlElement(name = "CP")
    protected int cp;
    @XmlElement(name = "ac_dallas", required = true)
    protected String acDallas;
    protected float usedfuel;
    protected float altitude;
    protected int destodes;
    @XmlElement(required = true)
    protected String timetodes;
    protected int sgarmin;
    protected float fearthwidthd;
    protected float fearthlengthd;
    @XmlElement(required = true)
    protected String gdatetime;
    protected int tdevice;
    @XmlElement(name = "num_sms")
    protected int numSms;
    protected int swnastav;
    protected int mil;
    @XmlElement(name = "aa_e")
    protected int aaE;
    protected int ll;
    protected int ffff;
    protected int eee;
    protected int dst;
    protected int dma;
    protected int dmi;
    protected int sem;
    protected int snv;
    protected int vag;
    protected int ss;
    protected int mm;
    protected int tIn;
    protected int tOut;
    @XmlElement(name = "tR")
    protected int tr;
    protected int vvvv;
    @XmlElement(required = true)
    protected String skodaetime;
    protected int dact;
    @XmlElement(name = "BB")
    protected int bb;
    @XmlElement(name = "FT")
    protected int ft;
    @XmlElement(name = "SC")
    protected float sc;
    @XmlElement(name = "LC")
    protected float lc;
    @XmlElement(name = "Tkm1")
    protected float tkm1;
    @XmlElement(name = "Tkm2")
    protected float tkm2;

    /**
     * Gets the value of the cd property.
     * 
     */
    public int getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     */
    public void setCd(int value) {
        this.cd = value;
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
     * Gets the value of the pt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPt() {
        return pt;
    }

    /**
     * Sets the value of the pt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPt(String value) {
        this.pt = value;
    }

    /**
     * Gets the value of the lp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLp() {
        return lp;
    }

    /**
     * Sets the value of the lp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLp(String value) {
        this.lp = value;
    }

    /**
     * Gets the value of the sd property.
     * 
     */
    public int getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     */
    public void setSd(int value) {
        this.sd = value;
    }

    /**
     * Gets the value of the ln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLN() {
        return ln;
    }

    /**
     * Sets the value of the ln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLN(String value) {
        this.ln = value;
    }

    /**
     * Gets the value of the i1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI1() {
        return i1;
    }

    /**
     * Sets the value of the i1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI1(String value) {
        this.i1 = value;
    }

    /**
     * Gets the value of the i2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI2() {
        return i2;
    }

    /**
     * Sets the value of the i2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI2(String value) {
        this.i2 = value;
    }

    /**
     * Gets the value of the i3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI3() {
        return i3;
    }

    /**
     * Sets the value of the i3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI3(String value) {
        this.i3 = value;
    }

    /**
     * Gets the value of the i4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI4() {
        return i4;
    }

    /**
     * Sets the value of the i4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI4(String value) {
        this.i4 = value;
    }

    /**
     * Gets the value of the ee property.
     * 
     */
    public int getEE() {
        return ee;
    }

    /**
     * Sets the value of the ee property.
     * 
     */
    public void setEE(int value) {
        this.ee = value;
    }

    /**
     * Gets the value of the hg property.
     * 
     */
    public int getHg() {
        return hg;
    }

    /**
     * Sets the value of the hg property.
     * 
     */
    public void setHg(int value) {
        this.hg = value;
    }

    /**
     * Gets the value of the fl property.
     * 
     */
    public float getFl() {
        return fl;
    }

    /**
     * Sets the value of the fl property.
     * 
     */
    public void setFl(float value) {
        this.fl = value;
    }

    /**
     * Gets the value of the fw property.
     * 
     */
    public int getFW() {
        return fw;
    }

    /**
     * Sets the value of the fw property.
     * 
     */
    public void setFW(int value) {
        this.fw = value;
    }

    /**
     * Gets the value of the hb property.
     * 
     */
    public int getHb() {
        return hb;
    }

    /**
     * Sets the value of the hb property.
     * 
     */
    public void setHb(int value) {
        this.hb = value;
    }

    /**
     * Gets the value of the km property.
     * 
     */
    public float getKm() {
        return km;
    }

    /**
     * Sets the value of the km property.
     * 
     */
    public void setKm(float value) {
        this.km = value;
    }

    /**
     * Gets the value of the lb property.
     * 
     */
    public int getLB() {
        return lb;
    }

    /**
     * Sets the value of the lb property.
     * 
     */
    public void setLB(int value) {
        this.lb = value;
    }

    /**
     * Gets the value of the wr property.
     * 
     */
    public int getWr() {
        return wr;
    }

    /**
     * Sets the value of the wr property.
     * 
     */
    public void setWr(int value) {
        this.wr = value;
    }

    /**
     * Gets the value of the t1 property.
     * 
     */
    public float getT1() {
        return t1;
    }

    /**
     * Sets the value of the t1 property.
     * 
     */
    public void setT1(float value) {
        this.t1 = value;
    }

    /**
     * Gets the value of the t2 property.
     * 
     */
    public float getT2() {
        return t2;
    }

    /**
     * Sets the value of the t2 property.
     * 
     */
    public void setT2(float value) {
        this.t2 = value;
    }

    /**
     * Gets the value of the t3 property.
     * 
     */
    public float getT3() {
        return t3;
    }

    /**
     * Sets the value of the t3 property.
     * 
     */
    public void setT3(float value) {
        this.t3 = value;
    }

    /**
     * Gets the value of the d1 property.
     * 
     */
    public int getD1() {
        return d1;
    }

    /**
     * Sets the value of the d1 property.
     * 
     */
    public void setD1(int value) {
        this.d1 = value;
    }

    /**
     * Gets the value of the d2 property.
     * 
     */
    public int getD2() {
        return d2;
    }

    /**
     * Sets the value of the d2 property.
     * 
     */
    public void setD2(int value) {
        this.d2 = value;
    }

    /**
     * Gets the value of the d3 property.
     * 
     */
    public int getD3() {
        return d3;
    }

    /**
     * Sets the value of the d3 property.
     * 
     */
    public void setD3(int value) {
        this.d3 = value;
    }

    /**
     * Gets the value of the d4 property.
     * 
     */
    public int getD4() {
        return d4;
    }

    /**
     * Sets the value of the d4 property.
     * 
     */
    public void setD4(int value) {
        this.d4 = value;
    }

    /**
     * Gets the value of the d5 property.
     * 
     */
    public int getD5() {
        return d5;
    }

    /**
     * Sets the value of the d5 property.
     * 
     */
    public void setD5(int value) {
        this.d5 = value;
    }

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt() {
        return st;
    }

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt(String value) {
        this.st = value;
    }

    /**
     * Gets the value of the ca property.
     * 
     */
    public int getCa() {
        return ca;
    }

    /**
     * Sets the value of the ca property.
     * 
     */
    public void setCa(int value) {
        this.ca = value;
    }

    /**
     * Gets the value of the a1 property.
     * 
     */
    public int getA1() {
        return a1;
    }

    /**
     * Sets the value of the a1 property.
     * 
     */
    public void setA1(int value) {
        this.a1 = value;
    }

    /**
     * Gets the value of the a2 property.
     * 
     */
    public int getA2() {
        return a2;
    }

    /**
     * Sets the value of the a2 property.
     * 
     */
    public void setA2(int value) {
        this.a2 = value;
    }

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVM() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVM(String value) {
        this.vm = value;
    }

    /**
     * Gets the value of the vp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVP() {
        return vp;
    }

    /**
     * Sets the value of the vp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVP(String value) {
        this.vp = value;
    }

    /**
     * Gets the value of the vc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVC() {
        return vc;
    }

    /**
     * Sets the value of the vc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVC(String value) {
        this.vc = value;
    }

    /**
     * Gets the value of the i1S property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI1S() {
        return i1S;
    }

    /**
     * Sets the value of the i1S property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI1S(String value) {
        this.i1S = value;
    }

    /**
     * Gets the value of the i2S property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI2S() {
        return i2S;
    }

    /**
     * Sets the value of the i2S property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI2S(String value) {
        this.i2S = value;
    }

    /**
     * Gets the value of the i3S property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI3S() {
        return i3S;
    }

    /**
     * Sets the value of the i3S property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI3S(String value) {
        this.i3S = value;
    }

    /**
     * Gets the value of the i4S property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI4S() {
        return i4S;
    }

    /**
     * Sets the value of the i4S property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI4S(String value) {
        this.i4S = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     */
    public int getCP() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     */
    public void setCP(int value) {
        this.cp = value;
    }

    /**
     * Gets the value of the acDallas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcDallas() {
        return acDallas;
    }

    /**
     * Sets the value of the acDallas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcDallas(String value) {
        this.acDallas = value;
    }

    /**
     * Gets the value of the usedfuel property.
     * 
     */
    public float getUsedfuel() {
        return usedfuel;
    }

    /**
     * Sets the value of the usedfuel property.
     * 
     */
    public void setUsedfuel(float value) {
        this.usedfuel = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     */
    public float getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     */
    public void setAltitude(float value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the destodes property.
     * 
     */
    public int getDestodes() {
        return destodes;
    }

    /**
     * Sets the value of the destodes property.
     * 
     */
    public void setDestodes(int value) {
        this.destodes = value;
    }

    /**
     * Gets the value of the timetodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetodes() {
        return timetodes;
    }

    /**
     * Sets the value of the timetodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetodes(String value) {
        this.timetodes = value;
    }

    /**
     * Gets the value of the sgarmin property.
     * 
     */
    public int getSgarmin() {
        return sgarmin;
    }

    /**
     * Sets the value of the sgarmin property.
     * 
     */
    public void setSgarmin(int value) {
        this.sgarmin = value;
    }

    /**
     * Gets the value of the fearthwidthd property.
     * 
     */
    public float getFearthwidthd() {
        return fearthwidthd;
    }

    /**
     * Sets the value of the fearthwidthd property.
     * 
     */
    public void setFearthwidthd(float value) {
        this.fearthwidthd = value;
    }

    /**
     * Gets the value of the fearthlengthd property.
     * 
     */
    public float getFearthlengthd() {
        return fearthlengthd;
    }

    /**
     * Sets the value of the fearthlengthd property.
     * 
     */
    public void setFearthlengthd(float value) {
        this.fearthlengthd = value;
    }

    /**
     * Gets the value of the gdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdatetime() {
        return gdatetime;
    }

    /**
     * Sets the value of the gdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdatetime(String value) {
        this.gdatetime = value;
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
     * Gets the value of the numSms property.
     * 
     */
    public int getNumSms() {
        return numSms;
    }

    /**
     * Sets the value of the numSms property.
     * 
     */
    public void setNumSms(int value) {
        this.numSms = value;
    }

    /**
     * Gets the value of the swnastav property.
     * 
     */
    public int getSwnastav() {
        return swnastav;
    }

    /**
     * Sets the value of the swnastav property.
     * 
     */
    public void setSwnastav(int value) {
        this.swnastav = value;
    }

    /**
     * Gets the value of the mil property.
     * 
     */
    public int getMil() {
        return mil;
    }

    /**
     * Sets the value of the mil property.
     * 
     */
    public void setMil(int value) {
        this.mil = value;
    }

    /**
     * Gets the value of the aaE property.
     * 
     */
    public int getAaE() {
        return aaE;
    }

    /**
     * Sets the value of the aaE property.
     * 
     */
    public void setAaE(int value) {
        this.aaE = value;
    }

    /**
     * Gets the value of the ll property.
     * 
     */
    public int getLl() {
        return ll;
    }

    /**
     * Sets the value of the ll property.
     * 
     */
    public void setLl(int value) {
        this.ll = value;
    }

    /**
     * Gets the value of the ffff property.
     * 
     */
    public int getFfff() {
        return ffff;
    }

    /**
     * Sets the value of the ffff property.
     * 
     */
    public void setFfff(int value) {
        this.ffff = value;
    }

    /**
     * Gets the value of the eee property.
     * 
     */
    public int getEee() {
        return eee;
    }

    /**
     * Sets the value of the eee property.
     * 
     */
    public void setEee(int value) {
        this.eee = value;
    }

    /**
     * Gets the value of the dst property.
     * 
     */
    public int getDst() {
        return dst;
    }

    /**
     * Sets the value of the dst property.
     * 
     */
    public void setDst(int value) {
        this.dst = value;
    }

    /**
     * Gets the value of the dma property.
     * 
     */
    public int getDma() {
        return dma;
    }

    /**
     * Sets the value of the dma property.
     * 
     */
    public void setDma(int value) {
        this.dma = value;
    }

    /**
     * Gets the value of the dmi property.
     * 
     */
    public int getDmi() {
        return dmi;
    }

    /**
     * Sets the value of the dmi property.
     * 
     */
    public void setDmi(int value) {
        this.dmi = value;
    }

    /**
     * Gets the value of the sem property.
     * 
     */
    public int getSem() {
        return sem;
    }

    /**
     * Sets the value of the sem property.
     * 
     */
    public void setSem(int value) {
        this.sem = value;
    }

    /**
     * Gets the value of the snv property.
     * 
     */
    public int getSnv() {
        return snv;
    }

    /**
     * Sets the value of the snv property.
     * 
     */
    public void setSnv(int value) {
        this.snv = value;
    }

    /**
     * Gets the value of the vag property.
     * 
     */
    public int getVag() {
        return vag;
    }

    /**
     * Sets the value of the vag property.
     * 
     */
    public void setVag(int value) {
        this.vag = value;
    }

    /**
     * Gets the value of the ss property.
     * 
     */
    public int getSs() {
        return ss;
    }

    /**
     * Sets the value of the ss property.
     * 
     */
    public void setSs(int value) {
        this.ss = value;
    }

    /**
     * Gets the value of the mm property.
     * 
     */
    public int getMm() {
        return mm;
    }

    /**
     * Sets the value of the mm property.
     * 
     */
    public void setMm(int value) {
        this.mm = value;
    }

    /**
     * Gets the value of the tIn property.
     * 
     */
    public int getTIn() {
        return tIn;
    }

    /**
     * Sets the value of the tIn property.
     * 
     */
    public void setTIn(int value) {
        this.tIn = value;
    }

    /**
     * Gets the value of the tOut property.
     * 
     */
    public int getTOut() {
        return tOut;
    }

    /**
     * Sets the value of the tOut property.
     * 
     */
    public void setTOut(int value) {
        this.tOut = value;
    }

    /**
     * Gets the value of the tr property.
     * 
     */
    public int getTR() {
        return tr;
    }

    /**
     * Sets the value of the tr property.
     * 
     */
    public void setTR(int value) {
        this.tr = value;
    }

    /**
     * Gets the value of the vvvv property.
     * 
     */
    public int getVvvv() {
        return vvvv;
    }

    /**
     * Sets the value of the vvvv property.
     * 
     */
    public void setVvvv(int value) {
        this.vvvv = value;
    }

    /**
     * Gets the value of the skodaetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkodaetime() {
        return skodaetime;
    }

    /**
     * Sets the value of the skodaetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkodaetime(String value) {
        this.skodaetime = value;
    }

    /**
     * Gets the value of the dact property.
     * 
     */
    public int getDact() {
        return dact;
    }

    /**
     * Sets the value of the dact property.
     * 
     */
    public void setDact(int value) {
        this.dact = value;
    }

    /**
     * Gets the value of the bb property.
     * 
     */
    public int getBB() {
        return bb;
    }

    /**
     * Sets the value of the bb property.
     * 
     */
    public void setBB(int value) {
        this.bb = value;
    }

    /**
     * Gets the value of the ft property.
     * 
     */
    public int getFT() {
        return ft;
    }

    /**
     * Sets the value of the ft property.
     * 
     */
    public void setFT(int value) {
        this.ft = value;
    }

    /**
     * Gets the value of the sc property.
     * 
     */
    public float getSC() {
        return sc;
    }

    /**
     * Sets the value of the sc property.
     * 
     */
    public void setSC(float value) {
        this.sc = value;
    }

    /**
     * Gets the value of the lc property.
     * 
     */
    public float getLC() {
        return lc;
    }

    /**
     * Sets the value of the lc property.
     * 
     */
    public void setLC(float value) {
        this.lc = value;
    }

    /**
     * Gets the value of the tkm1 property.
     * 
     */
    public float getTkm1() {
        return tkm1;
    }

    /**
     * Sets the value of the tkm1 property.
     * 
     */
    public void setTkm1(float value) {
        this.tkm1 = value;
    }

    /**
     * Gets the value of the tkm2 property.
     * 
     */
    public float getTkm2() {
        return tkm2;
    }

    /**
     * Sets the value of the tkm2 property.
     * 
     */
    public void setTkm2(float value) {
        this.tkm2 = value;
    }

}
