//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.customers.arrangement.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancodebogota.customers.arrangement.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CampaignInfoList_QNAME = new QName("urn://bancodebogota.com/customers/arrangement/v1/", "CampaignInfoList");
    private final static QName _CampaignInfo_QNAME = new QName("urn://bancodebogota.com/customers/arrangement/v1/", "CampaignInfo");
    private final static QName _CampaignRuleList_QNAME = new QName("urn://bancodebogota.com/customers/arrangement/v1/", "CampaignRuleList");
    private final static QName _CampaignRule_QNAME = new QName("urn://bancodebogota.com/customers/arrangement/v1/", "CampaignRule");
    private final static QName _CampaignType_QNAME = new QName("urn://bancodebogota.com/customers/arrangement/v1/", "CampaignType");
    private final static QName _CampAccInfo_QNAME = new QName("urn://bancodebogota.com/customers/arrangement/v1/", "CampAccInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancodebogota.customers.arrangement.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CampaignInfoListType }
     * 
     */
    public CampaignInfoListType createCampaignInfoListType() {
        return new CampaignInfoListType();
    }

    /**
     * Create an instance of {@link CampaignInfoType }
     * 
     */
    public CampaignInfoType createCampaignInfoType() {
        return new CampaignInfoType();
    }

    /**
     * Create an instance of {@link CampaignRuleListType }
     * 
     */
    public CampaignRuleListType createCampaignRuleListType() {
        return new CampaignRuleListType();
    }

    /**
     * Create an instance of {@link CampaignRuleType }
     * 
     */
    public CampaignRuleType createCampaignRuleType() {
        return new CampaignRuleType();
    }

    /**
     * Create an instance of {@link CampAccInfoType }
     * 
     */
    public CampAccInfoType createCampAccInfoType() {
        return new CampAccInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignInfoListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/arrangement/v1/", name = "CampaignInfoList")
    public JAXBElement<CampaignInfoListType> createCampaignInfoList(CampaignInfoListType value) {
        return new JAXBElement<CampaignInfoListType>(_CampaignInfoList_QNAME, CampaignInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/arrangement/v1/", name = "CampaignInfo")
    public JAXBElement<CampaignInfoType> createCampaignInfo(CampaignInfoType value) {
        return new JAXBElement<CampaignInfoType>(_CampaignInfo_QNAME, CampaignInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignRuleListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/arrangement/v1/", name = "CampaignRuleList")
    public JAXBElement<CampaignRuleListType> createCampaignRuleList(CampaignRuleListType value) {
        return new JAXBElement<CampaignRuleListType>(_CampaignRuleList_QNAME, CampaignRuleListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/arrangement/v1/", name = "CampaignRule")
    public JAXBElement<CampaignRuleType> createCampaignRule(CampaignRuleType value) {
        return new JAXBElement<CampaignRuleType>(_CampaignRule_QNAME, CampaignRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/arrangement/v1/", name = "CampaignType")
    public JAXBElement<String> createCampaignType(String value) {
        return new JAXBElement<String>(_CampaignType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampAccInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/arrangement/v1/", name = "CampAccInfo")
    public JAXBElement<CampAccInfoType> createCampAccInfo(CampAccInfoType value) {
        return new JAXBElement<CampAccInfoType>(_CampAccInfo_QNAME, CampAccInfoType.class, null, value);
    }

}
