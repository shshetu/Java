/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternType8_1_Pyramid1;

import java.util.Scanner;

/**
 *
 * @author shetu
 */
public class Pyra1Pat2 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines you want to print:");
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
          //Printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            //Printing number
            for (int col = 1; col <= 2*row -1 ; col++) {
                System.out.print(row);
            }
            System.out.println("");
       }
    } 
}
