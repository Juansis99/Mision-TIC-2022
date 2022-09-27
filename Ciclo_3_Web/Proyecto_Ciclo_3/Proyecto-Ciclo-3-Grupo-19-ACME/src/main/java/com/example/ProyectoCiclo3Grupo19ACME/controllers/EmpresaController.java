package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpresaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;
@RestController
public class EmpresaController {
    //Atributos
    EmpresaService empresaService;

    //Constructores
    public EmpresaController(EmpresaService empresaService){
        this.empresaService = empresaService;
    }

    //Metodos
    @GetMapping("/enterprises")
    public List<Empresa> getListEmpresa(){
        return this.empresaService.listEmpresa();
    }

//    @PostMapping("/enterprises")
//    public Empresa createEmpresa(@RequestBody Empresa empresa){
//        return this.empresaService.createEmpresa(empresa);
//    }
    @PostMapping("/home/empresas")
    public RedirectView createEmpresa(@ModelAttribute Empresa empresa, Model model){
        model.addAttribute(empresa);
        this.empresaService.createEmpresa(empresa);
        return new RedirectView("/home/empresas");
    }

    @GetMapping("/enterprises/{id}")
    public Empresa getEmpresaById(@PathVariable("id") Integer nit){
        return this.empresaService.getEmpresaById(nit);
    }

    @PatchMapping("/enterprises/{id}")
    public Empresa updateEmpresaById(@PathVariable("id") Integer nit, @RequestBody Map<Object, Object> objectMap){
        return this.empresaService.updateEmpresaById(nit, objectMap);
    }

//    @DeleteMapping("/enterprises/{id}")
//    public void deleteEmpresaById(@PathVariable("id") Integer nit){
//        empresaService.deleteEmpresaById(nit);
//    }
    @DeleteMapping("/home/empresas/{id}")
    public RedirectView deleteEmpresaById(@PathVariable("id") Integer nit){
        empresaService.deleteEmpresaById(nit);
        return new RedirectView("/home/empresas");
    }
}
