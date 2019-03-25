/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.TreeSet;

import java.util.TreeSet;

/**
 *
 * @author shshe
 */
public class JavaTreeSetEx4 {
    public static void main(String[] args) {
        //Create object of TreeSet
        TreeSet<String> set = new TreeSet<>();
        
        //Add elements to the object of TreeSet
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: "+set);
        System.out.println("Reverse Set: "+ set.descendingSet());
        System.out.println("Head Set: "+set.headSet("C",true));
        System.out.println("SubSet: "+set.subSet("A",false, "E",true));
        System.out.println("TailSet: "+set.tailSet("C",true));
    }
}
