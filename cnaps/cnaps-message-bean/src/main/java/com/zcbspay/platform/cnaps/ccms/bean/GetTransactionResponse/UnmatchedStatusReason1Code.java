//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:29 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.GetTransactionResponse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnmatchedStatusReason1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CMIS"/>
 *     &lt;enumeration value="DDAT"/>
 *     &lt;enumeration value="DELN"/>
 *     &lt;enumeration value="DEPT"/>
 *     &lt;enumeration value="DMON"/>
 *     &lt;enumeration value="DDEA"/>
 *     &lt;enumeration value="DQUA"/>
 *     &lt;enumeration value="CADE"/>
 *     &lt;enumeration value="SETR"/>
 *     &lt;enumeration value="DSEC"/>
 *     &lt;enumeration value="VASU"/>
 *     &lt;enumeration value="DTRA"/>
 *     &lt;enumeration value="RSPR"/>
 *     &lt;enumeration value="REPO"/>
 *     &lt;enumeration value="CLAT"/>
 *     &lt;enumeration value="RERT"/>
 *     &lt;enumeration value="REPA"/>
 *     &lt;enumeration value="REPP"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="IIND"/>
 *     &lt;enumeration value="FRAP"/>
 *     &lt;enumeration value="PLCE"/>
 *     &lt;enumeration value="PODU"/>
 *     &lt;enumeration value="FORF"/>
 *     &lt;enumeration value="REGD"/>
 *     &lt;enumeration value="RTGS"/>
 *     &lt;enumeration value="ICAG"/>
 *     &lt;enumeration value="CPCA"/>
 *     &lt;enumeration value="CHAR"/>
 *     &lt;enumeration value="IEXE"/>
 *     &lt;enumeration value="NCRR"/>
 *     &lt;enumeration value="NMAS"/>
 *     &lt;enumeration value="SAFE"/>
 *     &lt;enumeration value="DTRD"/>
 *     &lt;enumeration value="LATE"/>
 *     &lt;enumeration value="TERM"/>
 *     &lt;enumeration value="ICUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnmatchedStatusReason1Code")
@XmlEnum
public enum UnmatchedStatusReason1Code {

    CMIS,
    DDAT,
    DELN,
    DEPT,
    DMON,
    DDEA,
    DQUA,
    CADE,
    SETR,
    DSEC,
    VASU,
    DTRA,
    RSPR,
    REPO,
    CLAT,
    RERT,
    REPA,
    REPP,
    PHYS,
    IIND,
    FRAP,
    PLCE,
    PODU,
    FORF,
    REGD,
    RTGS,
    ICAG,
    CPCA,
    CHAR,
    IEXE,
    NCRR,
    NMAS,
    SAFE,
    DTRD,
    LATE,
    TERM,
    ICUS;

    public String value() {
        return name();
    }

    public static UnmatchedStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}