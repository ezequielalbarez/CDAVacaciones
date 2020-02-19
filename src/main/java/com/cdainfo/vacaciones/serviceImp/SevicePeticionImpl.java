package com.cdainfo.vacaciones.serviceImp;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.entity.TipoDeLicencia;
import com.cdainfo.vacaciones.entity.Usuario;
import com.cdainfo.vacaciones.repository.PeticionRepository;
import com.cdainfo.vacaciones.service.ServicePeticion;

@Service
public class SevicePeticionImpl implements ServicePeticion{
	
	@Autowired
	PeticionRepository peticionRepository; 
	
	Peticion peticion;
	
	@Override
	public List<Peticion> traerTodas() {
		return peticionRepository.findAll();
	} 

	@Override
	public Peticion findByNumeroPeticion(Long numPeticion) {
		Optional<Peticion> peticiones = peticionRepository.findByNumeroPeticion(numPeticion);
		if ( peticiones.isPresent() ) {
			return peticiones.get();
		} else {
			return null;
		}
	}	


	@Override
	public void guardar(Peticion peticion) {
		
		peticionRepository.save(peticion);
	}



	


	}
/*	@Override
	public Peticion findByNumeroPeticion(Long numeroPeticion) {
		List<Peticion> peticion = peticionRepository.findByNumeroPeticion(numeroPeticion);
	
			return peticion;
		} */



