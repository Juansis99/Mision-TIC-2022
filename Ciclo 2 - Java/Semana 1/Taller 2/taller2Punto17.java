public class taller2Punto17 {
    public static void main(String[] args) {
        double hectareas = 100;
        double metraje = hectareas*10000;
        double pinosUnidad = 8;
        double pinosMetraje = 10;
        double oyamelUnidad = 15;
        double oyamelMetraje = 15;
        double cedrosUnidad = 10;
        double cedrosMetraje = 18;
        if (metraje>1000000) {
            System.out.println("El terreno se sembrara de la siguiente forma: \nPino: 70% equivalente a " + 0.7*metraje/pinosMetraje*pinosUnidad + " pinos\nOyamel: 20% equivalente a " + 0.2*metraje/oyamelMetraje*oyamelUnidad + " oyameles\nCedro: 10% equivalente a " + 0.1*metraje/cedrosMetraje*cedrosUnidad + " cedros");
        } else {
            System.out.println("El terreno se sembrara de la siguiente forma: \nPino: 50% equivalente a " + 0.5*metraje/pinosMetraje*pinosUnidad + " pinos\nOyamel: 30% equivalente a " + 0.3*metraje/oyamelMetraje*oyamelUnidad + " oyameles\nCedro: 20% equivalente a " + 0.2*metraje/cedrosMetraje*cedrosUnidad + " cedros");
        }
    }
}
