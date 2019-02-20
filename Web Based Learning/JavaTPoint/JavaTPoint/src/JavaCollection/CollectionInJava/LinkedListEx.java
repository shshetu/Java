/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionInJava;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class LinkedListEx {
    public static void main(String[] args) {
        //creating object of linkedlist
        LinkedList<String>llist = new LinkedList<>();
        
        //adding elements in linked list
        llist.add("Ravi");
        llist.add("Vijay");
        llist.add("Ravi");
        llist.add("Ajay");
        
        //Calling the iterator class
        Iterator<String> itr = llist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Using for loop:");
        //Using for loop
        for(int i = 0;i<llist.size();i++){
            System.out.println(llist.get(i));
        }
    }
}
