public class taller2Punto12 {
    public static void main(String[] args) {
        double costo = 50000;
        double promedio = 9.3;
        double valor = 0;
        if (promedio < 9) {
            valor = costo * 0.9;
        } else {
            valor = costo * 0.7;
        }
        System.out.println("El valor a pagar sera de: " + valor);
    }
}
