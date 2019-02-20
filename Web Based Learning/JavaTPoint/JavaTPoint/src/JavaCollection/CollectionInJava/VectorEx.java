/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionInJava;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author shshe
 */
public class VectorEx {
    public static void main(String[] args) {
        //creating an object of Vector class
        Vector<String> v = new Vector<>();
        //adding element in Vector
        v.add("Ayush");
        v.add("Amit");
        v.add("Asish");
        v.add("Garima");
        v.add("Ayush");
        
        ///Creating an Iterator object
        Iterator itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
