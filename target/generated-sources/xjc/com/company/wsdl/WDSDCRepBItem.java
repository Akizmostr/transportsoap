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
 * <p>Java class for WDS_DCRepBItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_DCRepBItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdDriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TypP" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Dist" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Cons" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V4" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B4" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V5" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B5" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V6" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B6" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V7" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B7" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V8" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B8" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V9" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B9" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="V10" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="B10" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="RecStart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JStart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="R1K" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="R2K" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="S" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="T1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LimitRPM" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="T4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T5" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T6" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T7" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T8" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T9" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T10" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T11" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T12" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T13" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T14" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T15" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="H1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cons2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Cons3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Cons4" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Cons5" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Cons6" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Dist2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Dist3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Dist4" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="H2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="H3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Cons7" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Speed1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="H4" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_DCRepBItem", propOrder = {

})
public class WDSDCRepBItem {

    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "IdDriver")
    protected int idDriver;
    @XmlElement(name = "TypP")
    protected int typP;
    @XmlElement(name = "Dist")
    protected float dist;
    @XmlElement(name = "Cons")
    protected float cons;
    @XmlElement(name = "Weight")
    protected float weight;
    @XmlElement(name = "Speed")
    protected float speed;
    @XmlElement(name = "V1")
    protected float v1;
    @XmlElement(name = "B1")
    protected float b1;
    @XmlElement(name = "V2")
    protected float v2;
    @XmlElement(name = "B2")
    protected float b2;
    @XmlElement(name = "V3")
    protected float v3;
    @XmlElement(name = "B3")
    protected float b3;
    @XmlElement(name = "V4")
    protected float v4;
    @XmlElement(name = "B4")
    protected float b4;
    @XmlElement(name = "V5")
    protected float v5;
    @XmlElement(name = "B5")
    protected float b5;
    @XmlElement(name = "V6")
    protected float v6;
    @XmlElement(name = "B6")
    protected float b6;
    @XmlElement(name = "V7")
    protected float v7;
    @XmlElement(name = "B7")
    protected float b7;
    @XmlElement(name = "V8")
    protected float v8;
    @XmlElement(name = "B8")
    protected float b8;
    @XmlElement(name = "V9")
    protected float v9;
    @XmlElement(name = "B9")
    protected float b9;
    @XmlElement(name = "V10")
    protected float v10;
    @XmlElement(name = "B10")
    protected float b10;
    @XmlElement(name = "RecStart", required = true)
    protected String recStart;
    @XmlElement(name = "RecStop", required = true)
    protected String recStop;
    @XmlElement(name = "JStart", required = true)
    protected String jStart;
    @XmlElement(name = "JStop", required = true)
    protected String jStop;
    @XmlElement(name = "R1K", required = true)
    protected String r1K;
    @XmlElement(name = "R2K", required = true)
    protected String r2K;
    @XmlElement(name = "S", required = true)
    protected String s;
    @XmlElement(name = "T1")
    protected int t1;
    @XmlElement(name = "T2")
    protected int t2;
    @XmlElement(name = "T3")
    protected int t3;
    @XmlElement(name = "LimitRPM")
    protected float limitRPM;
    @XmlElement(name = "T4")
    protected int t4;
    @XmlElement(name = "T5")
    protected int t5;
    @XmlElement(name = "T6")
    protected int t6;
    @XmlElement(name = "T7")
    protected int t7;
    @XmlElement(name = "T8")
    protected int t8;
    @XmlElement(name = "T9")
    protected int t9;
    @XmlElement(name = "T10")
    protected int t10;
    @XmlElement(name = "T11")
    protected int t11;
    @XmlElement(name = "T12")
    protected int t12;
    @XmlElement(name = "T13")
    protected int t13;
    @XmlElement(name = "T14")
    protected int t14;
    @XmlElement(name = "T15")
    protected int t15;
    @XmlElement(name = "H1")
    protected int h1;
    @XmlElement(name = "Cons2")
    protected float cons2;
    @XmlElement(name = "Cons3")
    protected float cons3;
    @XmlElement(name = "Cons4")
    protected float cons4;
    @XmlElement(name = "Cons5")
    protected float cons5;
    @XmlElement(name = "Cons6")
    protected float cons6;
    @XmlElement(name = "Dist2")
    protected float dist2;
    @XmlElement(name = "Dist3")
    protected float dist3;
    @XmlElement(name = "Dist4")
    protected float dist4;
    @XmlElement(name = "H2")
    protected float h2;
    @XmlElement(name = "H3")
    protected float h3;
    @XmlElement(name = "Cons7")
    protected float cons7;
    @XmlElement(name = "Speed1")
    protected float speed1;
    @XmlElement(name = "H4")
    protected float h4;

    /**
     * Gets the value of the idCar property.
     * 
     */
    public int getIdCar() {
        return idCar;
    }

    /**
     * Sets the value of the idCar property.
     * 
     */
    public void setIdCar(int value) {
        this.idCar = value;
    }

    /**
     * Gets the value of the idDriver property.
     * 
     */
    public int getIdDriver() {
        return idDriver;
    }

    /**
     * Sets the value of the idDriver property.
     * 
     */
    public void setIdDriver(int value) {
        this.idDriver = value;
    }

    /**
     * Gets the value of the typP property.
     * 
     */
    public int getTypP() {
        return typP;
    }

    /**
     * Sets the value of the typP property.
     * 
     */
    public void setTypP(int value) {
        this.typP = value;
    }

    /**
     * Gets the value of the dist property.
     * 
     */
    public float getDist() {
        return dist;
    }

    /**
     * Sets the value of the dist property.
     * 
     */
    public void setDist(float value) {
        this.dist = value;
    }

    /**
     * Gets the value of the cons property.
     * 
     */
    public float getCons() {
        return cons;
    }

    /**
     * Sets the value of the cons property.
     * 
     */
    public void setCons(float value) {
        this.cons = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the v1 property.
     * 
     */
    public float getV1() {
        return v1;
    }

    /**
     * Sets the value of the v1 property.
     * 
     */
    public void setV1(float value) {
        this.v1 = value;
    }

    /**
     * Gets the value of the b1 property.
     * 
     */
    public float getB1() {
        return b1;
    }

    /**
     * Sets the value of the b1 property.
     * 
     */
    public void setB1(float value) {
        this.b1 = value;
    }

    /**
     * Gets the value of the v2 property.
     * 
     */
    public float getV2() {
        return v2;
    }

    /**
     * Sets the value of the v2 property.
     * 
     */
    public void setV2(float value) {
        this.v2 = value;
    }

    /**
     * Gets the value of the b2 property.
     * 
     */
    public float getB2() {
        return b2;
    }

    /**
     * Sets the value of the b2 property.
     * 
     */
    public void setB2(float value) {
        this.b2 = value;
    }

    /**
     * Gets the value of the v3 property.
     * 
     */
    public float getV3() {
        return v3;
    }

    /**
     * Sets the value of the v3 property.
     * 
     */
    public void setV3(float value) {
        this.v3 = value;
    }

    /**
     * Gets the value of the b3 property.
     * 
     */
    public float getB3() {
        return b3;
    }

    /**
     * Sets the value of the b3 property.
     * 
     */
    public void setB3(float value) {
        this.b3 = value;
    }

    /**
     * Gets the value of the v4 property.
     * 
     */
    public float getV4() {
        return v4;
    }

    /**
     * Sets the value of the v4 property.
     * 
     */
    public void setV4(float value) {
        this.v4 = value;
    }

    /**
     * Gets the value of the b4 property.
     * 
     */
    public float getB4() {
        return b4;
    }

    /**
     * Sets the value of the b4 property.
     * 
     */
    public void setB4(float value) {
        this.b4 = value;
    }

    /**
     * Gets the value of the v5 property.
     * 
     */
    public float getV5() {
        return v5;
    }

    /**
     * Sets the value of the v5 property.
     * 
     */
    public void setV5(float value) {
        this.v5 = value;
    }

    /**
     * Gets the value of the b5 property.
     * 
     */
    public float getB5() {
        return b5;
    }

    /**
     * Sets the value of the b5 property.
     * 
     */
    public void setB5(float value) {
        this.b5 = value;
    }

    /**
     * Gets the value of the v6 property.
     * 
     */
    public float getV6() {
        return v6;
    }

    /**
     * Sets the value of the v6 property.
     * 
     */
    public void setV6(float value) {
        this.v6 = value;
    }

    /**
     * Gets the value of the b6 property.
     * 
     */
    public float getB6() {
        return b6;
    }

    /**
     * Sets the value of the b6 property.
     * 
     */
    public void setB6(float value) {
        this.b6 = value;
    }

    /**
     * Gets the value of the v7 property.
     * 
     */
    public float getV7() {
        return v7;
    }

    /**
     * Sets the value of the v7 property.
     * 
     */
    public void setV7(float value) {
        this.v7 = value;
    }

    /**
     * Gets the value of the b7 property.
     * 
     */
    public float getB7() {
        return b7;
    }

    /**
     * Sets the value of the b7 property.
     * 
     */
    public void setB7(float value) {
        this.b7 = value;
    }

    /**
     * Gets the value of the v8 property.
     * 
     */
    public float getV8() {
        return v8;
    }

    /**
     * Sets the value of the v8 property.
     * 
     */
    public void setV8(float value) {
        this.v8 = value;
    }

    /**
     * Gets the value of the b8 property.
     * 
     */
    public float getB8() {
        return b8;
    }

    /**
     * Sets the value of the b8 property.
     * 
     */
    public void setB8(float value) {
        this.b8 = value;
    }

    /**
     * Gets the value of the v9 property.
     * 
     */
    public float getV9() {
        return v9;
    }

    /**
     * Sets the value of the v9 property.
     * 
     */
    public void setV9(float value) {
        this.v9 = value;
    }

    /**
     * Gets the value of the b9 property.
     * 
     */
    public float getB9() {
        return b9;
    }

    /**
     * Sets the value of the b9 property.
     * 
     */
    public void setB9(float value) {
        this.b9 = value;
    }

    /**
     * Gets the value of the v10 property.
     * 
     */
    public float getV10() {
        return v10;
    }

    /**
     * Sets the value of the v10 property.
     * 
     */
    public void setV10(float value) {
        this.v10 = value;
    }

    /**
     * Gets the value of the b10 property.
     * 
     */
    public float getB10() {
        return b10;
    }

    /**
     * Sets the value of the b10 property.
     * 
     */
    public void setB10(float value) {
        this.b10 = value;
    }

    /**
     * Gets the value of the recStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecStart() {
        return recStart;
    }

    /**
     * Sets the value of the recStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecStart(String value) {
        this.recStart = value;
    }

    /**
     * Gets the value of the recStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecStop() {
        return recStop;
    }

    /**
     * Sets the value of the recStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecStop(String value) {
        this.recStop = value;
    }

    /**
     * Gets the value of the jStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJStart() {
        return jStart;
    }

    /**
     * Sets the value of the jStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJStart(String value) {
        this.jStart = value;
    }

    /**
     * Gets the value of the jStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJStop() {
        return jStop;
    }

    /**
     * Sets the value of the jStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJStop(String value) {
        this.jStop = value;
    }

    /**
     * Gets the value of the r1K property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR1K() {
        return r1K;
    }

    /**
     * Sets the value of the r1K property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR1K(String value) {
        this.r1K = value;
    }

    /**
     * Gets the value of the r2K property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR2K() {
        return r2K;
    }

    /**
     * Sets the value of the r2K property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR2K(String value) {
        this.r2K = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS(String value) {
        this.s = value;
    }

    /**
     * Gets the value of the t1 property.
     * 
     */
    public int getT1() {
        return t1;
    }

    /**
     * Sets the value of the t1 property.
     * 
     */
    public void setT1(int value) {
        this.t1 = value;
    }

    /**
     * Gets the value of the t2 property.
     * 
     */
    public int getT2() {
        return t2;
    }

    /**
     * Sets the value of the t2 property.
     * 
     */
    public void setT2(int value) {
        this.t2 = value;
    }

    /**
     * Gets the value of the t3 property.
     * 
     */
    public int getT3() {
        return t3;
    }

    /**
     * Sets the value of the t3 property.
     * 
     */
    public void setT3(int value) {
        this.t3 = value;
    }

    /**
     * Gets the value of the limitRPM property.
     * 
     */
    public float getLimitRPM() {
        return limitRPM;
    }

    /**
     * Sets the value of the limitRPM property.
     * 
     */
    public void setLimitRPM(float value) {
        this.limitRPM = value;
    }

    /**
     * Gets the value of the t4 property.
     * 
     */
    public int getT4() {
        return t4;
    }

    /**
     * Sets the value of the t4 property.
     * 
     */
    public void setT4(int value) {
        this.t4 = value;
    }

    /**
     * Gets the value of the t5 property.
     * 
     */
    public int getT5() {
        return t5;
    }

    /**
     * Sets the value of the t5 property.
     * 
     */
    public void setT5(int value) {
        this.t5 = value;
    }

    /**
     * Gets the value of the t6 property.
     * 
     */
    public int getT6() {
        return t6;
    }

    /**
     * Sets the value of the t6 property.
     * 
     */
    public void setT6(int value) {
        this.t6 = value;
    }

    /**
     * Gets the value of the t7 property.
     * 
     */
    public int getT7() {
        return t7;
    }

    /**
     * Sets the value of the t7 property.
     * 
     */
    public void setT7(int value) {
        this.t7 = value;
    }

    /**
     * Gets the value of the t8 property.
     * 
     */
    public int getT8() {
        return t8;
    }

    /**
     * Sets the value of the t8 property.
     * 
     */
    public void setT8(int value) {
        this.t8 = value;
    }

    /**
     * Gets the value of the t9 property.
     * 
     */
    public int getT9() {
        return t9;
    }

    /**
     * Sets the value of the t9 property.
     * 
     */
    public void setT9(int value) {
        this.t9 = value;
    }

    /**
     * Gets the value of the t10 property.
     * 
     */
    public int getT10() {
        return t10;
    }

    /**
     * Sets the value of the t10 property.
     * 
     */
    public void setT10(int value) {
        this.t10 = value;
    }

    /**
     * Gets the value of the t11 property.
     * 
     */
    public int getT11() {
        return t11;
    }

    /**
     * Sets the value of the t11 property.
     * 
     */
    public void setT11(int value) {
        this.t11 = value;
    }

    /**
     * Gets the value of the t12 property.
     * 
     */
    public int getT12() {
        return t12;
    }

    /**
     * Sets the value of the t12 property.
     * 
     */
    public void setT12(int value) {
        this.t12 = value;
    }

    /**
     * Gets the value of the t13 property.
     * 
     */
    public int getT13() {
        return t13;
    }

    /**
     * Sets the value of the t13 property.
     * 
     */
    public void setT13(int value) {
        this.t13 = value;
    }

    /**
     * Gets the value of the t14 property.
     * 
     */
    public int getT14() {
        return t14;
    }

    /**
     * Sets the value of the t14 property.
     * 
     */
    public void setT14(int value) {
        this.t14 = value;
    }

    /**
     * Gets the value of the t15 property.
     * 
     */
    public int getT15() {
        return t15;
    }

    /**
     * Sets the value of the t15 property.
     * 
     */
    public void setT15(int value) {
        this.t15 = value;
    }

    /**
     * Gets the value of the h1 property.
     * 
     */
    public int getH1() {
        return h1;
    }

    /**
     * Sets the value of the h1 property.
     * 
     */
    public void setH1(int value) {
        this.h1 = value;
    }

    /**
     * Gets the value of the cons2 property.
     * 
     */
    public float getCons2() {
        return cons2;
    }

    /**
     * Sets the value of the cons2 property.
     * 
     */
    public void setCons2(float value) {
        this.cons2 = value;
    }

    /**
     * Gets the value of the cons3 property.
     * 
     */
    public float getCons3() {
        return cons3;
    }

    /**
     * Sets the value of the cons3 property.
     * 
     */
    public void setCons3(float value) {
        this.cons3 = value;
    }

    /**
     * Gets the value of the cons4 property.
     * 
     */
    public float getCons4() {
        return cons4;
    }

    /**
     * Sets the value of the cons4 property.
     * 
     */
    public void setCons4(float value) {
        this.cons4 = value;
    }

    /**
     * Gets the value of the cons5 property.
     * 
     */
    public float getCons5() {
        return cons5;
    }

    /**
     * Sets the value of the cons5 property.
     * 
     */
    public void setCons5(float value) {
        this.cons5 = value;
    }

    /**
     * Gets the value of the cons6 property.
     * 
     */
    public float getCons6() {
        return cons6;
    }

    /**
     * Sets the value of the cons6 property.
     * 
     */
    public void setCons6(float value) {
        this.cons6 = value;
    }

    /**
     * Gets the value of the dist2 property.
     * 
     */
    public float getDist2() {
        return dist2;
    }

    /**
     * Sets the value of the dist2 property.
     * 
     */
    public void setDist2(float value) {
        this.dist2 = value;
    }

    /**
     * Gets the value of the dist3 property.
     * 
     */
    public float getDist3() {
        return dist3;
    }

    /**
     * Sets the value of the dist3 property.
     * 
     */
    public void setDist3(float value) {
        this.dist3 = value;
    }

    /**
     * Gets the value of the dist4 property.
     * 
     */
    public float getDist4() {
        return dist4;
    }

    /**
     * Sets the value of the dist4 property.
     * 
     */
    public void setDist4(float value) {
        this.dist4 = value;
    }

    /**
     * Gets the value of the h2 property.
     * 
     */
    public float getH2() {
        return h2;
    }

    /**
     * Sets the value of the h2 property.
     * 
     */
    public void setH2(float value) {
        this.h2 = value;
    }

    /**
     * Gets the value of the h3 property.
     * 
     */
    public float getH3() {
        return h3;
    }

    /**
     * Sets the value of the h3 property.
     * 
     */
    public void setH3(float value) {
        this.h3 = value;
    }

    /**
     * Gets the value of the cons7 property.
     * 
     */
    public float getCons7() {
        return cons7;
    }

    /**
     * Sets the value of the cons7 property.
     * 
     */
    public void setCons7(float value) {
        this.cons7 = value;
    }

    /**
     * Gets the value of the speed1 property.
     * 
     */
    public float getSpeed1() {
        return speed1;
    }

    /**
     * Sets the value of the speed1 property.
     * 
     */
    public void setSpeed1(float value) {
        this.speed1 = value;
    }

    /**
     * Gets the value of the h4 property.
     * 
     */
    public float getH4() {
        return h4;
    }

    /**
     * Sets the value of the h4 property.
     * 
     */
    public void setH4(float value) {
        this.h4 = value;
    }

}
