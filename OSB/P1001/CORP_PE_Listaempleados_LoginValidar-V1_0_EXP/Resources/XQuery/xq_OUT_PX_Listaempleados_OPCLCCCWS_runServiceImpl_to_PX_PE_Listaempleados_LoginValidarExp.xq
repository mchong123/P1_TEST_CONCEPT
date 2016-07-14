(:: pragma bea:global-element-parameter parameter="$xEListaempleadosOPCLCCCWSrunServiceRespParam1" element="ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam" location="../../../CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_v1_0_IMPL/Resources/Schemas/OSB_CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_IMPL_Resp.xsd" ::)
(:: pragma bea:global-element-return element="ns1:ListaempleadosLoginValidarRespParam" location="../Schemas/CORP_PE_OSB_Listaempleados_Login_ValidarResp.xsd" ::)

declare namespace ns1 = "http://mdwcorp.falabella.com/CORP/PE/OSB/schema/Listaempleados/Login/Validar/Resp-v2016.04";
declare namespace ns0 = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Resp/IMPL/v2016.04";
declare namespace xf = "http://tempuri.org/CORP_PE_Listaempleados_LoginValidar-V1_0_EXP/Resources/XQuery/xq_OUT_PX_Listaempleados_OPCLCCCWS_runServiceImpl_to_PX_PE_Listaempleados_LoginValidarExp/";

declare function xf:xq_OUT_PX_Listaempleados_OPCLCCCWS_runServiceImpl_to_PX_PE_Listaempleados_LoginValidarExp($xEListaempleadosOPCLCCCWSrunServiceRespParam1 as element(ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam))
    as element(ns1:ListaempleadosLoginValidarRespParam) {
        <ns1:ListaempleadosLoginValidarRespParam>
            <ns1:RespuestaValidacion>
                {
                    for $estadoUsuario in $xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:RespuestaValidacion/ns0:estadoUsuario
                    return
                        <ns1:estadoUsuario>{ data($estadoUsuario) }</ns1:estadoUsuario>
                }
            </ns1:RespuestaValidacion>
            <ns1:Retorno>
                <ns1:codigo>{ data($xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:codigo) }</ns1:codigo>
                <ns1:descripcion>{ data($xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:descripcion) }</ns1:descripcion>
            </ns1:Retorno>
        </ns1:ListaempleadosLoginValidarRespParam>
};

declare variable $xEListaempleadosOPCLCCCWSrunServiceRespParam1 as element(ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam) external;

xf:xq_OUT_PX_Listaempleados_OPCLCCCWS_runServiceImpl_to_PX_PE_Listaempleados_LoginValidarExp($xEListaempleadosOPCLCCCWSrunServiceRespParam1)
