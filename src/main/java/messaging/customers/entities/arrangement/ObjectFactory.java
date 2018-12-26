//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package messaging.customers.entities.arrangement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the messaging.customers.entities.arrangement package. 
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

    private final static QName _CampPotentialSaleInq_QNAME = new QName("http://Messaging/customers/entities/arrangement", "CampPotentialSaleInq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: messaging.customers.entities.arrangement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CampPotentialSaleInqType }
     * 
     */
    public CampPotentialSaleInqType createCampPotentialSaleInqType() {
        return new CampPotentialSaleInqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampPotentialSaleInqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Messaging/customers/entities/arrangement", name = "CampPotentialSaleInq")
    public JAXBElement<CampPotentialSaleInqType> createCampPotentialSaleInq(CampPotentialSaleInqType value) {
        return new JAXBElement<CampPotentialSaleInqType>(_CampPotentialSaleInq_QNAME, CampPotentialSaleInqType.class, null, value);
    }

}
