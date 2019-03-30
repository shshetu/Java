/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_ProblemSolving.Compare_the_Triplets;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class CompareTheTriplets1 {

    public static String compare() {
        int[] a = new int[3];
        int[] b = new int[3];
        int al = 0;
        int bo = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i] = in.nextInt();
        }
        //calculate the greater
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                al++;
            } else if(a[i]<b[i]){
                bo++;
            }
        }
        return al + " " + bo;
    }

    public static void main(String[] args) {
        System.out.println(compare());
    }
}
