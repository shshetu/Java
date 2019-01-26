/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_26_01_19_Chapter21_Sets_and_Maps;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author User
 */
public class TestTreeSet {
    public static void main(String[] args) {
        //Create a hash set
        Set<String> set  = new HashSet<>();
        //Add String to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        
        TreeSet<String> treeSet = new TreeSet<>(set); //Taking the values of set
        System.out.println(" Sorted tree set: "+ treeSet);
        
        //Use the methods in SortedSet interface
        System.out.println(" First(): "+ treeSet.first());
        System.out.println(" Lasst(): "+ treeSet.last());
        System.out.println(" Headset(\"New York\"): " + treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York \"):"+ treeSet.tailSet("New York"));
        
        //Use the methods in NavigableSet interface
        System.out.println(" lower(\"P\"): "+ treeSet.lower("P"));
        System.out.println(" higher(\"P\"): "+ treeSet.higher("P"));
        
        
    }
}
