/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionInJava;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author shshe
 */
public class TreeSetEx {
    public static void main(String[] args) {
        ///Creating and Adding Elements
        TreeSet<String> set = new TreeSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
   
}
