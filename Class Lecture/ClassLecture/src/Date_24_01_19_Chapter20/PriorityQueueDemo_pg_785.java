/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_24_01_19_Chapter20;

import java.util.Collections;
import java.util.PriorityQueue;

/**
Methods used: 
* offer() = to add elements in synchornized way
* size() = to print the size of the priority queue
 */
public class PriorityQueueDemo_pg_785 {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");
        
        System.out.println("Priority queue usign Comparrable:");
       while(queue1.size()>0){
           System.out.println(queue1.remove()+" ");
       }
       
       //Priority queue2
       PriorityQueue<String> queue2 = new PriorityQueue(4,Collections.reverseOrder());
       queue2.offer("Oklhoma");
       queue2.offer("Indiana");
       queue2.offer("Georgia");
       queue2.offer("Texas");
        System.out.println("Priority queue using comparator: ");
        while(queue2.size()>0){
            System.out.println(queue2.remove()+" ");
        }
    }
   
}
