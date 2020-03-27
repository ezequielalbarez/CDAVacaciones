package com.cdainfo.vacaciones.controller;

import com.cdainfo.vacaciones.entity.Empleado;
import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.serviceImp.ServiceEmpleadompl;
import com.cdainfo.vacaciones.serviceImp.ServicePeticionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/aprobante")
public class AprobanteController {

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

    @GetMapping("/listareporta")//filtro para traer las solicitudes dependiendo de quien esta a cargo
    public String traerTodosLider(@RequestAttribute Integer id, @RequestAttribute Model model) {
        List<Empleado>  emp = serviceEmpleado.findByAllLider(id);

        System.out.println("Lista de indices de los usuario"); // filtro por lambda
        List<Integer> idList = serviceEmpleado.findByAllLider(id)
                                              .stream()
                                              .map(Empleado::getId)
                                              .collect(Collectors.toList());
        List<Peticion> user5List = servicepeticion.listarPeticiones()
                                                  .stream()
                                                  .filter(peticion -> idList.contains(peticion.getEmpleadoId().getId()))
                                                  .collect(Collectors.toList());
        model.addAttribute("ListaPeticiones", user5List);
        return "alta";// alta es el html donde estan las solicitudes 
    }//este filtro tiene un problema de logica donde el findByAllLider(id) no lo toma es un error de query que si no esta hardcodeado no toma el integer/id 


}
