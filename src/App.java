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
       
        runMapExamlpe();
           

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        

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
        System.out.println("Nombre: Cristian Moscoso");
        Mapa mapa= new Mapa();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
        mapa.ejemploConHashMap();
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();

        // 1. areAnagrams (estático)
        System.out.println("1. ¿'listen' y 'silent' son anagramas?");
        boolean resultado1 = Ejercicios.areAnagrams("listen", "silent");
        System.out.println("Resultado: " + resultado1); 

        System.out.println("¿'hello' y 'bello' son anagramas?");
        boolean resultado2 = Ejercicios.areAnagrams("hello", "bello");
        System.out.println("Resultado: " + resultado2); 

        System.out.println("¿'triangle' y 'integral' son anagramas?");
        boolean resultado3 = Ejercicios.areAnagrams("triangle", "integral");
        System.out.println("Resultado: " + resultado3); 

        // 2. sumatoriaDeDos
        System.out.println("\n2. Suma de dos que da 5 en [9, 2, 3, 6]:");
        int[] resultado4 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        if (resultado4 != null) {
            System.out.println("Índices encontrados: [" + resultado4[0] + ", " + resultado4[1] + "]");
        } else {
            System.out.println("No se encontró ninguna combinación.");
        }

        System.out.println("Suma de dos que da 10 en [9, 2, 3, 6]:");
        int[] resultado5 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
        if (resultado5 != null) {
            System.out.println("Índices encontrados: [" + resultado5[0] + ", " + resultado5[1] + "]");
        } else {
            System.out.println("No se encontró ninguna combinación.");
        }

        // 3. contarCaracteres
        System.out.println("\n3. Conteo de caracteres en 'hola mundo':");
        ejercicios.contarCaracteres("hola mundo");

        // 4. sonAnagramas (no estático)
        System.out.println("\n4. ¿'roma' y 'amor' son anagramas?");
        boolean resultado6 = ejercicios.sonAnagramas("roma", "amor");
        System.out.println("Resultado: " + resultado6); // true

        System.out.println("¿'perro' y 'gato' son anagramas?");
        boolean resultado7 = ejercicios.sonAnagramas("perro", "gato");
        System.out.println("Resultado: " + resultado7); // false
    }

    
}
