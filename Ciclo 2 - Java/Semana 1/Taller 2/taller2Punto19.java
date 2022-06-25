public class taller2Punto19 {
    public static void main(String[] args) {
        double precio = 70000000;
        double devaluacion = 0.2;
        double incremento = 0.05;
        if (precio*devaluacion*3 < (precio*Math.pow((1+incremento), 3)-precio)/2) {
            System.out.println("Comprar el carro");
        } else {
            System.out.println("Comprar el terreno");
        }
    }
}
