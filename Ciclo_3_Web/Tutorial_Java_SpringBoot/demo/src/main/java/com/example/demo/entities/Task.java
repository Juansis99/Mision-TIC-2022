package com.example.demo.entities;

import java.time.LocalDate;

public class Task {
    //Atributos
    private String description;
    private boolean done;
    private LocalDate duedate;

    //Constructores
    public Task(String description, boolean done, LocalDate duedate) {
        this.description = description;
        this.done = done;
        this.duedate = duedate;
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
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }
}
