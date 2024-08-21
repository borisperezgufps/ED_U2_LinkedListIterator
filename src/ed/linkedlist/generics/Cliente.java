/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.linkedlist.generics;

/**
 *
 * @author Boris Perez
 */
public class Cliente {
    public static void main(String[] args) {
        LinkedList<String> listaString = new LinkedList<>();
        
        listaString.add("Carlos");
        listaString.add("Marcela");
        listaString.add("Rodrigo");
        listaString.add("Isabela");
        
        LinkedList<Double> listaDouble = new LinkedList<>();
        listaDouble.add(45.6);
        listaDouble.add(34.0);
        listaDouble.add(86.3);
        listaDouble.add(155.7);
        
        Persona p1 = new Persona(45);
        Persona p2 = new Persona(35);
        
        System.out.println(p1.compareTo(p2));
    }
}





