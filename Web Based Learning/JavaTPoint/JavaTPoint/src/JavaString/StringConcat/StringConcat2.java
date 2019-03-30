/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString.StringConcat;

/**
 *
 * @author shshe
 */
public class StringConcat2 {
    public static void main(String[] args) {
        String s = (new StringBuilder().append("Sachin ").append("Tendulkar")).toString();
        System.out.println(s);
        System.out.println(new StringBuffer().append("Shahariar").append(" Shetu").toString());
        System.out.println(new StringBuilder().append("Mehnaz ").append(" Chowdhury").toString());
    }
}
