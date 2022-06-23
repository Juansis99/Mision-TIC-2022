import java.util.Scanner;
public class taller1Punto01 {
    public static void main(String[] args) {
        try (Scanner captura = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre");
            String nombre = captura.next();
            System.out.println("Ingrese su apellido");
            String apellido = captura.next();
            System.out.println("Ingrese su correo");
            String correo = captura.next();
            System.out.println("Ingrese su telefono");
            String telefono = captura.next();
            System.out.println("Sus datos son los siguientes: ");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Correo: " + correo);
            System.out.println("Telefono: " + telefono);
        }
    }
}
