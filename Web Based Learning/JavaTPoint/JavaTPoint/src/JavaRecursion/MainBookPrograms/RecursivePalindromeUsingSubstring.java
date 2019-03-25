/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRecursion.MainBookPrograms;

/**
 *
 * @author shshe
 */
public class RecursivePalindromeUsingSubstring {
    public static boolean isPalindrome(String s){
    if(s.length()<=1){ //Base case
    return true;
    }
    else if(s.charAt(0)!= s.charAt(s.length()-1)){ //base case
    return false;
    }
    else 
        return isPalindrome(s.substring(1,s.length()-1));
    }
    
    //Main method
    public static void main(String[] args) {
        System.out.println("Is moon a palindrome: "+isPalindrome("moon"));
        System.out.println("Is noon a palindrome: "+isPalindrome("noon"));
        System.out.println("Is \"a\" palindrome: "+isPalindrome("a"));
    }
}
