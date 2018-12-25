/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioArrays;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Vedio56TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] number = new int[2][3];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                number[row][col] = input.nextInt();
            }
            
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+number[row][col]);
            }
            System.out.println("");
        }
        
    }
}
