/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.DequeAndArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author shshe
 */
public class ArrayDequeEx {
    public static void main(String[] args) {
        //Creating Deque and Adding elements
        Deque<String> deque = new ArrayDeque<>();
        
        //Adding element
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        
        //Traversing elements
        for(String s:deque){
            System.out.println(s);
        }
        
    }
   
}
