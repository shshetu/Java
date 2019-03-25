/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.ExceptionHandling_With_MethodOverriding;

/**
 *Subclass can declare unchecked exception
 */
class Parents{
void msg(){System.out.println("Parent!");}
}
public class Rule2 extends Parents{
    @Override
    void msg() throws ArithmeticException{
        System.out.println("Child!");
    }
    public static void main(String[] args) {
        Parents p = new Parents();
        p.msg();
    }
}
