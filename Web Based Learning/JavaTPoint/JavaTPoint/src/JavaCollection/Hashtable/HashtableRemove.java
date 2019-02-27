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
public class HashtableRemove {
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable<>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        
        System.out.println("Befor remove: "+map);
        
        //Remove value for key 102
        map.remove(102);
        System.out.println("After remove: ");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue()+" "+ m.hashCode());
        }
    }
}
