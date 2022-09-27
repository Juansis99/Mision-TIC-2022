package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.MovimientoDinero;

import java.util.List;

public interface MovimientoDineroServiceInterface {
    //Metodos
    List<MovimientoDinero> getMovimientoDineroList();
    MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero);
    List<MovimientoDinero> getMovimientoDineroByIdEmpresaList(int nit_empresa);
    void deleteMovimientoDineroByIdEmprsa(long id);
    MovimientoDinero getMovimientoDineroById(long id);
    void deleteMovimientoDineroById(long id);
}
