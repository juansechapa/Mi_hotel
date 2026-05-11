package model;

import java.time.LocalDateTime;

public class Pagos {
    private int idPago;
    private int idReserva;
    private String monto;
    private int idMetodo;
    private LocalDateTime fechaPago;

    public Pagos() {
    }

    public Pagos(int idPago, int idReserva, String monto, int idMetodo, LocalDateTime fechaPago) {
        this.idPago = idPago;
        this.idReserva = idReserva;
        this.monto = monto;
        this.idMetodo = idMetodo;
        this.fechaPago = fechaPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public int getIdMetodo() {
        return idMetodo;
    }

    public void setIdMetodo(int idMetodo) {
        this.idMetodo = idMetodo;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

}
