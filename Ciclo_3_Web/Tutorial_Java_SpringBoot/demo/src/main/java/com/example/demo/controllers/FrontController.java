package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.entities.User;
import com.example.demo.services.TaskService;
import com.example.demo.services.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {
    //Atributos
    TaskService taskService;
    UserService userService;
    //Constructor
    public FrontController(TaskService taskService, UserService userService){
        this.taskService = taskService;
        this.userService = userService;
    }
    //Metodos
    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal != null){
            User user = userService.getOrCreateUser(principal.getClaims());
            model.addAttribute("user", user);
        }
        return "index";
    }
//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }

    @GetMapping("/tasks")
    public String tasks(Model model){
        List<Task> tasks = this.taskService.getTaskList();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @GetMapping("/tasks/new")
    public String newTask(Model model){
        model.addAttribute("task", new Task());
        return "new-task";
    }
}
