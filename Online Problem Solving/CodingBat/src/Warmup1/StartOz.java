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
public class StartOz {

    public static String startOz(String str) {
        String x = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(0) == 'o') && (str.charAt(1) == 'z')) {
                x = "oz";
            } else if ((str.charAt(0) == 'o')) {
                x = "o";
            } else if ((str.charAt(1) == 'z')) {
                x = "z" ;
            }

        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(startOz(in.nextLine()));

    }
}
