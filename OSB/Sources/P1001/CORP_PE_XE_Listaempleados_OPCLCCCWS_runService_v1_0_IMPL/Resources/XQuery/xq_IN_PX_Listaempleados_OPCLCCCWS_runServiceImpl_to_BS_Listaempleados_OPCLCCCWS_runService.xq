(:: pragma bea:global-element-parameter parameter="$xEListaempleadosOPCLCCCWSrunServiceReqParam1" element="ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam" location="../Schemas/OSB_CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_IMPL_Req.xsd" ::)
(:: pragma bea:global-element-return element="ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam" location="../Schemas/WLS_CORP_PE_XE_Listaempleados_OPCLCCCWS_runServiceReq_IMPL.xsd" ::)

declare namespace ns0 = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Req/IMPL/v2016.04";
declare namespace xf = "http://tempuri.org/CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_v1_0_IMPL/Resources/XQuery/xq_IN_PX_Listaempleados_OPCLCCCWS_runServiceImpl_to_BS_Listaempleados_OPCLCCCWS_runService/";

declare function xf:xq_IN_PX_Listaempleados_OPCLCCCWS_runServiceImpl_to_BS_Listaempleados_OPCLCCCWS_runService($xEListaempleadosOPCLCCCWSrunServiceReqParam1 as element(ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam))
    as element(ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam) {
        <ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam>
            <ns0:usuario>{ data($xEListaempleadosOPCLCCCWSrunServiceReqParam1/ns0:usuario) }</ns0:usuario>
            <ns0:clave>{ data($xEListaempleadosOPCLCCCWSrunServiceReqParam1/ns0:clave) }</ns0:clave>
        </ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam>
};

declare variable $xEListaempleadosOPCLCCCWSrunServiceReqParam1 as element(ns0:XEListaempleadosOPCLCCCWSrunServiceReqParam) external;

xf:xq_IN_PX_Listaempleados_OPCLCCCWS_runServiceImpl_to_BS_Listaempleados_OPCLCCCWS_runService($xEListaempleadosOPCLCCCWSrunServiceReqParam1)
