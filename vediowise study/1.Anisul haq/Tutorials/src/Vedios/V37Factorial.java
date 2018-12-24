/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class V37Factorial {
    public static void main(String[] args) {
        int fac=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to factorize:");
        int num = input.nextInt();
        for (int i = num; i >=1; i--) {
            fac=fac*i;
           
        }
        System.out.println("Factorial of "+num+" = "+fac);
    }
}
