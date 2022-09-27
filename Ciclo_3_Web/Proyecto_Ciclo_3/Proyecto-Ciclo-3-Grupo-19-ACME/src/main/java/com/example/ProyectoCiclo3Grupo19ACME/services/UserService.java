package com.example.ProyectoCiclo3Grupo19ACME.services;

import com.example.ProyectoCiclo3Grupo19ACME.entities.User;
import com.example.ProyectoCiclo3Grupo19ACME.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService implements UserServiceInterface{
    //Atributos
    private UserRepository userRepository;

    //Constructores
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //Metodos
    public User createUser(User newUser){
        return this.userRepository.save(newUser);
    }

    public User findUserByEmail(String email){
        return this.userRepository.findByEmail(email);
    }

    public User getOrCreateUser(Map<String, Object> userData){
        String email = (String) userData.get("email");
        User user = findUserByEmail(email);
        if(user==null){
            String nombre = (String) userData.get("nickname");
            String image = (String) userData.get("picture");
            String auth0ID = (String) userData.get("sub");
            User newUser = new User(email, image, auth0ID, nombre);
            return createUser(newUser);
        }
        return user;
    }
}