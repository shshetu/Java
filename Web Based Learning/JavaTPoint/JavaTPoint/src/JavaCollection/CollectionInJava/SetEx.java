/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionInJava;

import java.util.*;

/**
 *
 * @author shshe
 */
public class SetEx {
    public static void main(String[] args){
   HashSet<String> set = new HashSet<String>();
   set.add("Ravi");
   set.add("Vijay");
    set.add("Ravi");
    set.add("Ajay");
    
    ///Traversing elements
    Iterator itr = set.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next()); 
    }
    }
   
}
