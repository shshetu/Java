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
public class V41FibonacchiSeries {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter the range:");
        int range = input.nextInt();
        int result = 0;
        System.out.print(num1+"+"+num2);
        for(int i=1;i<=range;i++){
        result = num1+num2;
            System.out.print("+"+result);
        num1 = num2;
        num2 = result;
        }
    }
}
