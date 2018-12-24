/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vedioseries;
import java.util.Scanner;
/**
 
 
 
 
 
 
 * @author shetu
 */


public class V41DisplaySumOfDigits1 {
    public static void main(String[] args) {
        int temp,r,sum=0;
      Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();
        temp = num;
        while(temp != 0){
        r = temp % 10;
        sum = sum + r;
        temp = temp/10;
        }
        System.out.println("Sum = " + sum);
    }
    
}
