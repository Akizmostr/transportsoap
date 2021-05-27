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
 * <p>Java class for WDS_CarTiresPressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_CarTiresPressure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="idcar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="log_datetime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tires" type="{urn://api.webdispecink.cz/webdisser_02}ArrayOfWDS_TirePressureItem"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_CarTiresPressure", propOrder = {

})
public class WDSCarTiresPressure {

    protected int idcar;
    @XmlElement(name = "log_datetime", required = true)
    protected String logDatetime;
    @XmlElement(required = true)
    protected ArrayOfWDSTirePressureItem tires;

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
     * Gets the value of the logDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDatetime() {
        return logDatetime;
    }

    /**
     * Sets the value of the logDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDatetime(String value) {
        this.logDatetime = value;
    }

    /**
     * Gets the value of the tires property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWDSTirePressureItem }
     *     
     */
    public ArrayOfWDSTirePressureItem getTires() {
        return tires;
    }

    /**
     * Sets the value of the tires property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWDSTirePressureItem }
     *     
     */
    public void setTires(ArrayOfWDSTirePressureItem value) {
        this.tires = value;
    }

}
