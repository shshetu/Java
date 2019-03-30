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
public class StringComparison3 {

    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin"); //new keyword created object
            //== matches the type only
        System.out.println(s1 == s2); //True because both refer to same instance
        System.out.println(s1 == s3); //false because s3 refers to instance created in nonpool 
    }
}
