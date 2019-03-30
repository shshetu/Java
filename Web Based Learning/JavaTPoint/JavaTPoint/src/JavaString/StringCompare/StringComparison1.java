/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString.StringCompare;

/**
 *
 * @author shshe
 */
public class StringComparison1 {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin"); //we can create string using new keyword
        String s4 = "Saurav";
        System.out.println(s1.equals(s2)); //equals operator will match the content 
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        
        
    }
}
