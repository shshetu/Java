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
public class PalindromeStringBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String s = input.next();
        
       if(s.equals(new StringBuilder(s).reverse().toString())){
           System.out.println("Palindrome");
       }else {System.out.println("Not palindrome");} 
    }
}
