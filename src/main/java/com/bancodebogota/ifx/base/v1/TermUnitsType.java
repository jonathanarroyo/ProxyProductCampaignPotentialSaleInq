//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package com.bancodebogota.ifx.base.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TermUnits_Type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TermUnits_Type"&gt;
 *   &lt;restriction base="{urn://bancodebogota.com/ifx/base/v1/}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Days"/&gt;
 *     &lt;enumeration value="Weeks"/&gt;
 *     &lt;enumeration value="Months"/&gt;
 *     &lt;enumeration value="Years"/&gt;
 *     &lt;enumeration value="Indefinite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TermUnits_Type")
@XmlEnum
public enum TermUnitsType {

    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Weeks")
    WEEKS("Weeks"),
    @XmlEnumValue("Months")
    MONTHS("Months"),
    @XmlEnumValue("Years")
    YEARS("Years"),
    @XmlEnumValue("Indefinite")
    INDEFINITE("Indefinite");
    private final String value;

    TermUnitsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TermUnitsType fromValue(String v) {
        for (TermUnitsType c: TermUnitsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
