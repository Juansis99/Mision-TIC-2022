public class taller3Punto05 {
    public static void main(String[] args) {
        String estado = "Preparatoria";
        int materiaPerdida = 0;
        double desc = 0;
        double precioPrep = 180;
        double precioProf = 300;
        double pago = 0;
        double unidades = 60;
        double promedio = 7.5;
        if (estado.equalsIgnoreCase("Preparatoria")) {
            if (promedio>=9.5){
                desc=0.25;
                if (unidades >55) {
                    unidades = 55;
                }
                pago = unidades/5*precioPrep*(1-desc);
            } else if (promedio>=9){
                    desc = 0.1;
                    if (unidades>50) {
                        unidades = 50;
                    }
                    pago = unidades/5*precioPrep*(1-desc);
                } else if (promedio>=7) {
                    if (unidades>50) {
                        unidades = 50;
                    }
                    pago = unidades/5*precioPrep*(1-desc);
                } else {
                    if (materiaPerdida<=3) {
                        if (unidades>45) {
                            unidades = 45;
                        }
                        pago = unidades/5*precioPrep*(1-desc);
                    } else {
                        if (unidades>40) {
                            unidades = 40;
                        }
                        pago = unidades/5*precioPrep*(1-desc);
                    }
                }
        } else {
            if (promedio>=9.5) {
                desc = 0.2;
                if (unidades>55) {
                    unidades = 55;
                }
                pago = unidades/5*precioProf*(1-desc);
            } else {
                if (unidades>55) {
                    unidades = 55;
                }
                pago = unidades/5*precioProf*(1-desc);
            }
        }
        System.out.println("Usted podra cursar " + unidades + " y debera pagar " + pago);
    }
}
