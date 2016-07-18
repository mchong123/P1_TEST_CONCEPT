package pe.corp.xe.Listaempleados.opclcccws.runservice.dto;

public class XEListaEmpleadosResponse {
    
    private RespuestaValidacionDTO respuestaValidacion;
    private RetornoDTO retorno;
    
    
    public XEListaEmpleadosResponse() {
        super();
    }


    public void setRespuestaValidacion(RespuestaValidacionDTO respuestaValidacion) {
        this.respuestaValidacion = respuestaValidacion;
    }

    public RespuestaValidacionDTO getRespuestaValidacion() {
        return respuestaValidacion;
    }

    public void setRetorno(RetornoDTO retorno) {
        this.retorno = retorno;
    }

    public RetornoDTO getRetorno() {
        return retorno;
    }
}
