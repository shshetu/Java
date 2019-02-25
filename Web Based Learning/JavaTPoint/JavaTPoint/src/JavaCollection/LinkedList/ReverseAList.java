/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class ReverseAList {
    public static void main(String[] args) {
        //creating object of LinkedList
        LinkedList<String> ll = new LinkedList<>();
        
        //adding elements to the list
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        
        Iterator itr = ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
  
}
