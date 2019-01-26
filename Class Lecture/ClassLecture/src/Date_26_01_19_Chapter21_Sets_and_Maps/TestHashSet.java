/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_26_01_19_Chapter21_Sets_and_Maps;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class TestHashSet {
    public static void main(String[] args) {
        //Create a hash set
        Set<String> set  = new HashSet<>();
        
        //Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New york");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New york");
        System.out.println(set);
        
        //Displaya the elements in the hsash set
        for(String s: set){
            System.out.println(s.toUpperCase()+" ");
        }
        
    }
}
