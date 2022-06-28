public class taller3Punto06 {
    public static void main(String[] args) {
        double capitalActual = -50000;
        double prestamo = 0;
        if(capitalActual <0) {
            prestamo = 10000-capitalActual;
        } else if (capitalActual <20000) {
            prestamo = 20000-capitalActual;
        }
        System.out.println("Presto: " + prestamo + " para lo siguiente:\n5000 para equipo de computo. \n2000 para moviliario\n" + (capitalActual+prestamo-5000-2000)/2 + " para compra de insumos y otorgar insentivos al personal");
    }
}
