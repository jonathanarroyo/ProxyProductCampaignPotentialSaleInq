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
 * <p>Clase Java para SelRangeChkNum_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SelRangeChkNum_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}LowChkNum" minOccurs="0"/&gt;
 *           &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}HighChkNum" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelRangeChkNum_Type", propOrder = {
    "lowChkNum",
    "highChkNum"
})
public class SelRangeChkNumType {

    @XmlElement(name = "LowChkNum")
    protected String lowChkNum;
    @XmlElement(name = "HighChkNum")
    protected String highChkNum;

    /**
     * Obtiene el valor de la propiedad lowChkNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowChkNum() {
        return lowChkNum;
    }

    /**
     * Define el valor de la propiedad lowChkNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowChkNum(String value) {
        this.lowChkNum = value;
    }

    /**
     * Obtiene el valor de la propiedad highChkNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighChkNum() {
        return highChkNum;
    }

    /**
     * Define el valor de la propiedad highChkNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighChkNum(String value) {
        this.highChkNum = value;
    }

}
