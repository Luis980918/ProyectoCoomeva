package com.udea.analisis.rtf.dto;

import com.udea.analisis.rtf.constants.ValidatorConstants;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

public class CitaDto {
    private Long idCita;
    private Date fechaCita;
    private Date horaCita;
    private String lugarCita;
    private boolean estadoCita;

    @NotNull
    @Size(min= ValidatorConstants.MIN_SIZE_FECHA, max= ValidatorConstants.MAX_SIZE_FECHA, message = ValidatorConstants.BAD_SIZE_FECHA_MESSAGE )

    public CitaDto() {
    }

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Date getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Date horaCita) {
        this.horaCita = horaCita;
    }

    public String getLugarCita() {
        return lugarCita;
    }

    public void setLugarCita(String lugarCita) {
        this.lugarCita = lugarCita;
    }

    public boolean isEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(boolean estadoCita) {
        this.estadoCita = estadoCita;
    }


}
