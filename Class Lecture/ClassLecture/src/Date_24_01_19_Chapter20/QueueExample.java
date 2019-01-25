/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_24_01_19_Chapter20;

import java.util.LinkedList;
import java.util.Queue;

/**
Number of methods used in the program:
* add()= adds element
* remove() = removes the first element
* peek() = peeks the top element
* size() = prints the size of the queue
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //Adds element {0,1,2,3,4} to queue
        for (int i = 0; i < 5; i++) {
            q.add(i); //add()
        }
        //DIsplay content of the queue
        System.out.println("Elements of queue- "+q);
        //TO remove  the head of queue
        int removedele = q.remove(); //remove()
        System.out.println("Removed element: "+removedele);
        System.out.println(q);
        int head = q.peek(); //peek()
        System.out.println("Head of queue-"+ head);
        //Rest all methods of collection interface,
        //Link size3 and contains can be used with this implementation
        int size = q.size(); //size()
        System.out.println("Size of queue= "+ size);
    }
 
}
