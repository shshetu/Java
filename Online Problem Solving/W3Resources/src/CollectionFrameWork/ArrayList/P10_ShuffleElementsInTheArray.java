/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author shshe
 */
public class P10_ShuffleElementsInTheArray {
    
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
    //Add
    list.add("Red");
    list.add("Green");
    list.add("Orange");
    list.add("White");
    list.add("Black");
        System.out.println("List before shuffling:\n"+list);
        Collections.shuffle(list);
        System.out.println("List after shuffling:\n"+list);
    }
}
