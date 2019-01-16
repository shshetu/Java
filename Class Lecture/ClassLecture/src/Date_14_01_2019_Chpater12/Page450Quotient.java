/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_14_01_2019_Chpater12;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Page450Quotient {
 public static int quotient(int num1, int num2){
 if(num2 == 0){
     System.out.println("Divisor can't be zero!");
     System.exit(1);
 }
     return num1/num2;
 }   
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try{
            
        int result = quotient(num1,num2);
         System.out.println(num1+" / " + num2 + " is "+ result);
        
        }catch(ArithmeticException ex){
            System.out.println("Exception: an integer cannot be divided by zero");
        }
        
       
        
    }
}
