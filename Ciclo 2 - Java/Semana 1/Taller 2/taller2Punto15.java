public class taller2Punto15 {
    public static void main(String[] args) {
        double casa = 250000000;
        double inversionTotal = 10000000;
        double inversionParcial = 0;
        double hipoteca = 0.01;
        double valorHipoteca = hipoteca*casa;
        if (valorHipoteca<1000000){
            inversionParcial = inversionTotal/2;
        } else {
            inversionParcial = (inversionTotal-valorHipoteca)/2;
        }
        System.out.println("La inversion de cada uno sera de: " + inversionParcial);
    }
}
