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
 * <p>Java class for WDS_CarRentalBillingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarRentalBillingItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="orderid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ordernumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datefrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numberplate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="driverid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="drivername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="drivercenter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="costcenter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="carapprover" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rideapprover" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="keygive" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="keyget" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="officeid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ordertime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="routes" type="{urn://api.webdispecink.cz/webdisser_02}ArrayOfWDS_CarRentalRouteItem"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarRentalBillingItem", propOrder = {

})
public class WDSCarRentalBillingItem {

    protected int orderid;
    @XmlElement(required = true)
    protected String ordernumber;
    @XmlElement(required = true)
    protected String datefrom;
    @XmlElement(required = true)
    protected String dateto;
    protected int carid;
    @XmlElement(required = true)
    protected String numberplate;
    protected int driverid;
    @XmlElement(required = true)
    protected String drivername;
    @XmlElement(required = true)
    protected String drivercenter;
    @XmlElement(required = true)
    protected String costcenter;
    protected int type;
    @XmlElement(required = true)
    protected String carapprover;
    @XmlElement(required = true)
    protected String rideapprover;
    @XmlElement(required = true)
    protected String keygive;
    @XmlElement(required = true)
    protected String keyget;
    protected int officeid;
    protected float km;
    protected int ordertime;
    @XmlElement(required = true)
    protected ArrayOfWDSCarRentalRouteItem routes;

    /**
     * Gets the value of the orderid property.
     * 
     */
    public int getOrderid() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     */
    public void setOrderid(int value) {
        this.orderid = value;
    }

    /**
     * Gets the value of the ordernumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdernumber() {
        return ordernumber;
    }

    /**
     * Sets the value of the ordernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdernumber(String value) {
        this.ordernumber = value;
    }

    /**
     * Gets the value of the datefrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatefrom() {
        return datefrom;
    }

    /**
     * Sets the value of the datefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatefrom(String value) {
        this.datefrom = value;
    }

    /**
     * Gets the value of the dateto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateto() {
        return dateto;
    }

    /**
     * Sets the value of the dateto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateto(String value) {
        this.dateto = value;
    }

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
     * Gets the value of the numberplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberplate() {
        return numberplate;
    }

    /**
     * Sets the value of the numberplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberplate(String value) {
        this.numberplate = value;
    }

    /**
     * Gets the value of the driverid property.
     * 
     */
    public int getDriverid() {
        return driverid;
    }

    /**
     * Sets the value of the driverid property.
     * 
     */
    public void setDriverid(int value) {
        this.driverid = value;
    }

    /**
     * Gets the value of the drivername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivername() {
        return drivername;
    }

    /**
     * Sets the value of the drivername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivername(String value) {
        this.drivername = value;
    }

    /**
     * Gets the value of the drivercenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivercenter() {
        return drivercenter;
    }

    /**
     * Sets the value of the drivercenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivercenter(String value) {
        this.drivercenter = value;
    }

    /**
     * Gets the value of the costcenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostcenter() {
        return costcenter;
    }

    /**
     * Sets the value of the costcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostcenter(String value) {
        this.costcenter = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the carapprover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarapprover() {
        return carapprover;
    }

    /**
     * Sets the value of the carapprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarapprover(String value) {
        this.carapprover = value;
    }

    /**
     * Gets the value of the rideapprover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRideapprover() {
        return rideapprover;
    }

    /**
     * Sets the value of the rideapprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRideapprover(String value) {
        this.rideapprover = value;
    }

    /**
     * Gets the value of the keygive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeygive() {
        return keygive;
    }

    /**
     * Sets the value of the keygive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeygive(String value) {
        this.keygive = value;
    }

    /**
     * Gets the value of the keyget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyget() {
        return keyget;
    }

    /**
     * Sets the value of the keyget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyget(String value) {
        this.keyget = value;
    }

    /**
     * Gets the value of the officeid property.
     * 
     */
    public int getOfficeid() {
        return officeid;
    }

    /**
     * Sets the value of the officeid property.
     * 
     */
    public void setOfficeid(int value) {
        this.officeid = value;
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
     * Gets the value of the ordertime property.
     * 
     */
    public int getOrdertime() {
        return ordertime;
    }

    /**
     * Sets the value of the ordertime property.
     * 
     */
    public void setOrdertime(int value) {
        this.ordertime = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWDSCarRentalRouteItem }
     *     
     */
    public ArrayOfWDSCarRentalRouteItem getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWDSCarRentalRouteItem }
     *     
     */
    public void setRoutes(ArrayOfWDSCarRentalRouteItem value) {
        this.routes = value;
    }

}