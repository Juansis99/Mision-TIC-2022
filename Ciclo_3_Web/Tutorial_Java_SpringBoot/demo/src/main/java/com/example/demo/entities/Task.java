package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Task")
public class Task {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "description")
    private String description;
    @Column(name = "done")
    private boolean done;
    @Column(name = "dueDate")
    private LocalDate dueDate;

    //Constructores
    public Task(String description, boolean done, LocalDate duedate) {
        this.description = description;
        this.done = done;
        this.dueDate = duedate;
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

    public LocalDate getDuedate() {
        return dueDate;
    }

    public void setDuedate(LocalDate duedate) {
        this.dueDate = duedate;
    }
}
