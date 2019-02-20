/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author shshe
 */
public class ArrayListEx {
    public static void main(String[] args) {
        //creating ArrayList 
        ArrayList<String> list = new ArrayList<>();
        
        //adding elements in the arraylist
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        
        //Traversing list throug Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
