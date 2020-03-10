package com.cdainfo.vacaciones.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipdia")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tdnro")
    private Integer id;

    @Column(name = "tddesc")
    private String tipo;

    @Column(name = "tdlimmen")
    private Integer diasD;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getDiasD() {
        return diasD;
    }

    public void setDiasD(Integer diasD) {
        this.diasD = diasD;
    }

    @Override
    public String toString() {
        return "Licencia{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", diasD=" + diasD +
                '}';
    }
}