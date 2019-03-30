/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaSubStringComparison1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        char[] ar = str.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
    }
}
