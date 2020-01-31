package com.cdainfo.vacaciones.estados;

public class EnProceso implements State{
  
	 private EstadoImp estadoImp;

	@Override
	public void Aprobado(){
	System.out.println("Solicitud Aprobada");
	}
	
	@Override
	public void Rechazado() {
		System.out.println("Solicitud Rechazado");
		estadoImp.setState(new Rechazado());
	}

	@Override
	public void Iniciado() {
		System.out.println("Solicitud iniciada");
	
		
	}

	@Override
	public void EnProceso() {
		System.out.println("Solicitud esta en proceso");

	
	}

	@Override
	public void Cancelado() {
		System.out.println("Solicitud esta cancelada");
		EnProceso.this.estadoImp.setState(new Cancelado());
	}

	@Override
	public void setState(EstadoImp estadoImp) {
		this.estadoImp = estadoImp;
		
	}
	

}
