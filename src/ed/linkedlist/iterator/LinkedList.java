/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.linkedlist.iterator;

import java.util.Iterator;

public class LinkedList {
    
    private Node head;
    private int size;
    
    public Iterator iterator( ){
        return new LinkedListIterator( this ); 
    }
    
    public String get(int pos){        
        Node p = head;
        for (int i = 0; i < size; i++) {
            if(i==pos){
                return p.getData();
            }else
                p = p.getNext();                        
        }
        return null;
    }
    
    public int getSize() {
        return size;
    }
    
    public void addLast(String value){
        
        Node n = new Node();
        n.setData(value);
        
        if(head==null){
            head = n;
            size++;
        }else{            
            Node p = head;
            
            while(p.getNext()!=null)
                p = p.getNext();
            
            p.setNext(n);
            size++;
        }
        
    }

    

    
    
}
