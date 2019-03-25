/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author shshe
 */
public class P9_CopyOneArrayListIntoAnother {
    public static void main(String[] args) {
        //Create Object
        List<String> list = new ArrayList<>();
        
        //Add
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("List1: "+list);
        
        //Create 2nd Object
         List<String> list2 = new ArrayList<>();
         
         //Add
         list2.add("A");
         list2.add("B");
         list2.add("C");
         list2.add("D");
         
         System.out.println("List2: "+list2);
         
         //Copy List2 to list
         Collections.copy(list, list2);
         System.out.println("Copy List to List2,\nAfter Copy: ");
         System.out.println("List1: "+list);
         System.out.println("List2: "+list2);
         
    }
}
