import java.util.Scanner;
import java.util.ArrayList;

public class taller4Punto10 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                System.out.println(
                        "Ingrese el primer numero del rango donde queire averiguar cuantos y cuales son los numeros primos");
                int num1 = Math.abs(capt.nextInt());
                System.out.println(
                        "Ingrese el segundo numero del rango donde queire averiguar cuantos y cuales son los numeros primos");
                int num2 = Math.abs(capt.nextInt());
                int min = Math.min(num1, num2);
                int max = Math.max(num1, num2);
                int cont = 0;
                ArrayList<Integer> primos = new ArrayList<>();
                while (min <= max) {
                    cont = 0;
                    for (int i = 1; i <= min; i++) {
                        if (min % i == 0) {
                            cont++;
                        }
                    }
                    if (cont <= 2) {
                        primos.add(min);
                    }
                    min++;
                }
                System.out.println("Entre " + Math.min(num1, num2) + " y " + Math.max(num1, num2) + " hay " + primos.size() + " numero primos");
                System.out.print("Los numero primos son: ");
                for (int i =0;i<primos.size();i++) {
                    System.out.print(primos.get(i) + " ");
                }
                System.out.println("");
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
