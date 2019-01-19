/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGenerics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class AdvantagesOfGenerics {
    public static void main(String[] args) {
        //There are 3 advantages of generics
        //1.Single Type data is stored only for class or interface
        
//2.Type Casting is not required

//Non Generic = list
List list = new ArrayList(); //NO TYPE SO NON GENERICS
list.add("hello");
String s = (String)list.get(0); //Typecasting since list is object Type and String is a particular type
System.out.println(s);

//Generic = list1
List<String> list1 = new ArrayList<String>(); //Genereic list, single data type is made permenant
list.add("Hello");
String s1 = list1.get(0); //Type casting no needed

//3.Compile time checking 
List<String> list2 = new ArrayList<String>();
list2.add("hello");
//list2.add(32); //compile Time Error
    }
}
