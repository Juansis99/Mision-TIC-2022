public class reporte {
    public static void main(String[] args) {
        double listaNotas[] = { 4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0 };
        double prom = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            prom += listaNotas[i];
        }
        prom /= listaNotas.length;
        double datos[] = new double[3];
        datos[0] = prom;
        datos[1] = 1000;
        for (double i : listaNotas) {
            if (i < datos[1]) {
                datos[1] = i;
            }
        }
        datos[2] = 0;
        for (double i : listaNotas) {
            if (i > datos[2]) {
                datos[2] = i;
            }
        }
        System.out.println(datos[0]);
        System.out.println(datos[1]);
        System.out.println(datos[2]);
    }
}
