//El controlador es la interfaz para el usuario
//El controlador es el encargado de entregarle la informacion al usuario
//El controlador es el encargado de pedirle la informacion al servicio
package com.example.demo.controllers;

//import com.example.demo.entities.Task; //esta linea se comento porque en los retorno ya no se requiere retornar la clase Task
import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.services.TaskService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDate;
import java.util.List;

//El @RestController se agrego con el path sugerido y ahi si se activo
@RestController //Hace que Spring Boot sepa que la funcion se va a exponer a los usuarios
public class TaskController {
    //el siguiente atibuto y constructor se agregas pues ya se requiere para que poder acceder efectivamente al servicio
    //Atributos
    TaskService taskService; //se importa la clase TaskService con el asistente

    //Constructor
    //Se agrega la instanciacion automatica del servicio al controlador dado que ya se tiene tambien el repositorio
    public TaskController(TaskService taskService){
        //Una vez se crea la propiedad/atributo "Servicio" se completa el constructor
        //Se modifica para que no cree uno nuevo sino que tome el que ya tiene como atributo
        this.taskService = /*new TaskService()*/ taskService;
    }
//    //Se comenta este controlador pues se pasa al contrlador del front
//    //Antes de la siguiente linea se debe agregar en dependencies la de web de spring boot para proyectos con maven
//    //https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
//    //Una vez se agreguen las dos lineas anteriores, podemos agregar la siguiente anotacion
//    @GetMapping("/tasks") /*con esta linea se especifica que cada que el usuario valla a su navegador y haga una
//    peticion GET al puerto donde esta el servidor desplegado (en este caso el puerto 8080) en la ruta /task el sistema
//    debera retornar lo especificado en la funcion de a continuacion
//    Se puede verificar desde un navegador entrando al localhost:Puerto/recurso (para este caso "localhost:8080/tasks") */
//    //Como se cambia y se crea el repositorio, ya la funcion no devuelve un objeto TaskList sino una lista de tareas
//    public /*String*/ /*Task*/ /*TaskList*/ List<Task> TaskList(){ /*se cambia el retorno de "String" a la clase Task para mostar si
//        se devuelve la tarea 1*/ /*Al cambiar nuevamente el retorno se modifia de tipo Task a TaskList*/
//        /*Se agrega esta linea para verificar como hacer que el ejericio devuelva una tarea, se importa la clase y la
//        funcion "LocaDate" con la ayuda del asistente */
//        /*Task tarea1 = new Task("Aprender Python", false, LocalDate.of(2022,12,31));
//        //Esta creacion de la tarea 1 ya se realiza desde el servicio, por esta razon ya no se requiere tenerla aca
//         */
//        //return "Hola mundo, soy un recurso HTTP"; //se comenta para crear otro return de la tarea 1
//        /*return tarea1;*/ //es para verificar que si podemos devolver la tarea 1 en el servicio web
//        /*Al correr la aplicacon se puede ver que el sistema devuelve en formato JSON los atributos de dicha clase "Task"
//        realmente lo que se encarga de realizar la transformacion del objeto a JSON es la libreria REST que se instalo
//        previamente con el controlador */
//        /*Como se creo un servicio desde el controlador, todos los metodos del servicio estan disponibles, por esta
//        razon se cambia el return y se coloca uno que nos devuelva la lista */
//        return this.taskService.getTaskList();
//    }

//    //Metodo para json data
//    //Se agrega el metodo para hacer solicitudes POST
//    @PostMapping("/tasks")
//    public Task createTask(@RequestBody Task task){
//        return this.taskService.createTask(task); //Con esto la tarea que llega de postman/insomnia se envia a service para ser guardada
//    }

    //Metodo para front (form-data)
    @PostMapping("/tasks")
    //@ModelAtribute para comunicarse con Thymleaf, @DateTimeFormat para definir el formato de fechas, y una variable tipo model para comunicacion con thymeleaf
    public RedirectView createTask(@ModelAttribute @DateTimeFormat(pattern = "YYYY-MM-DD") Task task, Model model){
        model.addAttribute(task);
        task.setDone(false);
        this.taskService.createTask(task);
        return new RedirectView("/tasks");
    }

    @PatchMapping("/tasks/{id}")
    public RedirectView updateTask(@PathVariable("id") Long id){
        this.taskService.markTaskAsFinished(id);
        return new RedirectView("/tasks");
    }

    @DeleteMapping("tasks/{id}")
    public RedirectView deleteTask(@PathVariable("id") Long id){
        this.taskService.deleteTask(id);
        return new RedirectView("/tasks");
    }
}
