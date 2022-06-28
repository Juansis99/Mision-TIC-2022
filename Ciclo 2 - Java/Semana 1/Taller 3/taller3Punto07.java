import java.util.Scanner;

public class taller3Punto07 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            double seguro = 0;
            double descuento = 0;
            double costo = 0;
            String carroString = "";
            System.out.println("Ingrese el nombre");
            String nombre = capt.next();
            System.out.println(
                    "Seleccione el numero del carro que desea alquilar:\n1. BMW: 650000 por dia\n2. Megane: 120000 por dia\n3. Mercedes: 700000 por dia\n4. Twingo: 100000 por dia\n5. Chevrolet Aveo: 150000 por dia");
            int carro = capt.nextInt();
            switch (carro) {
                case 1:
                    costo = 650000;
                    carroString = "BMW";
                    break;
                case 2:
                    costo = 120000;
                    carroString = "Megane";
                    break;
                case 3:
                    costo = 700000;
                    carroString = "Mercedes";
                    break;
                case 4:
                    costo = 100000;
                    carroString = "Twingo";
                    break;
                case 5:
                    costo = 150000;
                    carroString = "Chevrolet Aveo";
                    break;
            }
            System.out.println("Escriba el numero de dias que va a tomar el vehiculo");
            double dias = capt.nextInt();
            System.out.println("Desea tomar un seguro?\nEste aumentara su cuenta en un 5%\nSi/No");
            String tomaSeguro = capt.next();
            if (tomaSeguro.equalsIgnoreCase("Si")) {
                seguro = 0.05;
            }
            if (dias < 3) {
                System.out.println("Senor " + nombre + " usted tendra " + descuento * 100 + "% de descuento.\nPor los " + dias + " dias del "
                + carroString + " debera pagar: " + dias * costo * (1 - descuento) * (1 + seguro));
            } else if (dias <= 5) {
                descuento = 0.1;
                System.out.println("Senor " + nombre + " usted tendra " + descuento * 100 + "% de descuento.\nPor los " + dias + " dias del "
                + carroString + " debera pagar: " + dias * costo * (1 - descuento) * (1 + seguro));
            } else if (dias <= 10) {
                descuento = 0.15;
                System.out.println("Senor " + nombre + " usted tendra " + descuento * 100 + "% de descuento.\nPor los " + dias + " dias del "
                + carroString + " debera pagar: " + dias * costo * (1 - descuento) * (1 + seguro));
            } else {
                descuento = 0.2;
                System.out.println("Senor " + nombre + " usted tendra " + descuento * 100 + "% de descuento.\nPor los " + dias + " dias del "
                + carroString + " debera pagar: " + dias * costo * (1 - descuento) * (1 + seguro));
            }
        }
    }
}
