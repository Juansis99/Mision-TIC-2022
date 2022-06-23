import java.util.Scanner;

public class taller1Punto09 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            System.out.println("Ingrese el precio que pago por el articulo");
            double pv = capt.nextDouble();
            double costo = pv / 1.15 / 2.5;
            System.out.println("El costo del producto es de " + costo + " USD");
        }
    }
}
