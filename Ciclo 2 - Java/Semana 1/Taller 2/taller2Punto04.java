public class taller2Punto04 {
    public static void main(String[] args) {
        int qCompra = 86;
        int pUnidad = 2000; 
        double pagoBruto = qCompra*pUnidad;
        double pagoNeto = 0;
        int docenas = qCompra/12;
        if (docenas>3){
            pagoNeto = pagoBruto*(1-0.15);
        } else {
            pagoNeto = pagoBruto*(1-0.1);
        }
        double desc = pagoBruto-pagoNeto;
        System.out.println("Monto compra: " + pagoBruto + " COP");
        System.out.println("Monto descuento: " + desc + " COP");
        System.out.println("Monto pagar: " + pagoNeto + " COP");
        System.out.println("Unidades obsequio: " + (docenas-3) + " COP");
    }
}
