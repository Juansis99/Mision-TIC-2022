import java.util.Scanner;

public class taller4Punto11 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                String nombreVendedor;
                String nombreVendedorMax = "";
                int vendedor = 1;
                double sueldo = 0;
                double sueldoMax = 0;
                while (vendedor<=10) {
                    System.out.println("Ingrese el nombre del vendedor " + vendedor + ":");
                    nombreVendedor = capt.next();
                    double carros = 0;
                    System.out.println("Ingrese la cantidad de carros que vendio " + nombreVendedor);
                    carros = capt.nextDouble();
                    int carro = 1;
                    while (carro<=carros){
                        System.out.println("ingrese el valor del carro #" + carro + " vendido " + nombreVendedor + ":");
                        sueldo += (100000 + capt.nextDouble()*0.02);
                        carro++;
                    }
                    if (vendedor==1){
                        nombreVendedorMax = nombreVendedor;
                        sueldoMax = sueldo;
                    } else {
                        if (sueldo > sueldoMax) {
                            nombreVendedorMax = nombreVendedor;
                            sueldoMax = sueldo;
                        }
                    }
                    vendedor++;
                }
                System.out.println("El vendedor que mas vendio fue " + nombreVendedorMax + " para un sueldo de " + sueldoMax + " mas salario minimo");
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
