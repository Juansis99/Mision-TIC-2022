public class taller2Punto14 {
    public static void main(String[] args) {
        double cuotaFija = 50000;
        double porcentajeEmpresa = 0.02;
        double porcentajeEmpleado = 0.02;
        String aporte = "Si";
        String opcionAporte = "Porcentaje";
        double salario = 1000000;
        double salarioNeto = 0;
        if (aporte.equalsIgnoreCase("Si")) {
            if (opcionAporte.equalsIgnoreCase("Porcentaje")){
                salarioNeto = salario*(1-porcentajeEmpleado-porcentajeEmpresa);
            } else {
                salarioNeto = salario*(1-porcentajeEmpresa)-cuotaFija;
            }
        } else {
            salarioNeto = salario*(1-porcentajeEmpresa);
        }
        System.out.println("Usted recibira: " + salarioNeto);
    }
}
