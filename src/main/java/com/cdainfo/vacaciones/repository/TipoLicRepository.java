 package com.cdainfo.vacaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.entity.TipoDeLicencia;

public interface TipoLicRepository extends JpaRepository<TipoDeLicencia, Integer>{

	List<TipoDeLicencia> findAll();
	
	Optional<TipoDeLicencia> findAllByIdAndDiasD(Integer id, Integer diasD);

	
}
