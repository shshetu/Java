/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vedioseries;
import java.util.Scanner;
/**
 *
 * @author shetu
 */
public class V48ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        while (temp != 0){
        int r = temp%10;
        sum = sum + (int)Math.pow(r,3);
        temp = temp/10;
        }
        System.out.println("The cubic sum of the digits:"+sum);
        if(sum == number){
            System.out.println("It is an armstrong number!");
        }else{
            System.out.println("Not Armstrong number!");
        }
    }
   
}
