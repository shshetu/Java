/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollectionsEnumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author shshe
 */
public class CollectionsEnumerationExample2 {
    public static void main(String[] args) {
        //Create array list object from Reference List Interface
        List<Integer> Enum = new ArrayList<Integer>();
        Enum.add(1100);
        Enum.add(2100);
        Enum.add(5100);
        
        //Create Enumeration
        Enumeration<Integer> e = Collections.enumeration(Enum);
        System.out.println("The Enumeration List are: ");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
 
}
