package model;

public class Habitacion {

    private int idHabitacion;
    private String numero;
    private int cantidad_camas;
    private int idTipo;
    private double precio;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, String numero, int cantidad_camas, int idTipo, double precio) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.cantidad_camas = cantidad_camas;
        this.idTipo = idTipo;
        this.precio = precio;
    }

    public int getIdHabitacipn() {
        return idHabitacion;
    }

    public void setIdHabitacipn(int idHabitacipn) {
        this.idHabitacion = idHabitacipn;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCantidad_camas() {
        return cantidad_camas;
    }

    public void setCantidad_camas(int cantidad_camas) {
        this.cantidad_camas = cantidad_camas;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
