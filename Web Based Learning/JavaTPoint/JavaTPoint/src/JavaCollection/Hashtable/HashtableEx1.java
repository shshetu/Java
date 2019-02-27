/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.Hashtable;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author User
 */
public class HashtableEx1 {
    public static void main(String[] args) {
        //create object of Hashtable
        Hashtable<Integer,String> hm = new Hashtable<>();
        
        //add elements of Hashtable
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");
        
        //Iterating using Map.Entery
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue()+" "+m.hashCode());
        }
    }
}
