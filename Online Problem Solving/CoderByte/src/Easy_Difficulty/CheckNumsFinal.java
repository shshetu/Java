/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class CheckNumsFinal {

    public static int checkNums(String str) {
        int n1 = Integer.parseInt(str.substring(0, 2).trim());
        int n2 = Integer.parseInt(str.substring(12).trim());
        if (n2 > n1) {
            System.out.println("true");

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkNums(sc.nextLine().trim()));
    }
}
