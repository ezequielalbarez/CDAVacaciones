package com.cdainfo.vacaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cdainfo.vacaciones.entity.Empleado;


@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado ,  Long>{

	Optional<Empleado> findByLider(Integer lider);
	List<Empleado> findAllByLider(Integer lider);

	Optional<Empleado> findById(Optional<Empleado> id);
	
	Optional<Empleado> findByEmail(String email);

	//Empleado findByFiltro(Integer lider, Integer id, String email);
	
	
}
