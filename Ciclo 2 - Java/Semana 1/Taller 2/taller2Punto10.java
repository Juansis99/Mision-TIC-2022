public class taller2Punto10 {
    public static void main(String[] args) {
        char sexo = 'M';
        double edad = 27;
        double pulso = 0;
        if (sexo=='M') {
            pulso = (210-edad)/10;
            System.out.println("Para un hombre de " + edad + " el pulso debe ser de: " + pulso);
        } else {
            pulso = (220-edad)/10;
            System.out.println("Para una mujer de " + edad + " el pulso debe ser de: " + pulso);
        }
    }
}
