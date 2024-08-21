/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.linkedlist.iterator;

import ed.linkedlist.iterator.LinkedList;
import java.util.Iterator;

public class Cliente {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addLast("Angie");
        ll.addLast("Marcelo");
        ll.addLast("Roberto");
        ll.addLast("Laura");
        
        Iterator itr = ll.iterator();
        while(itr.hasNext()){
            String valor = itr.next().toString();
            System.out.println("Valor = "+valor);
        }
    }
}


