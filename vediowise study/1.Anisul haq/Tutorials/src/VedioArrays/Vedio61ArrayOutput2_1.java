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
public class Vedio61ArrayOutput2_1 {
    public static void main(String[] args) {
        //Declaring only rows no columns
        int k = 0;
        int[][] number = new int[4][];
        number[1] = new int[1];
        number[2] = new int[2];
        number[3] = new int[3];
        number[4] = new int[4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                number[i][j] = k;
                k++;
            }
        }
        //Printing 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("\t"+ number[i][j]);
            }
            System.out.println("");
        }
    }
}
