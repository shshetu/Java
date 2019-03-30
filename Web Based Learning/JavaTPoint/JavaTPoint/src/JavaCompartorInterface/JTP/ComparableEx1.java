/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCompartorInterface.JTP;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author shshe
 */
//1st class: implements compareable interface
public class ComparableEx1 implements Comparable<ComparableEx1> { //making the same objet type
    //Fields are not initialized
    int rollno;
    String name;
    int age;

//input will be provided here
    public ComparableEx1(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(ComparableEx1 t) {
        if (age == t.age) {
            return 0;
        } 
        else if(age>t.age){
        return 1;
        }
        else
            return -1;
    }
}

//2nd class: test class
class Test{
    public static void main(String[] args) {
        ArrayList<ComparableEx1> al = new ArrayList<ComparableEx1>();
        al.add(new ComparableEx1(101,"Vijay",23));
        al.add(new ComparableEx1(106,"Ajay",27));
        al.add(new ComparableEx1(105,"Sujay",21));
        Collections.sort(al);
   for(ComparableEx1 e:al){
       System.out.println(e.rollno+" "+e.name+" "+e.age);
   }
    }
}