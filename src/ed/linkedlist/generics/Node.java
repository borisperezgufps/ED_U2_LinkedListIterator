/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.linkedlist.generics;

public class Node<E> {
    private E data;
    private Node<E> next;
    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
}



