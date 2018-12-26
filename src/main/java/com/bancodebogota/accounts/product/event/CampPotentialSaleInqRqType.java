//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.accounts.product.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.customers.arrangement.v1.CampaignRuleType;
import com.bancodebogota.ifx.base.v1.SvcRqType;


/**
 * <p>Clase Java para CampPotentialSaleInqRq_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampPotentialSaleInqRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn://bancodebogota.com/ifx/base/v1/}SvcRq_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/arrangement/v1/}CampaignRule"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampPotentialSaleInqRq_Type", propOrder = {
    "campaignRule"
})
public class CampPotentialSaleInqRqType
    extends SvcRqType
{

    @XmlElement(name = "CampaignRule", namespace = "urn://bancodebogota.com/customers/arrangement/v1/", required = true)
    protected CampaignRuleType campaignRule;

    /**
     * Obtiene el valor de la propiedad campaignRule.
     * 
     * @return
     *     possible object is
     *     {@link CampaignRuleType }
     *     
     */
    public CampaignRuleType getCampaignRule() {
        return campaignRule;
    }

    /**
     * Define el valor de la propiedad campaignRule.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignRuleType }
     *     
     */
    public void setCampaignRule(CampaignRuleType value) {
        this.campaignRule = value;
    }

}
