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
public class IsEmptyMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After insertion");
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
    }
}
