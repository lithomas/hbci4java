package org.kapott.hbci.sepa.jaxb.pain_002_002_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ServiceLevelSEPACode.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ServiceLevelSEPACode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEPA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceLevelSEPACode", namespace = "urn:swift:xsd:$pain.002.002.02")
@XmlEnum
public enum ServiceLevelSEPACode {

    SEPA;

    public String value() {
        return name();
    }

    public static ServiceLevelSEPACode fromValue(String v) {
        return valueOf(v);
    }

}
