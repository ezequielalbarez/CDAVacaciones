package com.cdainfo.vacaciones.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="emp_lic")
public class Peticion {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer emp_licnro;
	
	@Column(name="elcantdias")
	private Integer cantdiasxlicencia;

	@Column(name = "elfechadesde")
	private Date diaAlta;
	
	@Column(name = "elfechahasta")
	private Date diaHasta;
	
	
	@ManyToOne
	@JoinColumn(name = "empleado",
	referencedColumnName = "ternro")
	private Empleado empleadoId;

	@ManyToOne
	@JoinColumn(name = "tdnro",
	referencedColumnName = "tdnro")
	private Licencia numeroPeticion;
	

	

	public Integer getEmp_licnro() {
		return emp_licnro;
	}

	public void setEmp_licnro(Integer emp_licnro) {
		this.emp_licnro = emp_licnro;
	}

	public Integer getCantdiasxlicencia() {
		return cantdiasxlicencia;
	}

	public void setCantdiasxlicencia(Integer cantdiasxlicencia) {
		this.cantdiasxlicencia = cantdiasxlicencia;
	}

	public Date getDiaAlta() {
		return diaAlta;
	}

	public void setDiaAlta(Date diaAlta) {
		this.diaAlta = diaAlta;
	}

	public Date getDiaHasta() {
		return diaHasta;
	}

	public void setDiaHasta(Date diaHasta) {
		this.diaHasta = diaHasta;
	}

	public Integer getNumeroPeticion() {
		return numeroPeticion.getId();
	}

	public void setNumeroPeticion(Integer numeroPeticion) {
		this.numeroPeticion.setId(numeroPeticion);;
	}

	public Integer getEmpleadoId() {
		return empleadoId.getId();
	}

	public void setEmpleadoId(Integer empleadoId) {
		this.empleadoId.setId(empleadoId);
	}
	
	
}



