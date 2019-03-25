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
public class P7_SearchAnElement {
    public static void main(String[] args) {
        //Create object
        List<String> list = new ArrayList<>();
        
        //Add elements
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        
        //Search for the Red
        if(list.contains("Red")){
            System.out.println("Found the element!");
        }else{
            System.out.println("There is no such element!");
        }
    }
}
