package com.udea.analisis.rtf.entity;

import javax.persistence.*;

@Entity
@Table(name="Userp")
public class Prestador {

    @Id
    @GeneratedValue
    private Long nit;

    @Column
    private String nombre;

    @Column
    private String direccion;

    @Column
    private String telefono;

    @Column
    private String servicio;

    @Column
    private String sedes;

    public Prestador() {
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

}
