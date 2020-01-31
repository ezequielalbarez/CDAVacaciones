package com.cdainfo.vacaciones.estados;

public class Rechazado implements State{

	private EstadoImp estadoImp;

	@Override
	public void Aprobado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Rechazado() {
		System.out.println("su peticion esta rechazada");
		
	}

	@Override
	public void Iniciado() {

		
	}

	@Override
	public void EnProceso() {
	
		
	}

	@Override
	public void Cancelado() {

		
	}

	@Override
	public void setState(EstadoImp estadoImp) {
		this.estadoImp = estadoImp;
		
	}

	
}
