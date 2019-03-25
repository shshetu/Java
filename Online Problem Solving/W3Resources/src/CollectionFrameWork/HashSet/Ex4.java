/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.HashSet;

import java.util.HashSet;

/**
 *
  Empty an hash set
 */
public class Ex4 {
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
       // h_set.clear();
       h_set.removeAll(h_set);
       System.out.println("New Hash Set: "+ h_set);
    }
}
