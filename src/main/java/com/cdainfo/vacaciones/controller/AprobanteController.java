package com.cdainfo.vacaciones.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cdainfo.vacaciones.entity.Licencia;
import com.cdainfo.vacaciones.service.ServiceLicencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cdainfo.vacaciones.entity.Empleado;
import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.serviceImp.ServiceEmpleadompl;
import com.cdainfo.vacaciones.serviceImp.ServicePeticionImpl;

import javax.swing.*;
import javax.swing.text.html.Option;

@Controller
@RequestMapping("/aprobante")
public class AprobanteController {
	@Autowired
	ServiceLicencia serviceLicencia;
	@Autowired
	ServicePeticionImpl servicepeticion;
	@Autowired
	ServiceEmpleadompl serviceEmpleado;
	
	@GetMapping("/peticion") // trae la peticion
	public String peticion(Model model) {
		model.addAttribute("peticion", new Peticion());
		return "peticion";
	}

	@PostMapping("/cargarPeticion") // carga la peticion
	public String peticion(@ModelAttribute Peticion peticion) {
		return "peticionEnviada";
	} 
	@GetMapping("/lista") //trae los usuarios
	 public String getAlltraerTodos(Model model) {
	 List<Peticion> lista = servicepeticion.listarPeticiones();
	 //List<Empleado> listaEmpleados = serviceEmpleado.listarEmpleados();
	// List<Licencia> listita = serviceLicencia.listarLicencias();
	 
	 model.addAttribute("ListaPeticiones", lista);
	//	model.addAttribute("ListarLicencias", listita);
	 return "alta";
	 }
	@GetMapping("/listareporta")
	 public String traerTodosLider(@ModelAttribute Integer emp, Model model ) {

	// List<Empleado>  emp = serviceEmpleado.findByAllLider(4323);

	System.out.println("Lista de indices de los usuario"); // filtro por lambda
     List<Integer> idList = serviceEmpleado.findByAllLider(4323)
			    		 				   .stream()
			                               .map(Empleado::getId)
			                               .collect(Collectors.toList());
     List<Peticion> user5List = servicepeticion.listarPeticiones()
    		 								   .stream()
											   .filter(peticion -> idList.contains(peticion.getEmpleadoId().getId()))
											   .collect(Collectors.toList());
	 model.addAttribute("ListaPeticiones", user5List);
	 return "alta";
	 }

    	
}
