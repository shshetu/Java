/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.HashSet;

import java.util.HashSet;

/**
 *
 * Get the number of elements in a hash set
 */
public class Ex3 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        
        //Add elements
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        
        System.out.println("Original Hash Set: "+h_set);
        System.out.println("Size of the Hash Set: "+h_set.size());
    }
   
}
