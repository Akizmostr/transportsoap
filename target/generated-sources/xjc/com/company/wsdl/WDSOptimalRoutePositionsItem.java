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
 * <p>Java class for WDS_OptimalRoutePositionsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_OptimalRoutePositionsItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdRoute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Postime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ew" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="El" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_OptimalRoutePositionsItem", propOrder = {

})
public class WDSOptimalRoutePositionsItem {

    @XmlElement(name = "IdRoute")
    protected int idRoute;
    @XmlElement(name = "Postime", required = true)
    protected String postime;
    @XmlElement(name = "Ew")
    protected float ew;
    @XmlElement(name = "El")
    protected float el;

    /**
     * Gets the value of the idRoute property.
     * 
     */
    public int getIdRoute() {
        return idRoute;
    }

    /**
     * Sets the value of the idRoute property.
     * 
     */
    public void setIdRoute(int value) {
        this.idRoute = value;
    }

    /**
     * Gets the value of the postime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostime() {
        return postime;
    }

    /**
     * Sets the value of the postime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostime(String value) {
        this.postime = value;
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

}