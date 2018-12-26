//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.security.involvedparty.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.ifx.base.v1.PersonalIdentType;


/**
 * <p>Clase Java para CustId_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustId_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}SPName" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CustPermId" minOccurs="0"/&gt;
 *           &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CustLoginId" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CustType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}PersonalIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustId_Type", propOrder = {
    "spName",
    "custPermId",
    "custLoginId",
    "custType",
    "personalIdent"
})
public class CustIdType {

    @XmlElement(name = "SPName", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String spName;
    @XmlElement(name = "CustPermId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String custPermId;
    @XmlElement(name = "CustLoginId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String custLoginId;
    @XmlElement(name = "CustType", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String custType;
    @XmlElement(name = "PersonalIdent", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected PersonalIdentType personalIdent;

    /**
     * 
     * 						En este campo se parametriza el nombre del proveedor de servicio.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Define el valor de la propiedad spName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * 
     * 							En este campo se parametriza ID permanente del cliente, usado como una 
     * 	    					llave de base de datos para identificar de forma única un intercambio
     * 	    					financiero o cliente CSP. No puede ser modificado por el cliente.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Define el valor de la propiedad custPermId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * 
     * 							En este campo se parametriza el ID inicio sesión del cliente.
     * 							Usuario STA Campo de tres partes, el tercero  muestra el ID 
     * 							del usuario que realizó la modificación.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLoginId() {
        return custLoginId;
    }

    /**
     * Define el valor de la propiedad custLoginId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLoginId(String value) {
        this.custLoginId = value;
    }

    /**
     * 
     * 						En este campo se parametriza el tipo de cliente.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Define el valor de la propiedad custType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Obtiene el valor de la propiedad personalIdent.
     * 
     * @return
     *     possible object is
     *     {@link PersonalIdentType }
     *     
     */
    public PersonalIdentType getPersonalIdent() {
        return personalIdent;
    }

    /**
     * Define el valor de la propiedad personalIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalIdentType }
     *     
     */
    public void setPersonalIdent(PersonalIdentType value) {
        this.personalIdent = value;
    }

}
