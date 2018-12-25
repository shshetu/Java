/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioArrays;

/**
 *
 * @author Hp
 */
public class Vedio61ArrayOutput2 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int k =0 ;
        for (int row = 1; row <=4; row++) {
            for (int col = 1; col <= row; col++) {
                A[row][col] = k;
                k++;
            }
        }
        ///////////Printing the pattern using Array
        for (int row = 1; row <=4; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(A[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}
