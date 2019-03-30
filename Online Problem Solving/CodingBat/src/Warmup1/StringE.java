/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StringE {

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e'){
            count++;
            }
        }
        return count>=1 && count<=3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(stringE(in.nextLine()));
    }
}
