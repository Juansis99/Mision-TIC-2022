public class taller2Punto16 {
    public static void main(String[] args) {
        double hectareas = 100;
        double metraje = hectareas*10000;
        if (metraje>1000000) {
            System.out.println("El terreno se sembrara de la siguiente forma: \nPino: 70% \nOyamel: 20% \nCedro: 10%");
        } else {
            System.out.println("El terreno se sembrara de la siguiente forma: \nPino: 50% \nOyamel: 30% \nCedro: 20%");
        }
    }
}
