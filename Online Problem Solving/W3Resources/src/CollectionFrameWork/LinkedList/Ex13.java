/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class Ex13 {
    public static void main(String[] args) {
            LinkedList<String> llist = new LinkedList<String>();

            llist.add("Red");
            llist.add("Green");
            llist.add("Black");
            llist.add("Pink");
            llist.add("Orange");
            
            System.out.println("Original List: "+llist);
            
            Object first_element = llist.removeFirst();
            Object last_element = llist.removeLast();
            System.out.println("Element First removed: "+ first_element);
            System.out.println("Element Last removed: "+ last_element);
              System.out.println("Original List: "+llist);

    }
 
}
