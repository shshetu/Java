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
public class intMax {

    public static int intMax(int a, int b, int c) {
        int x = (a > b) ? a : b;
        int y = (x > c) ? x : c;
        return y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(intMax(in.nextInt(), in.nextInt(), in.nextInt()));
    }
}
