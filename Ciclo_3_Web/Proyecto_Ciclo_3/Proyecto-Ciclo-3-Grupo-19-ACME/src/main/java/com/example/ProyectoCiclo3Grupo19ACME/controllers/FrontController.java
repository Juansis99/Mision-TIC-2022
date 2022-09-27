package com.example.ProyectoCiclo3Grupo19ACME.controllers;

import com.example.ProyectoCiclo3Grupo19ACME.entities.*;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpleadoService;
import com.example.ProyectoCiclo3Grupo19ACME.services.EmpresaService;
import com.example.ProyectoCiclo3Grupo19ACME.services.MovimientoDineroService;
import com.example.ProyectoCiclo3Grupo19ACME.services.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class FrontController {
    //Atributos
    EmpleadoService empleadoService;
    EmpresaService empresaService;
    MovimientoDineroService movimientoDineroService;
    UserService userService;

    //Constructores
    public FrontController(EmpleadoService empleadoService, EmpresaService empresaService, MovimientoDineroService movimientoDineroService, UserService userService){
        this.empleadoService = empleadoService;
        this.empresaService = empresaService;
        this.movimientoDineroService= movimientoDineroService;
        this.userService = userService;
    }

    //Metodos
    public void getOrSetUserRol(Model model, OidcUser principal){
        if(principal != null){
            String emailLogin = (String) (principal.getClaims()).get("email");
            Empleado empleadoLogin = empleadoService.findEmpleadoByCorreoEmpleado(emailLogin);
            if(empleadoLogin == null){
                empleadoLogin = new Empleado(0,principal.getNickName(),emailLogin,EmpleadoRol.Default);
            }
            model.addAttribute("empleadoLogin", empleadoLogin);
        }
    }

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        if(principal != null){
            User user = this.userService.getOrCreateUser(principal.getClaims());
            model.addAttribute("user", user);
        }
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        return "home";
    }

    @GetMapping("/home/empresas")
    public String empresaTabla(Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        List<Empresa> empresaList = this.empresaService.listEmpresa();
        model.addAttribute("empresaList", empresaList);
        return "empresaTabla";
    }

    @GetMapping("/home/empresas/nueva")
    public String empresa(Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        model.addAttribute("empresa", new Empresa());
        return "empresa";
    }

    @GetMapping("/home/empresas/actualizar/{id}")
    public String empresa(@PathVariable("id") Integer id, Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        model.addAttribute("empresa", empresaService.getEmpresaById(id));
        return "empresaActualizar";
    }

    @GetMapping("/home/usuarios")
    public String usuarioTabla(Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        List<Empleado> empleadoList = this.empleadoService.listEmpleado();
        model.addAttribute("empleadoList", empleadoList);
        return "usuarioTabla";
    }

    @GetMapping("/home/usuarios/nuevo")
    public String usuario(Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        model.addAttribute("empleado", new Empleado());
        return "usuario";
    }

    @GetMapping("/home/usuarios/actualizar/{id}")
    public String usuario(@PathVariable("id") Integer id, Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        model.addAttribute("empleado", empleadoService.getEmpleadoById(id));
        return "usuarioActualizar";
    }

    @GetMapping("/home/transaccion")
    public String movimientoDineroTabla(Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        List<MovimientoDinero> movimientoDineroList = this.movimientoDineroService.getMovimientoDineroList();
        model.addAttribute("movimientoList", movimientoDineroList);
        return "movimientoDineroTabla";
    }

    @GetMapping("/home/empresas/transacciones/{id}")
    public String movimientoDineroByEmpresaTabla(@PathVariable("id") int id, Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        List<MovimientoDinero> movimientoDineroByEmpresaList = this.movimientoDineroService.getMovimientoDineroByIdEmpresaList(id);
        Empresa empresa = this.empresaService.getEmpresaById(id);
        double totalMonto = 0;
        for(MovimientoDinero movimientoDinero :movimientoDineroByEmpresaList){
            totalMonto += movimientoDinero.getMonto();
        }
        model.addAttribute("movimientoByEmpresaList", movimientoDineroByEmpresaList);
        model.addAttribute("empresa", empresa);
        model.addAttribute("totalMonto", totalMonto);
        return "movimientoDineroByEmpresaTabla";
    }

    @GetMapping("/home/transaccion/nueva")
    public String movimientoDinero(Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        model.addAttribute("movimiento", new MovimientoDinero());
        return "movimientoDinero";
    }

    @GetMapping("/home/transaccion/actualizar/{id}")
    public String movimientoDinero(@PathVariable("id") Integer id, Model model, @AuthenticationPrincipal OidcUser principal){
        getOrSetUserRol(model, principal);
        model.addAttribute("movimiento", movimientoDineroService.getMovimientoDineroById(id));
        return "movimientoDineroActualizar";
    }
}
