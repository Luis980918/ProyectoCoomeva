package com.udea.analisis.rtf.dto;

import com.sun.istack.internal.NotNull;
import com.udea.analisis.rtf.constants.ValidatorConstants;

import javax.validation.constraints.Size;

public class TServicioDto {

    private long idTServicio;

    @NotNull
    @Size(min= ValidatorConstants.MIN_SIZE_NAME, max = ValidatorConstants.MAX_SIZE_NAME, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String nombre;

    @Size(min= ValidatorConstants.MIN_SIZE_PRESTADOR, max = ValidatorConstants.MAX_SIZE_PRESTADOR, message = ValidatorConstants.BAD_SIZE_PRESTADOR_MESSSAGE)
    private String prestador;

    @Size(min= ValidatorConstants.MIN_SIZE_SERVICIO, max = ValidatorConstants.MAX_SIZE_SERVICIO, message = ValidatorConstants.BAD_SIZE_SERVICIO_MESSSAGE)
    private String servicio;

    public TServicioDto(){

    }

    public long getIdTServicio() {
        return idTServicio;
    }

    public void setIdTServicio(long idTServicio) {
        this.idTServicio = idTServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

}
