/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Array1DSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the size of Array: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Enter "+n+" numbers: ");
        
        //Inputting the arrayElements
        for (int i = 0; i < a.length; i++) {
          a[i] = input.nextInt();
        }
        //Condition checking
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            
           
        }
        
        //Printing the array asecending order
        for (int i = 0; i <a.length; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println("");
      //Printing array in descending order
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(" "+a[i]);
        }
        
    }
}
