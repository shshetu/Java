/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shshe
 */
public class P8_SortAGivenArrayList {
    public static void main(String[] args) {
        //Create Array object
        List<String> list = new ArrayList<>();
        
        //Add elements
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        
        //sort the elements
        Collections.sort(list);
        //Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
