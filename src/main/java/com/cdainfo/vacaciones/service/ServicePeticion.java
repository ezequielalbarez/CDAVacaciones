package com.cdainfo.vacaciones.service;

import java.util.List;


import com.cdainfo.vacaciones.entity.Peticion;


public interface ServicePeticion {
	
	List<Peticion> traerTodas();

	Peticion findByNumeroPeticion(Long numeroPeticion);
	
	void guardar(Peticion peticion);
	
	List<Peticion> getPeticionesByEmail(String email);
  

}
