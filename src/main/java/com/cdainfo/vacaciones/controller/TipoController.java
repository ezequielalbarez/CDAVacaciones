/*package com.cdainfo.vacaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.cdainfo.vacaciones.entity.TipoDeLicencia;
import com.cdainfo.vacaciones.serviceImp.ServiceTipoImpl;
@Controller
public class TipoController {
	
	@Autowired
	ServiceTipoImpl servicetipo;
	
/*	@GetMapping("/listatipos") //trae los usuarios
	 public String findAllByTipo(Model model) {
	 List<TipoDeLicencia> lista = servicetipo.findAll();
	 model.addAttribute("ListaLicencias", lista);
	 return "tipo";
	 }

	@GetMapping("/listatipos")
	public String tipos(Model model) {
		
		TipoDeLicencia tipo = new TipoDeLicencia();
		
		List<TipoDeLicencia> listatipos = servicetipo.findAll();
		model.addAttribute("titulo", "Formulario: Nueva Licencia");
		model.addAttribute("tipoDeLicencia", tipo);
		model.addAttribute("licencias", listatipos);
		
		return "/peticion";
		
	}
	
	
	
}
*/