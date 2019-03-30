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
public class BigIntegerIsProbableEx1 {
    public static void main(String[] args) {
        //create a BigInteger object
        BigInteger big1;
        //create 3 boolean objects
        Boolean bool1,bool2,bool3;
        big1 = new BigInteger("5");
        
        //perform is Probable prime on big1
        //with certainity 1,0,-1
        bool1 = big1.isProbablePrime(1);
        bool2 = big1.isProbablePrime(0);
        bool3 = big1.isProbablePrime(-1);
        
        //Strings
        String str1 = big1+" is prime with certainity 1 is: "+bool1;
        String str2 = big1+" is prime with certainity 0 is: "+bool2;
        String str3 = big1+" is prime with certainity -1 is: "+bool3;
    
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
