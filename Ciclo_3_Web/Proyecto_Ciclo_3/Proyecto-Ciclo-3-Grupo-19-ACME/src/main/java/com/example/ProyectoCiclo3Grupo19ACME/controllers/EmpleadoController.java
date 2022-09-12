package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empleado;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmpleadoController {
    EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService){
        this.empleadoService = empleadoService;
    }

    @GetMapping("/users")
    public List<Empleado> getListEmpleado(){
        return this.empleadoService.listEmpleado();
    }

    @PostMapping("/users")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.createEmpleado(empleado);
    }

    @GetMapping("/users/{id}")
    public Empleado getEmpleadoById(@PathVariable("id") Integer idEmpleado){
        return this.empleadoService.getEmpleadoById(idEmpleado);
    }

    @PatchMapping("/users/{id}")
    public Empleado updateEmpleadoById(@PathVariable("id") Integer idEmpleado, @RequestBody Map<Object, Object> objectMap){
        return this.empleadoService.updateEmpleadoById(idEmpleado, objectMap);
    }

    @DeleteMapping("/users/{id}")
    public void deleteEmpleadoById(@PathVariable("id") Integer idEmpleado){
        empleadoService.deleteEmpleadoById(idEmpleado);
    }
}
