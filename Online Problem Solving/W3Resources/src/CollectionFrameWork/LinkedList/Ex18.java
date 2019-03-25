/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork.LinkedList;

import java.util.LinkedList;

/**
 *
Write a Java program to clone an linked list to another linked list
 */
public class Ex18 {
    public static void main(String[] args) {
         LinkedList<String> llist = new LinkedList<String>();
         LinkedList<String> clonedLlist = new LinkedList<String>();

            llist.add("Red");
            llist.add("Green");
            llist.add("Black");
            llist.add("Pink");
            llist.add("Orange");
            
            System.out.println("Original List: "+llist);
            
            clonedLlist = (LinkedList<String>) llist.clone();
       
            System.out.println("Cloned linked lis"+clonedLlist);
    }
}
