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
public class JavaPrimarilityCheck {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        int n1 = Integer.parseInt(n);
        int count = 0;
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                count++;
                break;
            }

        }
        if (count == 0) {
            System.out.println("prime!");
        }

        scanner.close();
    }
}
