/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigIntegerIsProbablePrime;

import java.math.BigInteger;

/**
 *
 * @author shshe
 */
public class BigIntegerIsProbableEx2 {

    public static void main(String[] args) {
        BigInteger big1 = new BigInteger("8");
        Boolean bool1, bool2, bool3;
        bool1 = big1.isProbablePrime(1);
        bool2 = big1.isProbablePrime(0);
        bool3 = big1.isProbablePrime(-1);
        
        String str1 = big1+" is prime with certainity 1 is: "+bool1;
        String str2 = big1+" is prime with certainity 0 is: "+bool2;
        String str3 = big1+" is prime with certainity -1 is: "+bool3;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
