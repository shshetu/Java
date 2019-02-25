/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class LinkedListAdd {
    public static void main(String[] args) {
        //First LinkedList Object
        LinkedList<String> ll = new LinkedList<>();
        System.out.println("Initial list of elements: "+ll);
        
        //Adding element to the First LinkedList
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After invoking add(E e) method: "+ll);
        ll.add(1,"Gaurav");
        System.out.println("After invoking add(int index,E element) method: "+ll);
        
        //Creating Second LinkedList Object
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Sonno");
        ll2.add("Hanumat");
        
        //Adding second list element to the first list
        ll.addAll(ll2); //addAll() method
        System.out.println("After invoking addAll(Collection<? extends E> c) method:");
        
        //Creating third LinkedList Object
        LinkedList<String> ll3 = new LinkedList<>();
        
        //adding elements to the third linkedlist object
        ll3.add("John");
        ll3.add("Rahul");
        
        //Adding second List elements to the first list at specific position
        ll.addAll(1,ll3);
        System.out.println("After invoking addAll(int index,Collection<? extends E> c) method: "+ll);
        
        //Adding an element at the first position
        ll.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) Method: "+ll);
        
        //Adding an element at the last position
        ll.addLast("Harsh");
        System.out.println("After invoking addLast(E e) Method: "+ll);
    }
}
