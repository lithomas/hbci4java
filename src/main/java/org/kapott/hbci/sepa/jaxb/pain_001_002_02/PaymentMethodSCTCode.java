package org.kapott.hbci.sepa.jaxb.pain_001_002_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PaymentMethodSCTCode.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="PaymentMethodSCTCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodSCTCode", namespace = "urn:swift:xsd:$pain.001.002.02")
@XmlEnum
public enum PaymentMethodSCTCode {

    TRF;

    public String value() {
        return name();
    }

    public static PaymentMethodSCTCode fromValue(String v) {
        return valueOf(v);
    }

}
