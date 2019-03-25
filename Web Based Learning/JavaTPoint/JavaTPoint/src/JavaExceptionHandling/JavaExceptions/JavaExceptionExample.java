/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.JavaExceptions;

/**
 *
 * @author shshe
 */
public class JavaExceptionExample {
    public static void main(String[] args) {
        try {
          int data = 100/0;
        //  throw new ArithmeticException();
  
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Rest of the code....");
    }
}
