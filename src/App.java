import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

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
        System.out.println("Nombre: Cristian Moscoso");
        Mapa mapa= new Mapa();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
        mapa.ejemploConHashMap();

        
    }

    private static void runMapExamlpe() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
