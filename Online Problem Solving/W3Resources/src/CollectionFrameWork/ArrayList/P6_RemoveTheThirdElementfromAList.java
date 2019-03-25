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
public class P6_RemoveTheThirdElementfromAList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //Add elements
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        
        //Remove the third element
        list.remove(2);
        
        //Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
