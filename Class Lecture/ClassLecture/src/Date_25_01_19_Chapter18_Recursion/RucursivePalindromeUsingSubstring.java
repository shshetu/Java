/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_25_01_19_Chapter18_Recursion;

/**
 Substring:
 1. A part of string is called substring. In other words, 
 * substring is a subset of another string.
 2. In case of substring startIndex is inclusive and endIndes is exclusive
 */
public class RucursivePalindromeUsingSubstring {
  public static boolean isPalindrome(String s){
  if(s.length() <= 1) //Base case
  return true;
  else if(s.charAt(0)!= s.charAt(s.length() -1)) //Base case
      return false;
  }  
}
