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
public class P1_AppendTheSpecifiedElementToTheEndOfALinkedList {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        
        //add
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("White");
        llist.add("Pink");
        llist.add("Yellow");
        
        //Print the list
        System.out.println("The linked List: "+llist);
    }
}
