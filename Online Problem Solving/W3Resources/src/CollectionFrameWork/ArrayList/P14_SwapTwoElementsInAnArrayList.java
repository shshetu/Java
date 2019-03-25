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
public class P14_SwapTwoElementsInAnArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("\tBefore Swaping: ");
        for(String a:list){
            System.out.println(a);
        }
        System.out.println("\tAfter Swaping: ");
        Collections.swap(list, 0, 2);
       
         for(String b:list){
            System.out.println(b);
        }
    }
}
