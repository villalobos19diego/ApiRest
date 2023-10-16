package org.villalobos19.apirest.model.dto;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import java.util.Date;
import java.io.Serializable;

@Data
@ToString
@Builder
public class ClienteDto  implements Serializable {



    private Integer idCliente;
    private String  nombre;
    private String apellido;
    private String correo;
    private Date fechaRegistro;






}
