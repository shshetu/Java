/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.ArrayListDemo;
import java.util.*;
/**
 *
 * @author shshe
 */
public class AddElementsDemo {
    public static void main(String[] args) {
      ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial list of elements: "+al);
        //Adding elements to the end of the list
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After invoking add(E e) method: "+al);
        //Adding Elements at the specific position
        al.add(1,"Gaurav");
        System.out.println("After invoking add(int index,E element) method: "+al);
        
        //2nd ArrayList
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Sonoo");
        al2.add("Hanumat");
        
        //Adding Second list elements to the first list
        al.addAll(al2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method:");
        
    }
 
}
