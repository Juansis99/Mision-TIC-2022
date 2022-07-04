import java.util.Scanner;

public class taller4Punto03 {
    
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                System.out.println("Ingrese la cantidad de numero a procesar");
                double nums = capt.nextDouble();
                double i = 1;
                double suma = 0;
                double prom = 0;
                while (i <= nums) {
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
