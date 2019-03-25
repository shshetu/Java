/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.HashSet;

import java.util.HashSet;
import java.util.Spliterator;

/**
 Iterate through all elements in a hash list
 */
public class Ex2 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        
        //Add element
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        
        //using set Iterattor
        Spliterator spitr = h_set.spliterator();
        spitr.forEachRemaining(System.out::println);
    }
}
