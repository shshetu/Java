/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMath;

import static java.lang.Math.asin;
import static java.lang.Math.cbrt;
import static java.lang.Math.copySign;
import static java.lang.Math.cos;
import static java.lang.Math.exp;
import static java.lang.Math.expm1;
import static java.lang.Math.getExponent;
import static java.lang.Math.hypot;
import static java.lang.Math.log10;
import static java.lang.Math.nextAfter;
import static java.lang.Math.rint;
import static java.lang.Math.toDegrees;
import static java.lang.Math.ulp;

/**
 *
 * @author User
 */
public class JavaMath {
    public static void main(String[] args) {
      //Max 
    
        System.out.println("Maximum: "+ Math.max(3,10) );   
        System.out.println("Maximum: "+ Math.min(3,10) ); 
        System.out.println("Sin^-1(x): "+ toDegrees(asin(1)));
        System.out.println("Cubic Root: "+ cbrt(9));
        System.out.println("cubic: "+ Math.pow(4, (1/3)));
        System.out.println("CopySign(x): "+ copySign(2.6,-3.6));
        System.out.println("cos(x): "+ cos(45));
        System.out.println("e^x: "+ exp(3));
        System.out.println("e^x-1: "+ expm1(3));
     
        //Returns Exponent
        System.out.println("Returns unbiased exponent: "+ getExponent(100));
        
        System.out.println("sqrt(x^2+y^2): "+ hypot(1,4));
        System.out.println("Log10: "+ log10(3));
        System.out.println("nextAfter(x,y): "+ nextAfter(1,3));
        System.out.println("rint: "+ rint(2.50));
        System.out.println("ulp(x): "+ ulp(10));
      
    
        
    }

   
   

}
