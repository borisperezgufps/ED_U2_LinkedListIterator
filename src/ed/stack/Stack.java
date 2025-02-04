/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.stack;

import ed.linkedlist.generics.LinkedList;

/**
 *
 * @author borisperezg
 */
public class Stack<E> {
    
    private LinkedList<E> lista;
    
    public E peek(){
        return lista.get(0);
    }
    
}
