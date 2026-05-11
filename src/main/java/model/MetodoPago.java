package model;

public class MetodoPago {

    private int idMetodo;
    private String nombre;

    public MetodoPago() {
    }

    public MetodoPago(int idMetodo, String nombre) {
        this.idMetodo = idMetodo;
        this.nombre = nombre;
    }

    public int getIdPago() {
        return idMetodo;
    }

    public void setIdPago(int idMetodo) {
        this.idMetodo = idMetodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
