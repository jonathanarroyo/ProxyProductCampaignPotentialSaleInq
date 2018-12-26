//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.ifx.base.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreditInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreditInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CreditAuthType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CreditType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CreditAuthId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CreditId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ClientChgCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ExpDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditInfo_Type", propOrder = {
    "creditAuthType",
    "creditType",
    "compositeCurAmt",
    "creditAuthId",
    "creditId",
    "clientChgCode",
    "effDt",
    "expDt"
})
public class CreditInfoType {

    @XmlElement(name = "CreditAuthType")
    protected String creditAuthType;
    @XmlElement(name = "CreditType")
    protected String creditType;
    @XmlElement(name = "CompositeCurAmt")
    protected List<CompositeCurAmtType> compositeCurAmt;
    @XmlElement(name = "CreditAuthId")
    protected String creditAuthId;
    @XmlElement(name = "CreditId")
    protected String creditId;
    @XmlElement(name = "ClientChgCode")
    protected String clientChgCode;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;

    /**
     * 
     * 						En este campo se parametriza el tipo de autorización de crédito para la transacción,
     * 						los valores definidos son UnverifiedCashDeposit, VerifiedCashDeposit, UnverifiedCheckDeposit, 
     * 						VerifiedCheckDeposit, EnvelopeDeposit, MultiDeposit, MerchandiseReturn, ChkPayment,ChkCash.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthType() {
        return creditAuthType;
    }

    /**
     * Define el valor de la propiedad creditAuthType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthType(String value) {
        this.creditAuthType = value;
    }

    /**
     * 
     * 						En este campo se parametriza el tipo de transacción de crédito, los valores definidos son
     * 						UnverifiedCashDeposit, VerifiedCashDeposit, UnverifiedCheckDeposit, VerifiedCheckDeposit, 
     * 						EnvelopeDeposit, MultiDeposit, MerchandiseReturn, ChkPayment,ChkCash.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditType() {
        return creditType;
    }

    /**
     * Define el valor de la propiedad creditType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditType(String value) {
        this.creditType = value;
    }

    /**
     * 
     * 						En este campo se parametriza la cantidad de moneda compuesta, contiene información 
     * 						acerca de la cantidad y tiempo de la disponibilidad de fondos para una transacción.
     * 					Gets the value of the compositeCurAmt property.
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

    /**
     * 
     * 						En este campo se parametriza identificador para la autorización de Crédito. Asignado 
     * 						por el servidor en el momento de la autorización del crédito se agrega por primera vez. 
     * 						Esto se utiliza para relacionar un crédito autorizado con anterioridad a la autorización 
     * 						del crédito objeto
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthId() {
        return creditAuthId;
    }

    /**
     * Define el valor de la propiedad creditAuthId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthId(String value) {
        this.creditAuthId = value;
    }

    /**
     * 
     * 						En este campo se parametriza el identificador de crédito. 
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditId() {
        return creditId;
    }

    /**
     * Define el valor de la propiedad creditId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditId(String value) {
        this.creditId = value;
    }

    /**
     * 
     * 						En este campo se parametriza el código cambio del cliente, indica la razón de porque un crédito 
     * 						fue para cantidades diferentes de la autorización original para el crédito. Los valores definidos 
     * 						son None, ConsumerCancelled, TerminalExceptionAmountKnown, TerminalExceptionAmountUnknown, 
     * 						ConsumerExceptionAmountKnown, ConsumerExceptionAmountUnknown, ConsumerDeclined, ConsumerTimeout.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientChgCode() {
        return clientChgCode;
    }

    /**
     * Define el valor de la propiedad clientChgCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientChgCode(String value) {
        this.clientChgCode = value;
    }

    /**
     * 
     * 						En este campo se parametriza la fecha efectiva en el crédito.
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
     * 						En este campo se parametriza la fecha de vencimiento en el crédito.
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

}
