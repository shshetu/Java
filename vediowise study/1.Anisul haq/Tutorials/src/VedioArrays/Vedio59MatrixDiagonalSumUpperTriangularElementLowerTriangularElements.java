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
public class Vedio59MatrixDiagonalSumUpperTriangularElementLowerTriangularElements {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[][] diag = new int[10][10];
        int sumUpperTriangle = 0;
        int sumLowerTriangle = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        /////declaring variables and inputing dimension
        System.out.println("Enter the dimension of the Matrix A:");
        int r1 = input.nextInt();
        int c1 = input.nextInt();
        /////Inputing the values of the matrix
        System.out.println("Enter " + r1*c1 + " elements respectively:");
        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                A[row][col] = input.nextInt();
                System.out.print(A[row][col] + "\t");
                diag[row][col] = 0;
            }
            System.out.println("");
        }
        
        ///Calculating the trace or sum the diagonal elements
        System.out.println("The Primary Diagonal:");
        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                if(row == col){
                sum += A[row][col];
                    System.out.print(A[row][col]+"\t");
                }else{System.out.print("0\t");}
               
            }
             System.out.println("");
        }
        System.out.println("Sum of the primary diagonal:" + sum);
        ///Calculating the Secondary diagonal
        System.out.println("The Secondary diagonal:");
        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                if((row+col) == ((r1+c1) - (r1+1))){
                    System.out.print(A[row][col]+"\t");
                }else{System.out.print("0\t");}
            } System.out.println("");
        }
        
        //Calculating upper triangular elements of the Matrix
        System.out.println("Upper triangular elements of the Matrix:");
        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                if(col>row){
                    System.out.print(A[row][col] + "\t");
                    sumUpperTriangle += A[row][col];
                }else{System.out.print("0\t");}
            }
            System.out.println("");
        }
        System.out.println("Sum of Upper triangular Matrix: " + sumUpperTriangle);
   
///Calculating lower triangluar elements of the Matrix
 System.out.println("Lower triangular elements of the Matrix:");
        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                if(col<row){
                    System.out.print(A[row][col] + "\t");
                    sumLowerTriangle += A[row][col];
                }else{System.out.print("0\t");}
            }
            System.out.println("");
        }
        System.out.println("Sum of Lower triangular Matrix: " + sumLowerTriangle);    
    }
}
