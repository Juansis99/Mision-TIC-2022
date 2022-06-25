public class taller2Punto07 {
    public static void main(String[] args) {
        int clave = 1;
        String nombre = "Pera";
        double precioOriginal = 5000;
        double precioDescuento = precioOriginal;
        if (clave==1) {
            precioDescuento = precioOriginal*0.9;
        } else if (clave==2) {
            precioDescuento = precioOriginal*0.8;
        } else {
            System.out.println("Clave invalida");
        }
        System.out.println("Nombre: " + nombre + "\nClave: 0" + clave + "\nPrecio Original: " + precioOriginal + "\nPrecio Decuento: " + precioDescuento);
    }
}
