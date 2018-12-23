/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author User
 */
public class pg134equal {
    public static void main(String[] args) {
       String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";
        String s4 = "Welcome to c++";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s4));
        
        
       String str1 = "abf";
       String str2 = "abc";
        System.out.println(str1.compareTo(str2));
        
    }
 
}
