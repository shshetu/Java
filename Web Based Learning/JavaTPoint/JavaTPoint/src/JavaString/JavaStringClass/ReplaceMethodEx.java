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
public class ReplaceMethodEx {
    public static void main(String[] args) {
        String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = s1.replace("Java", "Kava"); //takes s1 and replace java with kava
        System.out.println(replaceString);
        
    }
}
