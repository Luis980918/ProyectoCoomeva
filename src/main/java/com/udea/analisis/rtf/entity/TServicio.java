package com.udea.analisis.rtf.entity;
import javax.persistence.*;


@Entity
@Table(name = "Servicios")
public class TServicio {
    @Id
    @GeneratedValue
    private Long idServicio;

    @Column
    private String nombreServicio;

    @Column
    private float costoServicio;

    @Column
    private String servicio;

    public TServicio() {
    }

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public float getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(float costoServicio) {
        this.costoServicio = costoServicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

}
