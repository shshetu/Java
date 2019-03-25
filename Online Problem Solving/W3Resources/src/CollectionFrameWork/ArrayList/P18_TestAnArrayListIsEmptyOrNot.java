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
public class P18_TestAnArrayListIsEmptyOrNot {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");
        
        List<String> list2 = new ArrayList<>();
        System.out.println("Is ArrayList1 Empty? "+ list1.isEmpty());
        System.out.println("Is ArrayList2 Empty? "+ list2.isEmpty());
    }
}
