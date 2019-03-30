/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigInteger;

import java.math.BigInteger;

/**
 *
 * @author shshe
 */
public class BigIntegerEx1 {

    public static void main(String[] args) {
        //Initialize result
        BigInteger bigInteger = new BigInteger("1");
        int n = 4;
        for (int i = 2; i <= n; i++) {
            //returns a BigInteger by computing ?this *val ?value
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of 4: " + bigInteger);
        //returns a Boolean value?true? if and only if this BigInteger is prime
        BigInteger bigInteger2 = new BigInteger("197");
        System.out.println("IsProbablePrime method will return: " + bigInteger2.isProbablePrime(100));
        //returns teh next prime integer that is greater than this BigInteger
        BigInteger nextPrimeNumber = bigInteger2.nextProbablePrime();
        System.out.println("Prime number next to 197: " + nextPrimeNumber);
        //returns the minimum between this BigInteger and val
        BigInteger min = bigInteger.min(bigInteger2);
        System.out.println("Min value: "+min);
        //returns the maximum value between this BigInteger and val
        BigInteger max = bigInteger.max(bigInteger2);
        System.out.println("Maximum value: "+max);
        
    }
}
