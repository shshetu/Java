/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.NestedTry;

/**
 *
 * @author shshe
 */
public class NestedTryBlock {
    public static void main(String[] args) {
        try{
        try {
            System.out.println("going to divide!");
            int b = 39/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        try {
            int[] a = new int[5];
            a[5] = 4;
        } finally{}
        
                System.out.println("Other statement!");

        }catch(Exception e){System.out.println("handled!");}
        System.out.println("Normal flow..");
    }
    
}
