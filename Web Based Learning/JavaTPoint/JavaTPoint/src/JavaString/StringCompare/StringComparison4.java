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
public class StringComparison4 {
 
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";
        //compareTo returns 0 , 1 and -1
        System.out.println(s1.compareTo(s2)); //0 because s1==s2
        System.out.println(s1.compareTo(s3)); //1 because s1>s3
        System.out.println(s3.compareTo(s1)); //-1 because s3<s1
    }
}
