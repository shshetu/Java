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
public class Vedio57MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] sum = new int[2][3];
        System.out.println("Enter 6 values of A Matrix:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
                System.out.print(A[row][col]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Enter 6 values of B Matrix:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                B[row][col] = input.nextInt();
                  System.out.print(B[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("Addition");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
               sum[row][col] = A[row][col] + B[row][col] ;
                System.out.print(sum[row][col] + " ");
            }
            System.out.println("");
        }
        
    }
}
