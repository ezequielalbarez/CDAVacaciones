 package com.cdainfo.vacaciones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cdainfo.vacaciones.entity.TipoDeLicencia;

public interface TipoLicRepository extends JpaRepository<TipoDeLicencia, Integer>{

	List<TipoDeLicencia> findAll();
	
}
