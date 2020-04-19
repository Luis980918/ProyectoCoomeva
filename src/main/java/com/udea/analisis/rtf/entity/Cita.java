package com.udea.analisis.rtf.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Date")

public class Cita {
    @Id
    @GeneratedValue

    @Column
    private Long idCita;

    @Column
    private Date fechaCita;

    @Column
    private Date horaCita;

    @Column
    private String lugarCita;

    @Column
    private boolean estadoCita;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cita cita = (Cita) o;

        return idCita != null ? idCita.equals(cita.idCita) : cita.idCita == null;
    }

    @Override
    public int hashCode() {
        return idCita != null ? idCita.hashCode() : 0;
    }

}
