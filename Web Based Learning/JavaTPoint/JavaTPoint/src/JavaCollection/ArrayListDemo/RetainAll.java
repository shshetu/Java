/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.ArrayListDemo;
import java.util.ArrayList;

import java.util.Iterator;

/**
 *
 * @author shshe
 */
public class RetainAll {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.retainAll(al2);
        System.out.println("Iterating the elements after retaining the elements of al2");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
