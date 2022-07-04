import java.util.Scanner;

public class taller4Punto04 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                System.out.println("El anio actual es 2022");
                double estudiante = 750;
                double crecimiento = 0.12;
                double anio = 2035;
                int i = 2023;
                while (i <= anio) {
                    estudiante += estudiante * crecimiento;
                    i++;
                }
                System.out.println("Los estudiantes esperados para el 2035 son: " + estudiante);
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }

    }
}
