package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//El @RestController se agrego con el path sugerido y ahi si se activo
@RestController //Hace que Spring Boot sepa que la funcion se va a exponer a los usuarios
public class TaskController {
    //Antes de la siguiente linea se debe agregar en dependencies la de web de spring boot para proyectos con maven
    //https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
    //Una vez se agreguen las dos lineas anteriores, podemos agregar la siguiente anotacion
    @GetMapping("/tasks") /*con esta linea se especifica que cada que el usuario valla a su navegador y haga una
    peticion GET al puerto donde esta el servidor desplegado (en este caso el puerto 8080) en la ruta /task el sistema
    debera retornar lo especificado en la funcion de a continuacion
    Se puede verificar desde un navegador entrando al localhost:Puerto/recurso (para este caso "localhost:8080/tasks") */
    public String TaskList(){
        return "Hola mundo, soy un recurso HTTP";
    }
}
