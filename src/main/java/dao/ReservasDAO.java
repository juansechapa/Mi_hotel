package dao;

import java.util.List;

import model.Reservas;

public interface ReservasDAO {
    List<Reservas> ListarTodas();
    boolean insertar(Reservas reservas, int idReserva);
    boolean actualizar(Reservas reservas, int idReserva);
    boolean eliminar(Reservas reservas, int idReserva);
}
