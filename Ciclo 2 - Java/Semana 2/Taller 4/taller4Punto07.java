import java.util.Scanner;

public class taller4Punto07 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                System.out.println("Ingrese el numero de filas que desea imprimir");
                int nums = Math.abs(capt.nextInt());
                int i = 1;
                String ast = "*";
                while (i <= nums) {
                    System.out.println(ast.repeat(i));
                    i++;
                }
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
