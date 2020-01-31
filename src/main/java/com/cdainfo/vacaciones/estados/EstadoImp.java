package com.cdainfo.vacaciones.estados;

import org.springframework.beans.factory.annotation.Autowired;


public class EstadoImp {
	@Autowired
	private State estado;

	public EstadoImp() {

		setState(new EnProceso());
	}

	public void setState(State estado) {
		this.estado = estado;
        this.estado.setState(this);  
	}
	public void Aprobado() {
		this.estado.Aprobado();
	}
	public void Cancelado() {
		this.estado.Cancelado();
	}
	public void EnProceso() {
		this.estado.EnProceso();
	}
	public void Iniciado() {
		this.estado.Iniciado();
	}
	public void Rechazado() {
		this.estado.Aprobado();	
		}
	
	
	}