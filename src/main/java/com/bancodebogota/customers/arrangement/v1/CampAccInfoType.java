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
import com.bancodebogota.ifx.base.v1.ContactInfoType;
import com.bancodebogota.ifx.base.v1.CurrencyAmountType;
import com.bancodebogota.ifx.base.v1.IntRateInfoType;
import com.bancodebogota.ifx.base.v1.ProductStatusType;
import com.bancodebogota.ifx.base.v1.ProductType;
import com.bancodebogota.ifx.base.v1.RefInfoType;
import com.bancodebogota.ifx.base.v1.SelRangeChkNumType;


/**
 * <p>Clase Java para CampAccInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampAccInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn://bancodebogota.com/ifx/base/v1/}Product_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}LinkedAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Franchise" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ContactInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}SelRangeChkNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CardPrefId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}IntRateInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RefInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampAccInfo_Type", propOrder = {
    "acctId",
    "linkedAcct",
    "franchise",
    "contactInfo",
    "selRangeChkNum",
    "curAmt",
    "productStatus",
    "cardPrefId",
    "intRateInfo",
    "refInfo"
})
public class CampAccInfoType
    extends ProductType
{

    @XmlElement(name = "AcctId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctId;
    @XmlElement(name = "LinkedAcct", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String linkedAcct;
    @XmlElement(name = "Franchise", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String franchise;
    @XmlElement(name = "ContactInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "SelRangeChkNum", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected SelRangeChkNumType selRangeChkNum;
    @XmlElement(name = "CurAmt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType curAmt;
    @XmlElement(name = "ProductStatus", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected ProductStatusType productStatus;
    @XmlElement(name = "CardPrefId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String cardPrefId;
    @XmlElement(name = "IntRateInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected IntRateInfoType intRateInfo;
    @XmlElement(name = "RefInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected List<RefInfoType> refInfo;

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Obtiene el valor de la propiedad linkedAcct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedAcct() {
        return linkedAcct;
    }

    /**
     * Define el valor de la propiedad linkedAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedAcct(String value) {
        this.linkedAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad franchise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchise() {
        return franchise;
    }

    /**
     * Define el valor de la propiedad franchise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchise(String value) {
        this.franchise = value;
    }

    /**
     * 
     * 								Informacion de contacto punto de entrega
     * 								de informacion de la campaña.
     * 							
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
     * Obtiene el valor de la propiedad selRangeChkNum.
     * 
     * @return
     *     possible object is
     *     {@link SelRangeChkNumType }
     *     
     */
    public SelRangeChkNumType getSelRangeChkNum() {
        return selRangeChkNum;
    }

    /**
     * Define el valor de la propiedad selRangeChkNum.
     * 
     * @param value
     *     allowed object is
     *     {@link SelRangeChkNumType }
     *     
     */
    public void setSelRangeChkNum(SelRangeChkNumType value) {
        this.selRangeChkNum = value;
    }

    /**
     * 
     * 								En este campo valor del producto,tasa y
     * 								plazo aprobado asociado a la campaña.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCurAmt() {
        return curAmt;
    }

    /**
     * Define el valor de la propiedad curAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCurAmt(CurrencyAmountType value) {
        this.curAmt = value;
    }

    /**
     * 
     * 								En este campo contiene informacion del
     * 								producto asociado a a campaña.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link ProductStatusType }
     *     
     */
    public ProductStatusType getProductStatus() {
        return productStatus;
    }

    /**
     * Define el valor de la propiedad productStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatusType }
     *     
     */
    public void setProductStatus(ProductStatusType value) {
        this.productStatus = value;
    }

    /**
     * 
     * 								En este campo contiene indicador de
     * 								tarjeta de crédito realzada.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrefId() {
        return cardPrefId;
    }

    /**
     * Define el valor de la propiedad cardPrefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPrefId(String value) {
        this.cardPrefId = value;
    }

    /**
     * Obtiene el valor de la propiedad intRateInfo.
     * 
     * @return
     *     possible object is
     *     {@link IntRateInfoType }
     *     
     */
    public IntRateInfoType getIntRateInfo() {
        return intRateInfo;
    }

    /**
     * Define el valor de la propiedad intRateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateInfoType }
     *     
     */
    public void setIntRateInfo(IntRateInfoType value) {
        this.intRateInfo = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefInfoType }
     * 
     * 
     */
    public List<RefInfoType> getRefInfo() {
        if (refInfo == null) {
            refInfo = new ArrayList<RefInfoType>();
        }
        return this.refInfo;
    }

}
