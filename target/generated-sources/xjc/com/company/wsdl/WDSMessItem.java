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
 * <p>Java class for WDS_MessItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_MessItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Idcar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Dev" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MessStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MessId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Ew" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="El" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MessOrigTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EwSend" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ElSend" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PlaceSend" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeliverTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReadTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeleteTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_MessItem", propOrder = {

})
public class WDSMessItem {

    @XmlElement(name = "Idcar")
    protected int idcar;
    @XmlElement(name = "Dev")
    protected int dev;
    @XmlElement(name = "MessStatus", required = true)
    protected String messStatus;
    @XmlElement(name = "MessFrom", required = true)
    protected String messFrom;
    @XmlElement(name = "MessTime", required = true)
    protected String messTime;
    @XmlElement(name = "MessBody", required = true)
    protected String messBody;
    @XmlElement(name = "MessType")
    protected int messType;
    @XmlElement(name = "MessId")
    protected long messId;
    @XmlElement(name = "Ew")
    protected float ew;
    @XmlElement(name = "El")
    protected float el;
    @XmlElement(name = "MessOrigTime", required = true)
    protected String messOrigTime;
    @XmlElement(name = "EwSend")
    protected float ewSend;
    @XmlElement(name = "ElSend")
    protected float elSend;
    @XmlElement(name = "PlaceSend", required = true)
    protected String placeSend;
    @XmlElement(name = "DeliverTime", required = true)
    protected String deliverTime;
    @XmlElement(name = "ReadTime", required = true)
    protected String readTime;
    @XmlElement(name = "DeleteTime", required = true)
    protected String deleteTime;
    @XmlElement(name = "UpdateTime", required = true)
    protected String updateTime;
    @XmlElement(name = "Type")
    protected int type;
    @XmlElement(name = "SubType")
    protected int subType;
    @XmlElement(name = "FileId")
    protected long fileId;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "FileSize")
    protected long fileSize;

    /**
     * Gets the value of the idcar property.
     * 
     */
    public int getIdcar() {
        return idcar;
    }

    /**
     * Sets the value of the idcar property.
     * 
     */
    public void setIdcar(int value) {
        this.idcar = value;
    }

    /**
     * Gets the value of the dev property.
     * 
     */
    public int getDev() {
        return dev;
    }

    /**
     * Sets the value of the dev property.
     * 
     */
    public void setDev(int value) {
        this.dev = value;
    }

    /**
     * Gets the value of the messStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessStatus() {
        return messStatus;
    }

    /**
     * Sets the value of the messStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessStatus(String value) {
        this.messStatus = value;
    }

    /**
     * Gets the value of the messFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessFrom() {
        return messFrom;
    }

    /**
     * Sets the value of the messFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessFrom(String value) {
        this.messFrom = value;
    }

    /**
     * Gets the value of the messTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessTime() {
        return messTime;
    }

    /**
     * Sets the value of the messTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessTime(String value) {
        this.messTime = value;
    }

    /**
     * Gets the value of the messBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessBody() {
        return messBody;
    }

    /**
     * Sets the value of the messBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessBody(String value) {
        this.messBody = value;
    }

    /**
     * Gets the value of the messType property.
     * 
     */
    public int getMessType() {
        return messType;
    }

    /**
     * Sets the value of the messType property.
     * 
     */
    public void setMessType(int value) {
        this.messType = value;
    }

    /**
     * Gets the value of the messId property.
     * 
     */
    public long getMessId() {
        return messId;
    }

    /**
     * Sets the value of the messId property.
     * 
     */
    public void setMessId(long value) {
        this.messId = value;
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
     * Gets the value of the messOrigTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessOrigTime() {
        return messOrigTime;
    }

    /**
     * Sets the value of the messOrigTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessOrigTime(String value) {
        this.messOrigTime = value;
    }

    /**
     * Gets the value of the ewSend property.
     * 
     */
    public float getEwSend() {
        return ewSend;
    }

    /**
     * Sets the value of the ewSend property.
     * 
     */
    public void setEwSend(float value) {
        this.ewSend = value;
    }

    /**
     * Gets the value of the elSend property.
     * 
     */
    public float getElSend() {
        return elSend;
    }

    /**
     * Sets the value of the elSend property.
     * 
     */
    public void setElSend(float value) {
        this.elSend = value;
    }

    /**
     * Gets the value of the placeSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceSend() {
        return placeSend;
    }

    /**
     * Sets the value of the placeSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceSend(String value) {
        this.placeSend = value;
    }

    /**
     * Gets the value of the deliverTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverTime() {
        return deliverTime;
    }

    /**
     * Sets the value of the deliverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverTime(String value) {
        this.deliverTime = value;
    }

    /**
     * Gets the value of the readTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadTime() {
        return readTime;
    }

    /**
     * Sets the value of the readTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadTime(String value) {
        this.readTime = value;
    }

    /**
     * Gets the value of the deleteTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    /**
     * Sets the value of the deleteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteTime(String value) {
        this.deleteTime = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
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
     * Gets the value of the subType property.
     * 
     */
    public int getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     */
    public void setSubType(int value) {
        this.subType = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     */
    public long getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     */
    public void setFileId(long value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(long value) {
        this.fileSize = value;
    }

}
