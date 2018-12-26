//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.26 a las 03:12:53 PM COT 
//


package messaging.customers.entities.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bancodebogota.ifx.base.v1.CurrencyAmountType;
import com.bancodebogota.ifx.base.v1.TermType;


/**
 * <p>Clase Java para ProductPotentialSale_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductPotentialSale_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctDomain" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RefId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}BalAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CashAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Amt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}EndDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CloseDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Rate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RateInfoType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Sales" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Indicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Observation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPotentialSale_Type", propOrder = {
    "productNum",
    "acctDomain",
    "productId",
    "refId",
    "balAmt",
    "cashAmt",
    "amt",
    "endDt",
    "productCode",
    "desc",
    "statusDesc",
    "closeDt",
    "rate",
    "rateInfoType",
    "term",
    "sales",
    "curAmt",
    "indicator",
    "observation"
})
public class ProductPotentialSaleType {

    @XmlElement(name = "ProductNum", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected List<String> productNum;
    @XmlElement(name = "AcctDomain", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctDomain;
    @XmlElement(name = "ProductId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String productId;
    @XmlElement(name = "RefId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String refId;
    @XmlElement(name = "BalAmt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType balAmt;
    @XmlElement(name = "CashAmt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType cashAmt;
    @XmlElement(name = "Amt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected List<BigDecimal> amt;
    @XmlElement(name = "EndDt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String endDt;
    @XmlElement(name = "ProductCode", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String productCode;
    @XmlElement(name = "Desc", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String desc;
    @XmlElement(name = "StatusDesc", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String statusDesc;
    @XmlElement(name = "CloseDt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closeDt;
    @XmlElement(name = "Rate", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected BigDecimal rate;
    @XmlElement(name = "RateInfoType", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String rateInfoType;
    @XmlElement(name = "Term", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected TermType term;
    @XmlElement(name = "Sales", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType sales;
    @XmlElement(name = "CurAmt", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected CurrencyAmountType curAmt;
    @XmlElement(name = "Indicator", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String indicator;
    @XmlElement(name = "Observation", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String observation;

    /**
     * Gets the value of the productNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductNum() {
        if (productNum == null) {
            productNum = new ArrayList<String>();
        }
        return this.productNum;
    }

    /**
     * Obtiene el valor de la propiedad acctDomain.
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
     * Obtiene el valor de la propiedad productId.
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
     * Obtiene el valor de la propiedad refId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Define el valor de la propiedad refId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Obtiene el valor de la propiedad balAmt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getBalAmt() {
        return balAmt;
    }

    /**
     * Define el valor de la propiedad balAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setBalAmt(CurrencyAmountType value) {
        this.balAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad cashAmt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCashAmt() {
        return cashAmt;
    }

    /**
     * Define el valor de la propiedad cashAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCashAmt(CurrencyAmountType value) {
        this.cashAmt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getAmt() {
        if (amt == null) {
            amt = new ArrayList<BigDecimal>();
        }
        return this.amt;
    }

    /**
     * Obtiene el valor de la propiedad endDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Define el valor de la propiedad endDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
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
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Define el valor de la propiedad statusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad closeDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDt() {
        return closeDt;
    }

    /**
     * Define el valor de la propiedad closeDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDt(XMLGregorianCalendar value) {
        this.closeDt = value;
    }

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Obtiene el valor de la propiedad rateInfoType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateInfoType() {
        return rateInfoType;
    }

    /**
     * Define el valor de la propiedad rateInfoType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateInfoType(String value) {
        this.rateInfoType = value;
    }

    /**
     * Obtiene el valor de la propiedad term.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Define el valor de la propiedad term.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Obtiene el valor de la propiedad sales.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getSales() {
        return sales;
    }

    /**
     * Define el valor de la propiedad sales.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setSales(CurrencyAmountType value) {
        this.sales = value;
    }

    /**
     * Obtiene el valor de la propiedad curAmt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCurAmt() {
        return curAmt;
    }

    /**
     * Define el valor de la propiedad curAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCurAmt(CurrencyAmountType value) {
        this.curAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad indicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Define el valor de la propiedad indicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Obtiene el valor de la propiedad observation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Define el valor de la propiedad observation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservation(String value) {
        this.observation = value;
    }

}
