package com.example.ProyectoCiclo3Grupo19ACME.entities;

public enum EmpleadoRol {
    Admin("Admin"),
    Operario("Operario"),
    Default("Default");

    private final String displayValue;

    private EmpleadoRol(String displayValue){
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
