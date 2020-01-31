package com.cdainfo.vacaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.estados.EstadoImp;
import com.cdainfo.vacaciones.serviceImp.SevicePeticionImpl;



@Controller
@RequestMapping("/aprobante")
public class AprobanteController {
	
	
	@Autowired
	SevicePeticionImpl servicepeticion;
	
	EstadoImp estadoImp;
	
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
	 model.addAttribute("ListaPeticiones", lista);
	 return "alta";
	 }

    	
}
