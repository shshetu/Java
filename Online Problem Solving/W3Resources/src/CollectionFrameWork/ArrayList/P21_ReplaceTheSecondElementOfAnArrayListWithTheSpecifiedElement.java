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
public class P21_ReplaceTheSecondElementOfAnArrayListWithTheSpecifiedElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        System.out.println("Original ArrayList: "+list);
        //Replacing the 2nd element 
        list.set(1,"White");
        System.out.println("Changed ArrayList: "+list);
    }
}
