/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_14_01_2019_Chpater12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class JTPListIterator {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();
        a1.add("Shetu");
        a1.add("Sagor");
        a1.add("Rahmat");
        a1.add(1,"Arif");
          for(String s:a1){System.out.println(s);}
        System.out.println("An element of 2ndd Position: "+ a1.get(2));
        for(String s:a1){System.out.println(s);}
    }
 
}
