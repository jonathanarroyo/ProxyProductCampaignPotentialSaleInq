//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.customers.arrangement.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.ifx.base.v1.CreditInfoType;
import com.bancodebogota.ifx.base.v1.CurrencyAmountType;
import com.bancodebogota.ifx.base.v1.NetworkTrnInfoType;
import com.bancodebogota.ifx.base.v1.SelRangeDtType;
import com.bancodebogota.ifx.base.v1.StatusType;


/**
 * <p>Clase Java para CampaignInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampaignInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Identifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/arrangement/v1/}CampaignType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Status" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}SelRangeDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}MaxCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}NetworkTrnInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RatingId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RefType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/arrangement/v1/}CampAccInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CreditInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}OriginatorName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Income" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}LOCLimit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RemainingPmtCount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/arrangement/v1/}CampaignRuleList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignInfo_Type", propOrder = {
    "identifier",
    "campaignType",
    "desc",
    "status",
    "selRangeDt",
    "maxCurAmt",
    "networkTrnInfo",
    "ratingId",
    "refType",
    "campAccInfo",
    "creditInfo",
    "originatorName",
    "income",
    "locLimit",
    "remainingPmtCount",
    "count",
    "campaignRuleList"
})
public class CampaignInfoType {

    @XmlElement(name = "Identifier", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String identifier;
    @XmlElement(name = "CampaignType")
    protected String campaignType;
    @XmlElement(name = "Desc", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String desc;
    @XmlElement(name = "Status", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected StatusType status;
    @XmlElement(name = "SelRangeDt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected SelRangeDtType selRangeDt;
    @XmlElement(name = "MaxCurAmt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType maxCurAmt;
    @XmlElement(name = "NetworkTrnInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected NetworkTrnInfoType networkTrnInfo;
    @XmlElement(name = "RatingId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String ratingId;
    @XmlElement(name = "RefType", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String refType;
    @XmlElement(name = "CampAccInfo")
    protected List<CampAccInfoType> campAccInfo;
    @XmlElement(name = "CreditInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected List<CreditInfoType> creditInfo;
    @XmlElement(name = "OriginatorName", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String originatorName;
    @XmlElement(name = "Income", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType income;
    @XmlElement(name = "LOCLimit", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType locLimit;
    @XmlElement(name = "RemainingPmtCount", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected Long remainingPmtCount;
    @XmlElement(name = "Count", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected Long count;
    @XmlElement(name = "CampaignRuleList")
    protected CampaignRuleListType campaignRuleList;

    /**
     * 
     * 						Identificacion de la campaña.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Define el valor de la propiedad identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignType() {
        return campaignType;
    }

    /**
     * Define el valor de la propiedad campaignType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignType(String value) {
        this.campaignType = value;
    }

    /**
     * 
     * 						Descripcion campaña
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
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * 
     * 						Rango de fecha inicio y vencimiento
     * 					
     * 
     * @return
     *     possible object is
     *     {@link SelRangeDtType }
     *     
     */
    public SelRangeDtType getSelRangeDt() {
        return selRangeDt;
    }

    /**
     * Define el valor de la propiedad selRangeDt.
     * 
     * @param value
     *     allowed object is
     *     {@link SelRangeDtType }
     *     
     */
    public void setSelRangeDt(SelRangeDtType value) {
        this.selRangeDt = value;
    }

    /**
     * 
     * 						Total valor aprobado
     * 					
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getMaxCurAmt() {
        return maxCurAmt;
    }

    /**
     * Define el valor de la propiedad maxCurAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setMaxCurAmt(CurrencyAmountType value) {
        this.maxCurAmt = value;
    }

    /**
     * 
     * 						Informacion general del canal
     * 					
     * 
     * @return
     *     possible object is
     *     {@link NetworkTrnInfoType }
     *     
     */
    public NetworkTrnInfoType getNetworkTrnInfo() {
        return networkTrnInfo;
    }

    /**
     * Define el valor de la propiedad networkTrnInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkTrnInfoType }
     *     
     */
    public void setNetworkTrnInfo(NetworkTrnInfoType value) {
        this.networkTrnInfo = value;
    }

    /**
     * 
     * 						Score acierta con el que estudiaron el cliente
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingId() {
        return ratingId;
    }

    /**
     * Define el valor de la propiedad ratingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingId(String value) {
        this.ratingId = value;
    }

    /**
     * 
     * 						Score acierta con el que estudiaron el cliente
     * 					
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
     * 
     * 						Informacion de los productos asociados a la campaña
     * 					Gets the value of the campAccInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campAccInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampAccInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampAccInfoType }
     * 
     * 
     */
    public List<CampAccInfoType> getCampAccInfo() {
        if (campAccInfo == null) {
            campAccInfo = new ArrayList<CampAccInfoType>();
        }
        return this.campAccInfo;
    }

    /**
     * 
     * 						Informacion de obligaciones asociadas a la
     * 						campaña.
     * 					Gets the value of the creditInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditInfoType }
     * 
     * 
     */
    public List<CreditInfoType> getCreditInfo() {
        if (creditInfo == null) {
            creditInfo = new ArrayList<CreditInfoType>();
        }
        return this.creditInfo;
    }

    /**
     * Obtiene el valor de la propiedad originatorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorName() {
        return originatorName;
    }

    /**
     * Define el valor de la propiedad originatorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorName(String value) {
        this.originatorName = value;
    }

    /**
     * Obtiene el valor de la propiedad income.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getIncome() {
        return income;
    }

    /**
     * Define el valor de la propiedad income.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setIncome(CurrencyAmountType value) {
        this.income = value;
    }

    /**
     * Obtiene el valor de la propiedad locLimit.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getLOCLimit() {
        return locLimit;
    }

    /**
     * Define el valor de la propiedad locLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setLOCLimit(CurrencyAmountType value) {
        this.locLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad remainingPmtCount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingPmtCount() {
        return remainingPmtCount;
    }

    /**
     * Define el valor de la propiedad remainingPmtCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingPmtCount(Long value) {
        this.remainingPmtCount = value;
    }

    /**
     * Obtiene el valor de la propiedad count.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignRuleList.
     * 
     * @return
     *     possible object is
     *     {@link CampaignRuleListType }
     *     
     */
    public CampaignRuleListType getCampaignRuleList() {
        return campaignRuleList;
    }

    /**
     * Define el valor de la propiedad campaignRuleList.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignRuleListType }
     *     
     */
    public void setCampaignRuleList(CampaignRuleListType value) {
        this.campaignRuleList = value;
    }

}
