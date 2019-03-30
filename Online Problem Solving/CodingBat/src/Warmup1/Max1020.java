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
public class Max1020 {

    public static int in3050(int a, int b) {
        
        
        int max;
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
        } else {
            max = 0;
        }
        return max;
     
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(in3050(in.nextInt(), in.nextInt()));
    }
}
