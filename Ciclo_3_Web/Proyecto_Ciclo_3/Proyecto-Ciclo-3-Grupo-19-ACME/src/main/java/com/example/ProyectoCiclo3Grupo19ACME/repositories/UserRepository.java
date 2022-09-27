package com.example.ProyectoCiclo3Grupo19ACME.repositories;


import com.example.ProyectoCiclo3Grupo19ACME.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
