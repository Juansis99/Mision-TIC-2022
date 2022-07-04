import java.util.Scanner;

public class taller4Punto05 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                System.out.println("Ingrese el numero al que desee conocerle el factorial:");
                int nums = Math.abs(capt.nextInt());
                int i = nums;
                int fact = 1;
                while (i >0) {
                    fact *= i;
                    i --;
                }
                System.out.println("El factorial del numero " + nums + " es: "+ fact);
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
