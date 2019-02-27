/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.Hashtable;

import java.util.Hashtable;

/**
 *
 * @author User
 */
public class HashtablePutIfAbsent {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        
        //Add
        ht.put(100, "Amit");
        ht.put(102, "Ravi");
        ht.put(101, "Vijay");
        ht.put(101, "Rahul");
        System.out.println("Initial Map: "+ht);
        
        //insert as the sepcified pair is unique
        ht.putIfAbsent(104, "Gaurav");
        System.out.println("Updated Map: "+ ht);
        
        //Returns the current value, as the specified pair already exist
        ht.putIfAbsent(101, "Vijay");
        System.out.println("Updated Map: "+ ht);
    }
}
