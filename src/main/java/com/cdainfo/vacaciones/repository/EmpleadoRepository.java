package com.cdainfo.vacaciones.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cdainfo.vacaciones.entity.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado , Integer>{

	Optional<Empleado> findByLider(Integer lider);

	List<Empleado> findAllByLider(Integer lider);

	Optional<Empleado> findByEmail(String email);

}
