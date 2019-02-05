/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_47_to_64;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shshe
 */
public class Video48ArrayListLoopingExample {
    public static void main(String[] args) {
        
        //Creating object of List interface from collection framework
        List<String> list = new ArrayList(); //Here List is base type
        list.add("Text 1");
        list.add("Text 2");
        list.add("Text 3");
        System.out.println("Normal Object size: "+ list.size());
        System.out.println("Normal Object Print: "+ list);
     
        
        //#1 for loop printing
        System.out.println("#1 for loop printing: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
          
        //#2 Advanced for loop of for each loop or colletion for loop printing
        System.out.println("#2 for each loop printing");
        for(String temp: list){
            System.out.println(temp);
        }
        
        //#3 while loop printing
        System.out.println("#3 while loop printing: 1st");
         int j = 0;
         while(j<list.size()){System.out.println(list.get(j));j++;}
         System.out.println("#3 while loop printing: 2nd");
         int k = 0;
         while(list.size()>k){System.out.println(list.get(k));k++;}
//#4 iterator  printing
        System.out.println("#4 Iterator printing");
       // Iterator iterator = list.iterator(); //taking the value of list inside iterator
    Iterator iterator = list.iterator(); //for imposing or entering value inside iterator is obj_nmae.iterator()
       while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
    }
}
