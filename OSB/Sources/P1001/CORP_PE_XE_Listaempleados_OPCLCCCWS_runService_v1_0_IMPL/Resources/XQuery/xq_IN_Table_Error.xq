xquery version "1.0" encoding "Cp1252";
(:: pragma  type="xs:anyType" ::)

declare namespace xf = "http://tempuri.org/CORP_PE_XE_Listaempleados_OPCLCCCWS_runService_v1_0_IMPL/Resources/XQuery/xq_IN_Table_Error/";

declare function xf:xq_IN_Table_Error()
as element(*) {
 <tableError>   
    <mapeoCode CODESAT = "000">
    	<code>P1001</code>
    	<string>CONSULTA EXITOSA</string>
    	<actor>SEGURIDAD</actor>
    </mapeoCode>
    
    <mapeoCode CODESAT = "200">
    	<code>P1001</code>
    	<string>NO SE ENCONTRARON DATOS</string>
    	<actor>SEGURIDAD</actor>
    </mapeoCode>
 </tableError>
};


xf:xq_IN_Table_Error()
