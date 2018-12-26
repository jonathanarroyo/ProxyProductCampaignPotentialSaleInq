//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.customers.condition.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancodebogota.customers.condition.v1 package. 
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

    private final static QName _Flag_QNAME = new QName("urn://bancodebogota.com/customers/condition/v1/", "Flag");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancodebogota.customers.condition.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlagType }
     * 
     */
    public FlagType createFlagType() {
        return new FlagType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlagType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/condition/v1/", name = "Flag")
    public JAXBElement<FlagType> createFlag(FlagType value) {
        return new JAXBElement<FlagType>(_Flag_QNAME, FlagType.class, null, value);
    }

}
