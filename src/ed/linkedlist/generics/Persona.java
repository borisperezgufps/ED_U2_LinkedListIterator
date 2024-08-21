/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.linkedlist.generics;

/**
 *
 * @author Boris Perez
 */
public class Persona implements Comparable<Persona> {

    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }
    
    @Override
    public int compareTo(Persona o) {
        if(getEdad()>o.getEdad())
            return 1;
        else if(getEdad()<o.getEdad())
            return -1;
        else
            return 0;
                   
    }

    public int getEdad() {
        return edad;
    }
    
    
    
}
