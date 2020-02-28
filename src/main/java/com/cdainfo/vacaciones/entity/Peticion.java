package com.cdainfo.vacaciones.entity;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


//import com.cdainfo.vacaciones.estados.Aprobado;
//import com.cdainfo.vacaciones.estados.Iniciado;
//import com.cdainfo.vacaciones.estados.Rechazado;


@Entity
@Table(name="peticion")
public class Peticion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	//@Column(name = "empleadoid")

	public Date getDiaAlta() {
		return diaAlta;
	}

	public void setDiaAlta(Date diaAlta) {
		this.diaAlta = diaAlta;
	}

//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

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
	
	//public Integer getEmpleadoId() {
	//	return empleadoId;
	//}

	//public void setEmpleadoId(Integer empleadoId) {
		//this.empleadoId = empleadoId;
	//}

	@Override
	public String toString() {
		return "Peticion [numeroPeticion=" + numeroPeticion  + ", tipoDeLicencia="
				+ tipoDeLicencia + ", cantidadDias=" + cantidadDias + ", estado=" + estado + ", diaAlta=" + diaAlta
				+ ", diaHasta=" + diaHasta + "]";
	}



}
