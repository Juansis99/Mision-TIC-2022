public class Reto3 {
    public static void main(String[] args) {
        double boleta = 6000;
        double combo1 = 8000;
        double combo2 = 12000;

        String id = "0123";
        String nombre = "Jhon Doe";
        String email = "jd32@correo.co";
        String tel = "5553221";
        String edad = "26";

        TarjetaPlata tp1 = new TarjetaPlata(id, nombre, email, tel, edad);
        //System.out.println(tp1.toString());

        String[] cuenta = {"Boleta", "Boleta", "Combo 1 - Crispetas + Gaseosa", "Combo 2 - Perro + Gaseosa"};
        tp1.pagar(cuenta);
        //System.out.println(tp1.toString());
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});
        //System.out.println(tp1.toString());

        TarjetaOro to2 = new TarjetaOro(id, nombre, email, tel, edad);
        //System.out.println(to2.toString());
        to2.pagar(new String[]{"Boleta", "Combo 1 - Crispetas + Gaseosa"});
        System.out.println("Puede jhon redimir la boleta gratis? = " + to2.redimirBeneficio(0));
        System.out.println("Puede jhon redimir las crispetas gratis? = " + to2.redimirBeneficio(1));
        System.out.println("Puede jhon redimir la gaseosa gratis? = " + to2.redimirBeneficio(2));
        System.out.println(to2.toString());
    }
}
