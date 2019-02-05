/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_47_to_64;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author shshe
 */
public class Video_49_VectorDemo {
 
    public static void main(String[] args) {
        //Initial size is 3, increment is 2
    Vector v = new Vector(3,2); //Generic type is not defined
        System.out.println("Initial size: "+ v.size());
        System.out.println("Initial capacity: "+ v.capacity()); //It can contain 3 values
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4)); //Adding object
        System.out.println("Capacity after four additions: "+ v.capacity());
        v.addElement(new Double(5.45));
        System.out.println("Current capacity: "+ v.capacity());
        v.addElement(new Float(9.4)); //Adding object
        System.out.println("Current capacity: "+ v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: "+ (Integer)v.firstElement()); //Casting is must since no generics is declared and we use Wrapper class since it is object
        System.out.println("Last element: "+    (Integer) v.lastElement());
      //v.contains()
        if (v.contains(new Integer(3))) {
            System.out.println("Vector contains 3.");
        }
        //Enumeration the elements in the vector
        
      //  Enumeration vEnum = Collections.enumeration(v);
        Enumeration vEnum = v.elements();
       while(vEnum.hasMoreElements()){
           System.out.println(vEnum.nextElement());
       }
       
       //Using Iterator
        System.out.println("Print using Iterator: ");
       Iterator iterator = v.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
    
    } 
    
}
