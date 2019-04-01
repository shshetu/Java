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
public class MapEx3_CompairingByKey {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        //Returns a Set view of the mappings contained in this map
        map.entrySet()
        
        //Returns a sequential Stream with this collection as its source
        .stream()
         //sorted according to the provided comparator
                .sorted(Map.Entry.comparingByKey())
                //performs an action for each element of this stream
                .forEach(System.out::println);
        
                //System.out::println is called method reference
    }
}
