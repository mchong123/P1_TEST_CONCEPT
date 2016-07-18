
package pe.corp.xe.Listaempleados.opclcccws.runservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XEListaempleadosOPCLCCCWSrunServiceRespParam_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XEListaempleadosOPCLCCCWSrunServiceRespParam_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaValidacion" type="{http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Resp/IMPL/v2016.04}RespuestaValidacion_TYPE" minOccurs="0"/>
 *         &lt;element name="Retorno" type="{http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Resp/IMPL/v2016.04}Retorno_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XEListaempleadosOPCLCCCWSrunServiceRespParam_TYPE", propOrder = {
    "respuestaValidacion",
    "retorno"
})
public class XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE {

    @XmlElement(name = "RespuestaValidacion")
    protected RespuestaValidacionTYPE respuestaValidacion;
    @XmlElement(name = "Retorno", required = true)
    protected RetornoTYPE retorno;

    /**
     * Gets the value of the respuestaValidacion property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaValidacionTYPE }
     *     
     */
    public RespuestaValidacionTYPE getRespuestaValidacion() {
        return respuestaValidacion;
    }

    /**
     * Sets the value of the respuestaValidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaValidacionTYPE }
     *     
     */
    public void setRespuestaValidacion(RespuestaValidacionTYPE value) {
        this.respuestaValidacion = value;
    }

    /**
     * Gets the value of the retorno property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoTYPE }
     *     
     */
    public RetornoTYPE getRetorno() {
        return retorno;
    }

    /**
     * Sets the value of the retorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoTYPE }
     *     
     */
    public void setRetorno(RetornoTYPE value) {
        this.retorno = value;
    }

}
