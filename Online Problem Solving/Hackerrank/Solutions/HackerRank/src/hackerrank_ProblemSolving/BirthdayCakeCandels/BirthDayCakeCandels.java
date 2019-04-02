/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_ProblemSolving.BirthdayCakeCandels;

import java.io.BufferedWriter;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class BirthDayCakeCandels {

    static int birthdayCakeCandles(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[0] == arr[i]){
            count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(birthdayCakeCandles(arr));
    }
}
