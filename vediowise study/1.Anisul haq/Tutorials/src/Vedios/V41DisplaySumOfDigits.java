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
public class V41DisplaySumOfDigits {
    public static void main(String[] args) {
        
        
       
        Scanner input = new Scanner(System.in);
        for(int i=1;;i++){
        System.out.println("Enter the 3 digit number:");
        int num = input.nextInt();
        while(num != 0){
        int digit3 = num%10;
        System.out.println("3rd digit:"+digit3);
        int digit2 = (num/10)%10;
        System.out.println("2nd digit:"+digit2);
        int digit1 = (num/10)/10;
        System.out.println("1st digit:"+digit1);
        int result = digit1+ digit2+digit3;
        System.out.println("Sum of "+digit1+" + "+digit2+" + "+digit3+" = "+result);
        }
        }
    }
}
