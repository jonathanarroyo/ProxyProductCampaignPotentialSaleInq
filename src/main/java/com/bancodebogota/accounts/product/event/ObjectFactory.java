//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.accounts.product.event;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancodebogota.accounts.product.event package. 
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

    private final static QName _CampPotentialSaleInqRq_QNAME = new QName("urn://bancodebogota.com/accounts/Product/event/", "CampPotentialSaleInqRq");
    private final static QName _CampPotentialSaleInqRs_QNAME = new QName("urn://bancodebogota.com/accounts/Product/event/", "CampPotentialSaleInqRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancodebogota.accounts.product.event
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CampPotentialSaleInqRqType }
     * 
     */
    public CampPotentialSaleInqRqType createCampPotentialSaleInqRqType() {
        return new CampPotentialSaleInqRqType();
    }

    /**
     * Create an instance of {@link CampPotentialSaleInqRsType }
     * 
     */
    public CampPotentialSaleInqRsType createCampPotentialSaleInqRsType() {
        return new CampPotentialSaleInqRsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampPotentialSaleInqRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/accounts/Product/event/", name = "CampPotentialSaleInqRq")
    public JAXBElement<CampPotentialSaleInqRqType> createCampPotentialSaleInqRq(CampPotentialSaleInqRqType value) {
        return new JAXBElement<CampPotentialSaleInqRqType>(_CampPotentialSaleInqRq_QNAME, CampPotentialSaleInqRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampPotentialSaleInqRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/accounts/Product/event/", name = "CampPotentialSaleInqRs")
    public JAXBElement<CampPotentialSaleInqRsType> createCampPotentialSaleInqRs(CampPotentialSaleInqRsType value) {
        return new JAXBElement<CampPotentialSaleInqRsType>(_CampPotentialSaleInqRs_QNAME, CampPotentialSaleInqRsType.class, null, value);
    }

}
