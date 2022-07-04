import java.util.Scanner;

public class taller4Punto01 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                int i = 0;
                int suma = 0;
                while (i <= 160) {
                    if (i % 2 == 0) {
                        suma += i;
                    }
                    i++;
                }
                System.out.println("La suma de los numeros pares hasta el 160 es: " + suma);
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
