/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString.JavaStringClass;

/**
 *
 * @author shshe
 */
public class InternMethod {
    public static void main(String[] args) {
        String s = new String("Sachin");
        String s2 = s.intern();
        System.out.println(s2);
    }
}
