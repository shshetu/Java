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
public class FloyedTrianglePat1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int sum =0;
        System.out.println("Enter the number of lines:");
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                
                System.out.print(++sum +" ");
            } System.out.println("");
        }
    }
}
