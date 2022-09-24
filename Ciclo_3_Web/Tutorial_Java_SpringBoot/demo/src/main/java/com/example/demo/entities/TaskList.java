package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    //Atributos
    private String name;
    private List<Task> taskList;

    //Constructor
    public TaskList(String name) {
        this.setName(name);
        this.taskList = new ArrayList<Task>();
    }

    //Metodos
    public void addTask(Task task) {
        this.taskList.add(task);
    }

    //Setters y Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTaskList() {
        return this.taskList;
    }

}
