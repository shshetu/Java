/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionInJava;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author shshe
 */
public class PrirityQueue {
    public static void main(String[] args) {
       // Priority Queue<String> queue = new Priority Queue<String>();
    PriorityQueue<String> queue = new PriorityQueue<String>();
    //adding in the class
    queue.add("Amit Sharma");
    queue.add("Vijay Raj");
    queue.add("Raj");
    //head priniting
        System.out.println("Head: "+queue.element());
        System.out.println("Head: "+queue.element());
        
        System.out.println("Iterating the queue elements:");
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        queue.remove();
        queue.poll();
        System.out.println("After Removing two elements: ");
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
            
        }
    }
}
