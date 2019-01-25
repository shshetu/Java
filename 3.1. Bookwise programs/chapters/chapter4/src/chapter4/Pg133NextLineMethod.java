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
public class Pg133NextLineMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Never use nextLine() method after any of the methods 
        
         System.out.println("Enter a new Line: ");
        String line  = input.nextLine();
      System.out.println("Enter a new name: ");
       String name = input.next(); //To print a name ends with whitespace
           System.out.println(line);
        System.out.println(name);
    
    }
}
