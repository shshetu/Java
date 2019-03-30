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
public class in3050 {

    public static boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(in3050(in.nextInt(), in.nextInt()));
    }
}
