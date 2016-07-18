
package pe.corp.xe.Listaempleados.opclcccws.runservice.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Channel_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Channel_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASL+"/>
 *     &lt;enumeration value="B2B"/>
 *     &lt;enumeration value="B2C"/>
 *     &lt;enumeration value="Cardif"/>
 *     &lt;enumeration value="Comercio Adherido"/>
 *     &lt;enumeration value="CRM"/>
 *     &lt;enumeration value="Fono Compras"/>
 *     &lt;enumeration value="Homy"/>
 *     &lt;enumeration value="IVR"/>
 *     &lt;enumeration value="Kiosco"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Mobile-APP"/>
 *     &lt;enumeration value="Mobile-WEB"/>
 *     &lt;enumeration value="Portal"/>
 *     &lt;enumeration value="Presencial"/>
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="Punto de Venta"/>
 *     &lt;enumeration value="SIX"/>
 *     &lt;enumeration value="UXPOS"/>
 *     &lt;enumeration value="Venta-Empresa"/>
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="Web CMR"/>
 *     &lt;enumeration value="Web-PAC"/>
 *     &lt;enumeration value="USSD"/>
 *     &lt;enumeration value="Punto de Venta"/>
 *     &lt;enumeration value="CRM"/>
 *     &lt;enumeration value="DIM"/>
 *     &lt;enumeration value="PMM"/>
 *     &lt;enumeration value="WMOS"/>
 *     &lt;enumeration value="SRX"/>
 *     &lt;enumeration value="ATG"/>
 *     &lt;enumeration value="OMS"/>
 *     &lt;enumeration value="TRL"/>
 *     &lt;enumeration value="SAB"/>
 *     &lt;enumeration value="WEB_PORTAL"/>
 *     &lt;enumeration value="BATCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Channel_TYPE", namespace = "http://mdwcorp.falabella.com/common/schema/clientservice")
@XmlEnum
public enum ChannelTYPE {

    @XmlEnumValue("ASL+")
    ASL("ASL+"),
    @XmlEnumValue("B2B")
    B_2_B("B2B"),
    @XmlEnumValue("B2C")
    B_2_C("B2C"),
    @XmlEnumValue("Cardif")
    CARDIF("Cardif"),
    @XmlEnumValue("Comercio Adherido")
    COMERCIO_ADHERIDO("Comercio Adherido"),
    CRM("CRM"),
    @XmlEnumValue("Fono Compras")
    FONO_COMPRAS("Fono Compras"),
    @XmlEnumValue("Homy")
    HOMY("Homy"),
    IVR("IVR"),
    @XmlEnumValue("Kiosco")
    KIOSCO("Kiosco"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Mobile-APP")
    MOBILE_APP("Mobile-APP"),
    @XmlEnumValue("Mobile-WEB")
    MOBILE_WEB("Mobile-WEB"),
    @XmlEnumValue("Portal")
    PORTAL("Portal"),
    @XmlEnumValue("Presencial")
    PRESENCIAL("Presencial"),
    POS("POS"),
    @XmlEnumValue("Punto de Venta")
    PUNTO_DE_VENTA("Punto de Venta"),
    SIX("SIX"),
    UXPOS("UXPOS"),
    @XmlEnumValue("Venta-Empresa")
    VENTA_EMPRESA("Venta-Empresa"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Web CMR")
    WEB_CMR("Web CMR"),
    @XmlEnumValue("Web-PAC")
    WEB_PAC("Web-PAC"),
    USSD("USSD"),
    DIM("DIM"),
    PMM("PMM"),
    WMOS("WMOS"),
    SRX("SRX"),
    ATG("ATG"),
    OMS("OMS"),
    TRL("TRL"),
    SAB("SAB"),
    WEB_PORTAL("WEB_PORTAL"),
    BATCH("BATCH");
    private final String value;

    ChannelTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelTYPE fromValue(String v) {
        for (ChannelTYPE c: ChannelTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
