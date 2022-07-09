//package Semana 4.Reto 3;  //Importante cambiar al paquete real donde se descargue

public class TarjetaCine {
    //Atributos
    private String idTarjeta;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private String edad;
    private double porcentajeDescuento;
    private String[] cuenta;
    double total;

    //Constructores
    public TarjetaCine(String idTarjeta, String nombreCompleto, String email, String telefono, String edad, double porcentajeDescuento) {
        this.idTarjeta = idTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //Metodos
    public double pagar(String[] cuenta) {
        total = 0;
        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta[i] == "Boleta") {
                total += 6000;
            } else if (cuenta[i] == "Combo 1 - Crispetas + Gaseosa") {
                total += 8000;
            } else if (cuenta[i] == "Combo 2 - Perro + Gaseosa") {
                total += 12000;
            }
        }
        //System.out.println("Jhon pago = "+ (total*(1-(porcentajeDescuento/100))));
        return total * (1 - (porcentajeDescuento / 100));
    }

    //Getters y Setters
    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //To String
    @Override
    public String toString() {
        return "ID de la tarjeta = " + idTarjeta
                + "\nNombre del cliente = " + nombreCompleto
                + "\nEmail del cliente = " + email
                + "\nTelefono del cliente = " + telefono
                + "\nEdad del cliente = " + edad
                + "\nPorcentaje de descuento = " + porcentajeDescuento;
    }
}
