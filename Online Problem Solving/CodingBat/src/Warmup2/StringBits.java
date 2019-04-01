/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup2;

import java.util.Scanner;

/**
 *
 * @author User
 */


public class StringBits {
    public static String stringBits(String str){
       String x ="";
        for (int i = 0; i < str.length(); i=i+2) {
            x+=str.charAt(i);
        }
        return x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(stringBits(sc.nextLine()));
        
    }
    
}
