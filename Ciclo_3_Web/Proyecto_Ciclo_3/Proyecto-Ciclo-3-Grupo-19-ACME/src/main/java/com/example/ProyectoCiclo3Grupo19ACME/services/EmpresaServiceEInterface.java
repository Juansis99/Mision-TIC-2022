package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;

import java.util.List;
import java.util.Map;

public interface EmpresaServiceEInterface {
    List<Empresa> listEmpresa();
    Empresa createEmpresa(Empresa empresa);
    Empresa getEmpresaById(int nit);
    Empresa updateEmpresaById(Integer nit, Map<Object, Object> objectMap);
    void deleteEmpresaById(Integer nit);
}
