/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shshe
 */
public class P19_TrimTheCapacityOfAnArrayListToTheCurrentListSize {
    public static void main(String[] args) {
        //If we want to Add the initial Size
        List<Integer> arr = Arrays.asList(new Integer[10]);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("arr ArrayList size: "+arr.size());
        
        list.add("Red");
        list.add("Green");
        list.add("White");
        list.add("Black");
        list.add("Pink");
        System.out.println("Original Array list: "+list);
        System.out.println("Let trim to size the above array: ");
        list.trimToSize();
        System.out.println(list);
        
    }
 
}
