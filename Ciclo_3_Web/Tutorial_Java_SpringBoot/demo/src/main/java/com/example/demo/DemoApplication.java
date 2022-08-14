package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication //Se comenta pues aun no se necesita
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args); //se comenta pues aun no se necesita
		Task tarea1 = new Task("Aprender Java", false, LocalDate.of(2022,12,31));

		System.out.println(tarea1.getDescription());

		tarea1.setDescription("Apender Java y desarrollo web");

		System.out.println(tarea1.getDescription());


		TaskList propositos = new TaskList("Propositos fin de anio");

		propositos.addTask(tarea1);

		System.out.println(propositos.getTaskList().size());


		Task tarea2 = new Task("Aprender HTML", false, LocalDate.of(2022,12,31));

		propositos.addTask(tarea2);

		System.out.println(propositos.getTaskList().size());

	}

}
