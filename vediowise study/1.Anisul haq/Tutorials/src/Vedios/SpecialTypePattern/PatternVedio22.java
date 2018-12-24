/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecialTypePattern;

import java.util.Scanner;

/**
 *
 * @author shetu
 */
public class PatternVedio22 {
    public static void main(String[] args) {
        int row,col;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n = input.nextInt();
        for ( row = n; row >= 1; row--) {
            //Printing Space
            for ( col = 1; col <= n- row; col++) {
                System.out.print(" ");
            }
            //Printing Number
            for ( col = 1; col <= row; col++) {
                System.out.print(col);
            }
               for ( col = row-1; col >= 1; col--) {
                System.out.print(col); 
        
         
        }
            System.out.println("");
            }
       
         
       
    }
}

