/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.text.DecimalFormat;

/**
 *
 * @author shshe
 */
public class Video143DecimalNumberFormattion {
    public static void main(String[] args) {
        double x = 2.9875401;
        System.out.printf("x = %.2f", x); //According to C programming
        
        //DecimalFormat Class using Java
        DecimalFormat ob = new DecimalFormat("0.00");
        System.out.println("\nx  = "+ ob.format(x));
        
        //My Attempt
        DecimalFormat obj1 = new DecimalFormat("0.0000");
        System.out.println("x: "+ obj1.format(x));

    }
}
