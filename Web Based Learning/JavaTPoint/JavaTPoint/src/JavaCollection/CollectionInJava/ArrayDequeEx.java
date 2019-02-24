/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionInJava;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author shshe
 */
public class ArrayDequeEx {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        //adding elements
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        
        //Traversing the elements
        for(String str:deque){System.out.println(str);}
    }
 
}
