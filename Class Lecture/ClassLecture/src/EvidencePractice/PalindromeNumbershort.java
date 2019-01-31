/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice;

import java.util.Scanner;

/*
 *
 * @author User
 */
public class PalindromeNumbershort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String s1 = input.next();
    StringBuffer sb = new StringBuffer(s1);
   String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    
    }
}
