/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporary;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class DoWhileLoopTesting {
    public static void main(String[] args) {
        int count =1;
        Scanner  input = new Scanner(System.in);
        do{
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1 + num2;
        System.out.println("Result: "+ result);
      count =2;
        }while(count == 1);
    }
}
