/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Video142ExceptionHandlingProblemSolving {
    public static void main(String[] args) {
      int count = 1;
        do{
        try{
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Please enter num2: ");
        int num2 = input.nextInt();
        int result = num1/num2;
        System.out.println("Result: "+ result);
        count = 2;
        }catch(Exception e){
            System.out.println("Exception: "+ e);
            System.out.println("You must enter integer. Please try again!");
        }
        }while(count == 1);
        }
 
    
    
}
