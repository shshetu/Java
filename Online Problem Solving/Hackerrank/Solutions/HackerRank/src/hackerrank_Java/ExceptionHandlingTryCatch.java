/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class ExceptionHandlingTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        try{
            int m = input.nextInt();
        int n = input. nextInt();
            System.out.print(m/n);

        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
    //    e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}

