package dao;

import java.util.List;

import model.TipoHabitacion;

public interface TipoHabitacionDAO {
    List<TipoHabitacion> listarTodas();
    boolean insertar (TipoHabitacion tipoHabitacion, int idTipo);
    boolean actualizar (TipoHabitacion tipoHabitacion, int idTipo);
    boolean eliminar (TipoHabitacion tipoHabitacion, int idTipo);
}
