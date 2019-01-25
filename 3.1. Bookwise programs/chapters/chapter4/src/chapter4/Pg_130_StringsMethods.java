/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author User
 */
public class Pg_130_StringsMethods {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        System.out.println("The length of "+ message +" is "+ message.length());
        System.out.println("Character at 0th index: "+ message.charAt(0));
        //Converting the Strings toUpperCase(),toLowerCase
        System.out.println("toUpperCase(): "+ message.toUpperCase());
        System.out.println("toLowerCase(): "+ message.toLowerCase());
        
    }
}
