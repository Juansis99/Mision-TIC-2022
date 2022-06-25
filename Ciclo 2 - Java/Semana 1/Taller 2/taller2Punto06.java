public class taller2Punto06 {
    public static void main(String[] args) {
        double tiempoDesp = 17.5;
        double tiempoRep = 24-tiempoDesp;
        double cal = tiempoDesp*1.08*60 + tiempoRep*1.66*60;
        System.out.println("Utd consume: " + cal + " Cal");
    }
}
