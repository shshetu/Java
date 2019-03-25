/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author shshe
 */
public class P2_IterateThroughAllElementsInALinkedList {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        
        //Add
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("White");
        llist.add("Pink");
        
        //print all the elements using list iterator
        ListIterator itr = llist.listIterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    } 
    }
}
