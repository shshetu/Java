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
 Write a Java program to join two linked lists
 */
public class Ex17 {
    public static void main(String[] args) {
        LinkedList<String> llist1 = new LinkedList<String>();
        LinkedList<String> llist2 = new LinkedList<String>();
        LinkedList<String> llist3 = new LinkedList<String>();
        //Adding element in first list
            llist1.add("Red");
            llist1.add("Green");
            llist1.add("Black");
            llist1.add("Pink");
            llist1.add("Orange");
            
            //Adding elements in the second list
            llist2.add("Red");
            llist2.add("Green");
            llist2.add("Black");
            llist2.add("Pink");
            
            System.out.println("Original First List: "+llist1);
            System.out.println("Original Second List: "+llist2);
            
            //joining two lists
            llist3.addAll(llist1);
            llist3.addAll(llist2);
            System.out.println("Joined List: "+llist3);
            
    }
}
