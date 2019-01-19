/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporary;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap works by using <key,value>
    HashMap <Integer,String> customer = new HashMap <Integer,String>();
   //We input values using put
    customer.put(101, " Shetu ");
    customer.put(102, " Shanta ");
    customer.put(101, " Nodi ");
    customer.put(101, " Rafsan ");
        System.out.println(customer);
        
        //We print values of specific key using get
        System.out.println(""+customer.get(101)); //we use key to call
     
    
    }
 
}
