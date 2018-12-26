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
import com.bancodebogota.accounts.product.event.CampPotentialSaleInqRqType;


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
 *         &lt;element ref="{urn://bancodebogota.com/accounts/Product/event/}CampPotentialSaleInqRq"/&gt;
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
    "campPotentialSaleInqRq"
})
@XmlRootElement(name = "getCampPotentialSaleRequest")
public class GetCampPotentialSaleRequest {

    @XmlElement(name = "CampPotentialSaleInqRq", namespace = "urn://bancodebogota.com/accounts/Product/event/", required = true)
    protected CampPotentialSaleInqRqType campPotentialSaleInqRq;

    /**
     * Obtiene el valor de la propiedad campPotentialSaleInqRq.
     * 
     * @return
     *     possible object is
     *     {@link CampPotentialSaleInqRqType }
     *     
     */
    public CampPotentialSaleInqRqType getCampPotentialSaleInqRq() {
        return campPotentialSaleInqRq;
    }

    /**
     * Define el valor de la propiedad campPotentialSaleInqRq.
     * 
     * @param value
     *     allowed object is
     *     {@link CampPotentialSaleInqRqType }
     *     
     */
    public void setCampPotentialSaleInqRq(CampPotentialSaleInqRqType value) {
        this.campPotentialSaleInqRq = value;
    }

}
