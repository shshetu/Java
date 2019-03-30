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
public class StringComparison2 {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "SACHIN";
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //equalsIgnoreCase() igonore everything of the first String => true
        
    }
}
