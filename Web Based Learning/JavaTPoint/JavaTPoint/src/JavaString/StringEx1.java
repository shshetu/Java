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
public class StringEx1 {

    public static void main(String[] args) {
        String s1 = "java";
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch); //converting character array to the string
       // String s4 = String.valueOf(ch); //converting character array to the string
        String s3 = new String("example"); //creating java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
