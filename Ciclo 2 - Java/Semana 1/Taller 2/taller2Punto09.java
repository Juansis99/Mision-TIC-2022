public class taller2Punto09 {
    public static void main(String[] args) {
        int numero = 53;
        double valor = 4568755;
        double desc = 0;
        if (numero<74) {
            desc = valor*0.15;
        } else {
            desc = valor*0.2;
        }
        System.out.println("El valor descontado es de: " + desc);
    }
}
