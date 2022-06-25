import java.util.Scanner;
public class taller2Punto02 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = capt.next();
            System.out.println("Ingrese las horas trabajadas: ");
            double horas = capt.nextDouble();
            double pagoBruto = horas*8000;
            System.out.print(nombre + "recibira como pago: ");
            double pagoNeto = 0;
            if (pagoBruto<=700000){
                pagoNeto=pagoBruto*0.965;
            } else {
                pagoNeto=pagoBruto*0.915;
            }
            System.out.println(pagoNeto + " COP");
        }
    }
}
