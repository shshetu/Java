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
public class P5_InsertTheSpecifiedElementAtTheSpecifiedPositionInTheLinkedList {
    public static void main(String[] args) {
        //Create and empty linked list
        LinkedList<String> llist = new LinkedList<>();
        
        //add 
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("White");
        llist.add("Pink");
        
        System.out.println("Original Linked List: "+llist);
        System.out.println("Let the yellow Color after the Red Color!");
        llist.add(1,"Yellow");
        System.out.println("Changed Linked List: "+ llist);
    }
   
}
