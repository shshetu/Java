/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Q2_Java_Stdin_Stdout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        double d = input.nextDouble();
        input.nextLine();
        String s = input.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
