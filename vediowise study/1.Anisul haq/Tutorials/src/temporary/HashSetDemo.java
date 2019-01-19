/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporary;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<String>(); ///Here <String> is Generics
       
//Only in HashMap we use put and get 
//Otherwise in list we add 
        fruitsName.add("Orange");
        fruitsName.add("Mango");
        fruitsName.add("Banana");
        System.out.println(fruitsName);     
        fruitsName.remove("Mango");
        System.out.println(fruitsName);
    }
}
