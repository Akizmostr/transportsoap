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
 * <p>Java class for WDS_BookPurposeSettItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WDS_BookPurposeSettItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IdP" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TextCZ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TextEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdUser" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WDS_BookPurposeSettItem", propOrder = {

})
public class WDSBookPurposeSettItem {

    @XmlElement(name = "IdP")
    protected int idP;
    @XmlElement(name = "TextCZ", required = true)
    protected String textCZ;
    @XmlElement(name = "TextEN", required = true)
    protected String textEN;
    @XmlElement(name = "IdUser")
    protected int idUser;

    /**
     * Gets the value of the idP property.
     * 
     */
    public int getIdP() {
        return idP;
    }

    /**
     * Sets the value of the idP property.
     * 
     */
    public void setIdP(int value) {
        this.idP = value;
    }

    /**
     * Gets the value of the textCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCZ() {
        return textCZ;
    }

    /**
     * Sets the value of the textCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCZ(String value) {
        this.textCZ = value;
    }

    /**
     * Gets the value of the textEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextEN() {
        return textEN;
    }

    /**
     * Sets the value of the textEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextEN(String value) {
        this.textEN = value;
    }

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

}
