public class taller3Punto01 {
    public static void main(String[] args) {
        int comp = 15;
        double desc = 0.1;
        double precio = 11000;
        if (comp<5) {
            System.out.println("el precio total es de: " + comp*precio*desc);
        } else if (comp<10) {
            desc = 0.2;
            System.out.println("el precio total es de: " + comp*precio*desc);
        } else {
            desc = 0.4;
            System.out.println("el precio total es de: " + comp*precio*desc);
        }
    }
}
