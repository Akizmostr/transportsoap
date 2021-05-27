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
 * <p>Java class for WDS_AccelometerItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_AccelometerItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LogDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeAct" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Intensity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Course" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Intensity2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Place" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Magnitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Ew" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="El" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "WDS_AccelometerItem", propOrder = {

})
public class WDSAccelometerItem {

    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "LogDate", required = true)
    protected String logDate;
    @XmlElement(name = "TypeAct")
    protected int typeAct;
    @XmlElement(name = "Direction", required = true)
    protected String direction;
    @XmlElement(name = "Intensity")
    protected int intensity;
    @XmlElement(name = "Speed")
    protected int speed;
    @XmlElement(name = "Course")
    protected int course;
    @XmlElement(name = "Intensity2")
    protected float intensity2;
    @XmlElement(name = "Place", required = true)
    protected String place;
    @XmlElement(name = "X")
    protected float x;
    @XmlElement(name = "Y")
    protected float y;
    @XmlElement(name = "Z")
    protected float z;
    @XmlElement(name = "Magnitude")
    protected int magnitude;
    @XmlElement(name = "Ew")
    protected float ew;
    @XmlElement(name = "El")
    protected float el;
    @XmlElement(name = "IdDriver")
    protected int idDriver;
    @XmlElement(name = "Driver", required = true)
    protected String driver;

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
     * Gets the value of the logDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDate() {
        return logDate;
    }

    /**
     * Sets the value of the logDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDate(String value) {
        this.logDate = value;
    }

    /**
     * Gets the value of the typeAct property.
     * 
     */
    public int getTypeAct() {
        return typeAct;
    }

    /**
     * Sets the value of the typeAct property.
     * 
     */
    public void setTypeAct(int value) {
        this.typeAct = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the intensity property.
     * 
     */
    public int getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     */
    public void setIntensity(int value) {
        this.intensity = value;
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
     * Gets the value of the course property.
     * 
     */
    public int getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     */
    public void setCourse(int value) {
        this.course = value;
    }

    /**
     * Gets the value of the intensity2 property.
     * 
     */
    public float getIntensity2() {
        return intensity2;
    }

    /**
     * Sets the value of the intensity2 property.
     * 
     */
    public void setIntensity2(float value) {
        this.intensity2 = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the x property.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     */
    public float getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     */
    public void setZ(float value) {
        this.z = value;
    }

    /**
     * Gets the value of the magnitude property.
     * 
     */
    public int getMagnitude() {
        return magnitude;
    }

    /**
     * Sets the value of the magnitude property.
     * 
     */
    public void setMagnitude(int value) {
        this.magnitude = value;
    }

    /**
     * Gets the value of the ew property.
     * 
     */
    public float getEw() {
        return ew;
    }

    /**
     * Sets the value of the ew property.
     * 
     */
    public void setEw(float value) {
        this.ew = value;
    }

    /**
     * Gets the value of the el property.
     * 
     */
    public float getEl() {
        return el;
    }

    /**
     * Sets the value of the el property.
     * 
     */
    public void setEl(float value) {
        this.el = value;
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
