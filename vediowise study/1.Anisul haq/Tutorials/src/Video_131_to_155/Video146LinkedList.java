/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class Video146LinkedList {
    public static void main(String[] args) {
       LinkedList<String> countryNames = new LinkedList<String>();
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Myanmar");
        countryNames.add("Thiland");
        countryNames.add("Srilanka"); //single parameter add method
        countryNames.add(5,"Brazil"); //double parameter add method
        countryNames.addFirst("Austrailia"); //adds first element austrailia
        countryNames.addLast("Japan"); //adds last elements japan
        ///Remove as  names
        countryNames.remove("Japan");
        
        //Remove as index
        countryNames.remove(6);
        //Remove the first element
        countryNames.removeFirst();
        //Removes the last element
        countryNames.removeLast();
        
        ///getFirst,getLast elements
        System.out.println("First element: "+ countryNames.getFirst());
        System.out.println("Last element: "+ countryNames.getLast());
        
        //clear the linkedList
        countryNames.clear();
        
        System.out.println(countryNames);
        for(String i: countryNames){
            System.out.println(i);
        }
        System.out.println(countryNames.size());
        
        
    }
}
