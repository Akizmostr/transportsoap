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
 * <p>Java class for WDS_SpreadUni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_SpreadUni"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Mer_datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Spreader_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Attrib" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Spread1_kg" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Spread2_kg" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Brine_l" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Time_spread" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mh" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Errors" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mat1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mat2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Brine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="WidthLeft" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Batch1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Batch2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Batch3" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BrineProc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_SpreadUni", propOrder = {

})
public class WDSSpreadUni {

    @XmlElement(name = "Mer_datum", required = true)
    protected String merDatum;
    @XmlElement(name = "Datum", required = true)
    protected String datum;
    @XmlElement(name = "Spreader_ID", required = true)
    protected String spreaderID;
    @XmlElement(name = "Attrib")
    protected int attrib;
    @XmlElement(name = "Spread1_kg")
    protected float spread1Kg;
    @XmlElement(name = "Spread2_kg")
    protected float spread2Kg;
    @XmlElement(name = "Brine_l")
    protected float brineL;
    @XmlElement(name = "Time_spread")
    protected int timeSpread;
    @XmlElement(name = "Mh")
    protected int mh;
    @XmlElement(name = "Distance")
    protected float distance;
    @XmlElement(name = "Errors", required = true)
    protected String errors;
    @XmlElement(name = "Mat1", required = true)
    protected String mat1;
    @XmlElement(name = "Mat2", required = true)
    protected String mat2;
    @XmlElement(name = "Brine", required = true)
    protected String brine;
    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "Width")
    protected float width;
    @XmlElement(name = "WidthLeft")
    protected float widthLeft;
    @XmlElement(name = "Batch1")
    protected float batch1;
    @XmlElement(name = "Batch2")
    protected float batch2;
    @XmlElement(name = "Batch3")
    protected float batch3;
    @XmlElement(name = "Speed")
    protected int speed;
    @XmlElement(name = "BrineProc")
    protected int brineProc;

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
     * Gets the value of the spreaderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpreaderID() {
        return spreaderID;
    }

    /**
     * Sets the value of the spreaderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpreaderID(String value) {
        this.spreaderID = value;
    }

    /**
     * Gets the value of the attrib property.
     * 
     */
    public int getAttrib() {
        return attrib;
    }

    /**
     * Sets the value of the attrib property.
     * 
     */
    public void setAttrib(int value) {
        this.attrib = value;
    }

    /**
     * Gets the value of the spread1Kg property.
     * 
     */
    public float getSpread1Kg() {
        return spread1Kg;
    }

    /**
     * Sets the value of the spread1Kg property.
     * 
     */
    public void setSpread1Kg(float value) {
        this.spread1Kg = value;
    }

    /**
     * Gets the value of the spread2Kg property.
     * 
     */
    public float getSpread2Kg() {
        return spread2Kg;
    }

    /**
     * Sets the value of the spread2Kg property.
     * 
     */
    public void setSpread2Kg(float value) {
        this.spread2Kg = value;
    }

    /**
     * Gets the value of the brineL property.
     * 
     */
    public float getBrineL() {
        return brineL;
    }

    /**
     * Sets the value of the brineL property.
     * 
     */
    public void setBrineL(float value) {
        this.brineL = value;
    }

    /**
     * Gets the value of the timeSpread property.
     * 
     */
    public int getTimeSpread() {
        return timeSpread;
    }

    /**
     * Sets the value of the timeSpread property.
     * 
     */
    public void setTimeSpread(int value) {
        this.timeSpread = value;
    }

    /**
     * Gets the value of the mh property.
     * 
     */
    public int getMh() {
        return mh;
    }

    /**
     * Sets the value of the mh property.
     * 
     */
    public void setMh(int value) {
        this.mh = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    public float getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(float value) {
        this.distance = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrors(String value) {
        this.errors = value;
    }

    /**
     * Gets the value of the mat1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMat1() {
        return mat1;
    }

    /**
     * Sets the value of the mat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMat1(String value) {
        this.mat1 = value;
    }

    /**
     * Gets the value of the mat2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMat2() {
        return mat2;
    }

    /**
     * Sets the value of the mat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMat2(String value) {
        this.mat2 = value;
    }

    /**
     * Gets the value of the brine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrine() {
        return brine;
    }

    /**
     * Sets the value of the brine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrine(String value) {
        this.brine = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
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
     * Gets the value of the width property.
     * 
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(float value) {
        this.width = value;
    }

    /**
     * Gets the value of the widthLeft property.
     * 
     */
    public float getWidthLeft() {
        return widthLeft;
    }

    /**
     * Sets the value of the widthLeft property.
     * 
     */
    public void setWidthLeft(float value) {
        this.widthLeft = value;
    }

    /**
     * Gets the value of the batch1 property.
     * 
     */
    public float getBatch1() {
        return batch1;
    }

    /**
     * Sets the value of the batch1 property.
     * 
     */
    public void setBatch1(float value) {
        this.batch1 = value;
    }

    /**
     * Gets the value of the batch2 property.
     * 
     */
    public float getBatch2() {
        return batch2;
    }

    /**
     * Sets the value of the batch2 property.
     * 
     */
    public void setBatch2(float value) {
        this.batch2 = value;
    }

    /**
     * Gets the value of the batch3 property.
     * 
     */
    public float getBatch3() {
        return batch3;
    }

    /**
     * Sets the value of the batch3 property.
     * 
     */
    public void setBatch3(float value) {
        this.batch3 = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * Gets the value of the brineProc property.
     * 
     */
    public int getBrineProc() {
        return brineProc;
    }

    /**
     * Sets the value of the brineProc property.
     * 
     */
    public void setBrineProc(int value) {
        this.brineProc = value;
    }

}
