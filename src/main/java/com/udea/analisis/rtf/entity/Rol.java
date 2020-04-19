package com.udea.analisis.rtf.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Rol")

public class Rol {
    @Id
    @GeneratedValue

    private Long id;

    @Column
    private String tipoRol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return Objects.equals(id, rol.id) &&
                Objects.equals(tipoRol, rol.tipoRol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoRol);
    }
}
