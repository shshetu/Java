/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_ProblemSolving.DiagonalDifference;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class DiagonalDifference {

    public static int diag() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (i == j) {
                    diag1 += a[i][j];
                }
                if (j == (n-1) - i) {
                    diag2 += a[i][j];
                }
            }
        }
        //2nd diagonal count

        return Math.abs(diag1-diag2);
    }

    public static void main(String[] args) {
        System.out.println(diag());
    }
}
