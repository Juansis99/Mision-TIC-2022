//package Semana 4.Reto 3;  //Importante cambiar al paquete real donde se descargue

public class TarjetaOro extends TarjetaCine{
    //Atributos
    private String[] beneficiosDescripcion;
    private boolean[] beneficiosEstado;
    
    //Constructor
    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono, String edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 20);
        this.beneficiosDescripcion = new String[] {"Boleto Gratis", "Crispetas Gratis", "Gaseosa Gratis"};
        this.beneficiosEstado = new boolean[] {true,true,true};
    }
    
    //Metodos
    public boolean redimirBeneficio (int posicionBeneficio){
        if (beneficiosEstado[posicionBeneficio]==true){
            beneficiosEstado[posicionBeneficio] = false;
            return true;
        } else {
            return false;
        }
    }

    //Getters y Setters
    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }
    
    //To String
    @Override
    public String toString() {
        return super.toString() + "\nBeneficios = [" + beneficiosDescripcion[0] + ", " +  beneficiosDescripcion[1] + ", " + beneficiosDescripcion[2] + "]"
                + "\nEstado de los beneficios = [" + beneficiosEstado[0] + ", " + beneficiosEstado[1] + ", " + beneficiosEstado[2] + "]";
    }
}
