package com.cdainfo.vacaciones.estados;

public class Iniciado  implements State{
 EstadoImp estadoImp;
 	@Override
	public void Aprobado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Rechazado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Iniciado() {
		System.out.println("Solicitud iniciada");
		Iniciado.this.estadoImp.setState(new EnProceso());
		
	}

	@Override
	public void EnProceso() {
		// TODO Auto-generated method stub
		
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

