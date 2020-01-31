package com.cdainfo.vacaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.vacaciones.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario ,Long>{

}
