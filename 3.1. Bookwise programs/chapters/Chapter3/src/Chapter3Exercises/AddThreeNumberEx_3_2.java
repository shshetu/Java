/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3Exercises;

//Algorithm

import java.util.Scanner;

//1. Gernerate three digit numbers using Math.random(),System.currentTimeMillis()
//2. Add and prompt the user to input the value
public class AddThreeNumberEx_3_2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(System.currentTimeMillis()%10);
        int num3 = (int)((Math.random()%7)*10);
        System.out.println("Generated num1: "+ num1);
        System.out.println("Generated num2: "+ num2);
        System.out.println("Generated num3: "+ num3);
        int result = num1+ num2+num3;
        System.out.print("Adding 3 numbers Enter your result: ");
        int inputedResult = input.nextInt();
        System.out.println(num1+" + "+num2+" + "+ num3+" = "+result);
        System.out.println("Your answer is: "+ (result == inputedResult));
    }
}
