/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class CollectionsEx1 {
    public static void main(String[] args) {
        //create object
        List<String> list = new ArrayList<>();
        
        //Add elements in object
        list.add("C");
        list.add("Core Java");
        list.add("Advance Java");
        System.out.println("Initial collection value: "+list);
        
        Collections.addAll(list, "Servlet","JSP");
        System.out.println("After adding elements collection value: "+list);
        
        String[] strArr = {"C#",".Net"};
        Collections.addAll(list, strArr);
        System.out.println("After adding array collection value: "+list);
    }
}
