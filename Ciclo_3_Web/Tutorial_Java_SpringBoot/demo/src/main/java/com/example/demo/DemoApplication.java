package com.example.demo;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
//la anotacion @SpringBootApplication se importa con la sugerencia que se entrega
@SpringBootApplication //Se descomenta pues ya se va a configurar el servidor web
public class DemoApplication {

	public static void main(String[] args) {
		//la anotacion @SpringApplication se importa con la sugerencia que se entrega
		SpringApplication.run(DemoApplication.class, args); //se descomenta pues ya se va a configurar el servidor web
//		Task tarea1 = new Task("Aprender Java", false, LocalDate.of(2022,12,31));
//
//		System.out.println(tarea1.getDescription());
//
//		tarea1.setDescription("Apender Java y desarrollo web");
//
//		System.out.println(tarea1.getDescription());
//
//
//		TaskList propositos = new TaskList("Propositos fin de anio");
//
//		propositos.addTask(tarea1);
//
//		System.out.println(propositos.getTaskList().size());
//
//
//		Task tarea2 = new Task("Aprender HTML", false, LocalDate.of(2022,12,31));
//
//		propositos.addTask(tarea2);
//
//		System.out.println(propositos.getTaskList().size());

	}

}
