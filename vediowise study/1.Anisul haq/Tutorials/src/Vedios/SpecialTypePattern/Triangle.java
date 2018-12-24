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
public class Triangle {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n = input.nextInt();
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                if(row == n || col ==1 || row == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
