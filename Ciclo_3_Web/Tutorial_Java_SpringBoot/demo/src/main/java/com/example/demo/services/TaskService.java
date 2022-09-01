//El servicio es el encargado de la ejecucion de la logica/reglas del negocio
//El servicio es el encargado de entregarle la informacion al controlador
//El servicio es el encargado de pedirle informacion al repositorio
package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service //Se agrega la etiqutea par que java spring boot injecte automaticamente las dependencias
public class TaskService {
    //Se agrega un atributo que enplee el repositorio
    private TaskRepository taskRepository;

    //Se comenta el siguiente codigo pues al tener el repositorio no es necesaro tener "Quemado" las funciones
//    /*Esta clase es la encargada de ejecutar las reglas de negocio para la apliacion*/
//    //Atributos
//    Task tarea1; //Se importa la clase Task y las tarea que vimos al incio en el main
//    Task tarea2;
//    TaskList propositos; //Se importa la clase TaskList y la lista de tareas que vimos al inicio del main

    //Constructor
    //Como ya se creo el repositorio, al servicio se le pasa como argumento un repositorio
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository; //se instancia el reporsitorio cuando se crea el servicio

        //Se comenta el codigo siguiente pues al tener el repositorio no es necesaro tener "Quemado" las funciones
//        this.tarea1 = new Task("Aprender Java", false, LocalDate.of(2022,12,31));
//        this.tarea2 = new Task("Aprender HTML", false, LocalDate.of(2022,12,31));
//        this.propositos = new TaskList("Propositos fin de año");
//        /*se agregan directamente desde el constructor las dos tareas a la lista de tareas, mas adelante se modifica
//        para hacer que el usuario sea quien las añada */
//        propositos.addTask(tarea1);
//        propositos.addTask(tarea2);
    }

    //Getters
    /*Esta funcion en el servicio se hace para que el usuario pueda consultar los propositos. esto hace que ya no sea
    necesario crear la tarea en el controlados sino una instancia del servicio y usar la funcion del servicio */
    //Dado que se busca retornar una lista con todos los tasks de la BD se debe cambiar el tipo de dato del metodo
    public /*TaskList*/ List<Task> getTaskList(){
        //Se comenta la siguiente linea pues al tener el repositorio no es necesaro tener "Quemado" el retorno
        //return this.propositos;
        return this.taskRepository.findAll(); //con esto se va la base de datos y se obtenen todos los tasks de la BD
    }
    //Se crea la funcion que permite guardar la tarea que viene desde el controlador
    public Task createTask(Task newTask){
        return this.taskRepository.save(newTask); //el repositorio toma la tarea nueva que entra y la guarda en la BD
    }
}
