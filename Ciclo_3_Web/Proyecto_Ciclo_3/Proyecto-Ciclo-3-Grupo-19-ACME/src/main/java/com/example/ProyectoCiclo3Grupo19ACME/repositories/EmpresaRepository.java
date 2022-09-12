package com.example.ProyectoCiclo3Grupo19ACME.repositories;

import com.example.ProyectoCiclo3Grupo19ACME.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository //DEFINIMOS LA INTERFAZ COMO TIPO REPOSITORIO TAL CUAL COMO LAS ENTITIES Y SERVICES
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> { //LA INTERFAZ HEREDA DEL REPOSITORIO DE JPA
}