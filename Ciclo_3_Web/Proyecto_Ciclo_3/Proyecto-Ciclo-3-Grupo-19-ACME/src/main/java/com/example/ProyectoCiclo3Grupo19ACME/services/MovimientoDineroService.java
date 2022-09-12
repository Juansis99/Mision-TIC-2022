package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.MovimientoDinero;
import com.example.ProyectoCiclo3Grupo19ACME.repositories.MovimientoDineroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoDineroService implements MovimientoDineroServiceInterface{
    private MovimientoDineroRepository movimientoDineroRepository;

    public MovimientoDineroService(MovimientoDineroRepository movimientoDineroRepository) {
        this.movimientoDineroRepository = movimientoDineroRepository;
    }
    @Override
    public List<MovimientoDinero> getMovimientoDineroList(){
        return this.movimientoDineroRepository.findAll();
    }
    @Override
    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero){
        return this.movimientoDineroRepository.save(movimientoDinero);
    }
    @Override
    public List<MovimientoDinero> getMovimientoDineroByIdEmpresaList(int nit_empresa){
        return this.movimientoDineroRepository.getMovimientoDineroByIdEmpresaList(nit_empresa);
    }
    @Override
    public void deleteMovimientoDineroByIdEmprsa(long id){
        this.movimientoDineroRepository.deleteById(id);
    }

    @Override
    public MovimientoDinero getMovimientoDineroById(long id){
        return this.movimientoDineroRepository.findById(id).get();
    }
}
