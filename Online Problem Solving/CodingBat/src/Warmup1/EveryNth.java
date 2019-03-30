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
public class EveryNth {

    public static String everyNth(String str, int n) {
        String x = "";
        for (int i = 0; i < str.length(); i = i + n) {
            x += str.charAt(i);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(everyNth(in.nextLine(), in.nextInt()));

    }
}
