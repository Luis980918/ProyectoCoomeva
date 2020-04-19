package com.udea.analisis.rtf.dto;
import com.udea.analisis.rtf.constants.ValidatorConstants;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EspecialidadDto {
    private long idEspecialidad;

    private long idProfesional;

    @NotNull
    @Size(min= ValidatorConstants.MIN_SIZE_NAME, max = ValidatorConstants.MAX_SIZE_NAME, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String nombreEspecialidad;
    @Size(min=ValidatorConstants.MIN_SIZE_RSOCIAL, max = ValidatorConstants.MAX_SIZE_RSOCIAL, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String sede;
    @Size(min=ValidatorConstants.MIN_SIZE_DIRECCION, max = ValidatorConstants.MAX_SIZE_DIRECCION, message = ValidatorConstants.BAD_SIZE_DIRECCION_MESSSAGE)
    private String nombreProfesional;


    public EspecialidadDto() {
    }

    public long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public long getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(long idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public void setNombreProfesional(String nombreProfesional) {
        this.nombreProfesional = nombreProfesional;
    }
}
