/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_24_01_19_Chapter20;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author User
 */
public class PriorityQueueComparatorExample {
    public static void main(String[] args) {
        Comparator<String> stringLengthComparator= new Comparator<String>(){
           
     @Override
     public int compare(String s1, String s2){
     return s1.length() - s2.length();
     }   
        }; 
       
        //Create a priority Queue with a custom comparator
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(
        stringLengthComparator
        );
        
        //Add items to a Priority queue
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");
    
        //Remove items from the priority Queue(DEQUEUE)
       while(!namePriorityQueue.isEmpty()){
           System.out.println(namePriorityQueue.remove());
       }
}
}