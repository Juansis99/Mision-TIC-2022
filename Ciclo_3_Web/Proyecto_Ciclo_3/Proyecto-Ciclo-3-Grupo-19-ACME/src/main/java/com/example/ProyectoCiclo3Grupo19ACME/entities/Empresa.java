package com.example.ProyectoCiclo3Grupo19ACME.entities;
import lombok.*;
import javax.persistence.*;
@Entity
@Setter//AUTOMATICO SETTER
@Getter//AUTOMATICO GETTERS
@AllArgsConstructor//CONSTRUCTOR AUTOMÁTICO
@NoArgsConstructor//CONSTRUCTOR SIN ARGS
@Table(name = "empresa")//NOMBRE DE LA TABLA PARA ESTA ENTIDAD
public class Empresa {
    //ATRIBUTOS
    @Id /*@GeneratedValue(strategy = GenerationType.AUTO)*/ @Column(name = "nit", nullable = false) private int nit;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "adress", nullable = false)  private String adress;
    @Column(name = "telf", nullable = false) private int telf;
}
