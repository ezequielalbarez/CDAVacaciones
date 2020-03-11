package com.cdainfo.vacaciones.service;

import java.util.List;
import com.cdainfo.vacaciones.entity.Empleado;

public interface ServiceEmpleado{
	
	List<Empleado> listarEmpleados();//retorna una lista de empleados
	
    Empleado buscarEmpleadoPorEmail(String email);
    
 	//Empleado findById(Integer id);
	
	List<Empleado> findByAllLider(Integer lider);

}
