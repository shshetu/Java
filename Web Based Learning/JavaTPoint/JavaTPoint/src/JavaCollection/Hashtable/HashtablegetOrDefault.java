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
public class HashtablegetOrDefault {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        
        //adding keys and values to the Hashtable object
        ht.put(100,"Amit");
        ht.put(102,"Ravi");
        ht.put(101,"Vijay");
        ht.put(103,"Rahul");
        
        //Here, we specify the if and else staement as arguments of the method
        System.out.println(ht.getOrDefault(101, "Not Found"));
        System.out.println(ht.getOrDefault(105, "Not Found"));
    }
}
