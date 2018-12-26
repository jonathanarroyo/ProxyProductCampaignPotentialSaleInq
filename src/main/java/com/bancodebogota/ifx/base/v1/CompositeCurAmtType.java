//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.ifx.base.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CompositeCurAmt_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CompositeCurAmt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CompositeCurAmtId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CompositeCurAmtType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Rate" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}MinCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}MaxCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}SpecialHandling" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Memo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeCurAmt_Type", propOrder = {
    "compositeCurAmtId",
    "compositeCurAmtType",
    "curAmt",
    "rate",
    "minCurAmt",
    "maxCurAmt",
    "specialHandling",
    "memo"
})
public class CompositeCurAmtType {

    @XmlElement(name = "CompositeCurAmtId")
    protected String compositeCurAmtId;
    @XmlElement(name = "CompositeCurAmtType")
    protected String compositeCurAmtType;
    @XmlElement(name = "CurAmt")
    protected CurrencyAmountType curAmt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "MinCurAmt")
    protected CurrencyAmountType minCurAmt;
    @XmlElement(name = "MaxCurAmt")
    protected CurrencyAmountType maxCurAmt;
    @XmlElement(name = "SpecialHandling")
    protected String specialHandling;
    @XmlElement(name = "Memo")
    protected String memo;

    /**
     * 
     * 						En este campo se parametriza el id de la cantidad de moneda compuesta, 
     * 						se utiliza en caso de que se repita dentro de un mensaje de crédito o débito.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeCurAmtId() {
        return compositeCurAmtId;
    }

    /**
     * Define el valor de la propiedad compositeCurAmtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeCurAmtId(String value) {
        this.compositeCurAmtId = value;
    }

    /**
     * 
     * 						En este campo se parametriza el tipo de la cantidad de moneda compuesta. 
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeCurAmtType() {
        return compositeCurAmtType;
    }

    /**
     * Define el valor de la propiedad compositeCurAmtType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeCurAmtType(String value) {
        this.compositeCurAmtType = value;
    }

    /**
     * 
     * 							En este campo se parametriza el valor monetario.
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
     * 							En este campo se parametriza la tasa. 
     * 						
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * 
     * 						En este campo se parametriza el valor mínimo a pagar.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getMinCurAmt() {
        return minCurAmt;
    }

    /**
     * Define el valor de la propiedad minCurAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setMinCurAmt(CurrencyAmountType value) {
        this.minCurAmt = value;
    }

    /**
     * 
     * 						En este campo se parametriza el valor máximo a pagar.
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
     * 						En éste campo se parametriza el manejo especial de la petición, el
     * 						cliente está sobreescribiendo el comportamiento por omisión del servidor.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialHandling() {
        return specialHandling;
    }

    /**
     * Define el valor de la propiedad specialHandling.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialHandling(String value) {
        this.specialHandling = value;
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

}
