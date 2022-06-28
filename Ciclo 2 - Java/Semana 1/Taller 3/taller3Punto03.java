public class taller3Punto03 {
    public static void main(String[] args) {
        System.out.println("Colon descubrio america? ");
        String respuesta = "Si";
        if (respuesta.equalsIgnoreCase("Si")) {
            System.out.println("Correcto, sigue en el juego. \nLa independencia de mexico fue en 1810?");
            respuesta = "Si";
            if (respuesta.equalsIgnoreCase("Si")) {
                System.out.println("Correcto, sigue en el juego. \nThe Doors fue un grupo de rock Americano?");
                respuesta = "Si";
                if (respuesta.equalsIgnoreCase("Si")) {
                    System.out.println("Correcto, completo el juego");
                } else {
                    System.out.println("Incorrecto, Perdio el juego");
                }
            } else {
                System.out.println("Incorrecto, Perdio el juego");
            }
        } else {
            System.out.println("Incorrecto, Perdio el juego");
        }
    }
}
