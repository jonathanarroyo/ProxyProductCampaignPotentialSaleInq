//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.creditcard.product.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.ifx.base.v1.BankInfoType;
import com.bancodebogota.ifx.base.v1.CompositeCurAmtType;
import com.bancodebogota.ifx.base.v1.CurrencyAmountType;
import com.bancodebogota.ifx.base.v1.ProductType;


/**
 * <p>Clase Java para Account_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Account_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn://bancodebogota.com/ifx/base/v1/}Product_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}LinkedAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctPlanCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}PCTCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RatingId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BillCycle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BillCycleType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ForeignUse" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BankInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/creditcard/product/v1/}AccountStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account_Type", propOrder = {
    "acctId",
    "linkedAcct",
    "acctPlanCode",
    "pctCode",
    "ratingId",
    "effDt",
    "expDt",
    "billCycle",
    "billCycleType",
    "foreignUse",
    "curAmt",
    "bankInfo",
    "accountStatus",
    "compositeCurAmt"
})
public class AccountType
    extends ProductType
{

    @XmlElement(name = "AcctId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctId;
    @XmlElement(name = "LinkedAcct", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String linkedAcct;
    @XmlElement(name = "AcctPlanCode", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctPlanCode;
    @XmlElement(name = "PCTCode", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected List<String> pctCode;
    @XmlElement(name = "RatingId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String ratingId;
    @XmlElement(name = "EffDt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String effDt;
    @XmlElement(name = "ExpDt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String expDt;
    @XmlElement(name = "BillCycle", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String billCycle;
    @XmlElement(name = "BillCycleType", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String billCycleType;
    @XmlElement(name = "ForeignUse", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String foreignUse;
    @XmlElement(name = "CurAmt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType curAmt;
    @XmlElement(name = "BankInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected BankInfoType bankInfo;
    @XmlElement(name = "AccountStatus")
    protected AccountStatusType accountStatus;
    @XmlElement(name = "CompositeCurAmt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected List<CompositeCurAmtType> compositeCurAmt;

    /**
     * 
     * 								En este campo se parametriza el identificador de cuenta, el cual es un elemento de datos 
     * 								que contiene una serie de números y/o caracteres que identifican una cuenta de cliente. 
     * 								A veces se conoce como número de cuenta.
     * 							
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
     * 
     * 								En este campo se parametriza el tipo de cuenta, el cual es el código Identificador del 
     * 								tipo de Tarjeta solicitado, el cual define si requiere o no codeudor o amparado.
     * 							
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
     * 
     * 								En este campo se parametriza el código del plan asignado a la cuenta.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPlanCode() {
        return acctPlanCode;
    }

    /**
     * Define el valor de la propiedad acctPlanCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPlanCode(String value) {
        this.acctPlanCode = value;
    }

    /**
     * 
     * 								En este campo se parametriza el código identificador de las condiciones financieras de la cuenta.
     * 							Gets the value of the pctCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pctCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPCTCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPCTCode() {
        if (pctCode == null) {
            pctCode = new ArrayList<String>();
        }
        return this.pctCode;
    }

    /**
     * 
     * 								En este campo se parametriza el código de riesgo crediticio que la entidad 
     * 	    						le puede asignar a una cuenta, viene de FV.
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
     * 								En este campo se parametriza la fecha efectiva en la cuenta.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Define el valor de la propiedad effDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * 
     * 								En este campo se parametriza la fecha vigencia en la cuenta.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Define el valor de la propiedad expDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * 
     * 								En este campo se parametriza el ciclo de facturación, día en el cual se debe efectuar la facturación.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycle() {
        return billCycle;
    }

    /**
     * Define el valor de la propiedad billCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycle(String value) {
        this.billCycle = value;
    }

    /**
     * 
     * 								En este campo se parametriza el tipo de ciclo de facturación.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleType() {
        return billCycleType;
    }

    /**
     * Define el valor de la propiedad billCycleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleType(String value) {
        this.billCycleType = value;
    }

    /**
     * 
     * 								En este campo se parametriza el uso extranjero.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignUse() {
        return foreignUse;
    }

    /**
     * Define el valor de la propiedad foreignUse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignUse(String value) {
        this.foreignUse = value;
    }

    /**
     * 
     * 								En este campo se parametriza el valor monetario en la cuenta.
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
     * 								En este campo se parametriza la información adicional del banco usada para
     * 								identificar éste en transferencias de pago, beneficiario, es obligatoria en 
     * 								CHE, DEU, e ITA para identificar por completo una cuenta.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link BankInfoType }
     *     
     */
    public BankInfoType getBankInfo() {
        return bankInfo;
    }

    /**
     * Define el valor de la propiedad bankInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfoType }
     *     
     */
    public void setBankInfo(BankInfoType value) {
        this.bankInfo = value;
    }

    /**
     * 
     * 								Información del estado de la cuenta.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusType }
     *     
     */
    public AccountStatusType getAccountStatus() {
        return accountStatus;
    }

    /**
     * Define el valor de la propiedad accountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusType }
     *     
     */
    public void setAccountStatus(AccountStatusType value) {
        this.accountStatus = value;
    }

    /**
     * 
     * 								En este campo se parametriza la cantidad de moneda compuesta, contiene
     * 								información acerca de la cantidad y tiempo de la disponibilidad de 
     * 								fondos para una transacción.
     * 							Gets the value of the compositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     * 
     * 
     */
    public List<CompositeCurAmtType> getCompositeCurAmt() {
        if (compositeCurAmt == null) {
            compositeCurAmt = new ArrayList<CompositeCurAmtType>();
        }
        return this.compositeCurAmt;
    }

}
