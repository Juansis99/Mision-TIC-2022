import java.util.Scanner;

public class taller1Punto08 {
    public static void main(String[] args) {
        int velLuz = 300000;
        try (Scanner capt = new Scanner(System.in)) {
            System.out.println("Ingrese el tiempo en segundos");
            int tiempo = capt.nextInt();
            System.out.println(
                    "El espacio recorrido por la luz en " + tiempo + " segundos es de: " + tiempo * velLuz + " Km");
        }
    }
}
