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
public class Vedio60ArrayOutput {
    public static void main(String[] args) {
        int[][] A = new int[4][5];
        int [][] sum = new int[4][5];
        int count = 0;
        int k = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
             A[row][col] = k;
             k++;
            }
        }
        System.out.println("Our desired Matrix:");
        //Printin the values of the 2D array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(A[row][col] + "\t");
                count++;
            }
            System.out.println("");
        }
        
        System.out.println("Number of times loop executed: "+ count);
    }
}
