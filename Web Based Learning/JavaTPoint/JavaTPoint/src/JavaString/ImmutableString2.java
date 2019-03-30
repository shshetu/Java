/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString;

/**
 *
 * @author shshe
 */
public class ImmutableString2 {

    public static void main(String[] args) {
        String s = "Sachin";
        s = s + " Tendulkar"; //We can print in this manner
        System.out.println(s);

        /////////2nd
        String s1 = "Shetu";
        s1 = s1 + " Shahariar";
        System.out.println(s1); //Strings are immutable
    }
}
