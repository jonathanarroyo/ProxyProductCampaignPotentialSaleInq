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
 * <p>Clase Java para BillSummAmt_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BillSummAmt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BillSummAmtId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BillSummAmtCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ShortDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BalType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CurAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillSummAmt_Type", propOrder = {
    "billSummAmtId",
    "billSummAmtCode",
    "shortDesc",
    "desc",
    "memo",
    "balType",
    "count",
    "curAmt"
})
public class BillSummAmtType {

    @XmlElement(name = "BillSummAmtId")
    protected String billSummAmtId;
    @XmlElement(name = "BillSummAmtCode")
    protected String billSummAmtCode;
    @XmlElement(name = "ShortDesc")
    protected String shortDesc;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "BalType")
    protected String balType;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "CurAmt")
    protected CurrencyAmountType curAmt;

    /**
     * 
     * 						En este campo se parametriza el identificador del resumen de factura por cantidad de moneda. 
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSummAmtId() {
        return billSummAmtId;
    }

    /**
     * Define el valor de la propiedad billSummAmtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSummAmtId(String value) {
        this.billSummAmtId = value;
    }

    /**
     * 
     * 						En este campo se parametriza el tipo de la cantidad que sería especificado en "CurAmt" usando 
     * 						una lista estándar de las cantidades faturadas que son legibles por las máquinas del cliente y 
     * 						pueden ser usadas para procesamiento interno.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSummAmtCode() {
        return billSummAmtCode;
    }

    /**
     * Define el valor de la propiedad billSummAmtCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSummAmtCode(String value) {
        this.billSummAmtCode = value;
    }

    /**
     * 
     * 						En este campo se parametriza la descripción corta del resumen de facturación.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Define el valor de la propiedad shortDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDesc(String value) {
        this.shortDesc = value;
    }

    /**
     * 
     * 						En este campo se parametriza la descripción.
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
     * 						En este campo se parametriza un elemento genérico, el uso depende del contexto, 
     * 	    				puede usarse como información adicional acerca de la transacción.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Define el valor de la propiedad memo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 
     * 						En este campo se parametriza el tipo de balance el cual puede ser balance contable, balance de apertura, 
     * 						balance de cierre, balance mínimo, balance promedio, balance disponible, saldo pendiente, salo de apertura, 
     * 						saldo de cierre, balance principal, fideicomiso, crédito disponible, Límite de Crédito, Pago final.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalType() {
        return balType;
    }

    /**
     * Define el valor de la propiedad balType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalType(String value) {
        this.balType = value;
    }

    /**
     * 
     * 						En este campo se parametriza la cantidad de balances en el resumen de facturación.
     * 					
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
     * 
     * 						En este campo se parametriza el valor monetario actual dentro del resumen de facturación.
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

}
