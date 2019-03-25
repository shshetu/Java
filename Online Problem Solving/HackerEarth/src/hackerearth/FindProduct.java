/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class FindProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to input: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int mul = 1;
        int modulo = (int) (Math.pow(10, 9)+7);
        //fist loop to take input
        System.out.println("Enter " +n+" inputs: ");
        for (int i = 0; i < n; i++) {
            arr[i]= input.nextInt();
            mul*= arr[i]%modulo;
        }
        System.out.println(mul);
        
    }
   
}
