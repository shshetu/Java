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
public class ImmutableString1 {
    public static void main(String[] args) {
        String s = "Sachin";
        s.concat("Tendulkar"); //will print only sachin because Strings are immutable objects
        System.out.println(s);
        
        /////////2nd
        String s1 = "Shetu";
        s1.concat("Shahariar");
        System.out.println(s1); //Strings are immutable
    }
}
