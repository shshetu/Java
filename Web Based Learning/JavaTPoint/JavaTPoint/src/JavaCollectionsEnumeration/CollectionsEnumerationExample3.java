/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollectionsEnumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author shshe
 */
public class CollectionsEnumerationExample3 {
    public static void main(String[] args) {
        //Creating an ArrayList Referrence: ArrayList
        ArrayList firstList = new ArrayList();
        firstList.add(new String("Hello"));
        firstList.add(new String("World"));
        firstList.add(new Boolean(true));
        firstList.add(new Double(101.5));
        
        Enumeration<String> e = Collections.enumeration(firstList);
        while(e.hasMoreElements()){
            Object obj = e.nextElement();
            System.out.println(obj);
        }
    }
   
}
