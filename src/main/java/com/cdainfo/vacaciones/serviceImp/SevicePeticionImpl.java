package com.cdainfo.vacaciones.serviceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.repository.PeticionRepository;
import com.cdainfo.vacaciones.service.ServicePeticion;

@Service
public class SevicePeticionImpl implements ServicePeticion{
	
	@Autowired
	PeticionRepository peticionRepository;
	@Override
	public List<Peticion> traerTodas() {
		return peticionRepository.findAll();
	}

}




