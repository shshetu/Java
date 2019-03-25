/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class Ex24 {
    public static void main(String[] args) {
         LinkedList<String> llist = new LinkedList<String>();
         LinkedList<String> llist2 = new LinkedList<String>();
         LinkedList<String> comparedList = new LinkedList<String>();
            
         //Adding element to first LinkedList
            llist.add("Red");
            llist.add("Green");
            llist.add("Black");
            llist.add("Pink");
            llist.add("Orange");
            
            //Adding element to second linkedList
            llist2.add("Red");
            llist2.add("Green");
            llist2.add("Black");
            llist2.add("Orange");
            
            for(String l:llist){
           comparedList.add(llist2.contains(l)?"Yes":"No");
            }
            System.out.println(comparedList);
            
    }
   
}
