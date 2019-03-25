/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shshe
 */
public class P1_to_P4_CreateANewArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        
        //Using Iterator solve
        System.out.println("\tUsing Iterator:");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //Program-03=>Insert Element in first position
        System.out.println("\tUsing for each loop:");
        list.add(0,"Pink");
        for(String s:list){
            System.out.println(s);
        }
        
        //Program-04=> Retrieve an element from a given list
        
        System.out.println("First element: "+list.get(0));
        
        //Program-05=> Update specific array element by given element
   
    }
}
