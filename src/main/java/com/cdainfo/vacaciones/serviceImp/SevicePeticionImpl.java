package com.cdainfo.vacaciones.serviceImp;

import java.util.List;
import java.util.Optional;

// import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.repository.EmpleadoRepository;
import com.cdainfo.vacaciones.repository.PeticionRepository;
import com.cdainfo.vacaciones.service.ServicePeticion;

@Service
public class SevicePeticionImpl implements ServicePeticion{
	
	@Autowired
	PeticionRepository peticionRepository; 
	
	@Autowired
	EmpleadoRepository empleadoRepository; 

	Peticion peticion;
	
	@Override
	public List<Peticion> traerTodas() {
		return peticionRepository.findAll();
	} 

	@Override
	public Peticion findByNumeroPeticion(Long numPeticion) {
		Optional<Peticion> peticiones = peticionRepository.findByNumeroPeticion(numPeticion);
		if ( peticiones.isPresent() ) {
			return peticiones.get();
		} else {
			return null;
		}
	}	

	@Override
	public void guardar(Peticion peticion) {
		
		peticionRepository.save(peticion);
	}

	@Override
	public List<Peticion> getPeticionesByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	

	/*@Override
	public List<Peticion> getPeticionesByEmail(String email) {
		List<Peticion> lPetiones = null; //(lista de peticiones)
		Optional<Empleado> empleado= empleadoRepository.findByUser(email);//toma como valor el email
		if ( empleado.isPresent() ) {//si el empleado esta en la base de datos va a acceder 		
			Empleado emp = empleado.get(); // retorna los datos del empleado 
			if ( emp.getLider() == null ) {//verifica si el empleado existe
				return lPetiones;//si es null te va a traer una lista vacia de peticiones
			} else {
				// Es lider
				lPetiones = new ArrayList<Peticion>();//toma un list de peticiones
				List<Empleado> reportan = empleadoRepository.findAllByLider(emp.getId());//toma los id de los usuarios que lo reportan 
				for (Empleado emple : reportan) {
					List<Peticion> petEmp = peticionRepository.findAllByEmpleadoId(emple.getId());// toma una lista de los id de a quienes lo reportan
					lPetiones.addAll(petEmp);//agrega a la lista de peticion con el petEmp
				}
			}
		} else {
			//log.info("Usuario " + email + "no fue encontrado");
			System.out.println("Usuario " + email + "no fue encontrado");
		}
		return lPetiones;////muestra una lista de peticion de los  usuario
	}*/

}




