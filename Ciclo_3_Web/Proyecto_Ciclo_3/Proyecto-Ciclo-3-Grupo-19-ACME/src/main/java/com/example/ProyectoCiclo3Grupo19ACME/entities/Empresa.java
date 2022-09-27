package com.example.ProyectoCiclo3Grupo19ACME.entities;

import lombok.*;
import javax.persistence.*;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empresa")
public class Empresa {
    //Atributos
    @Id
    @Column(name = "nit", nullable = false, unique = true)
    private int nit;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "adress", nullable = false)
    private String adress;
    @Column(name = "telf", nullable = false)
    private int telf;
}
