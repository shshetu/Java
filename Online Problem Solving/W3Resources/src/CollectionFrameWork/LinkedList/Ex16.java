/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class Ex16 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<String>();

            llist.add("Red");
            llist.add("Green");
            llist.add("Black");
            llist.add("Pink");
            llist.add("Orange");
            
            System.out.println("Original List: "+llist);
            //Shuffle the list
            Collections.shuffle(llist);
            System.out.println("Thellist New List: "+llist);
    }
}
