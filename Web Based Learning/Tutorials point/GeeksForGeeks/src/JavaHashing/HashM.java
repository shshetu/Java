/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaHashing;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class HashM {
    //Function to create HashMap from Array
    static void createHashMap(int arr[]){
    //creates an empty HashMap
    HashMap<Integer,Integer> hmap = new HashMap<>();
    
    ///Travers throug the given array
        for (int i = 0; i < arr.length; i++) {
       //Get if the element is presen
       Integer c = hmap.get(arr[i]); ///overriding the get method
       
       //If this is first occurance of element
       //Insert the element
       if(hmap.get(arr[i]) ==  null){
           
           hmap.put(arr[i], 1);}
       
       //If elements already exists in hash map
       //Increment the count of element by 1
       else{hmap.put(arr[i], ++c);}
        }
    }
}
