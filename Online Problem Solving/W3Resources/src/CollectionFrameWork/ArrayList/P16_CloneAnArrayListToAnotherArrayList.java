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
public class P16_CloneAnArrayListToAnotherArrayList {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
      list.add("Red");
      list.add("Green");
      list.add("Black");
      list.add("White");
      list.add("Pink");
    //      ArrayList<String> clonedList = new ArrayList<>(list);
    
      ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned Array List: "+clonedList);
    }
}
