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
 * <p>Java class for WDS_DriverHoursWorked complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_DriverHoursWorked"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="driverid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="items" type="{urn://api.webdispecink.cz/webdisser_02}ArrayOfWDS_DriverHoursWorkedItem"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_DriverHoursWorked", propOrder = {

})
public class WDSDriverHoursWorked {

    protected int driverid;
    protected float distance;
    @XmlElement(required = true)
    protected ArrayOfWDSDriverHoursWorkedItem items;

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
     * Gets the value of the distance property.
     * 
     */
    public float getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(float value) {
        this.distance = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWDSDriverHoursWorkedItem }
     *     
     */
    public ArrayOfWDSDriverHoursWorkedItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWDSDriverHoursWorkedItem }
     *     
     */
    public void setItems(ArrayOfWDSDriverHoursWorkedItem value) {
        this.items = value;
    }

}
