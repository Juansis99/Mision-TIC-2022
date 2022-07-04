import java.util.Scanner;

public class taller4Punto06 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            String repetir = "Si";
            while (repetir.equalsIgnoreCase("Si")) {
                System.out.println("Ingrese la cantidad de numeros a procesar");
                int nums = capt.nextInt();
                if (nums <= 1){
                    System.out.println("Para un numero no es valido el ejercicio");
                    break;
                }
                int i = 1;
                int num;
                int max=0;
                int min=0;
                while (i <= nums) {
                    System.out.println("Ingrese un numero");
                    if (i==1) {
                        max=capt.nextInt();
                    } else if (i==2) {
                        num = capt.nextInt();
                        if (num>max) {
                            min=max;
                            max = num;
                        } else {
                            min=num;
                        }
                    } else {
                        num = capt.nextInt();
                        if (num>max) {
                            max = num;
                        } else {
                            min=num;
                        }
                    }
                    i++;
                }
                System.out.println("El numero mayor fue " + max + " y el menor fue "+ min);
                System.out.println("desea repetir el ejercicio? Si/No");
                repetir = capt.next();
            }
        }
    }
}
