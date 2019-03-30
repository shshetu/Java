/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStrings.Trim;

/**
 *
 * @author shshe
 */
public class TrimMethodEx2 {
    public static void main(String[] args) {
        String s1 = "  hello java string  ";
        System.out.println(s1.length());
        System.out.println(s1); //without trim
       String str = s1.trim();
        System.out.println(str.length());
        System.out.println(str);
    }
}
