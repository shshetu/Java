/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternType6;

import java.util.Scanner;

/**
 *
 * @author shetu
 */
public class Pt3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines you want to print:");
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            //Printing Space
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");   
            }
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(col+64));
            }
            System.out.println("");
        }
         for (int row = n-1; row >= 1; row--) {
            //Printing Space
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");   
            }
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(col+64));
            }
            System.out.println("");
        }
        
    }
}
