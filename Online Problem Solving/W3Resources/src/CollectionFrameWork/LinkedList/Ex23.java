/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author shshe
 */
public class Ex23 {
    public static void main(String[] args) {
         LinkedList<String> llist = new LinkedList<String>();

            llist.add("Red");
            llist.add("Green");
            llist.add("Black");
            llist.add("Pink");
            llist.add("Orange");
            
            System.out.println("Original List: "+llist);
            
            //Convert a Linked List to array list
            List<String> list = new ArrayList<String>(llist);
            
            //using for each loop
            for(String l:list){
                System.out.println(l);
            }
    }
}
