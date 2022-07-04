import java.util.Scanner;

public class taller4Punto09 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                int tabla[][], f, c, num2, num4;
                System.out.println("A continuacion se presenta las tablas de multiplicar desde 1 hasta un numero deseado");
                System.out.println("Si se ingresa un numero negativo, la tabla tomara el valor absoluto para presentar el resultado");
                System.out.println("Ingrese hasta que numero desea las tablas de muiltiplicar");
                num2 = Math.abs(capt.nextInt());
                c = Math.abs(1 - num2);
                System.out.println("Ingrese el multiplo maximo de las tablas que desee");
                num4 = Math.abs(capt.nextInt());
                f = Math.abs(1 - num4);
                tabla = new int[f + 1][c + 1];
                if (1 == num2) {
                    System.out.println("Tabla de multiplicar del " + 1);
                } else {
                    System.out.println(
                            "Tablas de multiplicar del " + Math.min(1, num2) + " al " + Math.max(1, num2));
                }
                if (1 == num4) {
                    System.out.println("para el multiplo: " + 1);
                } else {
                    System.out.println("entre los multiplos: " + Math.min(1, num4) + " y " + Math.max(1, num4));
                }
                for (int i = 0; i <= f; i++) {
                    for (int j = 0; j <= c; j++) {
                        tabla[i][j] = (i + Math.min(1, num4)) * (j + Math.min(1, num2));
                        System.out.print((j + Math.min(1, num2)) + " X " + (i + Math.min(1, num4)) + " = " + tabla[i][j] + "     ");
                    }
                    System.out.println("");
                }
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
