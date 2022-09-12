package com.example.ProyectoCiclo3Grupo19ACME.services;
import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import com.example.ProyectoCiclo3Grupo19ACME.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.*;
@Service
public class EmpresaService implements EmpresaServiceEInterface {
    private EmpresaRepository empresaRepository;
    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }
    @Override
    public List<Empresa> listEmpresa(){
        return this.empresaRepository.findAll();
    }
    @Override
    public Empresa getEmpresaById(int nit){
        return this.empresaRepository.findById(nit).get();
    }
    @Override
    public Empresa createEmpresa(Empresa empresa){
        return this.empresaRepository.save(empresa);
    }
    @Override
    public Empresa updateEmpresaById(Integer nit, Map<Object, Object> objectMap){
        Empresa empresa =empresaRepository.findById(nit).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empresa.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,empresa,value);
        });
        return empresaRepository.save(empresa);
    }
    @Override
    public void deleteEmpresaById(Integer nit){
        empresaRepository.deleteById(nit);
    }
}
