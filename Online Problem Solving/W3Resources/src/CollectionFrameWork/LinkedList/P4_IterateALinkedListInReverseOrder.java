/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class P4_IterateALinkedListInReverseOrder {
    public static void main(String[] args) {
        //Create object
        LinkedList <String> llist = new LinkedList<String>();
    
        //Add
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("Pink");
        llist.add("Orange");
        
        ///print original list
        System.out.println("Original Linked List: "+llist);
        
        //Print Elements in reverse order
        Iterator itr = llist.descendingIterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
   
}
