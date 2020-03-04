package com.cdainfo.vacaciones.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdainfo.vacaciones.entity.Peticion;
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

@Override
public TipoDeLicencia findAllByIdAndDiasD(Integer id, Integer diasD) {
	Optional<TipoDeLicencia> tipos = tipoLicRepo.findAllByIdAndDiasD(id, diasD);
	if ( ((Optional<TipoDeLicencia>) tipos).isPresent() ) {
		return (TipoDeLicencia)tipos.get();
	} else {
		return null;
	}
}



/*@Override
			public TipoDeLicencia findByIdAndDiasD(Integer id, Integer diasD) {
			Optional<TipoDeLicencia> diasTipo = tipoLicRepo.findByIdAndDiasD(id,diasD);
				if ( diasTipo.isPresent() ) {
					return diasTipo.get();
				} else {
					return null;
				}
}
*/




}
