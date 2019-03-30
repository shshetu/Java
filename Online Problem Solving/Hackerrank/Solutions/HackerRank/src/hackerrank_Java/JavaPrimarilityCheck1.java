/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaPrimarilityCheck1 {
    private static final int CERTAINITY = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        System.out.println(n.isProbablePrime(CERTAINITY)?"prime":"not prime");
    }
}
