//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:07:19 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.BatchCustomersContractManageRequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractAgreementTypeCode1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractAgreementTypeCode1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CT00"/>
 *     &lt;enumeration value="CT01"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractAgreementTypeCode1")
@XmlEnum
public enum ContractAgreementTypeCode1 {

    @XmlEnumValue("CT00")
    CT_00("CT00"),
    @XmlEnumValue("CT01")
    CT_01("CT01");
    private final String value;

    ContractAgreementTypeCode1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContractAgreementTypeCode1 fromValue(String v) {
        for (ContractAgreementTypeCode1 c: ContractAgreementTypeCode1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}