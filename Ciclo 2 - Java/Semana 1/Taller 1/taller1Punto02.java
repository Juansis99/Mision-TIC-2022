import java.util.Scanner;

public class taller1Punto02 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            System.out.println("1: Pera");
            System.out.println("2: Manzana");
            System.out.println("3: Fresa");
            String pera[] = new String[2];
            String manzana[] = new String[2];
            String fresa[] = new String[2];
            String producto[][] = new String[3][2];
            pera[0] = "Pera";
            pera[1] = "1 USD";
            manzana[0] = "Manzana";
            manzana[1] = "2 USD";
            fresa[0] = "Fresa";
            fresa[1] = "3 USD";
            producto[0] = pera;
            producto[1] = manzana;
            producto[2] = fresa;
            System.out.println("Ingrese la primera opcion que desee comprar");
            int opc1 = capt.nextInt();
            System.out.println("Ingrese la segunda opcion que desee comprar");
            int opc2 = capt.nextInt();
            System.out.println(
                    "El primer producto es: " + producto[opc1 - 1][0] + " y su costo es: " + producto[opc1-1][1]);
            System.out.println(
                    "El segundo producto es: " + producto[opc2 - 1][0] + " y su costo es: " + producto[opc2-1][1]);
        }
    }
}
