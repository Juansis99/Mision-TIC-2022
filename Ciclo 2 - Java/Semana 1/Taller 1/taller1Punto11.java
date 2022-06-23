import java.util.Scanner;
public class taller1Punto11 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            System.out.println("Ingrese el salario basico mensual");
            double sbm = capt.nextDouble();
            double sbmh = sbm/30/8;
            System.out.println("Ingrese las horas extras laboradas");
            double he = capt.nextDouble();
            System.out.println("1: Hora extra diurna \n2: Hora extra nocturna \n3: Hora extra festiva \n4: Hora extra dominical");
            System.out.println("Ingrese el tipo de las horas extras laboradas");
            int opc = capt.nextInt();
            double vhe=sbmh;
            switch (opc) {
                case 1:
                    vhe = sbmh*1.25;
                    break;
                case 2:
                    vhe = sbmh*1.35;
                    break;
                case 3:
                    vhe = sbmh*1.75;
                    break;
                case 4:
                    vhe = sbmh*2;
                    break;
            }
            System.out.println("Ingrese la candidad de dias que falto");
            double df = capt.nextDouble();
            double sb = (30-df)*8*sbmh;
            double vhet = he*vhe;
            double desc = (sb+vhet)*0.08;
            double total = sb+vhet-desc;
            System.out.println("Salario basico: " + sb + "\nIngresos por horas extras: " + vhet + "\nDescuentos: " + desc + "\nTotal a pagar: " + total);
        }
    }
}
