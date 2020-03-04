package com.cdainfo.vacaciones.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado  {
	
	@Id
	@Column(name="ternro")
	private Integer id;
	
	@Column(name="empemail")
	private String user;
	
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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
		return "Empleado [id=" + id + ", user=" + user + ", nombre=" + nombre + ", apellido=" + apellido + ", lider="
				+ lider + "]";
	}



	
	}