//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.creditcard.product.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancodebogota.creditcard.product.v1 package. 
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

    private final static QName _AccountStatus_QNAME = new QName("urn://bancodebogota.com/creditcard/product/v1/", "AccountStatus");
    private final static QName _Account_QNAME = new QName("urn://bancodebogota.com/creditcard/product/v1/", "Account");
    private final static QName _AccountIdFrom_QNAME = new QName("urn://bancodebogota.com/creditcard/product/v1/", "AccountIdFrom");
    private final static QName _AccountIdTo_QNAME = new QName("urn://bancodebogota.com/creditcard/product/v1/", "AccountIdTo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancodebogota.creditcard.product.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountStatusType }
     * 
     */
    public AccountStatusType createAccountStatusType() {
        return new AccountStatusType();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/creditcard/product/v1/", name = "AccountStatus")
    public JAXBElement<AccountStatusType> createAccountStatus(AccountStatusType value) {
        return new JAXBElement<AccountStatusType>(_AccountStatus_QNAME, AccountStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/creditcard/product/v1/", name = "Account")
    public JAXBElement<AccountType> createAccount(AccountType value) {
        return new JAXBElement<AccountType>(_Account_QNAME, AccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/creditcard/product/v1/", name = "AccountIdFrom")
    public JAXBElement<AccountType> createAccountIdFrom(AccountType value) {
        return new JAXBElement<AccountType>(_AccountIdFrom_QNAME, AccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/creditcard/product/v1/", name = "AccountIdTo")
    public JAXBElement<AccountType> createAccountIdTo(AccountType value) {
        return new JAXBElement<AccountType>(_AccountIdTo_QNAME, AccountType.class, null, value);
    }

}
