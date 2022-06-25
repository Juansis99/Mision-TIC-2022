public class taller2Punto05 {
    public static void main(String[] args) {
        double cash = 50000000;
        double interes = 0.35;
        double rend = cash*interes/100;
        if (rend > 7000) {
            System.out.println("Reinvertir");
        } else {
            System.out.println("No reinvertir");
        }
    }
}
