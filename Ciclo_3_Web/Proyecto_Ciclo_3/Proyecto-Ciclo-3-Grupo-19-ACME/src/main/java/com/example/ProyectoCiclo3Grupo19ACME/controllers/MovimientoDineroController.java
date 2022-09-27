package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empleado;
import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.entities.MovimientoDinero;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpleadoService;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpresaService;
import com.example.ProyectoCiclo3Grupo19ACME.services.MovimientoDineroService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class MovimientoDineroController {
    //Atributos
    MovimientoDineroService movimientoDineroService;
    EmpresaService empresaService;
    EmpleadoService empleadoService;

    //Constructores
    public MovimientoDineroController(MovimientoDineroService movimientoDineroService, EmpresaService empresaService, EmpleadoService empleadoService){
        this.movimientoDineroService = movimientoDineroService;
        this.empleadoService = empleadoService;
        this.empresaService = empresaService;
    }

    //Metodos
    @GetMapping("/MovimientoDinero")
    public List<MovimientoDinero> getMovimientoDineroList(){
        return this.movimientoDineroService.getMovimientoDineroList();
    }

    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero> getMovimientoDineroByIdEmpresaList(@PathVariable int id){
        return this.movimientoDineroService.getMovimientoDineroByIdEmpresaList(id);
    }

//    @PostMapping("/enterprises/{id}/movements")
//    public MovimientoDinero createMovimientoDineroByIdEmprsa(@PathVariable int id, @RequestBody MovimientoDinero movimientoDinero){
//        Empresa empresa = empresaService.getEmpresaById(id);
//        Empleado empleado = empleadoService.getEmpleadoById(movimientoDinero.getEmpleado().getIdEmpleado());
//        if (empleado.getEmpresa().getNit() == id){
//            movimientoDinero.setEmpresa(empresa);
//            movimientoDinero.setEmpleado(empleado);
//            return this.movimientoDineroService.createMovimientoDinero(movimientoDinero);
//        }
//        else {
//            throw new RuntimeException();
//        }
//    }

    @PostMapping("/home/transaccion")
    public RedirectView createMovimientoDinero(@ModelAttribute MovimientoDinero movimientoDinero, Model model){
        this.movimientoDineroService.createMovimientoDinero(movimientoDinero);
        return new RedirectView("/home/transaccion");
    }

//    @DeleteMapping("/enterprises/{id}/movements")
//    public void deleteMovimientoDineroByIdEmprsa(@PathVariable int id, @RequestBody MovimientoDinero movimientoDinero){
//        MovimientoDinero movimientoDinero1 = movimientoDineroService.getMovimientoDineroById(movimientoDinero.getId());
//        if (movimientoDinero1.getEmpresa().getNit() == id){
//            this.movimientoDineroService.deleteMovimientoDineroByIdEmprsa(movimientoDinero.getId());
//        }
//        else {
//            throw new RuntimeException();
//        }
//    }

    @DeleteMapping("/home/transaccion/{id}")
    public RedirectView deleteMovimientoDineroByIdEmprsa(@PathVariable long id){
        movimientoDineroService.deleteMovimientoDineroById(id);
        return new RedirectView("/home/transaccion");
    }

    @PatchMapping("/enterprises/{id}/movements")
    public MovimientoDinero updateMovimientoDinero(@PathVariable int id, @RequestBody MovimientoDinero movimientoDinero){
        MovimientoDinero movimientoDineroPatch = movimientoDineroService.getMovimientoDineroById(movimientoDinero.getId());
        if (movimientoDineroPatch.getEmpresa().getNit() == id){
            Empresa empresa = empresaService.getEmpresaById(id);
            Empleado empleado;
            if(movimientoDinero.getEmpleado() == null){
                empleado = empleadoService.getEmpleadoById(movimientoDineroService.getMovimientoDineroById(movimientoDinero.getId()).getEmpleado().getIdEmpleado());
            } else {
                if (empleadoService.getEmpleadoById(movimientoDinero.getEmpleado().getIdEmpleado()).getEmpresa().getNit() != id){
                    throw new RuntimeException();
                } else {
                    empleado = empleadoService.getEmpleadoById(movimientoDinero.getEmpleado().getIdEmpleado());
                }
            }
            if (!movimientoDineroPatch.getConcepto().equals(movimientoDinero.getConcepto()) && (movimientoDinero.getConcepto() != null)){
                movimientoDineroPatch.setConcepto(movimientoDinero.getConcepto());
            }
            if ((movimientoDineroPatch.getMonto() != movimientoDinero.getMonto()) && (movimientoDinero.getMonto() != 0 )){
                movimientoDineroPatch.setMonto(movimientoDinero.getMonto());
            }
            movimientoDineroPatch.setEmpleado(empleado);
            movimientoDineroPatch.setEmpresa(empresa);
            return this.movimientoDineroService.createMovimientoDinero(movimientoDineroPatch);
        } else {
            throw new RuntimeException();
        }
    }
}







