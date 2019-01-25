/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AllStringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      String s1 = "Welcome to Java";
      String s2 = "Welcome to Java";
      String s3 = "Welcome to C++";
        
        ///String  compare
        if (s1 == s2) { //== only checks the type
            System.out.println("String1 and String2 are the same objects");
        }else{System.out.println("String1 and String2 are different objects");}
        System.out.println(s1.equals(s2)); //only checks the contents
        System.out.println(s1.compareTo(s3));
        
        
        char ch = input.next().charAt(0);
        String d = input.next();
        String d1 = input.nextLine();
        
    }
}
