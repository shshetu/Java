/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shshe
 */
public class P13_CompareTwoArrayLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");
        
        List<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
        
        List<String> list3 = new ArrayList<>();
        for(String e:list1){
        list3.add(list2.contains(e)? "Yes":"NO");
            
        }
        System.out.println(list3);
    }
}
