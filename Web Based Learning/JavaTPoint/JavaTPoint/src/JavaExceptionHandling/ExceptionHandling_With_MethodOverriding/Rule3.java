/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.ExceptionHandling_With_MethodOverriding;

/**
 *
 Can't declare parent exception
 */
class Parentss {
void msg() throws ArithmeticException{System.out.println("Parent");}
}
public class Rule3 extends Parentss{
    @Override
    void msg() throws Exception{
        System.out.println("Child");
    }
    
    //main method
    public static void main(String[] args) {
        Parentss p = new Rule3();
        p.msg();
    }
}
