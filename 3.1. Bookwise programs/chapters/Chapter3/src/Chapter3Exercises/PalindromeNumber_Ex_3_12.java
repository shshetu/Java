package Chapter3Exercises;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PalindromeNumber_Ex_3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        while(temp != 0){
        int r = temp%10;
        sum = sum*10 + r;
        temp = temp/10; 
        }
   System.out.println("Actual number is: "+ number +" Reversed number: "+sum);
        System.out.println((number==sum?"Palindrome":"Not palidrome"));  
        
    }
  
}
