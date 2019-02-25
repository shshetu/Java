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
public class SimpleLinkedListEx {
    public static void main(String[] args) {
        //Creating Object of LinkedList
        LinkedList<String> ll = new LinkedList<>();
        
        //Adding elements to the LinkedList
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ravi");
        ll.add("Ajay");
        
        //Creating Iterator class object => assignment Object
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
 
}
