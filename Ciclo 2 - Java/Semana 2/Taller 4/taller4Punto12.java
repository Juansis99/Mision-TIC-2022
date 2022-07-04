import java.util.Scanner;
import java.util.ArrayList;

public class taller4Punto12 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                String repetir2 = "Si";
                double precioUnitarioHoja = 1000;
                int cont = 0;
                int tipo;
                int rep = 0;
                ArrayList<String> nombreCliente = new ArrayList<>();
                ArrayList<Integer> tipoCliente = new ArrayList<>();
                ArrayList<Double> cantidadHojasCompradas = new ArrayList<>();
                ArrayList<Double> precioPorHoja = new ArrayList<>();
                while (repetir2.equalsIgnoreCase("Si")) {
                    System.out.println("Ingrese el nombre del cliente al que se le hara la factura");
                    nombreCliente.add(capt.next());
                    System.out.println("Cual es el tipo del cliente: " + nombreCliente.get(cont) + " 1, 2, 3 o 4.");
                    tipo = capt.nextInt();
                    tipoCliente.add(tipo);
                    System.out.println("Cuantas hojas compra el cliente: " + nombreCliente.get(cont));
                    cantidadHojasCompradas.add(capt.nextDouble());
                    switch (tipo){
                        case 1:
                            precioPorHoja.add(precioUnitarioHoja*(0.95));
                            break;
                        case 2:
                            precioPorHoja.add(precioUnitarioHoja*(0.92));
                            break;
                        case 3:
                            precioPorHoja.add(precioUnitarioHoja*(0.88));
                            break;
                        case 4:
                            precioPorHoja.add(precioUnitarioHoja*(0.85));
                            break;
                    }
                    cont++;
                    System.out.println("Tiene mas clientes para ingresar? Si/No");
                    repetir2 = capt.next();
                }
                System.out.println("Reporte de ventas por cliente:");
                System.out.println("Cliente     Tipo Cliente      Hojas compradas        Precio unitario");
                while (rep<tipoCliente.size()){
                    System.out.println(nombreCliente.get(rep) + "               " + tipoCliente.get(rep) + "               " + cantidadHojasCompradas.get(rep) + "                     " + precioPorHoja.get(rep));
                    rep++;
                }
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}