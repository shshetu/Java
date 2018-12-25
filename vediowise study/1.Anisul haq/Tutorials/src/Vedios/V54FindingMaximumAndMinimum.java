/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class V54FindingMaximumAndMinimum {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        //System.out.println("How many numbers you want to sort:");
       // double n = input.nextDouble();
         int[] number = new int[3];
       
        System.out.println("Enter " + number.length +" numbers Srespectively:" );
        for (int i = 0; i < number.length; i++) {
          number[i] = input.nextInt();   
           // System.out.print(number[i]+ " ");
        }
int max = number[0];
 int min = number[0];
        for (int i = 1; i < 3; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if(min> number[i]){
            min = number[i];
            }
        }
       
        
        System.out.println("max:"+ max);
        System.out.println("min: " + min);
        
        
       
        
    }
}
