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
public class P3_IterateThroughAllElementsInALinkedListStartingAtTheSpecifiedPosition {
    public static void main(String[] args) {
        //Create an object
        LinkedList<String> llist = new LinkedList<String>();
        
        //Add
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("White");
        llist.add("Pink");
        
        //Set the Iterator from the specific index
        Iterator itr = llist.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
  
}
