/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class MiniMaxSum {

    static String miniMax(int[] arr) {
        Arrays.sort(arr);
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min += arr[i];
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            max += arr[i];
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(miniMax(arr));
    }
}
