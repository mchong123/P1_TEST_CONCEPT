(:: pragma bea:global-element-parameter parameter="$xEListaempleadosOPCLCCCWSrunServiceRespParam1" element="ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam" location="../Schemas/WLS_CORP_PE_XE_Listaempleados_OPCLCCCWS_runServiceResp_IMPL.xsd" ::)
(:: pragma bea:global-element-return element="ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam" location="../Schemas/OSB_CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_IMPL_Resp.xsd" ::)

declare namespace ns0 = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Resp/IMPL/v2016.04";
declare namespace xf = "http://tempuri.org/CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_v1_0_IMPL/Resources/XQuery/xq_OUT_BS_Listaempleados_OPCLCCCWS_runService_to_PX_Listaempleados_OPCLCCCWS_runServiceImpl/";

declare function xf:xq_OUT_BS_Listaempleados_OPCLCCCWS_runService_to_PX_Listaempleados_OPCLCCCWS_runServiceImpl($xEListaempleadosOPCLCCCWSrunServiceRespParam1 as element(ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam))
    as element(ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam) {
        <ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam>
            <ns0:RespuestaValidacion>
                {
                    for $estadoUsuario in $xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:RespuestaValidacion/ns0:estadoUsuario
                    return
                        <ns0:estadoUsuario>{ data($estadoUsuario) }</ns0:estadoUsuario>
                }
            </ns0:RespuestaValidacion>
            <ns0:Retorno>
                <ns0:codigo>{ data($xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:codigo) }</ns0:codigo>
                <ns0:descripcion>{ data($xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:descripcion) }</ns0:descripcion>
            </ns0:Retorno>
        </ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam>
};

declare variable $xEListaempleadosOPCLCCCWSrunServiceRespParam1 as element(ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam) external;

xf:xq_OUT_BS_Listaempleados_OPCLCCCWS_runService_to_PX_Listaempleados_OPCLCCCWS_runServiceImpl($xEListaempleadosOPCLCCCWSrunServiceRespParam1)
