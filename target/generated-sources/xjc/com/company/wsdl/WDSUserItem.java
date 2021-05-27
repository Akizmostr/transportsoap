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
 * <p>Java class for WDS_UserItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_UserItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdUser" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pwd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChangePwd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserRights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cargroups" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CarsRead" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CarsWrite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mobil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PersCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Layer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SendSMS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxSMS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarRental" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShowLogBook" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShowOdom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShowMap" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BFullEdit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BDriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BPurpose" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BPurposeSelect" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BPrivate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BPrivate10" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BPrivate01" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BOdom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BNote" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BInfoF" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BInsert" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BInsert0" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BInsert1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BConnect" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BDelete" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EditDriver" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EditCarView" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EditBookView" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EditCosts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EditCostsOwn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShowPrivateR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_UserItem", propOrder = {

})
public class WDSUserItem {

    @XmlElement(name = "IdUser")
    protected int idUser;
    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Pwd", required = true)
    protected String pwd;
    @XmlElement(name = "ChangePwd")
    protected int changePwd;
    @XmlElement(name = "UserRights")
    protected int userRights;
    @XmlElement(name = "ValidFrom", required = true)
    protected String validFrom;
    @XmlElement(name = "ValidTo", required = true)
    protected String validTo;
    @XmlElement(name = "Cargroups", required = true)
    protected String cargroups;
    @XmlElement(name = "CarsRead", required = true)
    protected String carsRead;
    @XmlElement(name = "CarsWrite", required = true)
    protected String carsWrite;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Mobil", required = true)
    protected String mobil;
    @XmlElement(name = "PersCode", required = true)
    protected String persCode;
    @XmlElement(name = "Layer", required = true)
    protected String layer;
    @XmlElement(name = "SendSMS")
    protected int sendSMS;
    @XmlElement(name = "MaxSMS")
    protected int maxSMS;
    @XmlElement(name = "PageLimit")
    protected int pageLimit;
    @XmlElement(name = "CarRental")
    protected int carRental;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "ShowLogBook")
    protected int showLogBook;
    @XmlElement(name = "ShowOdom")
    protected int showOdom;
    @XmlElement(name = "ShowMap")
    protected int showMap;
    @XmlElement(name = "BFullEdit")
    protected int bFullEdit;
    @XmlElement(name = "BDriver")
    protected int bDriver;
    @XmlElement(name = "BPurpose")
    protected int bPurpose;
    @XmlElement(name = "BPurposeSelect")
    protected int bPurposeSelect;
    @XmlElement(name = "BPrivate")
    protected int bPrivate;
    @XmlElement(name = "BPrivate10")
    protected int bPrivate10;
    @XmlElement(name = "BPrivate01")
    protected int bPrivate01;
    @XmlElement(name = "BOdom")
    protected int bOdom;
    @XmlElement(name = "BNote")
    protected int bNote;
    @XmlElement(name = "BInfoF")
    protected int bInfoF;
    @XmlElement(name = "BInsert")
    protected int bInsert;
    @XmlElement(name = "BInsert0")
    protected int bInsert0;
    @XmlElement(name = "BInsert1")
    protected int bInsert1;
    @XmlElement(name = "BConnect")
    protected int bConnect;
    @XmlElement(name = "BDelete")
    protected int bDelete;
    @XmlElement(name = "EditDriver")
    protected int editDriver;
    @XmlElement(name = "EditCarView")
    protected int editCarView;
    @XmlElement(name = "EditBookView")
    protected int editBookView;
    @XmlElement(name = "EditCosts")
    protected int editCosts;
    @XmlElement(name = "EditCostsOwn")
    protected int editCostsOwn;
    @XmlElement(name = "ShowPrivateR")
    protected int showPrivateR;

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * Gets the value of the changePwd property.
     * 
     */
    public int getChangePwd() {
        return changePwd;
    }

    /**
     * Sets the value of the changePwd property.
     * 
     */
    public void setChangePwd(int value) {
        this.changePwd = value;
    }

    /**
     * Gets the value of the userRights property.
     * 
     */
    public int getUserRights() {
        return userRights;
    }

    /**
     * Sets the value of the userRights property.
     * 
     */
    public void setUserRights(int value) {
        this.userRights = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(String value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the cargroups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargroups() {
        return cargroups;
    }

    /**
     * Sets the value of the cargroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargroups(String value) {
        this.cargroups = value;
    }

    /**
     * Gets the value of the carsRead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarsRead() {
        return carsRead;
    }

    /**
     * Sets the value of the carsRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarsRead(String value) {
        this.carsRead = value;
    }

    /**
     * Gets the value of the carsWrite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarsWrite() {
        return carsWrite;
    }

    /**
     * Sets the value of the carsWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarsWrite(String value) {
        this.carsWrite = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the persCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersCode() {
        return persCode;
    }

    /**
     * Sets the value of the persCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersCode(String value) {
        this.persCode = value;
    }

    /**
     * Gets the value of the layer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayer() {
        return layer;
    }

    /**
     * Sets the value of the layer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayer(String value) {
        this.layer = value;
    }

    /**
     * Gets the value of the sendSMS property.
     * 
     */
    public int getSendSMS() {
        return sendSMS;
    }

    /**
     * Sets the value of the sendSMS property.
     * 
     */
    public void setSendSMS(int value) {
        this.sendSMS = value;
    }

    /**
     * Gets the value of the maxSMS property.
     * 
     */
    public int getMaxSMS() {
        return maxSMS;
    }

    /**
     * Sets the value of the maxSMS property.
     * 
     */
    public void setMaxSMS(int value) {
        this.maxSMS = value;
    }

    /**
     * Gets the value of the pageLimit property.
     * 
     */
    public int getPageLimit() {
        return pageLimit;
    }

    /**
     * Sets the value of the pageLimit property.
     * 
     */
    public void setPageLimit(int value) {
        this.pageLimit = value;
    }

    /**
     * Gets the value of the carRental property.
     * 
     */
    public int getCarRental() {
        return carRental;
    }

    /**
     * Sets the value of the carRental property.
     * 
     */
    public void setCarRental(int value) {
        this.carRental = value;
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
     * Gets the value of the showLogBook property.
     * 
     */
    public int getShowLogBook() {
        return showLogBook;
    }

    /**
     * Sets the value of the showLogBook property.
     * 
     */
    public void setShowLogBook(int value) {
        this.showLogBook = value;
    }

    /**
     * Gets the value of the showOdom property.
     * 
     */
    public int getShowOdom() {
        return showOdom;
    }

    /**
     * Sets the value of the showOdom property.
     * 
     */
    public void setShowOdom(int value) {
        this.showOdom = value;
    }

    /**
     * Gets the value of the showMap property.
     * 
     */
    public int getShowMap() {
        return showMap;
    }

    /**
     * Sets the value of the showMap property.
     * 
     */
    public void setShowMap(int value) {
        this.showMap = value;
    }

    /**
     * Gets the value of the bFullEdit property.
     * 
     */
    public int getBFullEdit() {
        return bFullEdit;
    }

    /**
     * Sets the value of the bFullEdit property.
     * 
     */
    public void setBFullEdit(int value) {
        this.bFullEdit = value;
    }

    /**
     * Gets the value of the bDriver property.
     * 
     */
    public int getBDriver() {
        return bDriver;
    }

    /**
     * Sets the value of the bDriver property.
     * 
     */
    public void setBDriver(int value) {
        this.bDriver = value;
    }

    /**
     * Gets the value of the bPurpose property.
     * 
     */
    public int getBPurpose() {
        return bPurpose;
    }

    /**
     * Sets the value of the bPurpose property.
     * 
     */
    public void setBPurpose(int value) {
        this.bPurpose = value;
    }

    /**
     * Gets the value of the bPurposeSelect property.
     * 
     */
    public int getBPurposeSelect() {
        return bPurposeSelect;
    }

    /**
     * Sets the value of the bPurposeSelect property.
     * 
     */
    public void setBPurposeSelect(int value) {
        this.bPurposeSelect = value;
    }

    /**
     * Gets the value of the bPrivate property.
     * 
     */
    public int getBPrivate() {
        return bPrivate;
    }

    /**
     * Sets the value of the bPrivate property.
     * 
     */
    public void setBPrivate(int value) {
        this.bPrivate = value;
    }

    /**
     * Gets the value of the bPrivate10 property.
     * 
     */
    public int getBPrivate10() {
        return bPrivate10;
    }

    /**
     * Sets the value of the bPrivate10 property.
     * 
     */
    public void setBPrivate10(int value) {
        this.bPrivate10 = value;
    }

    /**
     * Gets the value of the bPrivate01 property.
     * 
     */
    public int getBPrivate01() {
        return bPrivate01;
    }

    /**
     * Sets the value of the bPrivate01 property.
     * 
     */
    public void setBPrivate01(int value) {
        this.bPrivate01 = value;
    }

    /**
     * Gets the value of the bOdom property.
     * 
     */
    public int getBOdom() {
        return bOdom;
    }

    /**
     * Sets the value of the bOdom property.
     * 
     */
    public void setBOdom(int value) {
        this.bOdom = value;
    }

    /**
     * Gets the value of the bNote property.
     * 
     */
    public int getBNote() {
        return bNote;
    }

    /**
     * Sets the value of the bNote property.
     * 
     */
    public void setBNote(int value) {
        this.bNote = value;
    }

    /**
     * Gets the value of the bInfoF property.
     * 
     */
    public int getBInfoF() {
        return bInfoF;
    }

    /**
     * Sets the value of the bInfoF property.
     * 
     */
    public void setBInfoF(int value) {
        this.bInfoF = value;
    }

    /**
     * Gets the value of the bInsert property.
     * 
     */
    public int getBInsert() {
        return bInsert;
    }

    /**
     * Sets the value of the bInsert property.
     * 
     */
    public void setBInsert(int value) {
        this.bInsert = value;
    }

    /**
     * Gets the value of the bInsert0 property.
     * 
     */
    public int getBInsert0() {
        return bInsert0;
    }

    /**
     * Sets the value of the bInsert0 property.
     * 
     */
    public void setBInsert0(int value) {
        this.bInsert0 = value;
    }

    /**
     * Gets the value of the bInsert1 property.
     * 
     */
    public int getBInsert1() {
        return bInsert1;
    }

    /**
     * Sets the value of the bInsert1 property.
     * 
     */
    public void setBInsert1(int value) {
        this.bInsert1 = value;
    }

    /**
     * Gets the value of the bConnect property.
     * 
     */
    public int getBConnect() {
        return bConnect;
    }

    /**
     * Sets the value of the bConnect property.
     * 
     */
    public void setBConnect(int value) {
        this.bConnect = value;
    }

    /**
     * Gets the value of the bDelete property.
     * 
     */
    public int getBDelete() {
        return bDelete;
    }

    /**
     * Sets the value of the bDelete property.
     * 
     */
    public void setBDelete(int value) {
        this.bDelete = value;
    }

    /**
     * Gets the value of the editDriver property.
     * 
     */
    public int getEditDriver() {
        return editDriver;
    }

    /**
     * Sets the value of the editDriver property.
     * 
     */
    public void setEditDriver(int value) {
        this.editDriver = value;
    }

    /**
     * Gets the value of the editCarView property.
     * 
     */
    public int getEditCarView() {
        return editCarView;
    }

    /**
     * Sets the value of the editCarView property.
     * 
     */
    public void setEditCarView(int value) {
        this.editCarView = value;
    }

    /**
     * Gets the value of the editBookView property.
     * 
     */
    public int getEditBookView() {
        return editBookView;
    }

    /**
     * Sets the value of the editBookView property.
     * 
     */
    public void setEditBookView(int value) {
        this.editBookView = value;
    }

    /**
     * Gets the value of the editCosts property.
     * 
     */
    public int getEditCosts() {
        return editCosts;
    }

    /**
     * Sets the value of the editCosts property.
     * 
     */
    public void setEditCosts(int value) {
        this.editCosts = value;
    }

    /**
     * Gets the value of the editCostsOwn property.
     * 
     */
    public int getEditCostsOwn() {
        return editCostsOwn;
    }

    /**
     * Sets the value of the editCostsOwn property.
     * 
     */
    public void setEditCostsOwn(int value) {
        this.editCostsOwn = value;
    }

    /**
     * Gets the value of the showPrivateR property.
     * 
     */
    public int getShowPrivateR() {
        return showPrivateR;
    }

    /**
     * Sets the value of the showPrivateR property.
     * 
     */
    public void setShowPrivateR(int value) {
        this.showPrivateR = value;
    }

}