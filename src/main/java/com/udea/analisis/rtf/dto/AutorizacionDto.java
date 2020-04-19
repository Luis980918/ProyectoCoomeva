package com.udea.analisis.rtf.dto;
import com.udea.analisis.rtf.constants.ValidatorConstants;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AutorizacionDto {
    private long idAutorizacion;
    private long idOrden;
    private long idCita;

    @NotNull

    @Size(min=ValidatorConstants.MIN_SIZE_NAME, max= ValidatorConstants.MAX_SIZE_NAME, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String nombreUsuario;
    @Size(min=ValidatorConstants.MIN_SIZE_NAME, max= ValidatorConstants.MAX_SIZE_NAME, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String nombreProfesional;
    @Size(min=ValidatorConstants.MIN_SIZE_RSOCIAL, max = ValidatorConstants.MAX_SIZE_RSOCIAL, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String rSocial;
    @Size(min=ValidatorConstants.MIN_SIZE_SEDES, max = ValidatorConstants.MAX_SIZE_SEDES, message = ValidatorConstants.BAD_SIZE_SEDES_MESSSAGE)
    private String sede;
    @Size(min=ValidatorConstants.MIN_SIZE_DIRECCION, max = ValidatorConstants.MAX_SIZE_DIRECCION, message = ValidatorConstants.BAD_SIZE_DIRECCION_MESSSAGE)
    private String direccion;
    @Size(min=ValidatorConstants.MIN_SIZE_TSERVICIO, max = ValidatorConstants.MAX_SIZE_TSERVICIO, message = ValidatorConstants.BAD_SIZE_TSERVICIO_MESSSAGE)
    private String tservicio;

    public AutorizacionDto() {
    }

    public long getIdAutorizacion() {
        return idAutorizacion;
    }

    public void setIdAutorizacion(long idAutorizacion) {
        this.idAutorizacion = idAutorizacion;
    }

    public long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(long idOrden) {
        this.idOrden = idOrden;
    }

    public long getIdCita() {
        return idCita;
    }

    public void setIdCita(long idCita) {
        this.idCita = idCita;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public void setNombreProfesional(String nombreProfesional) {
        this.nombreProfesional = nombreProfesional;
    }

    public String getrSocial() {
        return rSocial;
    }

    public void setrSocial(String rSocial) {
        this.rSocial = rSocial;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTservicio() {
        return tservicio;
    }

    public void setTservicio(String tservicio) {
        this.tservicio = tservicio;
    }

}
