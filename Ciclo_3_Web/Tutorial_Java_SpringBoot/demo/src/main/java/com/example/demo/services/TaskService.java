//El servicio es el encargado de la ejecucion de la logica/reglas del negocio
//El servicio es el encargado de entregarle la informacion al controlador
//El servicio es el encargado de pedirle informacion al repositorio
package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;

import java.time.LocalDate;

public class TaskService {
    /*Esta clase es la encargada de ejecutar las reglas de negocio para la apliacion*/
    //Atributos
    Task tarea1; //Se importa la clase Task y las tarea que vimos al incio en el main
    Task tarea2;
    TaskList propositos; //Se importa la clase TaskList y la lista de tareas que vimos al inicio del main

    //Constructor
    public TaskService(){
        this.tarea1 = new Task("Aprender Java", false, LocalDate.of(2022,12,31));
        this.tarea2 = new Task("Aprender HTML", false, LocalDate.of(2022,12,31));
        this.propositos = new TaskList("Propositos fin de año");
        /*se agregan directamente desde el constructor las dos tareas a la lista de tareas, mas adelante se modifica
        para hacer que el usuario sea quien las añada */
        propositos.addTask(tarea1);
        propositos.addTask(tarea2);
    }

    //Getters
    /*Esta funcion en el servicio se hace para que el usuario pueda consultar los propositos. esto hace que ya no sea
    necesario crear la tarea en el controlados sino una instancia del servicio y usar la funcion del servicio */
    public TaskList getTaskList(){
        return this.propositos;
    }
}
