import java.util.Scanner;

public class tablasDeMultiplicar {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            // Ejercicio de las tablas de multiplicar
            int tabla[][], f, c, num1, num2, num3, num4;
            System.out.println(
                    "A continuacion se presenta una tabla de multiplicar para un numero o un rango de numeros que desee");
            System.out.println(
                    "Si se ingresa un numero negativo, la tabla tomara el valor absoluto para presentar el resultado");
            System.out.println("Ingrese el primer numero");
            num1 = Math.abs(capt.nextInt());
            System.out.println("Ingrese el segundo numero");
            num2 = Math.abs(capt.nextInt());
            c = Math.abs(num1 - num2);
            System.out.println("Ingrese el multiplo menor desde el desea que inicie la tabla");
            num3 = Math.abs(capt.nextInt());
            System.out.println("Ingrese el multiplo maximo de la tabla que desee");
            num4 = Math.abs(capt.nextInt());
            f = Math.abs(num3 - num4);
            tabla = new int[f + 1][c + 1];
            if (num1 == num2) {
                System.out.println("Tabla de multiplicar del " + num1);
            } else {
                System.out.println("Tablas de multiplicar del " + Math.min(num1, num2) + " al " + Math.max(num1, num2));
            }
            if (num3 == num4) {
                System.out.println("para el multiplo: " + num3);
            } else {
                System.out.println("entre los multiplos: " + Math.min(num3, num4) + " y " + Math.max(num3, num4));
            }
            for (int i = 0; i <= f; i++) {
                for (int j = 0; j <= c; j++) {
                    tabla[i][j] = (i + Math.min(num3, num4)) * (j + Math.min(num1, num2));
                    System.out
                            .print((j + Math.min(num1, num2)) + " X " + (i + Math.min(num3, num4)) + " = " + tabla[i][j]
                                    + "     ");
                }
                System.out.println("");
            }
        }
    }
}
