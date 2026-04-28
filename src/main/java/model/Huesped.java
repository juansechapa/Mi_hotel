package model;

public class Huesped {

    private int idHuesped;
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private String documento;
    private int edad;
    private String telefono;
    private String email;

    public Huesped() {
    }

    public Huesped(int idHuesped, int idUsuario, String nombres, String apellidos, String documento, int edad,
            String telefono, String email) {
        this.idHuesped = idHuesped;
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
