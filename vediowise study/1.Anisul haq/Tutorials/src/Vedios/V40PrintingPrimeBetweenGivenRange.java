/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;

/**
 *
 * @author Hp
 */
import java.util.Scanner;

public class V40PrintingPrimeBetweenGivenRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number:");
        int sn = input.nextInt();
        System.out.print("Enter the Ending number:");
        int en = input.nextInt();
        int count = 0;
        for (int i = sn; i <= en; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print("Prime! " + i);
                count = 0;
            }
        }
    }
}
