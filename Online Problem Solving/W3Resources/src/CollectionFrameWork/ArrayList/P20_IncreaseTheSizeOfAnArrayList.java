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
public class P20_IncreaseTheSizeOfAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(3); //Initial size = 3
        
        list.add("Red");
        list.add("Green");
        list.add("Black");
        
        System.out.println("Original Array List: "+ list);
        
        //Increae capacity to 6 => ensureCapacity(6)
        list.ensureCapacity(6);
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        System.out.println("New Array List: "+list);
  

        
    }
}
