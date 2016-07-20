xquery version "1.0" encoding "Cp1252";
(:: pragma bea:global-element-parameter parameter="$xEListaempleadosOPCLCCCWSrunServiceRespParam1" element="ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam" location="../Schemas/WLS_CORP_PE_XE_Listaempleados_OPCLCCCWS_runServiceResp_IMPL.xsd" ::)
(:: pragma  parameter="$tableError" type="xs:anyType" ::)
(:: pragma bea:global-element-return element="ns1:Fault" location="../../../UT_BCO_PE_EsquemasComunes_v1.0/Resources/Schemas/MdwCorp_Common_soapFault.xsd" ::)

declare namespace xf = "http://tempuri.org/CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_v1_0_IMPL/Resources/XQuery/xq_IN_Fault/";
declare namespace ns1 = "http://schemas.xmlsoap.org/soap/envelope/";
declare namespace ns0 = "http://mdwcorp.falabella.com/CORP/PE/WLS/schema/XE/Listaempleados/OPCLCCCWS/runService/Resp/IMPL/v2016.04";

declare function xf:xq_IN_Fault($xEListaempleadosOPCLCCCWSrunServiceRespParam1 as element(ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam),
    $tableError as element(*))
    as element(ns1:Fault) {
        <ns1:Fault>
        	{
        	let $code := data($tableError/mapeoCode[@CODESAT = $xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:codigo]/code)
        	return
        	if(normalize-space($code)) then
        	<faultcode>{$code}</faultcode>
         	else
         	<faultcode>-1</faultcode>
         	}
         	{
         	let $string := data($tableError/mapeoCode[@CODESAT = $xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:codigo]/string)
         	return
         	if(normalize-space($string)) then
         	<faultstring>{$string}</faultstring>
         	else
         	<faultstring>ERROR</faultstring>
         	}
         	{
         	let $actor := data($tableError/mapeoCode[@CODESAT = $xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:codigo]/actor)
         	return
         	if(normalize-space($actor)) then
         	<faultactor>{$actor}</faultactor>
         	else
         	<faultactor>-1</faultactor>
         	}
         	
         	<detail>{concat($xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:codigo,"-",$xEListaempleadosOPCLCCCWSrunServiceRespParam1/ns0:Retorno/ns0:descripcion)}</detail>
        </ns1:Fault>
};

declare variable $xEListaempleadosOPCLCCCWSrunServiceRespParam1 as element(ns0:XEListaempleadosOPCLCCCWSrunServiceRespParam) external;
declare variable $tableError as element(*) external;

xf:xq_IN_Fault($xEListaempleadosOPCLCCCWSrunServiceRespParam1,
    $tableError)
