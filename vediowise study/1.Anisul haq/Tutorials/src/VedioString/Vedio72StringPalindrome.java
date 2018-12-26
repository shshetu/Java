/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioString;

/**
 *
 * @author Hp
 */
public class Vedio72StringPalindrome {
    public static void main(String[] args) {
       
StringBuffer s1 = new StringBuffer("madam");
StringBuffer s2 = s1.reverse();
if(s1.equals(s2)){System.out.println("Palindrome!");}
else{System.out.println("Not Palindrome!");}

////////////In another Way
String s11 = "kak";
StringBuffer s12 = new StringBuffer(s1);
StringBuffer s13 = s12.reverse();
        if(s12.equals(s13)){System.out.println("Palindrome!");}
else{System.out.println("Not Palindrome!");}



    }
  
}
