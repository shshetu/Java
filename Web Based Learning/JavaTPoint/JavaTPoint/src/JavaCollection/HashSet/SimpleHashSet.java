/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author shshe
 */
public class SimpleHashSet {
    public static void main(String[] args) {
        ///Creating HashSet Object
        HashSet<String> set = new HashSet<String>();
        
        //Adding Element in HashSet
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        
        //Create Iterator
        Iterator<String> itr = set.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
