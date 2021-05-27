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
 * <p>Java class for WDS_OptimalRouteStopActionFullItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_OptimalRouteStopActionFullItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdStopAction" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TypeAction" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeqNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MessList" type="{urn://api.webdispecink.cz/webdisser_02}ArrayOfWDS_OptimalRouteStopActionMessItem"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_OptimalRouteStopActionFullItem", propOrder = {

})
public class WDSOptimalRouteStopActionFullItem {

    @XmlElement(name = "IdStopAction")
    protected int idStopAction;
    @XmlElement(name = "TypeAction")
    protected int typeAction;
    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "SeqNumber")
    protected int seqNumber;
    @XmlElement(name = "MessList", required = true)
    protected ArrayOfWDSOptimalRouteStopActionMessItem messList;

    /**
     * Gets the value of the idStopAction property.
     * 
     */
    public int getIdStopAction() {
        return idStopAction;
    }

    /**
     * Sets the value of the idStopAction property.
     * 
     */
    public void setIdStopAction(int value) {
        this.idStopAction = value;
    }

    /**
     * Gets the value of the typeAction property.
     * 
     */
    public int getTypeAction() {
        return typeAction;
    }

    /**
     * Sets the value of the typeAction property.
     * 
     */
    public void setTypeAction(int value) {
        this.typeAction = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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
     * Gets the value of the seqNumber property.
     * 
     */
    public int getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     */
    public void setSeqNumber(int value) {
        this.seqNumber = value;
    }

    /**
     * Gets the value of the messList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWDSOptimalRouteStopActionMessItem }
     *     
     */
    public ArrayOfWDSOptimalRouteStopActionMessItem getMessList() {
        return messList;
    }

    /**
     * Sets the value of the messList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWDSOptimalRouteStopActionMessItem }
     *     
     */
    public void setMessList(ArrayOfWDSOptimalRouteStopActionMessItem value) {
        this.messList = value;
    }

}
