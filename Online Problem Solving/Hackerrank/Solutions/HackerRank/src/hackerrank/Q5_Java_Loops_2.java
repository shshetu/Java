/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Q5_Java_Loops_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int sumPower2 = 0;
            for (int i = 0; i < n; i++) {
                sumPower2= sumPower2*2+1;
                if(i !=0){System.out.print(" ");}
                System.out.print(a+sumPower2*b);
            }
            System.out.println();
        }
        input.close();
    }
 
}
