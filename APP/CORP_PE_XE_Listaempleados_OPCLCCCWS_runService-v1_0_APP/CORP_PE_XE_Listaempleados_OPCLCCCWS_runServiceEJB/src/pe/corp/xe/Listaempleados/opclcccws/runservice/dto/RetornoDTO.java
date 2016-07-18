package pe.corp.xe.Listaempleados.opclcccws.runservice.dto;

public class RetornoDTO {
    
    private String codigoRetorno;
    private String descripcion;
    
    public RetornoDTO() {
        super();
    }


    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
