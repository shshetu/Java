/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.util.HashSet;

/**
 *
 * @author shshe
 */
public class Video150HashSet {

    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<String>();
//Adding values to Hashset object
fruitsName.add("Orange");
fruitsName.add("Apple");
fruitsName.add("Kiwi");
fruitsName.add("Banana");
fruitsName.add("Banana");

///Priniting the Array
System.out.println(fruitsName); ///It won't show duplicate value
System.out.println("Size of HashSet: "+ fruitsName.size());

//Remove the HashSet
fruitsName.remove("Banana");
        System.out.println(fruitsName);
        
        //Clear
        fruitsName.clear();
    //isEmpty
boolean value = fruitsName.isEmpty();
        System.out.println(value);
        
        
    }
}
