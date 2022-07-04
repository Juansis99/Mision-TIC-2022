import java.util.Scanner;

public class taller4Punto08 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                int tabla[], f, num1, num3, num4;
                System.out.println("A continuacion se presenta una tabla de multiplicar para un numero que desee");
                System.out.println("Si se ingresa un numero negativo, la tabla tomara el valor absoluto para presentar el resultado");
                System.out.println("Ingrese el numero");
                num1 = Math.abs(capt.nextInt());
                System.out.println("Ingrese el multiplo menor desde el desea que inicie la tabla");
                num3 = Math.abs(capt.nextInt());
                System.out.println("Ingrese el multiplo maximo de la tabla que desee");
                num4 = Math.abs(capt.nextInt());
                f = Math.abs(num3 - num4);
                tabla = new int[f + 1];
                System.out.println("Tabla de multiplicar del " + num1);
                if (num3 == num4) {
                    System.out.println("para el multiplo: " + num3);
                } else {
                    System.out.println("entre los multiplos: " + Math.min(num3, num4) + " y " + Math.max(num3, num4));
                }
                for (int i = 0; i <= f; i++) {
                    tabla[i] = (i + Math.min(num3, num4))*num1;
                    System.out.print((num1) + " X " + (i + Math.min(num3, num4)) + " = " + tabla[i] + "     ");
                    System.out.println("");
                }
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
