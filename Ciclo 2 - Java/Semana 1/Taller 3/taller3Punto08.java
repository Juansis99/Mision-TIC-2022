import java.util.Scanner;

public class taller3Punto08 {
    public static void main(String[] args) {
        try (Scanner capt = new Scanner(System.in)) {
            int pitbull = 6000000;
            int buly = 6500000;
            int rottwhiller = 4000000;
            int labradorRetriever = 3500000;
            int goldenRetriever = 3500000;
            int doberman = 5000000;
            int dogoArgentino = 5500000;
            System.out.println(
                    "Ingrese el numero del perro que quedo en primer lugar\n1. Pitbull\n2. Buly\n3. Rottwhiller\n4. Labrador Retriever\n5. Golde Retriever\n6. Doberman\n7. Dogo argentino");
            int posicion = capt.nextInt();
            switch (posicion) {
                case 1:
                    pitbull *= 2;
                    System.out.println("El nuevo valor del Pitbull es: " + pitbull);
                    break;
                case 2:
                    buly *= 2;
                    System.out.println("El nuevo valor del Pitbull es: " + buly);
                    break;
                case 3:
                    rottwhiller *= 2;
                    System.out.println("El nuevo valor del Pitbull es: " + rottwhiller);
                    break;
                case 4:
                    labradorRetriever *= 2;
                    System.out.println("El nuevo valor del Pitbull es: " + labradorRetriever);
                    break;
                case 5:
                    goldenRetriever *= 2;
                    System.out.println("El nuevo valor del Pitbull es: " + goldenRetriever);
                    break;
                case 6:
                    doberman *= 2;
                    System.out.println("El nuevo valor del Pitbull es: " + doberman);
                    break;
                case 7:
                    dogoArgentino *= 2;
                    System.out.println("El nuevo valor del Pitbull es: " + dogoArgentino);
                    break;
            }
            System.out.println(
                    "Ingrese el numero del perro que quedo en segundo lugar\n1. Pitbull\n2. Buly\n3. Rottwhiller\n4. Labrador Retriever\n5. Golde Retriever\n6. Doberman\n7. Dogo argentino");
            int posicion2 = capt.nextInt();
            if (posicion == posicion2) {
                System.out.println("Perro repetido");
            } else {
                switch (posicion2) {
                    case 1:
                        pitbull += 800000;
                        System.out.println("El nuevo valor del Pitbull es: " + pitbull);
                        break;
                    case 2:
                        buly += 800000;
                        System.out.println("El nuevo valor del Pitbull es: " + buly);
                        break;
                    case 3:
                        rottwhiller += 800000;
                        System.out.println("El nuevo valor del Pitbull es: " + rottwhiller);
                        break;
                    case 4:
                        labradorRetriever += 800000;
                        System.out.println("El nuevo valor del Pitbull es: " + labradorRetriever);
                        break;
                    case 5:
                        goldenRetriever += 800000;
                        System.out.println("El nuevo valor del Pitbull es: " + goldenRetriever);
                        break;
                    case 6:
                        doberman += 800000;
                        System.out.println("El nuevo valor del Pitbull es: " + doberman);
                        break;
                    case 7:
                        dogoArgentino += 800000;
                        System.out.println("El nuevo valor del Pitbull es: " + dogoArgentino);
                        break;
                }
            }
            System.out.println(
                    "Ingrese el numero del perro que quedo en tercer lugar\n1. Pitbull\n2. Buly\n3. Rottwhiller\n4. Labrador Retriever\n5. Golde Retriever\n6. Doberman\n7. Dogo argentino");
            int posicion3 = capt.nextInt();
            if (posicion == posicion2 || posicion2 == posicion3 || posicion == posicion3) {
                System.out.println("Perro repetido");
            } else {
                switch (posicion3) {
                    case 1:
                        pitbull += 200000;
                        System.out.println("El nuevo valor del Pitbull es: " + pitbull);
                        break;
                    case 2:
                        buly += 200000;
                        System.out.println("El nuevo valor del Pitbull es: " + buly);
                        break;
                    case 3:
                        rottwhiller += 200000;
                        System.out.println("El nuevo valor del Pitbull es: " + rottwhiller);
                        break;
                    case 4:
                        labradorRetriever += 200000;
                        System.out.println("El nuevo valor del Pitbull es: " + labradorRetriever);
                        break;
                    case 5:
                        goldenRetriever += 200000;
                        System.out.println("El nuevo valor del Pitbull es: " + goldenRetriever);
                        break;
                    case 6:
                        doberman += 200000;
                        System.out.println("El nuevo valor del Pitbull es: " + doberman);
                        break;
                    case 7:
                        dogoArgentino += 200000;
                        System.out.println("El nuevo valor del Pitbull es: " + dogoArgentino);
                        break;
                }
            }
        }
    }
}
