public class taller2Punto08 {
    public static void main(String[] args) {
        int cant = 15;
        int precio = 0;
        if (cant < 5) {
            precio = cant*800;
        } else {
            precio = cant*700;
        }
        System.out.println("El precio total es de: " + precio);
    }
}
