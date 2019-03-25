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
public class P11_DisplayTheElementsAndTheirPositionsInALinkedList {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("Pink");
        llist.add("Orange");
        
        System.out.println("Original Linked List: "+llist);
        for (int i = 0; i < llist.size(); i++) {
            System.out.println("Index: "+i+ " Element: "+llist.get(i));
        }
        
    }
}
