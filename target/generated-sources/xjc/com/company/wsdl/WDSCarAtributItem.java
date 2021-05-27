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
 * <p>Java class for WDS_CarAtributItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarAtributItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Identifikator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdDriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdCargroup" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Divize" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stredisko" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CisloO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Oskod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Vin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Park" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Clasif" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartKm" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RegDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DisabledDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitMileage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserDriver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserSupervisor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HomeWorkHome" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MonthKm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Consumption" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="TankTol" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FuelDecrease" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PurchasePrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Amort" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarAtributItem", propOrder = {

})
public class WDSCarAtributItem {

    @XmlElement(name = "IdCar")
    protected int idCar;
    @XmlElement(name = "Identifikator", required = true)
    protected String identifikator;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "IdDriver")
    protected int idDriver;
    @XmlElement(name = "IdCargroup")
    protected int idCargroup;
    @XmlElement(name = "Purpose", required = true)
    protected String purpose;
    @XmlElement(name = "Brand", required = true)
    protected String brand;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "Divize", required = true)
    protected String divize;
    @XmlElement(name = "Stredisko", required = true)
    protected String stredisko;
    @XmlElement(name = "CisloO", required = true)
    protected String cisloO;
    @XmlElement(name = "Oskod", required = true)
    protected String oskod;
    @XmlElement(name = "Vin", required = true)
    protected String vin;
    @XmlElement(name = "Park", required = true)
    protected String park;
    @XmlElement(name = "Owner", required = true)
    protected String owner;
    @XmlElement(name = "Clasif", required = true)
    protected String clasif;
    @XmlElement(name = "StartKm")
    protected float startKm;
    @XmlElement(name = "StartDate", required = true)
    protected String startDate;
    @XmlElement(name = "RegDate", required = true)
    protected String regDate;
    @XmlElement(name = "Disabled")
    protected int disabled;
    @XmlElement(name = "DisabledDate", required = true)
    protected String disabledDate;
    @XmlElement(name = "UnitMileage", required = true)
    protected String unitMileage;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "UserDriver", required = true)
    protected String userDriver;
    @XmlElement(name = "UserSupervisor", required = true)
    protected String userSupervisor;
    @XmlElement(name = "HomeWorkHome")
    protected int homeWorkHome;
    @XmlElement(name = "MonthKm")
    protected int monthKm;
    @XmlElement(name = "Consumption")
    protected float consumption;
    @XmlElement(name = "TankTol")
    protected int tankTol;
    @XmlElement(name = "FuelDecrease")
    protected int fuelDecrease;
    @XmlElement(name = "PurchasePrice")
    protected float purchasePrice;
    @XmlElement(name = "Amort")
    protected float amort;

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
     * Gets the value of the idCargroup property.
     * 
     */
    public int getIdCargroup() {
        return idCargroup;
    }

    /**
     * Sets the value of the idCargroup property.
     * 
     */
    public void setIdCargroup(int value) {
        this.idCargroup = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
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
     * Gets the value of the cisloO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloO() {
        return cisloO;
    }

    /**
     * Sets the value of the cisloO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloO(String value) {
        this.cisloO = value;
    }

    /**
     * Gets the value of the oskod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOskod() {
        return oskod;
    }

    /**
     * Sets the value of the oskod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOskod(String value) {
        this.oskod = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
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
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the park property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPark() {
        return park;
    }

    /**
     * Sets the value of the park property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPark(String value) {
        this.park = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the clasif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasif() {
        return clasif;
    }

    /**
     * Sets the value of the clasif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasif(String value) {
        this.clasif = value;
    }

    /**
     * Gets the value of the startKm property.
     * 
     */
    public float getStartKm() {
        return startKm;
    }

    /**
     * Sets the value of the startKm property.
     * 
     */
    public void setStartKm(float value) {
        this.startKm = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     */
    public int getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     */
    public void setDisabled(int value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the disabledDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabledDate() {
        return disabledDate;
    }

    /**
     * Sets the value of the disabledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabledDate(String value) {
        this.disabledDate = value;
    }

    /**
     * Gets the value of the unitMileage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitMileage() {
        return unitMileage;
    }

    /**
     * Sets the value of the unitMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitMileage(String value) {
        this.unitMileage = value;
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
     * Gets the value of the userDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDriver() {
        return userDriver;
    }

    /**
     * Sets the value of the userDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDriver(String value) {
        this.userDriver = value;
    }

    /**
     * Gets the value of the userSupervisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSupervisor() {
        return userSupervisor;
    }

    /**
     * Sets the value of the userSupervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSupervisor(String value) {
        this.userSupervisor = value;
    }

    /**
     * Gets the value of the homeWorkHome property.
     * 
     */
    public int getHomeWorkHome() {
        return homeWorkHome;
    }

    /**
     * Sets the value of the homeWorkHome property.
     * 
     */
    public void setHomeWorkHome(int value) {
        this.homeWorkHome = value;
    }

    /**
     * Gets the value of the monthKm property.
     * 
     */
    public int getMonthKm() {
        return monthKm;
    }

    /**
     * Sets the value of the monthKm property.
     * 
     */
    public void setMonthKm(int value) {
        this.monthKm = value;
    }

    /**
     * Gets the value of the consumption property.
     * 
     */
    public float getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     */
    public void setConsumption(float value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the tankTol property.
     * 
     */
    public int getTankTol() {
        return tankTol;
    }

    /**
     * Sets the value of the tankTol property.
     * 
     */
    public void setTankTol(int value) {
        this.tankTol = value;
    }

    /**
     * Gets the value of the fuelDecrease property.
     * 
     */
    public int getFuelDecrease() {
        return fuelDecrease;
    }

    /**
     * Sets the value of the fuelDecrease property.
     * 
     */
    public void setFuelDecrease(int value) {
        this.fuelDecrease = value;
    }

    /**
     * Gets the value of the purchasePrice property.
     * 
     */
    public float getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Sets the value of the purchasePrice property.
     * 
     */
    public void setPurchasePrice(float value) {
        this.purchasePrice = value;
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

}
