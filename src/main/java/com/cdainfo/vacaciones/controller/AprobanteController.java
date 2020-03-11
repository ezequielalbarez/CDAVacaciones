package com.cdainfo.vacaciones.controller;

import java.util.List;
import java.util.stream.Collectors;

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
import com.cdainfo.vacaciones.serviceImp.SevicePeticionImpl;

@Controller
@RequestMapping("/aprobante")
public class AprobanteController {
	
	@Autowired
	SevicePeticionImpl servicepeticion;
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
	 List<Peticion> lista = servicepeticion.traerTodas();
	 List<Empleado> listaEmpleados = serviceEmpleado.listarEmpleados();
	 
	 model.addAttribute("ListaPeticiones", lista);
	 return "alta";
	 }
	@GetMapping("/listarepota") //trae los usuarios
	 public String traerTodosLider(Model model) {
	 List<Empleado> emp = serviceEmpleado.findByAllLider(4323);
	 //List<Peticion> lista =servicepeticion.traerTodas();
	 
	System.out.println("Lista de indices de los usuario");
     List<Integer> idList = serviceEmpleado.findByAllLider(4323)
			    		 				   .stream()
			                               .map(Empleado::getId)
			                               .collect(Collectors.toList());
     List<Peticion> user5List = servicepeticion.traerTodas()
    		 								   .stream()
											   .filter(peticion -> idList.contains(peticion.getEmpleadoId()))
											   .collect(Collectors.toList());
     //user5List.forEach(System.out::println);
     
     //idList.forEach(System.out::println);
	 
	 model.addAttribute("ListaPeticiones", idList);
	 return "alta";
	 }
    	
}
