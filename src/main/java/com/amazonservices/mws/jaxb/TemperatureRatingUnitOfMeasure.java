
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TemperatureRatingUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TemperatureRatingUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="degrees-celsius"/>
 *     &lt;enumeration value="degrees-fahrenheit"/>
 *     &lt;enumeration value="kelvin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemperatureRatingUnitOfMeasure")
@XmlEnum
public enum TemperatureRatingUnitOfMeasure {

    @XmlEnumValue("degrees-celsius")
    DEGREES_CELSIUS("degrees-celsius"),
    @XmlEnumValue("degrees-fahrenheit")
    DEGREES_FAHRENHEIT("degrees-fahrenheit"),
    @XmlEnumValue("kelvin")
    KELVIN("kelvin");
    private final String value;

    TemperatureRatingUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemperatureRatingUnitOfMeasure fromValue(String v) {
        for (TemperatureRatingUnitOfMeasure c: TemperatureRatingUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
