//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.customers.involvedparty.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CommercialInfoNode_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CommercialInfoNode_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BranchId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BranchName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}MainUsrInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}MktgInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/involvedparty/v1/}CommercialInfoParentNode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/involvedparty/v1/}LevelRqNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialInfoNode_Type", propOrder = {
    "name",
    "branchId",
    "branchName",
    "mainUsrInd",
    "mktgInfo",
    "commercialInfoParentNode",
    "levelRqNode"
})
public class CommercialInfoNodeType {

    @XmlElement(name = "Name", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String name;
    @XmlElement(name = "BranchId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String branchId;
    @XmlElement(name = "BranchName", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String branchName;
    @XmlElement(name = "MainUsrInd", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String mainUsrInd;
    @XmlElement(name = "MktgInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String mktgInfo;
    @XmlElement(name = "CommercialInfoParentNode")
    protected CommercialInfoParentNodeType commercialInfoParentNode;
    @XmlElement(name = "LevelRqNode")
    protected LevelRqNodeType levelRqNode;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad branchId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Define el valor de la propiedad branchId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Obtiene el valor de la propiedad branchName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Define el valor de la propiedad branchName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Obtiene el valor de la propiedad mainUsrInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainUsrInd() {
        return mainUsrInd;
    }

    /**
     * Define el valor de la propiedad mainUsrInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainUsrInd(String value) {
        this.mainUsrInd = value;
    }

    /**
     * Obtiene el valor de la propiedad mktgInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktgInfo() {
        return mktgInfo;
    }

    /**
     * Define el valor de la propiedad mktgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktgInfo(String value) {
        this.mktgInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad commercialInfoParentNode.
     * 
     * @return
     *     possible object is
     *     {@link CommercialInfoParentNodeType }
     *     
     */
    public CommercialInfoParentNodeType getCommercialInfoParentNode() {
        return commercialInfoParentNode;
    }

    /**
     * Define el valor de la propiedad commercialInfoParentNode.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialInfoParentNodeType }
     *     
     */
    public void setCommercialInfoParentNode(CommercialInfoParentNodeType value) {
        this.commercialInfoParentNode = value;
    }

    /**
     * Obtiene el valor de la propiedad levelRqNode.
     * 
     * @return
     *     possible object is
     *     {@link LevelRqNodeType }
     *     
     */
    public LevelRqNodeType getLevelRqNode() {
        return levelRqNode;
    }

    /**
     * Define el valor de la propiedad levelRqNode.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelRqNodeType }
     *     
     */
    public void setLevelRqNode(LevelRqNodeType value) {
        this.levelRqNode = value;
    }

}
