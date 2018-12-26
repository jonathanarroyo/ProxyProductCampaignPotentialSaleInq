//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.ifx.base.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GovIssueIdent_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GovIssueIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}GovIssueIdentType"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}IdentSerialNum"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}GovOrg"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}StateProv" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}IssDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ExpDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovIssueIdent_Type", propOrder = {
    "govIssueIdentType",
    "identSerialNum",
    "govOrg",
    "stateProv",
    "country",
    "desc",
    "issDt",
    "expDt"
})
public class GovIssueIdentType {

    @XmlElement(name = "GovIssueIdentType", required = true)
    protected String govIssueIdentType;
    @XmlElement(name = "IdentSerialNum", required = true)
    protected String identSerialNum;
    @XmlElement(name = "GovOrg", required = true)
    protected String govOrg;
    @XmlElement(name = "StateProv")
    protected String stateProv;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "IssDt")
    protected String issDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;

    /**
     * Obtiene el valor de la propiedad govIssueIdentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovIssueIdentType() {
        return govIssueIdentType;
    }

    /**
     * Define el valor de la propiedad govIssueIdentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovIssueIdentType(String value) {
        this.govIssueIdentType = value;
    }

    /**
     * Obtiene el valor de la propiedad identSerialNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentSerialNum() {
        return identSerialNum;
    }

    /**
     * Define el valor de la propiedad identSerialNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentSerialNum(String value) {
        this.identSerialNum = value;
    }

    /**
     * Obtiene el valor de la propiedad govOrg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovOrg() {
        return govOrg;
    }

    /**
     * Define el valor de la propiedad govOrg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovOrg(String value) {
        this.govOrg = value;
    }

    /**
     * Obtiene el valor de la propiedad stateProv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Define el valor de la propiedad stateProv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
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
     * Define el valor de la propiedad desc.
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
     * Obtiene el valor de la propiedad issDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssDt() {
        return issDt;
    }

    /**
     * Define el valor de la propiedad issDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssDt(String value) {
        this.issDt = value;
    }

    /**
     * Obtiene el valor de la propiedad expDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Define el valor de la propiedad expDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

}
