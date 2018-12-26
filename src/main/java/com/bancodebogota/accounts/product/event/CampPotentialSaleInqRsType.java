//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.accounts.product.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.ifx.base.v1.SvcRsType;
import messaging.customers.entities.arrangement.CampPotentialSaleInqType;


/**
 * <p>Clase Java para CampPotentialSaleInqRs_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampPotentialSaleInqRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn://bancodebogota.com/ifx/base/v1/}SvcRs_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://Messaging/customers/entities/arrangement}CampPotentialSaleInq" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampPotentialSaleInqRs_Type", propOrder = {
    "campPotentialSaleInq"
})
public class CampPotentialSaleInqRsType
    extends SvcRsType
{

    @XmlElement(name = "CampPotentialSaleInq", namespace = "http://Messaging/customers/entities/arrangement")
    protected List<CampPotentialSaleInqType> campPotentialSaleInq;

    /**
     * Gets the value of the campPotentialSaleInq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campPotentialSaleInq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampPotentialSaleInq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampPotentialSaleInqType }
     * 
     * 
     */
    public List<CampPotentialSaleInqType> getCampPotentialSaleInq() {
        if (campPotentialSaleInq == null) {
            campPotentialSaleInq = new ArrayList<CampPotentialSaleInqType>();
        }
        return this.campPotentialSaleInq;
    }

}
