/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Q5_Java_Loops_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: "); 
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.print("n: ");
        int n = input.nextInt();
        int[] array = new int[n];
        int[] array1 = new int[n];
        
        array1[0] = 0;
        array[0] = 0;
        for (int i = 0; i < 3; i++) {
            array1[i] = array[i]+(int)(Math.pow(2, i));
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(array1[i]);
        }
        
   
    }
 
}
