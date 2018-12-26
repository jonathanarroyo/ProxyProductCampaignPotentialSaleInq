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
 * <p>Clase Java para PersonInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}NameAddrType"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}FullName"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ContactInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}GovIssueIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfo_Type", propOrder = {
    "nameAddrType",
    "fullName",
    "contactInfo",
    "govIssueIdent"
})
public class PersonInfoType {

    @XmlElement(name = "NameAddrType", required = true)
    protected String nameAddrType;
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "GovIssueIdent")
    protected GovIssueIdentType govIssueIdent;

    /**
     * Obtiene el valor de la propiedad nameAddrType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAddrType() {
        return nameAddrType;
    }

    /**
     * Define el valor de la propiedad nameAddrType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAddrType(String value) {
        this.nameAddrType = value;
    }

    /**
     * Obtiene el valor de la propiedad fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Define el valor de la propiedad fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Obtiene el valor de la propiedad contactInfo.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Define el valor de la propiedad contactInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad govIssueIdent.
     * 
     * @return
     *     possible object is
     *     {@link GovIssueIdentType }
     *     
     */
    public GovIssueIdentType getGovIssueIdent() {
        return govIssueIdent;
    }

    /**
     * Define el valor de la propiedad govIssueIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link GovIssueIdentType }
     *     
     */
    public void setGovIssueIdent(GovIssueIdentType value) {
        this.govIssueIdent = value;
    }

}
