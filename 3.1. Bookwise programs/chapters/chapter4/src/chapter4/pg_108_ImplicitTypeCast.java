/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class pg_108_ImplicitTypeCast {
    public static void main(String[] args) {
        //HExadecimal
        System.out.println((char)(0X30));
        
        int i = '2'+'3'; //Implicit type casting
        System.out.println("i is: "+ i);
        int j = 2 + 'a';
        System.out.println(j+" is the Unicode for character"+(char)j);
        System.out.println("Chapter "+ '2');
        
        ///Program to check is it upper case,lower case or numeric
        System.out.println("Enter your character: ");
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0); //for characters input next().charAt()
        if (ch>='A' && ch<='Z') {
            System.out.println(ch+" is an Uppercase letter");
        }else if (ch>='a' && ch<='z') {
            System.out.println(ch+" is a Lowercase letter");
        }else if (ch>='0' && ch <='9') {
            System.out.println(ch+" is a numeric character");
        }
        //Test is this character or digit or uppercase or lowercase
        System.out.println("isDigit('a') is "+ Character.isDigit('a'));
        System.out.println("isLetter('a') is "+ Character.isLetter('a'));
        System.out.println("isLowerCase('a' is )"+ Character.isLowerCase('a'));
        System.out.println("isUpperCase('a' is )"+ Character.isUpperCase('a'));
    }
   
}
