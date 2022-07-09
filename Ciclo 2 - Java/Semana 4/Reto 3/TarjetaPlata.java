//package Semana 4.Reto 3;  //Importante cambiar al paquete real donde se descargue

public class TarjetaPlata extends TarjetaCine {
    //Atributos
    private int cantidadVisitas;
    private boolean elegibleOro;
    
    //Constructores
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, String edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
        this.cantidadVisitas = 0;
        this.elegibleOro = false;
    }
    
    //Metodo
    @Override
    public double pagar(String[] cuenta) {
        cantidadVisitas ++;
        if (cantidadVisitas > 4){
            this.elegibleOro = true;
        }
        return super.pagar(cuenta);
    }
    
    //Getters y Setters
    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
    
    //To String
    @Override
    public String toString() {
        return super.toString() + "\nCantidad de visitas = " + cantidadVisitas 
                + "\nEl cliente es elejible para la tarjeta Oro? = " + elegibleOro;
    }
    
}