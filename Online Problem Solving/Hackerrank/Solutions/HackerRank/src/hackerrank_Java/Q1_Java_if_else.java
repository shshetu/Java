/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Q1_Java_if_else {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Enter the Value of n: ");
        int n = input.nextInt();
        if(n%2==1 || (n%2==0 && n>=6 && n<=20)){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
            
    }

    
    
   
    
}
