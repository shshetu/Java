/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shshe
 */
public class P5_UpdateSpecificArrayElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
       //Add elements
       list.add("Red");
       list.add("Blue");
       list.add("Green");
       list.add("Black");
       
       //replace
       list.set(2, "Yellow");
       
       //Iterator
       Iterator itr = list.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}
