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
public class ComputeFibonacci {
  static  int count  = 0;
    //The method for finding the Fibonacci number
    public static long fib(long index){
        count++;
    if(index == 0) //Base case
        return 0;
    else if(index ==1) //Base case
        return 1;
    else //Reduction and recursive calls
        return fib(index - 1)+fib(index - 2 );
    /*
    Recursion Testing for index: 2
    1st run: fib(1)+ fib(0)
    2nd run: 1+ 0
    3rd run: 1 
    final Result: 2
    */
    }
    
    //Main Method
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();
        
        //Find and display the Fibonacci number:
        System.out.println("The Fibonacci number at index: "+ 
                index+" is "+ fib(index));
        System.out.println("Number of times: "+ count);
        
    }
}
