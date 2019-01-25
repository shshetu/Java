/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_25_01_19_Chapter18_Recursion;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeFactorial_Page_797 {
      static int count = 0;
    //Main method
    public static void main(String[] args) {
    
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int n = input.nextInt();
        
        //Display factorial
        System.out.println("Factorial of "+ n +" is "+ factorial(n));
        System.out.println("Number of times: "+ count);
    }
        //Return factorial for the specified number
        public static long factorial(int n){
            count++;
        if(n == 0) //Base Case
            return 1;
        else 
            return n* factorial(n-1); //Recursive call

//Recursive method is discussed below:
/*Suppose we pass a value 5:
1st run: 5* factorial(4)
2nd run: 5*4*factorial(3)
3rd run: 5*4*3*factorial(2)
4th run: 5*4*3*2*factorial(1)
5th run: 5*4*3*2*1*factorial(0)
5th run: 5*4*3*2*1*factorial(0)
6th run: 5*4*3*2*1*1 = 120
*/        
        }
    }
 

