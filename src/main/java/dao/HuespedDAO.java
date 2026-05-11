package dao;

import java.util.List;
import model.Huesped;

public interface HuespedDAO {
    List<Huesped> ListarTodos();
    boolean insertar (Huesped huesped, int idHuesped);
    boolean actualizar (Huesped huesped, int idHuesped);
    boolean eliminar(Huesped huesped, int idHuesped);
}
