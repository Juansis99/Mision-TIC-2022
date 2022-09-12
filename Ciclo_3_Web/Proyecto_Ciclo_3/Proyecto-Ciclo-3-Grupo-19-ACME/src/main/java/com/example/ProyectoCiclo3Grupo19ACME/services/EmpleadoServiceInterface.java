package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empleado;

import java.util.List;
import java.util.Map;

public interface EmpleadoServiceInterface {
    List<Empleado> listEmpleado();
    Empleado createEmpleado(Empleado empleado);
    Empleado getEmpleadoById(int idEmpleado);
    Empleado updateEmpleadoById(Integer idEmpleado, Map<Object, Object> objectMap);
    void deleteEmpleadoById(Integer idEmpleado);
}
