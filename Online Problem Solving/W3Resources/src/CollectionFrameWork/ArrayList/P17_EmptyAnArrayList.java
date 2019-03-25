/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author shshe
 */
public class P17_EmptyAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Before removeing all the elements from the ArrayList: "+list);
        //list.clear();
        list.removeAll(list);
        System.out.println("After removeing all the elements from the ArrayList: "+list);
        
        
        
        
    }
}
