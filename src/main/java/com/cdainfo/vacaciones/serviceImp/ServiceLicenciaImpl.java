package com.cdainfo.vacaciones.serviceImp;

import com.cdainfo.vacaciones.entity.Licencia;
import com.cdainfo.vacaciones.repository.LicenciaRepository;
import com.cdainfo.vacaciones.service.ServiceLicencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceLicenciaImpl implements ServiceLicencia {

    @Autowired
    LicenciaRepository repoLicencia;

    @Override
    public List<Licencia> listarLicencias() {
        return repoLicencia.findAll();
    }

    @Override
    public Optional<Licencia> buscarLicenciaId(Integer id) {
        return repoLicencia.findById(id);
    }
}
