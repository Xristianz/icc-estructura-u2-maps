import java.nio.channels.Pipe.SourceChannel;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import dao.EmpleadoDAO;
import dao.EmpleadoDAOHashMap;
import dao.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
       
        //runMapExamlpe();
           

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runEmpleadoExample() {
        // System.out.println("Nombre: Cristian Moscoso");
        // Mapa mapa= new Mapa();
        // mapa.ejemploConLinkedHashMap();
        // mapa.ejemploConTreeMap();
        // mapa.ejemploConHashMap();




        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree =  new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTree);


        Empleado emp1 =  new Empleado(5, "Pedro", "Dev");
        Empleado emp2 =  new Empleado(3, "Juan", "Dev");
        Empleado emp3 =  new Empleado(1, "Jose", "Dev");
        Empleado emp4 =  new Empleado(2, "Pedro", "Dev");
        Empleado emp5 =  new Empleado(4, "Pedro", "Dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);

        
        empleadoContoller2.agregarEmpleado(emp1);
        empleadoContoller2.agregarEmpleado(emp2);
        empleadoContoller2.agregarEmpleado(emp3);
        empleadoContoller2.agregarEmpleado(emp4);
        empleadoContoller2.agregarEmpleado(emp5);

        empleadoContoller.list();
        System.out.println("------------------");
        empleadoContoller2.list();


        
    }

    private static void runMapExamlpe() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
