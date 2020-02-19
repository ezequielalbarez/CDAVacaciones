package com.cdainfo.vacaciones.repository;


import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.entity.TipoDeLicencia;

@Repository
public interface PeticionRepository extends JpaRepository<Peticion,Long> {
	List<Peticion> findAll();
/*	List<Peticion> findAllByDiaAltaAndTipoDeLicenciaAndCantidadDias(String diaAlta, String tipoDeLicencia,Date cantidadDias);*/
	Optional<Peticion> findByNumeroPeticion(Long numeroPeticion); 
/*Peticion findAllByTipoDeLicencia(String tipoLicencia);
Peticion findAllByCantidadDias(Date cantidadDias);
Peticion findAllByEstado(String estado); 
Optional<Peticion> findByNumeroPeticion(Long numeroPeticion);
*/
	
	

}