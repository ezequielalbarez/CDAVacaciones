package com.cdainfo.vacaciones.controller;

import java.util.List;

import com.cdainfo.vacaciones.entity.Licencia;
import com.cdainfo.vacaciones.serviceImp.ServiceLicenciaImpl;
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
import com.cdainfo.vacaciones.serviceImp.ServicePeticionImpl;

@Controller
@RequestMapping("/peticion")
public class UsuarioController{

	@Autowired
	ServiceEmpleadompl serviceEmpleado;
	@Autowired
	ServiceLicenciaImpl serviceLicencia;

	@GetMapping("/formulario") //trae el formulario
	public String peticion(Model model,
						   @ModelAttribute Empleado empleado) {
		List<Licencia> listaLicencias = serviceLicencia.listarLicencias();
		model.addAttribute("peticion", new Peticion());
		model.addAttribute("titulo", "Formulario: Nueva Licencia");
		model.addAttribute("listaLicencias", listaLicencias);
		return "formPeticion";
	}

	@PostMapping("/cargarPeticion") // carga la peticion
	public String cargaPeticion(@ModelAttribute Peticion peticion) {
		return "peticion/peticionEnviada";
	}

	// localhost:8080/peticion/logueando?entradaEmail=DHIglesias@proveedor.telecom.com.ar
	//lider eczornogas@cdainfo.com
	@GetMapping("/logueando")//para el login
	public String loginci(@RequestParam(value = "entradaEmail") String buscar,
			Model modelo) {//entra el email llamado buscar como parametro
		Empleado emp = serviceEmpleado.buscarEmpleadoPorEmail(buscar);//guarda buscar en emp

		if (emp.equals(null)) {//si el email no coincide retornaria denuevo la pagina de login
			// Usuarioa no valido
			return "/login";
		} else if (emp.getLider()==null) {//si el email coincide pero es un lider (que no tenga a quierenes reportar)
			// traer las peticiones correspondiente a sus empleados a cargo

			modelo.addAttribute(emp.getId());
			return "redirect:/aprobante/listareporta";
		} else {
			modelo.addAttribute(emp.getId());//si tiene a quien reportar va a la creacion de peticion
			return ("redirect:/peticion/formulario");
		}
	}
	@GetMapping("/login")
	public String login(){
		return "login";
	}


}
