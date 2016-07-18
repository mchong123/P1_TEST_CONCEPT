
package pe.corp.xe.Listaempleados.opclcccws.runservice.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Country_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="UY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Country_TYPE", namespace = "http://mdwcorp.falabella.com/common/schema/clientservice")
@XmlEnum
public enum CountryTYPE {

    AR,
    BR,
    CL,
    CO,
    PE,
    UY;

    public String value() {
        return name();
    }

    public static CountryTYPE fromValue(String v) {
        return valueOf(v);
    }

}
