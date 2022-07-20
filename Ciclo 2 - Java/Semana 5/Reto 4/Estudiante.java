//package Semana 5.Reto 4;

import java.util.ArrayList;

public class Estudiante {
    //Atributos
    String nombreCompleto;
    String documentoIdentidad;
    double nota;
    int grado;
    int edad;

    //Constructores
    public Estudiante(String nombreCompleto, String documentoIdentidad, double nota, int grado, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.nota = nota;
        this.grado = grado;
        this.edad = edad;
    }

    public Estudiante() {
    }

    //Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos
    public static Object[] reportes(ArrayList<Estudiante> grupo) {
        double sum = 0;
        double notaMin = 0;
        double notaMax = 0;
        String nomMin = null;
        String nomMax = null;
        for (int i = 0; i < grupo.size(); i++) {
            sum += grupo.get(i).getNota();
        }
        for (int i = 0; i < grupo.size(); i++) {
            if (i == 0) {
                nomMin = grupo.get(i).getNombreCompleto();
                notaMin = grupo.get(i).getNota();
                nomMax = grupo.get(i).getNombreCompleto();
                notaMax = grupo.get(i).getNota();
            } else {
                if (grupo.get(i).getNota() > notaMax) {
                    notaMax = grupo.get(i).getNota();
                    nomMax = grupo.get(i).getNombreCompleto();
                } else if (grupo.get(i).getNota() < notaMin) {
                    notaMin = grupo.get(i).getNota();
                    nomMin = grupo.get(i).getNombreCompleto();
                }
            }
        }
        Object[] retorno1 = {sum / grupo.size(), nomMin, notaMin, nomMax, notaMax};
        return retorno1;
    }
}
