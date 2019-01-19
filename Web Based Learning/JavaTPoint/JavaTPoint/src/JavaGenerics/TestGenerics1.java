/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGenerics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class TestGenerics1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
        //list.add(32) //COmpile time error
        String s = list.get(1);
        System.out.println("Element is: "+ s);
        
        //Iterator = interface
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
  
}
