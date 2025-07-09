package dao;

import models.Empleado;

public interface EmpleadoDAO {

    public void add(Empleado emp);
    public void remove(int id);
    public void list();

}
