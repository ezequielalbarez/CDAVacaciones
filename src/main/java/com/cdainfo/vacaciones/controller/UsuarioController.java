package com.cdainfo.vacaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import com.cdainfo.vacaciones.entity.Empleado;
import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.serviceImp.ServiceEmpleadompl;
import com.cdainfo.vacaciones.serviceImp.SevicePeticionImpl;

@Controller
public class UsuarioController {

	@Autowired
	SevicePeticionImpl servicePeticion;
	@Autowired
	ServiceEmpleadompl serviceEmpleado;

	@GetMapping("/peticion") // trae la peticion
	public String peticion(Model model) {
		model.addAttribute("peticion", new Peticion());
		return "peticion";
	}

	@PostMapping("/cargarPeticion") // carga la peticion
	public String cargaPeticion(@ModelAttribute Peticion peticion) {
		servicePeticion.guardar(peticion);
		return "peticionEnviada";
	}

	@GetMapping("/login")
	public String greetingForm() {
		return "login";
	}

	@GetMapping("/logueando")//para el login
	public String loginci(@RequestParam(value = "entradaEmail", required = true) String buscar, 
			Model modelo) {//entra el email llamado buscar como parametro 
		Empleado emp = serviceEmpleado.buscarEmpleadoPorEmail(buscar);//guarda buscar en emp

		if (emp.equals(null)) {//si el email no coincide retornaria denuevo la pagina de login
			// Usuarioa no valido
			return "/login";
		} else if (emp.getLider()==null) {//si el email coincide pero es un lider (que no tenga a quierenes reportar)
			// traer las peticiones correspondiente a sus empleados a cargo.
			List<Peticion> unaListado = servicePeticion.traerTodas();//trae una lista
			modelo.addAttribute("ListaPeticiones", unaListado);
			return "/alta";
		} else {
			modelo.addAttribute("empleado", emp);//si tiene a quien reportar va a la creacion de peticion
			return "redirect:/peticion";
		}
		// serviceEmpleado.traerUsuario(empleado);
		// modelo.addAttribute("estado", "Este usuario no existe, por favor ingrese
		// datos para el alta usuario");

	}
}
