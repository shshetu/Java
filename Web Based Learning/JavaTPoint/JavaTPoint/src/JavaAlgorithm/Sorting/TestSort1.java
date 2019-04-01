/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAlgorithm.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shshe
 */
public class TestSort1 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");
        Collections.sort(al);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
