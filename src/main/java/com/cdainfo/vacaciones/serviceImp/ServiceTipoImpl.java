package com.cdainfo.vacaciones.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdainfo.vacaciones.entity.TipoDeLicencia;
import com.cdainfo.vacaciones.repository.TipoLicRepository;
import com.cdainfo.vacaciones.service.ServiceTipo;
@Service
public class ServiceTipoImpl implements ServiceTipo{
	
	@Autowired
	TipoLicRepository tipoLicRepo;

	@Override
	public List<TipoDeLicencia> findAll() {
		return tipoLicRepo.findAll();
	}

}
