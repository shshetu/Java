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
public class P6_InsertElementsIntoTheLinkedListAtTheFirstAndLastPosition {
    public static void main(String[] args) {
        //Create Object
        LinkedList<String> llist = new LinkedList<>();
        //Add
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        
        System.out.println("Original List: "+llist);
        llist.addFirst("White");
        llist.addLast("Pink");
        System.out.println("Final Linked List: "+llist);
        
    }
}
