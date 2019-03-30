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
public class ComparableEx1_secondTime implements Comparable<ComparableEx1_secondTime> {

    //declaring the fields
    int rollno;
    String name;
    int age;

    public ComparableEx1_secondTime(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    //how to do the same program without constructor?
    @Override
    public int compareTo(ComparableEx1_secondTime t) {
        if (age == t.age) {
            return 0;
        } else if (age > t.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

///Test class
class Test2 {

    public static void main(String[] args) {
        List<ComparableEx1_secondTime> list = new ArrayList<ComparableEx1_secondTime>();
        list.add(new ComparableEx1_secondTime(100, "shetu", 25));
        list.add(new ComparableEx1_secondTime(101, "shagor", 27));
        list.add(new ComparableEx1_secondTime(102, "Shuvo", 28));
        list.add(new ComparableEx1_secondTime(103, "Oli", 25));
        Collections.sort(list);
        for (ComparableEx1_secondTime s : list) {
            System.out.println(s.rollno + " " + s.name + " " + s.age);
        }
    }
}
