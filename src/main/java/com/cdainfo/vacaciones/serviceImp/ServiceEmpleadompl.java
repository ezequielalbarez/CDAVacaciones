
package com.cdainfo.vacaciones.serviceImp;

import com.cdainfo.vacaciones.entity.Empleado;
import com.cdainfo.vacaciones.repository.EmpleadoRepository;
import com.cdainfo.vacaciones.service.ServiceEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmpleadompl implements ServiceEmpleado {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }


    @Override
    public Empleado buscarEmpleadoPorEmail(String email) {
        Optional<Empleado> empleado = empleadoRepository.findByEmail(email);//busca por email

        if (empleado.isPresent()) {//si el empleado existe
            return (Empleado) empleado.get();//retorna el empleado
        } else {
            System.out.println("Usuario " + email + "no fue encontrado");
        }
        return null;
    }


    @Override
    public List<Empleado> findByAllLider(Integer lider) {
        return empleadoRepository.findAllByLider(lider);
    }

}
