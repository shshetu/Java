/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_14_01_2019_Chpater12;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TPArrayList {
    public static void main(String[] args) {
        
        
        ArrayList a1 = new ArrayList();
        
        //Array list size
        System.out.println("first Size: "+ a1.size());
        
        //Adding elements
        a1.add("C"); // Here index = 0 and Input = C
        a1.add(1,"A2"); //Here 1 = index and A2 = input
        a1.add(1,2);
        //display ArrayList size
        System.out.println("Second Size: "+ a1.size());
        
        //display the contents of ArrayList
        System.out.println("Contents of ArrayList: "+ a1);
        
        //Remove elements from the Array List
        a1.remove("C");
        System.out.println(a1);
        a1.remove(0);
        
        //final output
        System.out.println("final size: "+ a1.size() + " elements: " + a1);
    }
}
