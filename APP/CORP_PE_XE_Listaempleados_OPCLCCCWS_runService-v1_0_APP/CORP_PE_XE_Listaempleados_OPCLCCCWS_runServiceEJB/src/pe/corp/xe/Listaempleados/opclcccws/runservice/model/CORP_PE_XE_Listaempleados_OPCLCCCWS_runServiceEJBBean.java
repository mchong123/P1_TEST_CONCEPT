package pe.corp.xe.Listaempleados.opclcccws.runservice.model;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import pe.bco.utils.BCHelper;


@Stateless(name = "CORP_PE_XE_Listaempleados_OPCLCCCWS_runServiceEJB",
    mappedName = "EJB-CORP")
@TransactionManagement(TransactionManagementType.BEAN)
public class CORP_PE_XE_Listaempleados_OPCLCCCWS_runServiceEJBBean extends BCHelper implements CORP_PE_XE_Listaempleados_OPCLCCCWS_runServiceEJBRemote,
                                                                                               CORP_PE_XE_Listaempleados_OPCLCCCWS_runServiceEJBLocal {
    public CORP_PE_XE_Listaempleados_OPCLCCCWS_runServiceEJBBean() {
    }
    
    
    public void validarUsuario(String dataSource){
        
    }
    
    
    
    
    
}
