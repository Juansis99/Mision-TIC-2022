package com.example.ProyectoCiclo3Grupo19ACME.entities;

import javax.persistence.*;

@Entity
@Table(name = "movimiento_dinero")
public class MovimientoDinero {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "monto", nullable = false)
    private double monto;
    @Column(name = "concepto", nullable = false)
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "nit_empresa", nullable = false, referencedColumnName = "nit")
    private Empresa empresaMov;
    @ManyToOne
    @JoinColumn(name = "id_empleado",nullable = false, referencedColumnName = "idEmpleado")
    private Empleado empleadoMov;

    //Constructores
    public MovimientoDinero(double monto, String concepto){
        this.monto = monto;
        this.concepto = concepto;
    }

    public MovimientoDinero(){
//        this.usuario = empleado;
    }

    //Getters y Setters
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empresa getEmpresa() {
        return empresaMov;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresaMov = empresa;
    }

    public Empleado getEmpleado() {
        return empleadoMov;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleadoMov = empleado;
    }
}
