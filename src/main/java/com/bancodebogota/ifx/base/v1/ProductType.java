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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.creditcard.product.v1.AccountType;
import com.bancodebogota.customers.arrangement.v1.CampAccInfoType;


/**
 * <p>Clase Java para Product_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Product_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctDomain" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctCur" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product_Type", propOrder = {
    "productId",
    "productCode",
    "productNum",
    "acctType",
    "acctSubType",
    "acctName",
    "acctDomain",
    "acctCur"
})
@XmlSeeAlso({
    CampAccInfoType.class,
    AccountType.class
})
public class ProductType {

    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "ProductNum")
    protected String productNum;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctSubType")
    protected String acctSubType;
    @XmlElement(name = "AcctName")
    protected String acctName;
    @XmlElement(name = "AcctDomain")
    protected String acctDomain;
    @XmlElement(name = "AcctCur")
    protected String acctCur;

    /**
     * 
     * 						Número de Producto.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad productCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Define el valor de la propiedad productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Obtiene el valor de la propiedad productNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNum() {
        return productNum;
    }

    /**
     * Define el valor de la propiedad productNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNum(String value) {
        this.productNum = value;
    }

    /**
     * 
     * 						Tipo de Producto.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Define el valor de la propiedad acctType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * 
     * 						SubTipo de Producto.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSubType() {
        return acctSubType;
    }

    /**
     * Define el valor de la propiedad acctSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSubType(String value) {
        this.acctSubType = value;
    }

    /**
     * 
     * 						Nombre de Producto.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Define el valor de la propiedad acctName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * 
     * 						Dominio de Producto.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDomain() {
        return acctDomain;
    }

    /**
     * Define el valor de la propiedad acctDomain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDomain(String value) {
        this.acctDomain = value;
    }

    /**
     * 
     * 						Divisa de la cuenta o moneda de la cuenta, ésto
     * 						puede ser necesario para identificar de forma
     * 						exclusiva la cuenta, ya que muchos países
     * 						permiten que para una sola cuenta de contener
     * 						varias subcuentas, cada una en una moneda
     * 						diferente.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCur() {
        return acctCur;
    }

    /**
     * Define el valor de la propiedad acctCur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCur(String value) {
        this.acctCur = value;
    }

}
