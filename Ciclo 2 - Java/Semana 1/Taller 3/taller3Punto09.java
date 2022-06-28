import java.util.Scanner;

public class taller3Punto09 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            System.out.println("Ingrese el grado en el que se encuentra el estudiante");
            int grado = capt.nextInt();
            double notas[][] = new double[4][4];
            String notasCalificadas[][] = new String[4][4];
            String desc = "";
            double prom = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("ingrese la nota de la materia " + (i+1) + " para el periodo " + (j+1));
                    notas[i][j] = capt.nextDouble();
                    prom += notas[i][j];
                    if (notas[i][j] <= 1) {
                        desc = "D";
                    } else if (notas[i][j] < 3) {
                        desc = "I";
                    } else if (notas[i][j] < 3.9) {
                        desc = "A";
                    } else if (notas[i][j] < 4.7) {
                        desc = "S";
                    } else {
                        desc = "E";
                    }
                    notasCalificadas[i][j] = notas[i][j] + desc;
                    System.out.println(notasCalificadas[i][j]);
                }
            }
            if (prom / 16 < 3.5) {
                System.out.println("El estudiante NO ES PROMOVIDO");
            } else {
                if (grado < 11) {
                    System.out.println("El estudiante es Promovido al siguiente grado, grado: " + (grado + 1));
                } else {
                    System.out.println("El estudiante puede graduarse");
                }
            }
        }
    }
}
