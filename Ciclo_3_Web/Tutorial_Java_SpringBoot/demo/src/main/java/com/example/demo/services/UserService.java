package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
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
        // (String) es para hacer el parseo o el casteo de objeto a string
        // los textos que estan dentro del .get() son las llaves de cada uno de las parejas del map que entrega el userData (el .getClaims())
        String email = (String) userData.get("email");
        User user = findUserByEmail(email);
        if(user == null){
            String name = (String) userData.get("nickname");
            String image = (String) userData.get("picture");
            String auth0ID = (String) userData.get("sub");
            User newUser = new User(email=email, image=image, auth0ID=auth0ID);
            return createUser(newUser);
        }
        return user;
    }
}
