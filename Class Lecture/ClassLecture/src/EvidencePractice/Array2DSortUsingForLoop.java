/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice;

/**
 *
 * @author User
 */
public class Array2DSortUsingForLoop {
    public static void main(String[] args) {
        int[][] array = {
            {1,3,654,3},{123,5,67,42}
        
        };
        
        //Checking condition
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = j+1; k <array[i].length; k++) {
                    int temp = array[i][j];
                    array[i][j] = array[i][k];
                    array[i][k] = temp;
                }
            }
        }
        //Printing array in ascending order
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" "+ array[i][j]);
            }
        }
        
    }
}
