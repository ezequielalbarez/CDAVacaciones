package com.cdainfo.vacaciones.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Peticion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroPeticion;

	@Column(name = "diaAlta")
	private Date diaAlta;
	
		@Column(name = "diaHasta")
	private Date diaHasta;

	@Column(name = "tipoDeLicencia")
	private String tipoDeLicencia;

	@Column(name = "cantidadDias")
	private Integer cantidadDias;

	@Column(name = "estado")
	private String estado;


	public Date getDiaAlta() {
		return diaAlta;
	}

	public void setDiaAlta(Date diaAlta) {
		this.diaAlta = diaAlta;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	public Long getNumeroPeticion() {
		return numeroPeticion;
	}

	public void setNumeroPeticion(Long numeroPeticion) {
		this.numeroPeticion = numeroPeticion;
	}

	public String getTipoDeLicencia() {
		return tipoDeLicencia;
	}

	public void setTipoDeLicencia(String tipoDeLicencia) {
		this.tipoDeLicencia = tipoDeLicencia;
	}

	public Integer getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(Integer cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	

	public Date getDiaHasta() {
		return diaHasta;
	}

	public void setDiaHasta(Date diaHasta) {
		this.diaHasta = diaHasta;
	}

	@Override
	public String toString() {
		return "Peticion [numeroPeticion=" + numeroPeticion  + ", tipoDeLicencia="
				+ tipoDeLicencia + ", cantidadDias=" + cantidadDias + ", estado=" + estado + ", diaAlta=" + diaAlta
				+ ", diaHasta=" + diaHasta + "]";
	}

	//public void tiposDePeticion() {

//	}

	//public void verEstadoDeLaPeticion() {

//	}

}
