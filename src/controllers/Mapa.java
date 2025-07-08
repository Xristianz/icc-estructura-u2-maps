package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
       
  
    }
    public void ejemploConHashMap(){
        HashMap<String, String> capitales = new HashMap(); 
        capitales.put("Quito", "Ecuador");
        capitales.put("Lima", "Peru");
        capitales.put("Bogota", "Colombia");

        for(String pais:capitales.keySet()){
           
            System.out.println("Pais "+ pais + ", Capital  " + capitales.get(pais));

        }
        HashMap <Integer , Empleado> empleados = new HashMap<>();
            empleados.put(3, new Empleado(3, "Pedro", "Tester"));
            empleados.put(1, new Empleado(1, "Ana", "Dev"));
            empleados.put(2, new Empleado(2, "Luis", "Diseniador"));
            empleados.put(1, new Empleado(3, "Pedro", "Tester"));
            for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
                System.out.println("Clave: " + entry.getKey() + "valor: "+ entry.getValue());
            }

        HashMap <Empleado , Integer> empleadosDos = new HashMap<>();
        

            Empleado emp1 = new Empleado(1, "Ana", "Tester");
            Empleado emp2 = new Empleado(2, "Pedro", "Tester");
            Empleado emp3 = new Empleado(3, "Ana", "Tester");
            Empleado emp4 = new Empleado(3, "Ana", "Tester");


            empleadosDos.put(emp1, 1000);
            empleadosDos.put(emp2, 1200);
            empleadosDos.put(emp3, 1500);
            empleadosDos.put(emp4, 2000);


            System.out.println("--------");
            for(Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()){
                System.out.println("Clave: " + entry.getKey() + "valor: "+ entry.getValue());
            }


        

    }

    public void ejemploConLinkedHashMap(){
        LinkedHashMap<String , Integer> productos = new LinkedHashMap<>();
        productos.put("Laptopt", 20);
        productos.put("Manzana", 8);
        productos.put("Pan", 7);
        productos.put("Zapatos", 5);
        productos.put("Camisas", 3);
        for(String producto : productos.keySet()){
            System.out.println("Valor: " + producto + "Valor: " + productos.get(producto));
        }


    }

    public void ejemploConTreeMap(){
        TreeMap<Integer , String> personas = new TreeMap<>();

        personas.put(1, "Juan");
        personas.put(2, "Pedro");
        personas.put(3, "Pablo");
        personas.put(4, "Raul");
        personas.put(5, "Hola");
        for(Integer ced : personas.keySet()){
            System.out.println("Cedula: " + ced + "Nombre: " + personas.get(ced));

        }


        TreeMap <Empleado , Integer> empleadosss = new TreeMap<>();
        

            Empleado emp1 = new Empleado(1, "Ana", "Tester");
            Empleado emp2 = new Empleado(2, "Pedro", "Tester");
            Empleado emp3 = new Empleado(3, "Ana", "Tester");
            Empleado emp4 = new Empleado(3, "Ana", "Tester");


            empleadosss.put(emp1, 1000);
            empleadosss.put(emp2, 1200);
            empleadosss.put(emp3, 1500);
            empleadosss.put(emp4, 2000);


            System.out.println("--------");
            for(Map.Entry<Empleado, Integer> entry : empleadosss.entrySet()){
                System.out.println("Clave: " + entry.getKey() + "valor: "+ entry.getValue());
            }

    }
}
