/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.ArrayListDemo;
import java.util.ArrayList;
/**
 *
 * @author shshe
 */
public class SetAndGetMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("Before update: "+al.get(1));
        //updating an element at specific position
        al.set(1, "Gaurav");
        System.out.println("After update: "+al.get(1));
        System.out.println(al);
    }
}
