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
public class Vedio58MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = new int[10][10]; 
        int[][] B = new int[10][10]; 
        int[][] multi = new int[10][10];
      
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the dimension of A Matrix:");
         int r1 = input.nextInt();
         int c1 = input.nextInt();
         System.out.println("Enter the dimension of B Matrix:");
         int r2 = input.nextInt();
         int c2 = input.nextInt();
         if (c1 == r2) {
             System.out.println("Enter " + r1*c1 +" values of A Matrix:");
             for (int row = 0; row < r1; row++) {
                 for (int col = 0; col < c1; col++) {
                     A[row][col] = input.nextInt();
                     System.out.print(A[row][col]+"\t");
                 }
                 System.out.println("");
             }
             System.out.println("Enter " + r2*c2 +" values of B Matrix:");
             for (int row = 0; row < r2; row++) {
                 for (int col = 0; col < c2; col++) {
                     B[row][col] = input.nextInt();
                       System.out.print(B[row][col]+"\t");
                 }
                  System.out.println("");
             }
             ///////////Storing 0 in muti named variable
              for (int row = 0; row < r1; row++) {
                 for (int col = 0; col < c2; col++) {
                     multi[row][col] = 0;
                       
                 }
                  System.out.println("");
             }
              //Matrix Mulitplication
             for (int row = 0; row < r1; row++) {
                 for (int col = 0; col < c2; col++) {
                     for (int k = 0; k < c1; k++) {
                         multi[row][col] += A[row][k]*B[k][col];
                         
                     }
                     System.out.print(multi[row][col]+"\t");
                    
                 }
                   System.out.println("");
             }
   
        }else{
             System.out.println("Dimension doesn't match!Multiplication is not possible!");
         }
    }
   
    
}
