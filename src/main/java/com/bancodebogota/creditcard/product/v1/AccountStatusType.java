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


/**
 * <p>Clase Java para AccountStatus_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}StatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}StatusDesc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}LockId" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AccountStatus_Type", propOrder = {
    "statusCode",
    "statusDesc",
    "lockId",
    "effDt",
    "expDt"
})
public class AccountStatusType {

    @XmlElement(name = "StatusCode", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String statusCode;
    @XmlElement(name = "StatusDesc", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected List<String> statusDesc;
    @XmlElement(name = "LockId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected List<String> lockId;
    @XmlElement(name = "EffDt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String effDt;
    @XmlElement(name = "ExpDt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String expDt;

    /**
     * 
     * 						En este campo estan paramentrizados todos los posibles estados en 
     * 	    				los cuales se puede encontrar una cuenta perteneciente a la entidad.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * 
     * 						En este campo se parametriza la descripción del estado.
     * 					Gets the value of the statusDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusDesc() {
        if (statusDesc == null) {
            statusDesc = new ArrayList<String>();
        }
        return this.statusDesc;
    }

    /**
     * 
     * 						En este campo se parametriza el código de bloqueo, el cual es definido por la entidad. 
     * 	    				En este caso, el codigo de bloqueo que muestra corresponde a los bloqueos que se pueden 
     * 	    				aplicar desde oficina.
     * 					Gets the value of the lockId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lockId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLockId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLockId() {
        if (lockId == null) {
            lockId = new ArrayList<String>();
        }
        return this.lockId;
    }

    /**
     * 
     * 						En este campo se parametriza la fecha efectiva en el estado de la cuenta.
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
     * 						En este campo se parametriza la fecha vencimiento en el estado de la cuenta.
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
