package dao;


import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap(){
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
    empleados.put(emp, emp);
    }

    @Override
    public void remove(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }

    @Override
    public void list() {
       for(Map.Entry<Empleado, Empleado> entry : empleados.entrySet()){
                System.out.println("Clave: " + entry.getKey() + "valor: "+ entry.getValue());
        }
    }
    
}
