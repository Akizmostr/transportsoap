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
 * <p>Java class for WDS_LandWorkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_LandWorkItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdLandWorkItem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdPoint" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdTool1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdTool2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdTool3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdTool4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdWorkAction1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdWorkAction2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdWorkAction3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdWorkAction4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="TimeStand" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="WorkArea" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="WorkAreaKm" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Cons" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="IdDriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Driver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_LandWorkItem", propOrder = {

})
public class WDSLandWorkItem {

    @XmlElement(name = "IdLandWorkItem")
    protected int idLandWorkItem;
    @XmlElement(name = "IdPoint")
    protected int idPoint;
    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "IdTool1")
    protected int idTool1;
    @XmlElement(name = "IdTool2")
    protected int idTool2;
    @XmlElement(name = "IdTool3")
    protected int idTool3;
    @XmlElement(name = "IdTool4")
    protected int idTool4;
    @XmlElement(name = "IdWorkAction1")
    protected int idWorkAction1;
    @XmlElement(name = "IdWorkAction2")
    protected int idWorkAction2;
    @XmlElement(name = "IdWorkAction3")
    protected int idWorkAction3;
    @XmlElement(name = "IdWorkAction4")
    protected int idWorkAction4;
    @XmlElement(name = "DateFrom", required = true)
    protected String dateFrom;
    @XmlElement(name = "DateTo", required = true)
    protected String dateTo;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "Length")
    protected float length;
    @XmlElement(name = "Width")
    protected float width;
    @XmlElement(name = "TimeStand")
    protected float timeStand;
    @XmlElement(name = "WorkArea")
    protected float workArea;
    @XmlElement(name = "WorkAreaKm")
    protected float workAreaKm;
    @XmlElement(name = "Cons")
    protected float cons;
    @XmlElement(name = "IdDriver")
    protected int idDriver;
    @XmlElement(name = "Driver", required = true)
    protected String driver;

    /**
     * Gets the value of the idLandWorkItem property.
     * 
     */
    public int getIdLandWorkItem() {
        return idLandWorkItem;
    }

    /**
     * Sets the value of the idLandWorkItem property.
     * 
     */
    public void setIdLandWorkItem(int value) {
        this.idLandWorkItem = value;
    }

    /**
     * Gets the value of the idPoint property.
     * 
     */
    public int getIdPoint() {
        return idPoint;
    }

    /**
     * Sets the value of the idPoint property.
     * 
     */
    public void setIdPoint(int value) {
        this.idPoint = value;
    }

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
     * Gets the value of the idTool1 property.
     * 
     */
    public int getIdTool1() {
        return idTool1;
    }

    /**
     * Sets the value of the idTool1 property.
     * 
     */
    public void setIdTool1(int value) {
        this.idTool1 = value;
    }

    /**
     * Gets the value of the idTool2 property.
     * 
     */
    public int getIdTool2() {
        return idTool2;
    }

    /**
     * Sets the value of the idTool2 property.
     * 
     */
    public void setIdTool2(int value) {
        this.idTool2 = value;
    }

    /**
     * Gets the value of the idTool3 property.
     * 
     */
    public int getIdTool3() {
        return idTool3;
    }

    /**
     * Sets the value of the idTool3 property.
     * 
     */
    public void setIdTool3(int value) {
        this.idTool3 = value;
    }

    /**
     * Gets the value of the idTool4 property.
     * 
     */
    public int getIdTool4() {
        return idTool4;
    }

    /**
     * Sets the value of the idTool4 property.
     * 
     */
    public void setIdTool4(int value) {
        this.idTool4 = value;
    }

    /**
     * Gets the value of the idWorkAction1 property.
     * 
     */
    public int getIdWorkAction1() {
        return idWorkAction1;
    }

    /**
     * Sets the value of the idWorkAction1 property.
     * 
     */
    public void setIdWorkAction1(int value) {
        this.idWorkAction1 = value;
    }

    /**
     * Gets the value of the idWorkAction2 property.
     * 
     */
    public int getIdWorkAction2() {
        return idWorkAction2;
    }

    /**
     * Sets the value of the idWorkAction2 property.
     * 
     */
    public void setIdWorkAction2(int value) {
        this.idWorkAction2 = value;
    }

    /**
     * Gets the value of the idWorkAction3 property.
     * 
     */
    public int getIdWorkAction3() {
        return idWorkAction3;
    }

    /**
     * Sets the value of the idWorkAction3 property.
     * 
     */
    public void setIdWorkAction3(int value) {
        this.idWorkAction3 = value;
    }

    /**
     * Gets the value of the idWorkAction4 property.
     * 
     */
    public int getIdWorkAction4() {
        return idWorkAction4;
    }

    /**
     * Sets the value of the idWorkAction4 property.
     * 
     */
    public void setIdWorkAction4(int value) {
        this.idWorkAction4 = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public float getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(float value) {
        this.length = value;
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
     * Gets the value of the timeStand property.
     * 
     */
    public float getTimeStand() {
        return timeStand;
    }

    /**
     * Sets the value of the timeStand property.
     * 
     */
    public void setTimeStand(float value) {
        this.timeStand = value;
    }

    /**
     * Gets the value of the workArea property.
     * 
     */
    public float getWorkArea() {
        return workArea;
    }

    /**
     * Sets the value of the workArea property.
     * 
     */
    public void setWorkArea(float value) {
        this.workArea = value;
    }

    /**
     * Gets the value of the workAreaKm property.
     * 
     */
    public float getWorkAreaKm() {
        return workAreaKm;
    }

    /**
     * Sets the value of the workAreaKm property.
     * 
     */
    public void setWorkAreaKm(float value) {
        this.workAreaKm = value;
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
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

}
