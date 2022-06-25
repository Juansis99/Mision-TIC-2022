public class taller2Punto11 {
    public static void main(String[] args) {
        double monto = 54000;
        double cuota = 0;
        if (monto < 50000) {
            cuota = monto*0.03;
        } else {
            cuota = monto*0.02;
        }
        System.out.println("La cuota sera de: " + cuota);
    }
}
