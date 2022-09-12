package com.example.ProyectoCiclo3Grupo19ACME.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Empleado {
    //Creacion de la Clase Empleado
    @Id
    private int idEmpleado;
    @Column(nullable = false)
    private String nombrEmpleado;
    @Column(nullable = false)
    private String correoEmpleado;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private EmpleadoRol rolEmpleado;
    @ManyToOne
    @JoinColumn(name = "emp_nit_empresa",nullable = false,referencedColumnName = "nit")
    private Empresa empresaEmpl;

    @OneToMany(mappedBy = "empleadoMov")
    private List<MovimientoDinero> movimientoDineroList;

    //Constructores
    public Empleado(int idEmpleado, String nombrEmpleado, String correoEmpleado, EmpleadoRol rolEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombrEmpleado = nombrEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public Empleado() {
    }

    //Setters y Getters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombrEmpleado() {
        return nombrEmpleado;
    }

    public void setNombrEmpleado(String nombrEmpleado) {
        this.nombrEmpleado = nombrEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public EmpleadoRol getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(EmpleadoRol rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Empresa getEmpresa() {
        return empresaEmpl;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresaEmpl = empresa;
    }
}