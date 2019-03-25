/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.ExceptionHandling_With_MethodOverriding;

import java.io.IOException;

/**
 *
 * @author shshe
 */

//creating a class
class Parent{
void msg(){System.out.println("parent");}
}
public class TestExceptionChildRule1 extends Parent{
    @Override
    void msg() throws IOException{
        System.out.println("TestExceptionChild");
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        p.msg();
    }
}
