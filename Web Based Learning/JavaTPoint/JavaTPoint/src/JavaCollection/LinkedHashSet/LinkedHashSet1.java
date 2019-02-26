/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author User
 */
public class LinkedHashSet1 {
    public static void main(String[] args) {
        //Creating HashSet and adding elements
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        //Ignoring the duplicate element
        set.add("Five");
        
        //Printing using Iterator
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
