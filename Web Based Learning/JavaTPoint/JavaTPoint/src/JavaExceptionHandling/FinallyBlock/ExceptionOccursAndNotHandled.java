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
public class ExceptionOccursAndNotHandled {
    public static void main(String[] args) {
        try {
            int data = 25/0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
            
        }
        finally{System.out.println("Finally block is always executed");}
        System.out.println("Rest of the code..");
    }
}
