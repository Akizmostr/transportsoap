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
 * <p>Java class for WDS_RouteStateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_RouteStateItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="idroute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idcar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="date_from" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="date_to" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="stops_completed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="planned_km" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="edited_by" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_RouteStateItem", propOrder = {

})
public class WDSRouteStateItem {

    protected int idroute;
    @XmlElement(required = true)
    protected String name;
    protected int idcar;
    @XmlElement(name = "date_from", required = true)
    protected String dateFrom;
    @XmlElement(name = "date_to", required = true)
    protected String dateTo;
    @XmlElement(required = true)
    protected String state;
    protected int stops;
    @XmlElement(name = "stops_completed")
    protected int stopsCompleted;
    @XmlElement(name = "planned_km")
    protected float plannedKm;
    @XmlElement(name = "edited_by", required = true)
    protected String editedBy;

    /**
     * Gets the value of the idroute property.
     * 
     */
    public int getIdroute() {
        return idroute;
    }

    /**
     * Sets the value of the idroute property.
     * 
     */
    public void setIdroute(int value) {
        this.idroute = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     */
    public int getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     */
    public void setStops(int value) {
        this.stops = value;
    }

    /**
     * Gets the value of the stopsCompleted property.
     * 
     */
    public int getStopsCompleted() {
        return stopsCompleted;
    }

    /**
     * Sets the value of the stopsCompleted property.
     * 
     */
    public void setStopsCompleted(int value) {
        this.stopsCompleted = value;
    }

    /**
     * Gets the value of the plannedKm property.
     * 
     */
    public float getPlannedKm() {
        return plannedKm;
    }

    /**
     * Sets the value of the plannedKm property.
     * 
     */
    public void setPlannedKm(float value) {
        this.plannedKm = value;
    }

    /**
     * Gets the value of the editedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditedBy() {
        return editedBy;
    }

    /**
     * Sets the value of the editedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditedBy(String value) {
        this.editedBy = value;
    }

}
