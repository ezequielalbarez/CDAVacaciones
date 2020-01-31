package com.cdainfo.vacaciones.estados;

import com.cdainfo.vacaciones.entity.Peticion;

public class Aprobado implements State {
	 private EstadoImp estadoImp;
	@Override
	public void Aprobado() {
		System.out.println("esta aprobada");
	}
	@Override
	public void Rechazado() {

	}
	@Override
	public void Iniciado() {
		
		
	}
	@Override
	public void EnProceso() {

	}
	@Override
	public void Cancelado() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void setState(EstadoImp estadoImp) {
		this.estadoImp = estadoImp;
	}
	
	
	

}
