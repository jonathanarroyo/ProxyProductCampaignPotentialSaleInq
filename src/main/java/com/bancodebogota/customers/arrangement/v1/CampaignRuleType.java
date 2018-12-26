//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.customers.arrangement.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.ifx.base.v1.AcctDomainListType;


/**
 * <p>Clase Java para CampaignRule_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampaignRule_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RefType"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RefId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctDomainList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignRule_Type", propOrder = {
    "refType",
    "refId",
    "acctDomainList"
})
public class CampaignRuleType {

    @XmlElement(name = "RefType", namespace = "urn://bancodebogota.com/ifx/base/v1/", required = true)
    protected String refType;
    @XmlElement(name = "RefId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String refId;
    @XmlElement(name = "AcctDomainList", namespace = "urn://bancodebogota.com/ifx/base/v1/", required = true)
    protected AcctDomainListType acctDomainList;

    /**
     * Obtiene el valor de la propiedad refType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefType() {
        return refType;
    }

    /**
     * Define el valor de la propiedad refType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefType(String value) {
        this.refType = value;
    }

    /**
     * Obtiene el valor de la propiedad refId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Define el valor de la propiedad refId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctDomainList.
     * 
     * @return
     *     possible object is
     *     {@link AcctDomainListType }
     *     
     */
    public AcctDomainListType getAcctDomainList() {
        return acctDomainList;
    }

    /**
     * Define el valor de la propiedad acctDomainList.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctDomainListType }
     *     
     */
    public void setAcctDomainList(AcctDomainListType value) {
        this.acctDomainList = value;
    }

}
