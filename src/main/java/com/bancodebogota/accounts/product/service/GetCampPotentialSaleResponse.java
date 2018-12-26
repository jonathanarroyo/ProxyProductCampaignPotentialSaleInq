//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.accounts.product.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.accounts.product.event.CampPotentialSaleInqRsType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/accounts/Product/event/}CampPotentialSaleInqRs"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campPotentialSaleInqRs"
})
@XmlRootElement(name = "getCampPotentialSaleResponse")
public class GetCampPotentialSaleResponse {

    @XmlElement(name = "CampPotentialSaleInqRs", namespace = "urn://bancodebogota.com/accounts/Product/event/", required = true)
    protected CampPotentialSaleInqRsType campPotentialSaleInqRs;

    /**
     * Obtiene el valor de la propiedad campPotentialSaleInqRs.
     * 
     * @return
     *     possible object is
     *     {@link CampPotentialSaleInqRsType }
     *     
     */
    public CampPotentialSaleInqRsType getCampPotentialSaleInqRs() {
        return campPotentialSaleInqRs;
    }

    /**
     * Define el valor de la propiedad campPotentialSaleInqRs.
     * 
     * @param value
     *     allowed object is
     *     {@link CampPotentialSaleInqRsType }
     *     
     */
    public void setCampPotentialSaleInqRs(CampPotentialSaleInqRsType value) {
        this.campPotentialSaleInqRs = value;
    }

}
