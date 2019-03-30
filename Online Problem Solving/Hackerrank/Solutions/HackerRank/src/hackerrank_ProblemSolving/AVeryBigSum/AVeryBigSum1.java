/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_ProblemSolving.AVeryBigSum;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class AVeryBigSum1 {

    public static BigInteger bigSum() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger sum = new BigInteger("0");
        BigInteger[] big = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            big[i] = in.nextBigInteger();
            sum = sum.add(big[i]);

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(bigSum());
    }
}
