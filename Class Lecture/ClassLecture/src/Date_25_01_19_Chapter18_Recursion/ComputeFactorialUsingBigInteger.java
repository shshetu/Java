/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_25_01_19_Chapter18_Recursion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeFactorialUsingBigInteger {
    //Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();
        
        //Display Factorial
        
        
    }
    //Return the Factorial for the specified number:
        public static String factorial(BigInteger n){
        if(n == 0) //base case
        return 1;
        else
            return n * factorial(n-1);
        }
    
}
