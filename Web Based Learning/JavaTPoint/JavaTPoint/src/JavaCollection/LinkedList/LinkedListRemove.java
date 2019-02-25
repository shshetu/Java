/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class LinkedListRemove {
    public static void main(String[] args) {
        //creating First LinkedList object
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Ravi");
        ll1.add("Vijay");
        ll1.add("Ajay");
        ll1.add("Anuj");
        ll1.add("Gaurav");
        ll1.add("Harsh");
        ll1.add("Virat");
        ll1.add("Gaurav");
        ll1.add("Harsh");
        ll1.add("Amit");
        System.out.println("Inital list of elements: "+ll1);
        
        //removing object
        ll1.remove("Vijay");
        System.out.println("After invoking remove(object) method: "+ll1);
        
        //remove(index) 
        ll1.remove(0);
        System.out.println("After invoking remove(index) method: "+ll1);
    
        //Creating Second LinkedList Object
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Ravi");
        ll2.add("Hanumat");
        
        //Adding new elements to arrayList
        ll1.addAll(ll2);
        System.out.println("Updated List: "+ll1);
        
        //removeAll()
        ll1.removeAll(ll2);
        System.out.println("After invoking removeAll() method: "+ll1);
        
        //removeFirst()
        ll1.removeFirst();
        System.out.println("After invoking removeFirst() method: "+ll1);
    
        //removeLast()
        ll1.removeLast();
        System.out.println("After invoking removeLast() method: "+ll1);
        
        //removeFirstOccurance(Object)
        ll1.removeFirstOccurrence("Gaurav");
        System.out.println("After invoking removeFirstOccurance() method: "+ll1);
        
        //removeLastOccurance(Object)
        ll1.removeLastOccurrence("Gaurav");
        System.out.println("After invoking removeLastOccurance() method: "+ll1);
        
        //clear()
        ll1.clear();
        System.out.println("After invoking clear() method: "+ ll1);
        
    }
}
