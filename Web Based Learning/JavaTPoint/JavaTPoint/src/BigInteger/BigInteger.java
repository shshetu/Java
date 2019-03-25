/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigInteger;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class BigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        java.math.BigInteger a = sc.nextBigInteger();
        System.out.println("Enter second Number: ");
        java.math.BigInteger b = sc.nextBigInteger();
        java.math.BigInteger arr[] = a.divideAndRemainder(b);
        System.out.println("Quotient/Result = "+arr[0]);
        System.out.println("Remainder = "+arr[1]);
    }
}
