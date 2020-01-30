package com.cdainfo.vacaciones.controller;

import java.sql.Date;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.repository.PeticionRepository;
import com.cdainfo.vacaciones.serviceImp.SevicePeticionImpl;



@Controller
public class UsuarioController {
	@Autowired
	SevicePeticionImpl servicePeticion;

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

	/*
	 * @GetMapping("/peticionvacas")//trae la peticion public String
	 * getPeticion(Model model) { model.addAttribute("peticion", new Peticion());
	 * return "peticion"; }
	 * 
	 * @GetMapping("/peticion") public String
	 * greeting(@RequestParam(name="numeroPeticion") Long numeroPeticion, Model
	 * model) { model.addAttribute("peticion", new Peticion()); return "peticion"; }
	 * 
	 * @GetMapping("/peticion") public String crearPeticion(Model model) {
	 * model.addAttribute("peticion", new Peticion()); return "peticion"; }
	 */
	/*
	 * @GetMapping("/peticion") public Optional<Peticion> getPeticion(@PathVariable
	 * Long numeroPeticion) { return
	 * peticionRepository.findByNumeroPeticion(numeroPeticion); }
	 */
	/*
	 * @GetMapping("/usuario/{usuarioId}") //trae el usuario por la id(legajo)
	 * public Usuario getUsuario(@PathVariable Long usuarioId){
	 * System.out.println("Usuario: " + usuarioId); Usuario usuario =
	 * serviceUsuario.findById(usuarioId); // usuario.setEstado(Estado.Aprobado); //
	 * if ( usuario.getEstado() == Estado.Cancelado ) { // // } return usuario; }
	 * 
	 * @PostMapping("/usuario")//crea un usuario para mandarle a la tabla "usuario"
	 * public Usuario crearUsuario(@RequestBody Usuario usuario) { usuario =
	 * serviceUsuario.grabar(usuario);
	 * 
	 * return usuario;
	 * 
	 * }
	 */

	/*
	 * @PostMapping("/cargarPeticion")//carga la peticion public String
	 * cargarPeticion(@ModelAttribute Peticion peticion) { return
	 * "resultadoPeticion"; }
	 * 
	 * @PutMapping("/usuario")//editar usuario public Usuario
	 * actualizarUsuario(@RequestBody Usuario usuario) {
	 * 
	 * usuario = serviceUsuario.grabar(usuario);
	 * 
	 * return usuario; }
	 * 
	 * @DeleteMapping("usuario_borrar/{usuarioId}") public String
	 * eliminarUsuario(@PathVariable Long usuarioId) {
	 * 
	 * Usuario usuario = serviceUsuario.findById(usuarioId);
	 * 
	 * if ( usuario == null ) { throw new RuntimeException("Usuario con id " +
	 * usuarioId + " no se encuentra"); }
	 * 
	 * serviceUsuario.borrar(usuario);
	 * 
	 * return "Se ha eliminado el usuario id = "+usuarioId; }
	 * 
	 */
}
