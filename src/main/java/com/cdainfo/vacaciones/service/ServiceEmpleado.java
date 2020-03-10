package com.cdainfo.vacaciones.service;

import java.util.List;
import java.util.Optional;

import com.cdainfo.vacaciones.entity.Empleado;




public interface ServiceEmpleado{
	
	List<Empleado> traerTodos();

	
    Empleado buscarPorEmail(String email);
 	Empleado findById(Integer id);
	//Empleado findByFiltro(Integer lider, Integer id, String user);
	//Empleado findByLiderAndId(Integer lider, Integer id);
	Empleado grabar(Empleado empleado);//guarda esa peticion (se llamara en el serviceimp )
	List<Empleado> findByAllLider(Integer lider);

	void borrar(Empleado empleado);//elimina la peticion (se llamara en el serviceimp )

	
	



}
