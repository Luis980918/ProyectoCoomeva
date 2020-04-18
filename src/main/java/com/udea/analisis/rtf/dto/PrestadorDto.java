package com.udea.analisis.rtf.dto;

import com.udea.analisis.rtf.constants.ValidatorConstants;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PrestadorDto {
    private long idPrestador;

    @NotNull
    @Size(min= ValidatorConstants.MIN_SIZE_NAME, max = ValidatorConstants.MAX_SIZE_NAME, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String nombre;
    @Size(min= ValidatorConstants.MIN_SIZE_RSOCIAL, max = ValidatorConstants.MAX_SIZE_RSOCIAL, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String rSocial;
    @Size(min= ValidatorConstants.MIN_SIZE_DIRECCION, max = ValidatorConstants.MAX_SIZE_DIRECCION, message = ValidatorConstants.BAD_SIZE_DIRECCION_MESSSAGE)
    private String direccion;
    @Size(min= ValidatorConstants.MIN_SIZE_SERVICIO, max = ValidatorConstants.MAX_SIZE_SERVICIO, message = ValidatorConstants.BAD_SIZE_SERVICIO_MESSSAGE)
    private String servicio;
    @Size(min= ValidatorConstants.MIN_SIZE_SEDES, max = ValidatorConstants.MAX_SIZE_SEDES, message = ValidatorConstants.BAD_SIZE_SEDES_MESSSAGE)
    private String sedes;
    @Size(min= ValidatorConstants.MIN_SIZE_PRESTADOR, max = ValidatorConstants.MAX_SIZE_PRESTADOR, message = ValidatorConstants.BAD_SIZE_PRESTADOR_MESSSAGE)
    private String prestador;

    public PrestadorDto() {
    }

    public long getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(long idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getrSocial() {
        return rSocial;
    }

    public void setrSocial(String rSocial) {
        this.rSocial = rSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getSedes() {
        return sedes;
    }

    public void setSedes(String sedes) {
        this.sedes = sedes;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }
}
