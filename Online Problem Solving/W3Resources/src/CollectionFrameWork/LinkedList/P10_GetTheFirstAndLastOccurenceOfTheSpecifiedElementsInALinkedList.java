/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class P10_GetTheFirstAndLastOccurenceOfTheSpecifiedElementsInALinkedList {
    public static void main(String[] args) {
               LinkedList<String> llist = new LinkedList<>();
               //Add
               llist.add("Red");
               llist.add("Green");
               llist.add("Black");
               llist.add("Pink");
               llist.add("Orange");
               
              System.out.println("Original Linked List: "+llist);
              
              //Find first element of the List
              Object first_element = llist.getFirst();
              System.out.println("First element is: "+ first_element);
              
              ///Find the last element of the List
              Object last_element = llist.getLast();
              System.out.println("Last element is: "+last_element);
    }
 
}
