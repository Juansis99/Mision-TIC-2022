import java.util.Scanner;

public class taller4Punto02 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                double suma = 0;
                double prom = 0;
                double i = 1;
                while (i <= 10) {
                    System.out.println("Ingrese un numero");
                    suma += capt.nextDouble();
                    i++;
                }
                prom = suma/(i-1);
                System.out.println("El promedio de los numeros es: " + prom);
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
