/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternType5;

import java.util.Scanner;

/**
 *
 * @author shetu
 */
public class Pt5 {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Entet number of lines to print:");
        int n = input.nextInt();
        for (int row = n; row >= 1; row--) {
            //Printing Spaces
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            //Printing number
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(col+64));
            }
            System.out.println("");
        }
    }
}
