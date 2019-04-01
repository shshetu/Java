/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.MapInterface;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shshe
 */
public class MapEx1_New {
    public static void main(String[] args) {
    Map<Integer,String> map = new HashMap<>();
    map.put(100,"Amit");
    map.put(101,"Vijay");
    map.put(102,"Rahul");
    //Map can't be traversed that's why either use entrySet() or keySet()
    //Eleements can be traversed in any order
   for(Map.Entry m: map.entrySet()){
       System.out.println(m.getKey()+" "+m.getValue());
   }
    
    }
}