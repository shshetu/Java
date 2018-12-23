/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author User
 */
public class pg121 {
    public static void main(String[] args) {
        //Basically all math method takes input as double type and returns double type data value
        System.out.println(Math.exp(1)); //double will be returned
        System.out.println(Math.log10(10)); //double will be returned
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(10.5));
        //The rounding methods
        System.out.println("Rounding Methods:");
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.ceil(-2));
        System.out.println(Math.floor(2.9));
        System.out.println(Math.floor(-2.9));
        System.out.println(Math.round(-2.51));
        System.out.println(Math.round(2.5));
        System.out.println(Math.rint(2.51)); //double value works
      ///The service method
        System.out.println(Math.random());
        
    }
 
}
