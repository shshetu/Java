/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternType9;

import java.util.Scanner;

/**
 *
 * @author shetu
 */
public class patt4 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines you want to print:");
        int n = input.nextInt();
        for (int row = n; row >= 1; row--) {
            //Printing Space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            //Printing number
            for (int col = 1; col <= 2*row - 1; col++) {
                System.out.print((char)(row+64));
            }
            System.out.println("");
        }
    }
}
