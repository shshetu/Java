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
public class Vedio53FindingSumAndAverageUsingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   double[] number = new double[5];
        System.out.println("Enter 5 numbers:");
       int i = 0;
       int sum = 0; 
       while(i <= number.length){
    number[i] = input.nextDouble();
    
    sum += number[i];
    i++;
    }
        System.out.println("sum of " + number.length + "numbers: " + sum);
    }
}
