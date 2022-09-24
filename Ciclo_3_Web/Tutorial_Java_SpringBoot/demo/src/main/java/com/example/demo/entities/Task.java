package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Task")
public class Task {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Se cambia a public para poder obtenerlo desde la url en el despliegue web
    public long id;
    @Column(name = "description")
    private String description;
    @Column(name = "done")
    private boolean done;
    @Column(name = "dueDate")
    private LocalDate dueDate;

    //Constructores
    public Task(String description, boolean done, LocalDate dueDate) {
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public Task() {
    }

    //Getters y Setters
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
