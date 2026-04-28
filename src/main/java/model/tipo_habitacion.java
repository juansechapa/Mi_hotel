package model;

public class tipo_habitacion {
    private int tipo;
    private String nombre;
    private String descripcion;

    public tipo_habitacion() {
    }

    public tipo_habitacion(int tipo, String nombre, String descripcion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
