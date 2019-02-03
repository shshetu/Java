/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOPSMisc;

/**
 *
 * @author User
 */
public class JavaMathExample2 {
    public static void main(String[] args) {
        double a = 30;
        
        //converting values to radian
        double b = Math.toRadians(a);
        
        //return the trigonometric sine of a 
        System.out.println("Sine value of a is: "+ Math.sin(a));
        
        //return the trigonometric cosine value of a 
        System.out.println("Cosine value of a is: "+ Math.cos(a));
        
        //return the trigonometric tangent value of a 
        System.out.println("Tangent value of a is: "+ Math.tan(a));
        
        //return the trigonometric arc sine value of a 
        System.out.println("Sine inverse value of a is: "+ Math.asin(a));
       
        //return the trigonometric arc cosine value of a 
        System.out.println("Cosine inverse value of a is: "+ Math.acos(a));
        
        //return the trigonometric arc tan value of a 
        System.out.println("Hyperbolic sine value of a is: "+ Math.atan(a));
        
        //return teh heperbolic sine of a 
        System.out.println("Sine value of a is: "+ Math.sinh(a));
        
        //return the hyperbolic cosine value of a
        System.out.println("Cosine value of a  is: "+ Math.cosh(a));
        
        //return the hyperbolic tangent value of a 
        System.out.println("Tangent value of a is: "+ Math.tanh(a));
        
       //Math.cbrt() = cube root of number
       //Math.signum() = find the sign of a givern value
       //Math.nextAfter() = return the floating-point number adjacent to the first argument in the direction of the second argument
       //Math.nextUp()
       //Math.nextDown()
       //Math.rint() = returns double value that is closest to the given argument an equal to mathematical integer.
       //Math.hypot() = returns sqrt(x^2+y^2)
       //?? Math.addExact(),Math.subtractExact(),Math.multiplyExact(),Math.incrementExact(),Math.decrementExact()
       //Math.toDegrees,Math.toRadians
    }
}
