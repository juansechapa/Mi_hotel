package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservas {
    private int idReserva;
    private int idHuesped;
    private int idHabitacipn;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDateTime check_in;
    private LocalDateTime check_out;
    private int idEstado;
    private String metodoReserva;

    public Reservas() {
    }

    public Reservas(int idReserva, int idHuesped, int idHabitacipn, LocalDate fechaInicio, LocalDate fechaFin,
            LocalDateTime check_in, LocalDateTime check_out, int idEstado, String metodoReserva) {
        this.idReserva = idReserva;
        this.idHuesped = idHuesped;
        this.idHabitacipn = idHabitacipn;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.check_in = check_in;
        this.check_out = check_out;
        this.idEstado = idEstado;
        this.metodoReserva = metodoReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdHabitacipn() {
        return idHabitacipn;
    }

    public void setIdHabitacipn(int idHabitacipn) {
        this.idHabitacipn = idHabitacipn;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDateTime getCheck_in() {
        return check_in;
    }

    public void setCheck_in(LocalDateTime check_in) {
        this.check_in = check_in;
    }

    public LocalDateTime getCheck_out() {
        return check_out;
    }

    public void setCheck_out(LocalDateTime check_out) {
        this.check_out = check_out;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getMetodoReserva() {
        return metodoReserva;
    }

    public void setMetodoReserva(String metodoReserva) {
        this.metodoReserva = metodoReserva;
    }

}
