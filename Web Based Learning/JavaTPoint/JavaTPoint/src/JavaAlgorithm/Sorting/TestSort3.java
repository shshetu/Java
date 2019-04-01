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
public class TestSort3 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(Integer.valueOf(201));
        list.add(Integer.valueOf(101));
        list.add(230);
        Collections.sort(list);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
