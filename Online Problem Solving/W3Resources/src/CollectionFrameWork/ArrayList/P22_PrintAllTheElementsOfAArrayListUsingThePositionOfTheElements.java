/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author shshe
 */
public class P22_PrintAllTheElementsOfAArrayListUsingThePositionOfTheElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        
        System.out.println("Originala ArrayList: "+list);
        
       //Using for loop
       for(int i = 0;i<list.size();i++){
           System.out.println("Index: "+i+" Element: "+list.get(i));
       }
    }
}
