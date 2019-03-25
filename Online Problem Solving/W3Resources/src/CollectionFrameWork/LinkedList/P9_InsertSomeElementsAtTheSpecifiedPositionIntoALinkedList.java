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
public class P9_InsertSomeElementsAtTheSpecifiedPositionIntoALinkedList {
     public static void main(String[] args) {
        //Create Object
        LinkedList<String> llist = new LinkedList<>();
        
        //Add
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        System.out.println("Original Linked List: "+llist);
        
        //Create a new collection and add some elements
                LinkedList<String> newLlist = new LinkedList<>();
                
                newLlist.add("White");
                newLlist.add("Pink");
                
         //Add the Collectino in the Second Position of the existing linked list
         llist.addAll(1,newLlist);
         System.out.println("Changed LinkedList: "+llist);
        
    }
}
