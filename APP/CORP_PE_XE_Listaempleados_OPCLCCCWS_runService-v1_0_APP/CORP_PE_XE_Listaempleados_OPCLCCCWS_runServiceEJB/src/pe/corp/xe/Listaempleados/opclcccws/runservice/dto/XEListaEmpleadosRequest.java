package pe.corp.xe.Listaempleados.opclcccws.runservice.dto;

public class XEListaEmpleadosRequest {
    
    private String usuario;
    private String clave;
    
    public XEListaEmpleadosRequest() {
        super();
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }
}
