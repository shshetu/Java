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
public class V41FibonacchiWithArrays {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to print? : ");
        int range = input.nextInt();
         int[] a = {};
        System.out.println("Enter the first number:");
        a[0] = input.nextInt();
                System.out.println("Enter the second number:");

        a[1] = input.nextInt();
        
        for (int i = 2; i <= range; i++) {
            a[i] = a[i-1]+a[i-2];
            System.out.print("+"+a[i]);
        }
        
    }
 
}
