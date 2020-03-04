package com.cdainfo.vacaciones.service;

import java.util.List;
import java.util.Optional;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.entity.TipoDeLicencia;


public interface ServicePeticion {
	
	List<Peticion> traerTodas();

	Peticion findByNumeroPeticion(Long numeroPeticion);
	
	void guardar(Peticion peticion);
	

	
}
