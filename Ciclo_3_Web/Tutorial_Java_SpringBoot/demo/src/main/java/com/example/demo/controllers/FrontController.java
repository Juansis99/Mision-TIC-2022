package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {
    //Atributos
    TaskService taskService;
    //Constructor
    public FrontController(TaskService taskService){
        this.taskService = taskService;
    }
    //Metodos
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/tasks")
    public String tasks(Model model){
        List<Task> tasks = this.taskService.getTaskList();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
