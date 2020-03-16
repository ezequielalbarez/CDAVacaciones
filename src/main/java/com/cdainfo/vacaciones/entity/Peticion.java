package com.cdainfo.vacaciones.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_lic")
public class Peticion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "emp_licnro")
	private Integer peticionId;
	
	@Column(name="elcantdias")
	private Integer cantidadDias;

	@Column(name = "elfechadesde")
	private Date fechaAlta;
	
	@Column(name = "elfechahasta")
	private Date fechaFin;
	
	@ManyToOne
	@JoinColumn(name = "empleado",
	referencedColumnName = "ternro")
	private Empleado empleadoId;

	@ManyToOne
	@JoinColumn(name = "tdnro",
	referencedColumnName = "tdnro")
	private Licencia numeroPeticion;
	

	public Integer getPeticionId() {
		return peticionId;
	}

	public void setPeticionId(Integer peticionId) {
		this.peticionId = peticionId;
	}

	public Integer getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(Integer cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Empleado getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(Empleado empleadoId) {
		this.empleadoId = empleadoId;
	}

	public Licencia getNumeroPeticion() {
		return numeroPeticion;
	}

	public void setNumeroPeticion(Licencia numeroPeticion) {
		this.numeroPeticion = numeroPeticion;
	}
}



