/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Palindrome {
   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String n = input.next();
        String rev = "";
  
         for (int i = n.length()-1; i >= 0; i--) {
            rev+=n.charAt(i);
        }
         if (n.equals(rev)) {
             System.out.println("Palindrome!");
        }else{System.out.println("Not palindrome");}
    }
    }

