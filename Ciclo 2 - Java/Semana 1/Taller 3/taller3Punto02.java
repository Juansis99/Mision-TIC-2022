public class taller3Punto02 {
    public static void main(String[] args) {
        int comp = 15;
        double precio = 300;
        if (comp<5) {
            System.out.println("El precio de cada llanta es de: " + precio + "\nEl precio total es de: " + comp*precio);
        } else if (comp<=10) {
            precio = 250;
            System.out.println("El precio de cada llanta es de: " + precio + "\nEl precio total es de: " + comp*precio);
        } else {
            precio = 200;
            System.out.println("El precio de cada llanta es de: " + precio + "\nEl precio total es de: " + comp*precio);
        }
    }
}
