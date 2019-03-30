/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_ProblemSolving.PlusMinus;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class PlusMinus {

    public static String plusMinus(int n, float ar[]) {
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for (float a : ar) {
            if (a > 0) {
                pos++;
//                float f = a / n;
//                System.out.printf("%.6f",f);
////                System.out.println(new DecimalFormat("0.000000").format(f));
//                System.out.println();
            } else if (a == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        return new DecimalFormat("0.000000").format(pos/n).toString()+"\n"+new DecimalFormat("0.000000").format(neg/n).toString()+"\n"+new DecimalFormat("0.000000").format(zero/n).toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float ar[] = new float[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println(plusMinus(n, ar));

    }
}
