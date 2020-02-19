package com.cdainfo.vacaciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tipdia")
public class TipoDeLicencia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id	
	 @Column(name="tdnro")
	private Integer id;
	
	 @Column(name="tddesc")
	 private String tipo;
	 
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

	@Override
	public String toString() {
		return "TipoDeLicencia [id=" + id + ", tipo=" + tipo + "]";
	}
	
	
	
}
