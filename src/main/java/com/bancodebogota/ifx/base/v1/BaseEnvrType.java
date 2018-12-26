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
 * <p>Clase Java para BaseEnvr_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BaseEnvr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ClientBusinessDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseEnvr_Type", propOrder = {
    "desc",
    "name",
    "clientBusinessDt"
})
public class BaseEnvrType {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ClientBusinessDt")
    protected String clientBusinessDt;

    /**
     * 
     * 						En este campo se parametriza la descripción del ambiente origen.
     * 					
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
     * 
     * 						En este campo se parametriza el código único que identifica al ambiente origen.
     * 					
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
     * Define el valor de la propiedad name.
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
     * 
     * 						En este campo se parametriza la fecha y hora del ambiente.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientBusinessDt() {
        return clientBusinessDt;
    }

    /**
     * Define el valor de la propiedad clientBusinessDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientBusinessDt(String value) {
        this.clientBusinessDt = value;
    }

}
