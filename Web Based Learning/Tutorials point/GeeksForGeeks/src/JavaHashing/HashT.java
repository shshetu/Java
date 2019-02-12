/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaHashing;

import java.util.Hashtable;

/**
 *
 * @author User
 */
public class HashT {
    public static void main(String[] args) {
        //create a HashTable to store
        //Stirng values corresponding to integer keys
Hashtable<Integer,String> hm = new Hashtable<Integer,String>();

//input the values
hm.put(1, "Shetu");
hm.put(2, "Shagor");
hm.put(3, "Rahmat");
hm.put(4, "Arif");

//printing the Hashtable
System.out.println(hm);
        
    }
}
