//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.27 at 10:46:26 AM BST 
//


package edu.cornell.mannlib.orcidclient.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

public enum Visibility {
    PRIVATE("private"),
    LIMITED("limited"),
    PUBLIC("public"),

    REGISTERED_ONLY("registered-only");
    private final String value;

    Visibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Visibility fromValue(String v) {
        for (Visibility c: Visibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}