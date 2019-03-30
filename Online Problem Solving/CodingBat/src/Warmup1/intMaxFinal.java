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
public class intMaxFinal {

    public static int intMax(int a, int b, int c) {

        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
        // Could use the built in Math.max(x, y) function which selects the larger
        // of two values.
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(intMax(in.nextInt(), in.nextInt(), in.nextInt()));
    }
}
