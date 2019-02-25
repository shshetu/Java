/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author shshe
 */
public class IteratingCollectionThroughRemainingWays {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        //Traverse using ArrayList
        System.out.println("Traversing list through List Iterator:");
        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()){
        String str= list1.previous();
            System.out.println(str);
        }
        
        //Traverse using for loop
        System.out.println("Traversing list using for loop");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        //Traverse using forEach() method
        System.out.println("Traversing through forEach() method");
        list.forEach(a->{System.out.println(a);});
        
        //Traverse using forEachRemaining() method
        System.out.println("Traversing through forEachRemaining() method");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a->{
            System.out.println(a);
        });
    }
 
}
