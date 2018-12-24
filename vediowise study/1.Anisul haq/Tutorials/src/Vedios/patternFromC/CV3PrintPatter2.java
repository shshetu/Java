/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternFromC;

import java.util.Scanner;

/**
 *
 * @author shetu
 */
public class CV3PrintPatter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines you want to print:");
        int n = input.nextInt();
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >=1 ; col--) {
                System.out.print(" "+ row);
            }
            System.out.println("");
        }
    }
}
