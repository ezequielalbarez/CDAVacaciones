package com.cdainfo.vacaciones.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(
		name = "usuario"
//		schema = "vacaciones",
//		indexes = {@Index(name = "usuario", columnList = "nombre", unique = true)}
		)

public class Usuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	@Column(name = "usuario", nullable = false, length = 20)
    private String usuario;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre; 
    
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    
    @Column(name = "sede", nullable = false, length = 20)
    private String sede;
    
    @Column(name = "cargo", nullable = false, length = 20)
    private String cargo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return usuario;
	}

	public void setUser(String user) {
		this.usuario = user;
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

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", user=" + usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", sede="
				+ sede + ", cargo=" + cargo + "]";
	}
    

    
}
