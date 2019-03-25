/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.FinallyBlock;

/**
 *
 * @author shshe
 */
public class ExceptionsDoesNotOccur {
    public static void main(String[] args) {
        try {
            int data = 25/5;
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{System.out.println("finally block is always executed!");}
        System.out.println("rest of the code..");
    }
}
