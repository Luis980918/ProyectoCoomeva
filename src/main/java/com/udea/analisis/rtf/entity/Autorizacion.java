package com.udea.analisis.rtf.entity;

import javax.persistence.*;

@Entity
@Table(name="Autorizacion")
public class Autorizacion {
    @Id
    @GeneratedValue
    private long autorizacion;

    @Column
    private long idorden;

    @Column
    private long idProfesional;

    @Column
    private long idCita;



    @Column
    private String nombreUsuario;

    @Column
    private String nombreProfesional;

    @Column
    private String razonSocial;

    @Column
    private String sede;

    @Column
    private String direccion;

    @Column
    private String tServicio;

    public long getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(long autorizacion) {
        this.autorizacion = autorizacion;
    }

    public long getIdorden() {
        return idorden;
    }

    public void setIdorden(long idorden) {
        this.idorden = idorden;
    }

    public long getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(long idProfesional) {
        this.idProfesional = idProfesional;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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

    public String gettServicio() {
        return tServicio;
    }

    public void settServicio(String tServicio) {
        this.tServicio = tServicio;
    }

}
