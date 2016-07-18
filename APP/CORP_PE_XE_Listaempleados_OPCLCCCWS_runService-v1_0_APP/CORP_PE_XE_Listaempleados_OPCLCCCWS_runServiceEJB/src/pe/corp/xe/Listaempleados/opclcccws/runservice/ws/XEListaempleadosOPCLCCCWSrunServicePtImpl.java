package pe.corp.xe.Listaempleados.opclcccws.runservice.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

import pe.corp.xe.Listaempleados.opclcccws.runservice.dto.XEListaEmpleadosRequest;
import pe.corp.xe.Listaempleados.opclcccws.runservice.dto.XEListaEmpleadosResponse;

@WebService(name = "XEListaempleadosOPCLCCCWSrunServicePt", targetNamespace = "http://mdwcorp.falabella.com/CORP/PE/WLS/wsdl/XE/Listaempleados/OPCLCCCWS/runService/IMPL/v1.0", serviceName = "XEListaempleadosOPCLCCCWSrunServiceServicePRD", portName = "XEListaempleadosOPCLCCCWSrunServicePortPRD", wsdlLocation = "/WEB-INF/WSDL/WLS_CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_IMPL.wsdl")
@XmlSeeAlso( { ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class XEListaempleadosOPCLCCCWSrunServicePtImpl {
    public XEListaempleadosOPCLCCCWSrunServicePtImpl() {
    }

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://mdwcorp.falabella.com/CORP/PE/WLS/wsdl/XE/Listaempleados/OPCLCCCWS/runService/IMPL/v1.0/Op", output = "http://mdwcorp.falabella.com/CORP/PE/WLS/wsdl/XE/Listaempleados/OPCLCCCWS/runService/IMPL/v1.0/XEListaempleadosOPCLCCCWSrunServicePt/XEListaempleadosOPCLCCCWSrunServiceOpResponse", fault = { @FaultAction(className =
                        FaultMsg.class, value = "http://mdwcorp.falabella.com/CORP/PE/WLS/wsdl/XE/Listaempleados/OPCLCCCWS/runService/IMPL/v1.0/XEListaempleadosOPCLCCCWSrunServicePt/XEListaempleadosOPCLCCCWSrunServiceOp/Fault/FaultMsg") })
    @WebMethod(operationName = "XEListaempleadosOPCLCCCWSrunServiceOp", action = "http://mdwcorp.falabella.com/CORP/PE/WLS/wsdl/XE/Listaempleados/OPCLCCCWS/runService/IMPL/v1.0/Op")
    @WebResult(name = "XEListaempleadosOPCLCCCWSrunServiceRespParam", targetNamespace = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Resp/IMPL/v2016.04", partName = "XEListaempleadosOPCLCCCWSrunServiceRespParam")
    public XEListaempleadosOPCLCCCWSrunServiceRespParamTYPE xeListaempleadosOPCLCCCWSrunServiceOp(@WebParam(name = "XEListaempleadosOPCLCCCWSrunServiceReqParam", partName = "XEListaempleadosOPCLCCCWSrunServiceReqParam", targetNamespace = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Req/IMPL/v2016.04")
        XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE XEListaempleadosOPCLCCCWSrunServiceReqParam, @WebParam(name = "ClientService", partName = "clienteService", targetNamespace = "http://mdwcorp.falabella.com/common/schema/clientservice", header = true)
        ClientServiceTYPE clienteService) throws FaultMsg {
       
        XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE requestWS = XEListaempleadosOPCLCCCWSrunServiceReqParam;
       
        XEListaEmpleadosRequest requestDTO = new XEListaEmpleadosRequest();
        requestDTO.setUsuario(requestWS.getUsuario());
        requestDTO.setClave(requestWS.getClave());
        
        
        
        
        
        
        
        
        
        return null;
        
    }
    
    public XEListaEmpleadosRequest prepareRequest(XEListaempleadosOPCLCCCWSrunServiceReqParamTYPE requestWS){
        XEListaEmpleadosRequest requestDTO = new XEListaEmpleadosRequest();
        requestDTO.setUsuario(requestWS.getUsuario());
        requestDTO.setClave(requestWS.getClave());
    return requestDTO;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
