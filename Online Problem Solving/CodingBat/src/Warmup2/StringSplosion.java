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
public class StringSplosion {

    public static String stringSplosion(String str) {
        String x = "";
        for (int i = 0; i < str.length(); i++) {
            x+=str.substring(0,i);
        }
        return x+str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(stringSplosion(sc.nextLine()));

    }

}
