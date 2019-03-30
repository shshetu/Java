/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCompartorInterface.JTP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author shshe
 */
//1st class: implements compareable interface
public class ComparableEx1Reverse implements Comparable<ComparableEx1Reverse> {
//declaring 3 fields

    int roll;
    String name;
    int age;

    public ComparableEx1Reverse(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    ComparableEx1Reverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(ComparableEx1Reverse t) {
        if (roll == t.roll) {
            return 0;
        } else if (roll < t.roll) { //just make it > to reverse the order
            return 1;
        } else {
            return -1;
        }
    }
}

///2nd class : Test class
class Test3 {

    public static void main(String[] args) {
  
        List<ComparableEx1Reverse> list = new ArrayList<ComparableEx1Reverse>();
        list.add(new ComparableEx1Reverse(100, "shetu", 25));
        list.add(new ComparableEx1Reverse(101, "shanta", 25));
        list.add(new ComparableEx1Reverse(102, "nodi", 23));
        ///sort 
        Collections.sort(list);
        //for loop to print the sorted collections
        for(ComparableEx1Reverse c :list){
            System.out.println(c.roll+" "+c.name+" "+c.age);
        }
        
        //using method
        
    }

}
