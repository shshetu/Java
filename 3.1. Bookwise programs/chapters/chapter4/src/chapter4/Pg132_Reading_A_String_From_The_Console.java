/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pg132_Reading_A_String_From_The_Console {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words seperated by spaces: ");
        String s1 = input.next(); //next() is only used to input strings
        //for inputting character at a certain index we use next().charAt()
         String s2 = input.next();
         String s3 = input.next();
         //Printing the output 
         System.out.println("S1: "+ s1);
         System.out.println("S2: "+ s2);
         System.out.println("S3: "+ s3);
    
    }  
    
}
