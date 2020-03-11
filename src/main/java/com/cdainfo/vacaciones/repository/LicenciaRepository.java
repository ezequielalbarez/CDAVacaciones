package com.cdainfo.vacaciones.repository;

import com.cdainfo.vacaciones.entity.Licencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LicenciaRepository  extends JpaRepository<Licencia, Integer> {

}
