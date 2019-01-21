/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStudy;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class SimpleIfDemo {
   //Page-79
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if (number%5 == 0) {
            System.out.println("Hi Five!s");
        }
        if (number%2 == 0) {
            System.out.println("Hi Even!");
        }
    }
}
