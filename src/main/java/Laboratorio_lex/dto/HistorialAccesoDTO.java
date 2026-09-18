package Laboratorio_lex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistorialAccesoDTO {
    private UUID id;
    private Long empleadoId;
    private String empleadoNombreCompleto;
    private Integer areaId;
    private String areaNombre;
    private String numeroDocumentoIngresado;
    private String codigoTarjetaIngresado;
    private String resultadoAcceso;
    private String motivoDenegacion;
    private OffsetDateTime timestamp;
}
