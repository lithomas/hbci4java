package org.kapott.hbci.sepa.jaxb.pain_001_001_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PaymentIdentification1 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentIdentification1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrId" type="{urn:sepade:xsd:pain.001.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="EndToEndId" type="{urn:sepade:xsd:pain.001.001.02}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification1", namespace = "urn:sepade:xsd:pain.001.001.02", propOrder = { "instrId", "endToEndId" })
public class PaymentIdentification1 {

    @XmlElement(name = "InstrId", namespace = "urn:sepade:xsd:pain.001.001.02")
    protected String instrId;
    @XmlElement(name = "EndToEndId", namespace = "urn:sepade:xsd:pain.001.001.02", required = true)
    protected String endToEndId;

    /**
     * Gets the value of the instrId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

}
