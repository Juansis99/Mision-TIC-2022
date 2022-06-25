public class taller2Punto03 {
    public static void main(String[] args) {
        int horas = 1;
        int min = 15;
        if (min>0){
            horas += 1;
        }
        System.out.println("Debe pagar: " + horas*1500 + " COP");
    }
    
}
