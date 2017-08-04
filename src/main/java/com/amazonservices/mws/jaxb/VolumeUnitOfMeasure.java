
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VolumeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VolumeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cubic-cm"/>
 *     &lt;enumeration value="cubic-ft"/>
 *     &lt;enumeration value="cubic-in"/>
 *     &lt;enumeration value="cubic-m"/>
 *     &lt;enumeration value="cubic-yd"/>
 *     &lt;enumeration value="cup"/>
 *     &lt;enumeration value="fluid-oz"/>
 *     &lt;enumeration value="gallon"/>
 *     &lt;enumeration value="liter"/>
 *     &lt;enumeration value="milliliter"/>
 *     &lt;enumeration value="ounce"/>
 *     &lt;enumeration value="pint"/>
 *     &lt;enumeration value="quart"/>
 *     &lt;enumeration value="liters"/>
 *     &lt;enumeration value="deciliters"/>
 *     &lt;enumeration value="centiliters"/>
 *     &lt;enumeration value="milliliters"/>
 *     &lt;enumeration value="microliters"/>
 *     &lt;enumeration value="nanoliters"/>
 *     &lt;enumeration value="picoliters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumeUnitOfMeasure")
@XmlEnum
public enum VolumeUnitOfMeasure {

    @XmlEnumValue("cubic-cm")
    CUBIC_CM("cubic-cm"),
    @XmlEnumValue("cubic-ft")
    CUBIC_FT("cubic-ft"),
    @XmlEnumValue("cubic-in")
    CUBIC_IN("cubic-in"),
    @XmlEnumValue("cubic-m")
    CUBIC_M("cubic-m"),
    @XmlEnumValue("cubic-yd")
    CUBIC_YD("cubic-yd"),
    @XmlEnumValue("cup")
    CUP("cup"),
    @XmlEnumValue("fluid-oz")
    FLUID_OZ("fluid-oz"),
    @XmlEnumValue("gallon")
    GALLON("gallon"),
    @XmlEnumValue("liter")
    LITER("liter"),
    @XmlEnumValue("milliliter")
    MILLILITER("milliliter"),
    @XmlEnumValue("ounce")
    OUNCE("ounce"),
    @XmlEnumValue("pint")
    PINT("pint"),
    @XmlEnumValue("quart")
    QUART("quart"),
    @XmlEnumValue("liters")
    LITERS("liters"),
    @XmlEnumValue("deciliters")
    DECILITERS("deciliters"),
    @XmlEnumValue("centiliters")
    CENTILITERS("centiliters"),
    @XmlEnumValue("milliliters")
    MILLILITERS("milliliters"),
    @XmlEnumValue("microliters")
    MICROLITERS("microliters"),
    @XmlEnumValue("nanoliters")
    NANOLITERS("nanoliters"),
    @XmlEnumValue("picoliters")
    PICOLITERS("picoliters");
    private final String value;

    VolumeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumeUnitOfMeasure fromValue(String v) {
        for (VolumeUnitOfMeasure c: VolumeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
