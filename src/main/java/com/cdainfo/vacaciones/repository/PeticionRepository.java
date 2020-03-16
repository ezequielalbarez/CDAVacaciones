package com.cdainfo.vacaciones.repository;

import com.cdainfo.vacaciones.entity.Peticion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PeticionRepository extends JpaRepository<Peticion, Integer> {

    Optional<Peticion> findByNumeroPeticion(int numeroPeticion);
}