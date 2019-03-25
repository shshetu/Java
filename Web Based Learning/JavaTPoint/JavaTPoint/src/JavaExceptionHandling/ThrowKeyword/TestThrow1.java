/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.ThrowKeyword;

/**
 *
 * @author shshe
 */
public class TestThrow1 {
    static void validate(int age){
    if(age<18){
    throw new ArithmeticException("Not valid!");
    }else{
        System.out.println("Welcome to vote!");
    }
    }
    public static void main(String[] args) {
    validate(11);   
        System.out.println("rest of the code..");
    }
}
