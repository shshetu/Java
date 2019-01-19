/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.util.HashMap;

/**
 *
 * @author shshe
 */
public class Video149HashMap {
    public static void main(String[] args) {
        //Put = to insert date, Get = to retrieve Data
        HashMap<Integer,String> customer = new HashMap<Integer,String>();
        
        customer.put(101, "Shetu");
        customer.put(102, "Shanta");
        customer.put(103, "Nodi");
        
        //get
        System.out.println(customer.get(102));
    }
}
