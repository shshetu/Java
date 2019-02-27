/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class CollectionsMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        //Add
        list.add(46);
        list.add(67);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);
        
        System.out.println("Value of maximum element from the collection: "+ Collections.max(list));
        System.out.println("Value of minimum element from the collection: "+ Collections.min(list));
        
    }
}
