/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.linkedlist.iterator;

import java.util.Iterator;

public class LinkedListIterator implements Iterator{
    
    private int current = 0;
    private LinkedList container;

    public LinkedListIterator(LinkedList container) {
        this.container = container;
    }    
    
    @Override
    public boolean hasNext() {
        return current < container.getSize();
    }

    @Override
    public Object next() {
         return container.get(current++);
    }
}

