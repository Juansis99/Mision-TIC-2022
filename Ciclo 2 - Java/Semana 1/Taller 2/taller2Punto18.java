public class taller2Punto18 {
    public static void main(String[] args) {
        double dia1 = 150;
        double dia2 = 200;
        double dia3 = 250;
        double dia4 = 200;
        double dia5 = 170;
        double prom = (dia1+dia2+dia3+dia4+dia5)/5;
        double gananciaDia = 500000; 
        double multaDia = 0;
        if (prom>170) {
            multaDia = gananciaDia*0.5;
        }
        System.out.println("La empresa debera pagar: " + multaDia + " por cada dia que no pare.");
    }
}
