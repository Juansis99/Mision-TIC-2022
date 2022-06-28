public class taller3Punto04 {
    public static void main(String[] args) {
        double descNosy = 0.05;
        double descPrecio = 0.1;
        String marca = "Nosy";
        double precio = 2500;
        double pago = 0;
        double iva = 0.19;
        if (marca.equalsIgnoreCase("Nosy")){
            descNosy = 0.05;
        } else {
            descNosy = 0;
        }
        if (precio>=2000) {
            descPrecio = 0.1;
        } else {
            descPrecio = 0;
        }
        pago = precio*(1-descNosy-descPrecio)*(1+iva);
        System.out.println("Usted pagara: " + pago);
    }
}
