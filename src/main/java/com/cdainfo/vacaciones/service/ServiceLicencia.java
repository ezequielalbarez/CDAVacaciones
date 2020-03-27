package com.cdainfo.vacaciones.service;

import com.cdainfo.vacaciones.entity.Licencia;

import java.util.List;
import java.util.Optional;

public interface ServiceLicencia {

    List<Licencia> listarLicencias();
    Optional<Licencia> buscarLicenciaId(Integer id);

}
