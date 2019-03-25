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
public class P12_ExtractAPortionOfAnArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Red");
        list.add("Green");
        list.add("Ornage");
        list.add("White");
        list.add("Black");
        
        List<String>sublist= list.subList(0, 3);
        System.out.println("List the first three elements: "+sublist);
    }
}
