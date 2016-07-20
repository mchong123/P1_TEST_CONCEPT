(:: pragma bea:global-element-parameter parameter="$listaempleadosLoginValidarReqParam1" element="ns1:ListaempleadosLoginValidarReqParam" location="../Schemas/CORP_PE_OSB_Listaempleados_Login_ValidarReq.xsd" ::)
(:: pragma bea:global-element-return element="ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam" location="../../../CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_v1_0_IMPL/Resources/Schemas/OSB_CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_IMPL_Req.xsd" ::)

declare namespace ns1 = "http://mdwcorp.falabella.com/CORP/PE/OSB/schema/Listaempleados/Login/Validar/Req-v2016.04";
declare namespace ns0 = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Req/IMPL/v2016.04";
declare namespace xf = "http://tempuri.org/CORP_PE_Listaempleados_LoginValidar-V1_0_EXP/Resources/XQuery/xq_IN_PX_PE_Listaempleados_LoginValidarExp_to_PX_Listaempleados_OPCLCCCWS_runServiceImpl/";

declare function xf:xq_IN_PX_PE_Listaempleados_LoginValidarExp_to_PX_Listaempleados_OPCLCCCWS_runServiceImpl($listaempleadosLoginValidarReqParam1 as element(ns1:ListaempleadosLoginValidarReqParam))
    as element(ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam) {
        <ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam>
            <ns0:usuario>{ data($listaempleadosLoginValidarReqParam1/ns1:usuario) }</ns0:usuario>
            <ns0:clave>{ data($listaempleadosLoginValidarReqParam1/ns1:clave) }</ns0:clave>
        </ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam>
};

declare variable $listaempleadosLoginValidarReqParam1 as element(ns1:ListaempleadosLoginValidarReqParam) external;

xf:xq_IN_PX_PE_Listaempleados_LoginValidarExp_to_PX_Listaempleados_OPCLCCCWS_runServiceImpl($listaempleadosLoginValidarReqParam1)
