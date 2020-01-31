package com.cdainfo.vacaciones.estados;

public class Cancelado  implements State{

	private EstadoImp estadoImp;

	@Override
	public void Aprobado() {
		
	}

	@Override
	public void Rechazado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Iniciado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EnProceso() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Cancelado() {
	System.out.println("esta cancelada su peticion");
		
	}

	@Override
	public void setState(EstadoImp estadoImp) {
		this.estadoImp = estadoImp;
		
	}

		
	

}
