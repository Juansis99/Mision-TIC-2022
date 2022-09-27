package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empleado;
import com.example.ProyectoCiclo3Grupo19ACME.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class EmpleadoService implements EmpleadoServiceInterface {
    //Atributos
    private EmpleadoRepository empleadoRepository;

    //Constructores
    public EmpleadoService(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    //Metodos
    @Override
    public List<Empleado> listEmpleado(){
        return this.empleadoRepository.findAll();
    }

    @Override
    public Empleado getEmpleadoById(int idEmpleado){
        return this.empleadoRepository.findById(idEmpleado).get();
    }

    public Empleado findEmpleadoByCorreoEmpleado(String email){
        return this.empleadoRepository.findByCorreoEmpleado(email);
    }

    @Override
    public Empleado createEmpleado(Empleado empleado){
        return this.empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleadoById(Integer idEmpleado, Map<Object, Object> objectMap){
        Empleado empleado = empleadoRepository.findById(idEmpleado).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empleado.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,empleado,value);
        });
        return empleadoRepository.save(empleado);
    }

    @Override
    public void deleteEmpleadoById(Integer idEmpleado){
        empleadoRepository.deleteById(idEmpleado);
    }
}
