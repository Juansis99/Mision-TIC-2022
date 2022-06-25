public class taller2Punto13 {
    public static void main(String[] args) {
        double ingreso = 8500;
        double casa = 258000;
        double enganche = 0;
        double mes = 0;
        if (ingreso<8000) {
            enganche = casa*0.15;
            mes = (casa-enganche)/(10*12);
        } else {
            enganche = casa*0.3;
            mes = (casa-enganche)/(7*12);
        }
        System.out.println("Su pago de enganche es de " + enganche + " y sus cuotas de " + mes);
    }
}
