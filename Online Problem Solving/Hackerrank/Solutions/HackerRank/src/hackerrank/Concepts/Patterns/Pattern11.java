/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Concepts.Patterns;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >=1; i--) { //row controll
            for (int j = 1; j <= i; j++) { //column controll
                System.out.print(j%2+" ");
            }
            System.out.println("");
        }
    }
}
