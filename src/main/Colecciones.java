/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Oscar
 */
public class Colecciones {

    // Examples Lists
    static List<String> stringList = new ArrayList<String>();
    public static void exampleLists()
    {
        System.out.println("Ejemplo Listas");
        stringList.add("Hola");
        stringList.add("Caracola");
        stringList.add("Babosa");
        stringList.add("Rabosa");
        
        // Show how many strings there're inside
        System.out.println(stringList.size());
        
        // Delete last String
        stringList.remove(stringList.size() - 1);
        stringList.remove("Babosa");
        
        // Update some value
        stringList.set(0, "Pirate");
        
        // PRINT THE STRINGS
        // Option A ==> Like an array
        for(int i = 0; i < stringList.size(); i++)
            System.out.println(stringList.get(i));
        System.out.println("-----------");
        
        // Option B ==> Like an array too
        for(String element : stringList)
            System.out.println(element);
        System.out.println("-----------");
        
        // Option D ==> Lambda expression (JAVA 8)
        stringList.forEach(s -> System.out.println(s));
        System.out.println("-----------");
        
        // Option E ==> using Iterator
        Iterator<String> iterator = stringList.iterator(); // or '.listIterator()'
        while (iterator.hasNext()){ System.out.println(iterator.next()); }
        System.out.println("-----------");
    
        // Sort the List
		/* stringList.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return 0;
			}
		});
        stringList.stream().sorted().forEach(System.out::println); */
        stringList.sort((a, b) -> {return a.compareTo(b);});
        stringList.forEach(s -> System.out.println(s));
        System.out.println("-----------");
    }
    
    public static void exampleAlmacen()
    {
        System.out.println("\n\n\nEjemplo Almacen de libros");
        String[] libros = {"La paradoja", "El navegante", "La moneda"};
        Almacen<String> libreria = new Almacen<String>(libros);
        
        System.out.println(libreria.toString());
        libreria.changeId("El navegante", 32);
        System.out.println(libreria.toString());
    }
    
    public static void exampleAlumnos()
    {
        System.out.println("\n\n\nEjemplo interfaz comparable<T>");
        List<Alumno> listadoAlumnos = new ArrayList<Alumno>();
        listadoAlumnos.add(new Alumno(3,"Alexis"));
        listadoAlumnos.add(new Alumno(2,"Eduardo"));
        listadoAlumnos.add(new Alumno(7,"Miguel"));
        listadoAlumnos.add(new Alumno(1,"Ivan"));
        
        listadoAlumnos.forEach(a -> System.out.println(a));
        Collections.sort(listadoAlumnos);
        
        System.out.println("_____Ordenadas____");
        listadoAlumnos.forEach(a -> System.out.println(a));
    }
    
    public static void main(String[] args)
    {
        // Example Lists
//        exampleLists();
        
        // Almacen class example
//        exampleAlmacen();
        
        // Example compareTo method
//        exampleAlumnos();
		System.out.println(123%10);
    }
}