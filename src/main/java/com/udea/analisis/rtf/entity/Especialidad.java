package com.udea.analisis.rtf.entity;

import javax.persistence.*;

@Entity
@Table(name="Especialidad")
public class Especialidad {
    @Id
    @GeneratedValue
    private long especialidad;

    @Column
    private String nombreEspecialidad;

    @Column
    private String sedes;

    @Column
    private Long idProfesional;

    @Column
    private String nombreProfesional;

    public long getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(long especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getSedes() {
        return sedes;
    }

    public void setSedes(String sedes) {
        this.sedes = sedes;
    }

    public Long getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(Long idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public void setNombreProfesional(String nombreProfesional) {
        this.nombreProfesional = nombreProfesional;
    }
}