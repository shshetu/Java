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
public class BigIntegerEx2 {

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("17");
        //returns the signum function of this BigInteger
        BigInteger bigInteger2 = new BigInteger("171");
        System.out.println("Signum value for "+bigInteger2+" : "+bigInteger2.signum());
        //returns the next prime integer that is greater than this BigInteger
        BigInteger sub = bigInteger2.subtract(bigInteger);
        System.out.println(bigInteger2+" - "+bigInteger+" : "+sub);
        
        //returns th quotient after dividing two bigInteger values
        BigInteger  quotient = bigInteger2.divide(bigInteger);
        System.out.println(bigInteger2+" / "+bigInteger+" : Quotient: "+quotient);
        //returns the remainder after dividing two bigInteger values
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        System.out.println("  Reaminder: "+remainder);
        
        //returns a BigInteger whose value is ?this << val?
        BigInteger shiftLeft = bigInteger.shiftLeft(4);
        System.out.println("ShiftLeft value: "+shiftLeft);
    
    }

}
