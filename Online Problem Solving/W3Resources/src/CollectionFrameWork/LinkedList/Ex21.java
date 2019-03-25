/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.LinkedList;

/**
 *
 Retrieve but does not remove, the last element of a linked list
 */
public class Ex21 {
    public static void main(String[] args) {
         LinkedList<String> llist = new LinkedList<String>();

            llist.add("Red");
            llist.add("Green");
            llist.add("Black");
            llist.add("Pink");
            llist.add("Orange");
            
            System.out.println("Original List: "+llist);
            System.out.println(" Retrieve but does not remove, the last element of a linked list: "+llist.peekLast());
    }
}
