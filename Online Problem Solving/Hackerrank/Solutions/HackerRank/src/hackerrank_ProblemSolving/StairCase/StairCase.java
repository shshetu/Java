/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_ProblemSolving.StairCase;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class StairCase {

    public static void stairCase(int n) {
        for (int i = 0; i <n; i++) {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
          for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <=i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
