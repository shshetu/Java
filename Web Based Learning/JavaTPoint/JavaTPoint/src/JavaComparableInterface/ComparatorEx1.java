/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author shshe
 */
///Comparator  class
public class ComparatorEx1 {

    int rollno;
    String name;
    int age;

    public ComparatorEx1(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    ComparatorEx1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
//2nd class: Age comparator class

class AgeComparator implements Comparator<ComparatorEx1> {

    @Override
    public int compare(ComparatorEx1 t, ComparatorEx1 t1) {
        if (t.age == t1.age) {
            return 0;
        } else if (t.age > t1.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
//3rd class: Name comparator class

class NameComparator implements Comparator<ComparatorEx1> {

    @Override
    public int compare(ComparatorEx1 t, ComparatorEx1 t1) {
        return t.name.compareTo(t1.name);
    }

}

//Test class
class Simple {

    public static void main(String[] args) {
        List<ComparatorEx1> list = new ArrayList<>();
        list.add(new ComparatorEx1(100, "shetu", 25));
        list.add(new ComparatorEx1(101, "shanta", 25));
        list.add(new ComparatorEx1(102, "xodi", 23));
        System.out.println("Age comparison: ");
        //age comparator
        Collections.sort(list, new AgeComparator());
        for (ComparatorEx1 c : list) {
            System.out.println(c.rollno + " " + c.name + " " + c.age);
        }

        //Name comparator
        System.out.println("Name comparison: ");
        Collections.sort(list, new NameComparator());
        for (ComparatorEx1 c : list) {
            System.out.println(c.rollno + " " + c.name + " " + c.age);
        }
    }
}
