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
public class CheckNums {

    public static void checkNums(int num1, int num2) {

        if (num2 > num1) {
            System.out.println("true");
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int n1 = Integer.parseInt(str.substring(0, 2).trim());
        int n2 = Integer.parseInt(str.substring(12).trim());
        checkNums(n1, n2);
    }
}
