
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CardReaderInterfaceTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CardReaderInterfaceTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="firewire_1600"/>
 *     &lt;enumeration value="firewire_3200"/>
 *     &lt;enumeration value="firewire_400"/>
 *     &lt;enumeration value="firewire_800"/>
 *     &lt;enumeration value="firewire_esata"/>
 *     &lt;enumeration value="usb1.0"/>
 *     &lt;enumeration value="usb1.1"/>
 *     &lt;enumeration value="usb2.0"/>
 *     &lt;enumeration value="usb3.0"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardReaderInterfaceTypeValues")
@XmlEnum
public enum CardReaderInterfaceTypeValues {

    @XmlEnumValue("firewire_1600")
    FIREWIRE_1600("firewire_1600"),
    @XmlEnumValue("firewire_3200")
    FIREWIRE_3200("firewire_3200"),
    @XmlEnumValue("firewire_400")
    FIREWIRE_400("firewire_400"),
    @XmlEnumValue("firewire_800")
    FIREWIRE_800("firewire_800"),
    @XmlEnumValue("firewire_esata")
    FIREWIRE_ESATA("firewire_esata"),
    @XmlEnumValue("usb1.0")
    USB_1_0("usb1.0"),
    @XmlEnumValue("usb1.1")
    USB_1_1("usb1.1"),
    @XmlEnumValue("usb2.0")
    USB_2_0("usb2.0"),
    @XmlEnumValue("usb3.0")
    USB_3_0("usb3.0");
    private final String value;

    CardReaderInterfaceTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardReaderInterfaceTypeValues fromValue(String v) {
        for (CardReaderInterfaceTypeValues c: CardReaderInterfaceTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}