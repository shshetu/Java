/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.HashSet;

import java.util.HashSet;

/**
 *
 * Write a Java program to append the specified element to the end of a hash se
 */
public class Ex1 {
    public static void main(String[] args) {
        //create object
        HashSet<String> h_set = new HashSet<>();
        
        //Add
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        
        ///Print the HashSet
        System.out.println("The Hash Set:"+h_set);
    }
  
}
