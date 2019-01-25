/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubstrinInJava;

/**
Substring: A part of string is called substring
2 ways to call: 
1. public String substring(int startIndex): starts and goes infinitely
* public String substring(int startIndex endIndex): starts from startIndex and
 */
public class TestSubstring {
    public static void main(String[] args) {
        String s = "SachinTendulkar";
        System.out.println(s.substring(6)); //Tecdulkar startIndex is inclusive but endIndex is exclusive
        System.out.println(s.substring(0,6)); //0 to 5 //Sachin
    }
   
}
