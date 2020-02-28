package com.cdainfo.vacaciones.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado  {
	
	@Id
	@Column(name="ternro")
	private Integer id;
	
	@Column(name="empemail")
	private String email;
	
	@Column(name="ternom")
	private String nombre;
	
	@Column(name="terape")
	private String apellido;
	
	@Column(name="empreporta")
	private Integer lider;

	public Integer getLider() {
		return lider;
	}

	public void setLider(Integer lider) {
		this.lider = lider;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ",email=" + email + ", nombre=" + nombre + ", apellido=" + apellido + ", lider="
				+ lider + "]";
	}

	
	}