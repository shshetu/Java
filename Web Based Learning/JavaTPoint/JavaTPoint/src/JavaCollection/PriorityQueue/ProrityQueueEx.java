/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author shshe
 */
public class ProrityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Rahul");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Amit");
        System.out.println("head: "+ queue.element());
        System.out.println("head: "+queue.peek());
        System.out.println("iterating the queue elements");
        
        //creating Iterator object
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //remove
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements; ");
        
        //creating 2nd Iterator object
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        
    }
}
