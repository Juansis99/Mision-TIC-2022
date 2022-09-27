package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empleado;
import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpleadoService;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpresaService;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;

@RestController
public class EmpleadoController {
    //Atributos
    EmpleadoService empleadoService;
    EmpresaService empresaService;

    //Constructores
    public EmpleadoController(EmpleadoService empleadoService, EmpresaService empresaService){
        this.empleadoService = empleadoService;
        this.empresaService = empresaService;
    }

    //Metodos
    @GetMapping("/users")
    public List<Empleado> getListEmpleado(){
        return this.empleadoService.listEmpleado();
    }

//    @PostMapping("/users")
//    public Empleado createEmpleado(@RequestBody Empleado empleado){
//        return this.empleadoService.createEmpleado(empleado);
//    }

    @PostMapping("/home/usuarios")
    public RedirectView createEmpleado(@ModelAttribute Empleado empleado, Model model){
        model.addAttribute(empleado);
        this.empleadoService.createEmpleado(empleado);
        return new RedirectView("/home/usuarios");
    }

    @GetMapping("/users/{id}")
    public Empleado getEmpleadoById(@PathVariable("id") Integer idEmpleado){
        return this.empleadoService.getEmpleadoById(idEmpleado);
    }

    @PatchMapping("/users/{id}")
    public Empleado updateEmpleadoById(@PathVariable("id") Integer idEmpleado, @RequestBody Map<Object, Object> objectMap){
        return this.empleadoService.updateEmpleadoById(idEmpleado, objectMap);
    }

//    @DeleteMapping("/users/{id}")
//    public void deleteEmpleadoById(@PathVariable("id") Integer idEmpleado){
//        empleadoService.deleteEmpleadoById(idEmpleado);
//    }

    @DeleteMapping("/home/usuarios/{id}")
    public RedirectView deleteEmpleadoById(@PathVariable("id") Integer idEmpleado){
        empleadoService.deleteEmpleadoById(idEmpleado);
        return new RedirectView("/home/usuarios");
    }
}
