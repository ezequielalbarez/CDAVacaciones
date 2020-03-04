package com.cdainfo.vacaciones.service;

import java.util.List;
import java.util.Optional;

import com.cdainfo.vacaciones.entity.TipoDeLicencia;

public interface ServiceTipo {

	List<TipoDeLicencia> findAll();
	
	TipoDeLicencia findAllByIdAndDiasD(Integer id, Integer diasD); 
	


}
