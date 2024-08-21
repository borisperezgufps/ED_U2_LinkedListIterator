/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.linkedlist.generics;

/**
 *
 * @author Boris Perez
 */
public class LinkedList<E> {
    
    private Node<E> head;
    private int size;
    
    public void add(E value){
        Node<E> n = new Node<>();
        n.setData(value);        
        if(head==null){
            head = n;
            size++;
        }else{            
            Node<E> p = head;            
            while(p.getNext()!=null)
                p = p.getNext();            
            p.setNext(n);
            size++;
        }
    }    
    public E get(int pos){
        Node<E> p = head;
        for (int i = 0; i < size; i++) {
            if(i==pos){
                return p.getData();
            }else
                p = p.getNext();                        
        }
        return null;
    }    
}

