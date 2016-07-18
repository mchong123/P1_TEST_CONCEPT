
package pe.corp.xe.Listaempleados.opclcccws.runservice.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.corp.xe.Listaempleados.opclcccws.runservice.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _XEListaempleadosOPCLCCCWSrunServiceReqParam_QNAME = new QName("http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Req/IMPL/v2016.04", "XEListaempleadosOPCLCCCWSrunServiceReqParam");
    private final static QName _XEListaempleadosOPCLCCCWSrunServiceRespParam_QNAME = new QName("http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Resp/IMPL/v2016.04", "XEListaempleadosOPCLCCCWSrunServiceRespParam");
    private final static QName _ClientService_QNAME = new QName("http://mdwcorp.falabella.com/common/schema/clientservice", "ClientService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.corp.xe.Listaempleados.opclcccws.runservice.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE }
     * 
     */
    public XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE createXEListaempleadosOPCLCCCWSrunServiceRespParamTYPE() {
        return new XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE();
    }

    /**
     * Create an instance of {@link RetornoTYPE }
     * 
     */
    public RetornoTYPE createRetornoTYPE() {
        return new RetornoTYPE();
    }

    /**
     * Create an instance of {@link RespuestaValidacionTYPE }
     * 
     */
    public RespuestaValidacionTYPE createRespuestaValidacionTYPE() {
        return new RespuestaValidacionTYPE();
    }

    /**
     * Create an instance of {@link ClientServiceTYPE }
     * 
     */
    public ClientServiceTYPE createClientServiceTYPE() {
        return new ClientServiceTYPE();
    }

    /**
     * Create an instance of {@link XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE }
     * 
     */
    public XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE createXEListaempleadosOPCLCCCWSrunServiceReqParamTYPE() {
        return new XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Req/IMPL/v2016.04", name = "XEListaempleadosOPCLCCCWSrunServiceReqParam")
    public JAXBElement<XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE> createXEListaempleadosOPCLCCCWSrunServiceReqParam(XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE value) {
        return new JAXBElement<XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE>(_XEListaempleadosOPCLCCCWSrunServiceReqParam_QNAME, XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Resp/IMPL/v2016.04", name = "XEListaempleadosOPCLCCCWSrunServiceRespParam")
    public JAXBElement<XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE> createXEListaempleadosOPCLCCCWSrunServiceRespParam(XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE value) {
        return new JAXBElement<XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE>(_XEListaempleadosOPCLCCCWSrunServiceRespParam_QNAME, XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientServiceTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/common/schema/clientservice", name = "ClientService")
    public JAXBElement<ClientServiceTYPE> createClientService(ClientServiceTYPE value) {
        return new JAXBElement<ClientServiceTYPE>(_ClientService_QNAME, ClientServiceTYPE.class, null, value);
    }

}
